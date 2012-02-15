package dao

import org.squeryl.Session
import org.squeryl.SessionFactory
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.{Schema, KeyedEntity, Table, Session}
import org.squeryl.annotations.ColumnBase
import org.squeryl.adapters.MySQLAdapter

import scala.collection.immutable.HashMap

import unicode.{Alphabet, unicode}
 
/** The DB session initialiser according to squeryl documentation.
 */ 
object Mysql {

  def startDbSession(): Unit = {
    val dbUsername = "gues"
    val dbPassword = "guess"
    val dbConnection = "jdbc:mysql://localhost:3306/guesslanguage?useUnicode=true&characterEncoding=utf8"

    Class.forName("com.mysql.jdbc.Driver")
    SessionFactory.concreteFactory = Some(
      () => 
	Session.create(
          java.sql.DriverManager.getConnection(dbConnection, dbUsername, dbPassword),
          new MySQLAdapter)
    )
  }
}

/** Run to initialise the database.
 */ 
object Main {

  def main(args: Array[String]) { 
    Mysql.startDbSession
    transaction { DB.create }
    DB.init
  }

}

class Word(val name: String, val language: String, val alphabet: String)

object DB extends Schema { 
  val words = table[Word]("words")

  on(words)(w => declare(
    columns(w.name, w.language) are(unique),
    columns(w.name, w.alphabet) are(indexed)
  ))

  //extract data from flat file in dict/ to the database
  def fillDatabase(dict: String, alphabet: String, language: String) { 
    val lines = scala.io.Source.fromFile(dict).getLines().toList
    transaction { 
      for (l <- lines)
	try { DB.words.insert(new Word(l, language, alphabet)) }
	catch { case e: Exception => () }
    }
  }

  /** Initialise the database.
   */ 
  def init() { 
      println(java.util.Calendar.getInstance.getTime)
      fillDatabase("dict/ar_dict", "arabic", "arabic")
      fillDatabase("dict/en_dict", "latin", "english")
      fillDatabase("dict/fr_dict", "latin", "french")
      println(java.util.Calendar.getInstance.getTime)
    }
  
  /** Return a List of potential language given a word and its alphabet.
   */
  def getLangs(word: String, alphabet: String) = transaction { 
    from(words)(w => where((w.alphabet === alphabet) and (w.name === word)) select(w.language)).toList
  }
}


object language { 

  /** Separate a string by pontuation symbols.
   */ 
  def separateByPonctuation(phrase: String) = { 
    val words = List.newBuilder[String]
    var buffer = ""
    phrase.foreach(letter => {
      if (unicode.isPonctuation(letter)) { 
	if (!buffer.isEmpty) { 
	  words += buffer
	  buffer = ""
	}
      }
	else 
	  buffer += letter
    })
    if (!buffer.isEmpty)
      words += buffer
    words.result
  }

  /** Find in which dominant alphabet is written the text.
   * It will test all char of the text and select the most repressented alphabet overall.
   */ 
  def wordAlphabet(word: String) = { 
    val m = scala.collection.mutable.HashMap[Alphabet.Value, Int]()
    word.foreach(letter => { 
      if (!unicode.isPonctuation(letter)) { 
	val r = unicode.whichAlphabet(letter)
	if (m.contains(r)) m(r) = m(r) + 1
	else m += (r -> 1)
      }
    })
   
    m.foldLeft(Alphabet.UNKNOWN -> 0)(
      (max, curr) => {if (max._2 < curr._2) curr else max})._1
  }

  /** It will guess the language of a text written in an alphabet.
   * To do so it separate each word by pontuation, match each to a database return potential languages.
   * And find the language with the most occurence.
   */ 
  def guessLang(text: String, alphabet: String) = { 
    val list = separateByPonctuation(text.substring(0, {if (text.size < textSizeLimit) text.size else textSizeLimit})).take(maxWordsToTest)
    val unknownAlphabet = "unknown_" + alphabet

    val map = HashMap.newBuilder[String, List[String]]
    val langs = scala.collection.mutable.HashMap[String, Int]()

    list.foreach(s => map += (s -> DB.getLangs(s, alphabet)))
    for((k, v) <- map.result) { 
      if (v.isEmpty)
	if (langs.contains(unknownAlphabet)) langs(unknownAlphabet) = langs(unknownAlphabet) + 1
	else langs(unknownAlphabet) = 1
      else
	v.foreach(s => {
	  if (langs.contains(s)) langs(s) = langs(s) + 1
	  else langs(s) = 1
	})
    }

    langs.foldLeft("" -> 0)((max, curr) => {if (max._2 < curr._2) curr else max})._1
  }

  /** Given a string try to find the language it is written in.
   * Select the phraseSizeLimit first charracter of the phrase in order to avoid useless effort.
   * Expected latin, cyrillic, arabic, devanagari and ethiopic other alphabet are assumed to be self sufficient to guess their languages.
   * So those alphabet will be tested against a dictionary database.
   * Return the english name of the language.
   */ 
  def guessLanguage(phrase: String) = { 
    wordAlphabet(phrase.substring(0, {if (phrase.size < phraseSizeLimit) phrase.size else phraseSizeLimit})) match { 
      case Alphabet.LATIN => guessLang(phrase, "latin")
      case Alphabet.CYRILLIC => guessLang(phrase, "cyrillic")
      case Alphabet.ARABIC => guessLang(phrase, "arabic")
      case Alphabet.DEVANAGARI => guessLang(phrase, "devanagari")
      case Alphabet.ETHIOPIC => guessLang(phrase, "ethiopic")

      case Alphabet.CJK => "chinese"
      case Alphabet.GURMUKHI => "panjabi"
      case alphabet => alphabet.toString.toLowerCase

    }
  }
  
  /** The number of charracter usefull to guess in which alphabet are written those charracter.
   */
  val phraseSizeLimit = 50

  /** The number of words to test against a dictionary database.
   */ 
  val maxWordsToTest = 10

  /** The number of character usefull to guess a language.
   */
  val textSizeLimit = 200
}


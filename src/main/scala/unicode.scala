package unicode

/** Srcipt to language
 * THAANA -> dhivehi
 * TAGALOG -> philipino
 * GURMUKHI -> panjabi
 * ETHIOPIC -> amharic, tigrinya
 * BENGALI -> bengali, asamesse
 * DEVANAGARI -> nepali, sindhi, sanskirit, bihari, hindi, kashmiri, marathi, pali
 * TIBETAN -> tibetan, dzongkha
 * ARABIC -> arabic, hausa, khasmiri, kurdish, malay, panjabi, persian, pashto, sindhi, tajik, uyghur, uzbek, urdu
 * CYRILLIC -> too mutch
 * LATIN -> even more
 */

/** The main different alphabets.
 * CJK mean Chinese, Japanese, Korean
 */ 
object Alphabet extends Enumeration { 
  type UnicodeBlock = Value
  val LATIN,
  GREEK,
  CYRILLIC,
  HEBREW,
  ARABIC,
  ARMENIAN,
  INDIAN,
  THAI,
  LAO,
  TIBETAN,
  MYANMAR,
  GEORGIAN,
  KOREAN,
  KHMER,
  MONGOLIAN,
  JAPANESE,
  CJK,
  TAMIL,
  MALAYALAM,
  THAANA,
  TAGALOG,
  SYRIAC,
  GURMUKHI,
  GUJARATI,
  ORIYA,
  KANNADA,
  TELUGU,
  SINHALA,
  DEVANAGARI,
  BENGALI,
  ETHIOPIC,
  UNKNOWN = Value
}

/** Unicode block from unicode 6.1
 */ 
object UnicodeBlock extends Enumeration { 
  type UnicodeBlock = Value
  val BASIC_LATIN,
    LATIN_1_SUPPLEMENT,
    LATIN_EXTENDED_A,
    LATIN_EXTENDED_B,
    IPA_EXTENSIONS,
    SPACING_MODIFIER_LETTERS,
    COMBINING_DIACRITICAL_MARKS,
    GREEK_AND_COPTIC,
    CYRILLIC,
    CYRILLIC_SUPPLEMENT,
    ARMENIAN,
    HEBREW,
    ARABIC,
    SYRIAC,
    ARABIC_SUPPLEMENT,
    THAANA,
    NKO,
    SAMARITAN,
    MANDAIC,
    ARABIC_EXTENDED_A,
    DEVANAGARI,
    BENGALI,
    GURMUKHI,
    GUJARATI,
    ORIYA,
    TAMIL,
    TELUGU,
    KANNADA,
    MALAYALAM,
    SINHALA,
    THAI,
    LAO,
    TIBETAN,
    MYANMAR,
    GEORGIAN,
    HANGUL_JAMO,
    ETHIOPIC,
    ETHIOPIC_SUPPLEMENT,
    CHEROKEE,
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS,
    OGHAM,
    RUNIC,
    TAGALOG,
    HANUNOO,
    BUHID,
    TAGBANWA,
    KHMER,
    MONGOLIAN,
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED,
    LIMBU,
    TAI_LE,
    NEW_TAI_LUE,
    KHMER_SYMBOLS,
    BUGINESE,
    TAI_THAM,
    BALINESE,
    SUNDANESE,
    BATAK,
    LEPCHA,
    OL_CHIKI,
    SUNDANESE_SUPPLEMENT,
    VEDIC_EXTENSIONS,
    PHONETIC_EXTENSIONS,
    PHONETIC_EXTENSIONS_SUPPLEMENT,
    COMBINING_DIACRITICAL_MARKS_SUPPLEMENT,
    LATIN_EXTENDED_ADDITIONAL,
    GREEK_EXTENDED,
    GENERAL_PUNCTUATION,
    SUPERSCRIPTS_AND_SUBSCRIPTS,
    CURRENCY_SYMBOLS,
    COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS,
    LETTERLIKE_SYMBOLS,
    NUMBER_FORMS,
    ARROWS,
    MATHEMATICAL_OPERATORS,
    MISCELLANEOUS_TECHNICAL,
    CONTROL_PICTURES,
    OPTICAL_CHARACTER_RECOGNITION,
    ENCLOSED_ALPHANUMERICS,
    BOX_DRAWING,
    BLOCK_ELEMENTS,
    GEOMETRIC_SHAPES,
    MISCELLANEOUS_SYMBOLS,
    DINGBATS,
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A,
    SUPPLEMENTAL_ARROWS_A,
    BRAILLE_PATTERNS,
    SUPPLEMENTAL_ARROWS_B,
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B,
    SUPPLEMENTAL_MATHEMATICAL_OPERATORS,
    MISCELLANEOUS_SYMBOLS_AND_ARROWS,
    GLAGOLITIC,
    LATIN_EXTENDED_C,
    COPTIC,
    GEORGIAN_SUPPLEMENT,
    TIFINAGH,
    ETHIOPIC_EXTENDED,
    CYRILLIC_EXTENDED_A,
    SUPPLEMENTAL_PUNCTUATION,
    CJK_RADICALS_SUPPLEMENT,
    KANGXI_RADICALS,
    IDEOGRAPHIC_DESCRIPTION_CHARACTERS,
    CJK_SYMBOLS_AND_PUNCTUATION,
    HIRAGANA,
    KATAKANA,
    BOPOMOFO,
    HANGUL_COMPATIBILITY_JAMO,
    KANBUN,
    BOPOMOFO_EXTENDED,
    CJK_STROKES,
    KATAKANA_PHONETIC_EXTENSIONS,
    ENCLOSED_CJK_LETTERS_AND_MONTHS,
    CJK_COMPATIBILITY,
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A,
    YIJING_HEXAGRAM_SYMBOLS,
    CJK_UNIFIED_IDEOGRAPHS,
    YI_SYLLABLES,
    YI_RADICALS,
    LISU,
    VAI,
    CYRILLIC_EXTENDED_B,
    BAMUM,
    MODIFIER_TONE_LETTERS,
    LATIN_EXTENDED_D,
    SYLOTI_NAGRI,
    COMMON_INDIC_NUMBER_FORMS,
    PHAGS_PA,
    SAURASHTRA,
    DEVANAGARI_EXTENDED,
    KAYAH_LI,
    REJANG,
    HANGUL_JAMO_EXTENDED_A,
    JAVANESE,
    CHAM,
    MYANMAR_EXTENDED_A,
    TAI_VIET,
    MEETEI_MAYEK_EXTENSIONS,
    ETHIOPIC_EXTENDED_A,
    MEETEI_MAYEK,
    HANGUL_SYLLABLES,
    HANGUL_JAMO_EXTENDED_B,
    HIGH_SURROGATES,
    HIGH_PRIVATE_USE_SURROGATES,
    LOW_SURROGATES,
    PRIVATE_USE_AREA,
    CJK_COMPATIBILITY_IDEOGRAPHS,
    ALPHABETIC_PRESENTATION_FORMS,
    ARABIC_PRESENTATION_FORMS_A,
    VARIATION_SELECTORS,
    VERTICAL_FORMS,
    COMBINING_HALF_MARKS,
    CJK_COMPATIBILITY_FORMS,
    SMALL_FORM_VARIANTS,
    ARABIC_PRESENTATION_FORMS_B,
    HALFWIDTH_AND_FULLWIDTH_FORMS,
    SPECIALS,
    LINEAR_B_SYLLABARY,
    LINEAR_B_IDEOGRAMS,
    AEGEAN_NUMBERS,
    ANCIENT_GREEK_NUMBERS,
    ANCIENT_SYMBOLS,
    PHAISTOS_DISC,
    LYCIAN,
    CARIAN,
    OLD_ITALIC,
    GOTHIC,
    UGARITIC,
    OLD_PERSIAN,
    DESERET,
    SHAVIAN,
    OSMANYA,
    CYPRIOT_SYLLABARY,
    IMPERIAL_ARAMAIC,
    PHOENICIAN,
    LYDIAN,
    MEROITIC_HIEROGLYPHS,
    MEROITIC_CURSIVE,
    KHAROSHTHI,
    OLD_SOUTH_ARABIAN,
    AVESTAN,
    INSCRIPTIONAL_PARTHIAN,
    INSCRIPTIONAL_PAHLAVI,
    OLD_TURKIC,
    RUMI_NUMERAL_SYMBOLS,
    BRAHMI,
    KAITHI,
    SORA_SOMPENG,
    CHAKMA,
    SHARADA,
    TAKRI,
    CUNEIFORM,
    CUNEIFORM_NUMBERS_AND_PUNCTUATION,
    EGYPTIAN_HIEROGLYPHS,
    BAMUM_SUPPLEMENT,
    MIAO,
    KANA_SUPPLEMENT,
    BYZANTINE_MUSICAL_SYMBOLS,
    MUSICAL_SYMBOLS,
    ANCIENT_GREEK_MUSICAL_NOTATION,
    TAI_XUAN_JING_SYMBOLS,
    COUNTING_ROD_NUMERALS,
    MATHEMATICAL_ALPHANUMERIC_SYMBOLS,
    ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS,
    MAHJONG_TILES,
    DOMINO_TILES,
    PLAYING_CARDS,
    ENCLOSED_ALPHANUMERIC_SUPPLEMENT,
    ENCLOSED_IDEOGRAPHIC_SUPPLEMENT,
    MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS,
    EMOTICONS,
    TRANSPORT_AND_MAP_SYMBOLS,
    ALCHEMICAL_SYMBOLS,
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B,
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C,
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D,
    CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT,
    TAGS,
    VARIATION_SELECTORS_SUPPLEMENT,
    SUPPLEMENTARY_PRIVATE_USE_AREA_A,
    SUPPLEMENTARY_PRIVATE_USE_AREA_B,
    UNKNOWN = Value
}

object unicode { 
  /** Return if a Char is a ponctuation.
   * Assuming ponctuation is only in LATIN's blocks.
   */ 
  def isPonctuation(c: Char) = { 
    c >= 0x0000 && c <= 0x0040 ||
    c >= 0x005B && c <= 0x0060 ||
    c >= 0x007B && c <= 0x007F
  }
 
  /** Return which alphabet a Char is.
   */ 
  def whichAlphabet(c: Char) = { 
    if (c >= 0x0000 && c <= 0x02AF)
      Alphabet.LATIN
    else if (c >= 0x1E00 && c <= 0x1EFF)
      Alphabet.LATIN
    else if (c >= 0x2C60 && c <= 0x2C7F)
      Alphabet.LATIN
    else if (c >= 0xA720 && c <= 0xA7FF)
      Alphabet.LATIN
    else if (c >= 0x0400 && c <= 0x052F)
      Alphabet.CYRILLIC
    else if (c >= 0x2DE0 && c <= 0x2DFF)
      Alphabet.CYRILLIC
    else if (c >= 0xA640 && c <= 0xA69F)
      Alphabet.CYRILLIC
    else if (c >= 0x0370 && c <= 0x03FF)
      Alphabet.GREEK
    else if (c >= 0x1F00 && c <= 0x1FFF)
      Alphabet.GREEK
    else if (c >= 0x0590 && c <= 0x05FF)
      Alphabet.HEBREW
    else if (c >= 0x0600 && c <= 0x06FF)
      Alphabet.ARABIC
    else if (c >= 0x0750 && c <= 0x077F)
      Alphabet.ARABIC
    else if (c >= 0x08A0 && c <= 0x08FF)
      Alphabet.ARABIC
    else if (c >= 0xFB50 && c <= 0xFDFF)
      Alphabet.ARABIC
    else if (c >= 0xFE70 && c <= 0xFEFF)
      Alphabet.ARABIC
    else if (c >= 0x0530 && c <= 0x058F)
      Alphabet.ARMENIAN
    else if (c >= 0x0900 && c <= 0x097F)
      Alphabet.DEVANAGARI
    else if (c >= 0xA8E0 && c <= 0xA8FF)
      Alphabet.DEVANAGARI
    else if (c >= 0x0980 && c <= 0x09FF)
      Alphabet.BENGALI
    else if (c >= 0x1900 && c <= 0x194F)
      Alphabet.INDIAN
    else if (c >= 0x0E00 && c <= 0x0E7F)
      Alphabet.THAI
    else if (c >= 0x0E80 && c <= 0x0EFF)
      Alphabet.LAO
    else if (c >= 0x10A0 && c <= 0x10FF)
      Alphabet.GEORGIAN
    else if (c >= 0x2D00 && c <= 0x2D2F)
      Alphabet.GEORGIAN
    else if (c >= 0x1100 && c <= 0x11FF)
      Alphabet.KOREAN
    else if (c >= 0x3130 && c <= 0x318F)
      Alphabet.KOREAN
    else if (c >= 0xA960 && c <= 0xA97F)
      Alphabet.KOREAN
    else if (c >= 0xAC00 && c <= 0xD7FF)
      Alphabet.KOREAN
    else if (c >= 0x3040 && c <= 0x30FF)
      Alphabet.JAPANESE
    else if (c >= 0x3190 && c <= 0x319F)
      Alphabet.JAPANESE
    else if (c >= 0x31F0 && c <= 0x31FF)
      Alphabet.JAPANESE
    else if (c >= 0x2E80 && c <= 0x2FDF)
      Alphabet.CJK
    else if (c >= 0x4E00 && c <= 0x9FFF)
      Alphabet.CJK
    else if (c >= 0xF900 && c <= 0xFAFF)
      Alphabet.CJK
    else if (c >= 0x20000 && c <= 0x2B81F)
      Alphabet.CJK
    else if (c >= 0x2F800 && c <= 0x2FA1F)
      Alphabet.CJK
    else if (c >= 0x0B80 && c <= 0x0BFF)
      Alphabet.TAMIL
    else if (c >= 0x1780 && c <= 0x17FF)
      Alphabet.KHMER
    else if (c >= 0x19E0 && c <= 0x19FF)
      Alphabet.KHMER
    else if (c >= 0x1000 && c <= 0x109F)
      Alphabet.MYANMAR
    else if (c >= 0xAA60 && c <= 0xAA7F)
      Alphabet.MYANMAR
    else if (c >= 0x0780 && c <= 0x07BF)
      Alphabet.THAANA
    else if (c >= 0x0F00 && c <= 0x0FFF)
      Alphabet.TIBETAN
    else if (c >= 0x1800 && c <= 0x18AF)
      Alphabet.MONGOLIAN
    else if (c >= 0x0700 && c <= 0x074F)
      Alphabet.SYRIAC
    else if (c >= 0x1700 && c <= 0x171F)
      Alphabet.TAGALOG
    else if (c >= 0x0A80 && c <= 0x0AFF)
      Alphabet.GUJARATI
    else if (c >= 0x0B00 && c <= 0x0B7F)
      Alphabet.ORIYA
    else if (c >= 0x0C00 && c <= 0x0C7F)
      Alphabet.TELUGU
    else if (c >= 0x0C80 && c <= 0x0CFF)
      Alphabet.KANNADA
    else if (c >= 0x0D00 && c <= 0x0D7F)
      Alphabet.MALAYALAM
    else if (c >= 0x0D80 && c <= 0x0DFF)
      Alphabet.SINHALA
    else if (c >= 0x0A00 && c <= 0x0A7F)
      Alphabet.GURMUKHI
    else if (c >= 0x1200 && c <= 0x137F)
      Alphabet.ETHIOPIC
    else if (c >= 0x1380 && c <= 0x139F)
      Alphabet.ETHIOPIC
    else if (c >= 0x2D80 && c <= 0x2DDF)
      Alphabet.ETHIOPIC
    else if (c >= 0xAB00 && c <= 0xAB2F)
      Alphabet.ETHIOPIC
    else
      Alphabet.UNKNOWN
  }

  /** Return which unicode block a Char is.
   */ 
  def whichBlock(c: Char) = { 
    if (c >= 0x0000 && c <= 0x007F) 
      UnicodeBlock.BASIC_LATIN 
    else if (c >= 0x0080 && c <= 0x00FF)
      UnicodeBlock.LATIN_1_SUPPLEMENT
    else if (c >= 0x0100 && c <= 0x017F)
      UnicodeBlock.LATIN_EXTENDED_A
    else if (c >= 0x0180 && c <= 0x024F)
      UnicodeBlock.LATIN_EXTENDED_B
    else if (c >= 0x0250 && c <= 0x02AF)
      UnicodeBlock.IPA_EXTENSIONS
    else if (c >= 0x02B0 && c <= 0x02FF)
      UnicodeBlock.SPACING_MODIFIER_LETTERS
    else if (c >= 0x0300 && c <= 0x036F)
      UnicodeBlock.COMBINING_DIACRITICAL_MARKS
    else if (c >= 0x0370 && c <= 0x03FF)
      UnicodeBlock.GREEK_AND_COPTIC
    else if (c >= 0x0400 && c <= 0x04FF)
      UnicodeBlock.CYRILLIC
    else if (c >= 0x0500 && c <= 0x052F)
      UnicodeBlock.CYRILLIC_SUPPLEMENT
    else if (c >= 0x0530 && c <= 0x058F)
      UnicodeBlock.ARMENIAN
    else if (c >= 0x0590 && c <= 0x05FF)
      UnicodeBlock.HEBREW
    else if (c >= 0x0600 && c <= 0x06FF)
      UnicodeBlock.ARABIC
    else if (c >= 0x0700 && c <= 0x074F)
      UnicodeBlock.SYRIAC
    else if (c >= 0x0750 && c <= 0x077F)
      UnicodeBlock.ARABIC_SUPPLEMENT
    else if (c >= 0x0780 && c <= 0x07BF)
      UnicodeBlock.THAANA
    else if (c >= 0x07C0 && c <= 0x07FF)
      UnicodeBlock.NKO
    else if (c >= 0x0800 && c <= 0x083F)
      UnicodeBlock.SAMARITAN
    else if (c >= 0x0840 && c <= 0x085F)
      UnicodeBlock.MANDAIC
    else if (c >= 0x08A0 && c <= 0x08FF)
      UnicodeBlock.ARABIC_EXTENDED_A
    else if (c >= 0x0900 && c <= 0x097F)
      UnicodeBlock.DEVANAGARI
    else if (c >= 0x0980 && c <= 0x09FF)
      UnicodeBlock.BENGALI
    else if (c >= 0x0A00 && c <= 0x0A7F)
      UnicodeBlock.GURMUKHI
    else if (c >= 0x0A80 && c <= 0x0AFF)
      UnicodeBlock.GUJARATI
    else if (c >= 0x0B00 && c <= 0x0B7F)
      UnicodeBlock.ORIYA
    else if (c >= 0x0B80 && c <= 0x0BFF)
      UnicodeBlock.TAMIL
    else if (c >= 0x0C00 && c <= 0x0C7F)
      UnicodeBlock.TELUGU
    else if (c >= 0x0C80 && c <= 0x0CFF)
      UnicodeBlock.KANNADA
    else if (c >= 0x0D00 && c <= 0x0D7F)
      UnicodeBlock.MALAYALAM
    else if (c >= 0x0D80 && c <= 0x0DFF)
      UnicodeBlock.SINHALA
    else if (c >= 0x0E00 && c <= 0x0E7F)
      UnicodeBlock.THAI
    else if (c >= 0x0E80 && c <= 0x0EFF)
      UnicodeBlock.LAO
    else if (c >= 0x0F00 && c <= 0x0FFF)
      UnicodeBlock.TIBETAN
    else if (c >= 0x1000 && c <= 0x109F)
      UnicodeBlock.MYANMAR
    else if (c >= 0x10A0 && c <= 0x10FF)
      UnicodeBlock.GEORGIAN
    else if (c >= 0x1100 && c <= 0x11FF)
      UnicodeBlock.HANGUL_JAMO
    else if (c >= 0x1200 && c <= 0x137F)
      UnicodeBlock.ETHIOPIC
    else if (c >= 0x1380 && c <= 0x139F)
      UnicodeBlock.ETHIOPIC_SUPPLEMENT
    else if (c >= 0x13A0 && c <= 0x13FF)
      UnicodeBlock.CHEROKEE
    else if (c >= 0x1400 && c <= 0x167F)
      UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS
    else if (c >= 0x1680 && c <= 0x169F)
      UnicodeBlock.OGHAM
    else if (c >= 0x16A0 && c <= 0x16FF)
      UnicodeBlock.RUNIC
    else if (c >= 0x1700 && c <= 0x171F)
      UnicodeBlock.TAGALOG
    else if (c >= 0x1720 && c <= 0x173F)
      UnicodeBlock.HANUNOO
    else if (c >= 0x1740 && c <= 0x175F)
      UnicodeBlock.BUHID
    else if (c >= 0x1760 && c <= 0x177F)
      UnicodeBlock.TAGBANWA
    else if (c >= 0x1780 && c <= 0x17FF)
      UnicodeBlock.KHMER
    else if (c >= 0x1800 && c <= 0x18AF)
      UnicodeBlock.MONGOLIAN
    else if (c >= 0x18B0 && c <= 0x18FF)
      UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED
    else if (c >= 0x1900 && c <= 0x194F)
      UnicodeBlock.LIMBU
    else if (c >= 0x1950 && c <= 0x197F)
      UnicodeBlock.TAI_LE
    else if (c >= 0x1980 && c <= 0x19DF)
      UnicodeBlock.NEW_TAI_LUE
    else if (c >= 0x19E0 && c <= 0x19FF)
      UnicodeBlock.KHMER_SYMBOLS
    else if (c >= 0x1A00 && c <= 0x1A1F)
      UnicodeBlock.BUGINESE
    else if (c >= 0x1A20 && c <= 0x1AAF)
      UnicodeBlock.TAI_THAM
    else if (c >= 0x1B00 && c <= 0x1B7F)
      UnicodeBlock.BALINESE
    else if (c >= 0x1B80 && c <= 0x1BBF)
      UnicodeBlock.SUNDANESE
    else if (c >= 0x1BC0 && c <= 0x1BFF)
      UnicodeBlock.BATAK
    else if (c >= 0x1C00 && c <= 0x1C4F)
      UnicodeBlock.LEPCHA
    else if (c >= 0x1C50 && c <= 0x1C7F)
      UnicodeBlock.OL_CHIKI
    else if (c >= 0x1CC0 && c <= 0x1CCF)
      UnicodeBlock.SUNDANESE_SUPPLEMENT
    else if (c >= 0x1CD0 && c <= 0x1CFF)
      UnicodeBlock.VEDIC_EXTENSIONS
    else if (c >= 0x1D00 && c <= 0x1D7F)
      UnicodeBlock.PHONETIC_EXTENSIONS
    else if (c >= 0x1D80 && c <= 0x1DBF)
      UnicodeBlock.PHONETIC_EXTENSIONS_SUPPLEMENT
    else if (c >= 0x1DC0 && c <= 0x1DFF)
      UnicodeBlock.COMBINING_DIACRITICAL_MARKS_SUPPLEMENT
    else if (c >= 0x1E00 && c <= 0x1EFF)
      UnicodeBlock.LATIN_EXTENDED_ADDITIONAL
    else if (c >= 0x1F00 && c <= 0x1FFF)
      UnicodeBlock.GREEK_EXTENDED
    else if (c >= 0x2000 && c <= 0x206F)
      UnicodeBlock.GENERAL_PUNCTUATION
    else if (c >= 0x2070 && c <= 0x209F)
      UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS
    else if (c >= 0x20A0 && c <= 0x20CF)
      UnicodeBlock.CURRENCY_SYMBOLS
    else if (c >= 0x20D0 && c <= 0x20FF)
      UnicodeBlock.COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS
    else if (c >= 0x2100 && c <= 0x214F)
      UnicodeBlock.LETTERLIKE_SYMBOLS
    else if (c >= 0x2150 && c <= 0x218F)
      UnicodeBlock.NUMBER_FORMS
    else if (c >= 0x2190 && c <= 0x21FF)
      UnicodeBlock.ARROWS
    else if (c >= 0x2200 && c <= 0x22FF)
      UnicodeBlock.MATHEMATICAL_OPERATORS
    else if (c >= 0x2300 && c <= 0x23FF)
      UnicodeBlock.MISCELLANEOUS_TECHNICAL
    else if (c >= 0x2400 && c <= 0x243F)
      UnicodeBlock.CONTROL_PICTURES
    else if (c >= 0x2440 && c <= 0x245F)
      UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION
    else if (c >= 0x2460 && c <= 0x24FF)
      UnicodeBlock.ENCLOSED_ALPHANUMERICS
    else if (c >= 0x2500 && c <= 0x257F)
      UnicodeBlock.BOX_DRAWING
    else if (c >= 0x2580 && c <= 0x259F)
      UnicodeBlock.BLOCK_ELEMENTS
    else if (c >= 0x25A0 && c <= 0x25FF)
      UnicodeBlock.GEOMETRIC_SHAPES
    else if (c >= 0x2600 && c <= 0x26FF)
      UnicodeBlock.MISCELLANEOUS_SYMBOLS
    else if (c >= 0x2700 && c <= 0x27BF)
      UnicodeBlock.DINGBATS
    else if (c >= 0x27C0 && c <= 0x27EF)
      UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A
    else if (c >= 0x27F0 && c <= 0x27FF)
      UnicodeBlock.SUPPLEMENTAL_ARROWS_A
    else if (c >= 0x2800 && c <= 0x28FF)
      UnicodeBlock.BRAILLE_PATTERNS
    else if (c >= 0x2900 && c <= 0x297F)
      UnicodeBlock.SUPPLEMENTAL_ARROWS_B
    else if (c >= 0x2980 && c <= 0x29FF)
      UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B
    else if (c >= 0x2A00 && c <= 0x2AFF)
      UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS
    else if (c >= 0x2B00 && c <= 0x2BFF)
      UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS
    else if (c >= 0x2C00 && c <= 0x2C5F)
      UnicodeBlock.GLAGOLITIC
    else if (c >= 0x2C60 && c <= 0x2C7F)
      UnicodeBlock.LATIN_EXTENDED_C
    else if (c >= 0x2C80 && c <= 0x2CFF)
      UnicodeBlock.COPTIC
    else if (c >= 0x2D00 && c <= 0x2D2F)
      UnicodeBlock.GEORGIAN_SUPPLEMENT
    else if (c >= 0x2D30 && c <= 0x2D7F)
      UnicodeBlock.TIFINAGH
    else if (c >= 0x2D80 && c <= 0x2DDF)
      UnicodeBlock.ETHIOPIC_EXTENDED
    else if (c >= 0x2DE0 && c <= 0x2DFF)
      UnicodeBlock.CYRILLIC_EXTENDED_A
    else if (c >= 0x2E00 && c <= 0x2E7F)
      UnicodeBlock.SUPPLEMENTAL_PUNCTUATION
    else if (c >= 0x2E80 && c <= 0x2EFF)
      UnicodeBlock.CJK_RADICALS_SUPPLEMENT
    else if (c >= 0x2F00 && c <= 0x2FDF)
      UnicodeBlock.KANGXI_RADICALS
    else if (c >= 0x2FF0 && c <= 0x2FFF)
      UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS
    else if (c >= 0x3000 && c <= 0x303F)
      UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
    else if (c >= 0x3040 && c <= 0x309F)
      UnicodeBlock.HIRAGANA
    else if (c >= 0x30A0 && c <= 0x30FF)
      UnicodeBlock.KATAKANA
    else if (c >= 0x3100 && c <= 0x312F)
      UnicodeBlock.BOPOMOFO
    else if (c >= 0x3130 && c <= 0x318F)
      UnicodeBlock.HANGUL_COMPATIBILITY_JAMO
    else if (c >= 0x3190 && c <= 0x319F)
      UnicodeBlock.KANBUN
    else if (c >= 0x31A0 && c <= 0x31BF)
      UnicodeBlock.BOPOMOFO_EXTENDED
    else if (c >= 0x31C0 && c <= 0x31EF)
      UnicodeBlock.CJK_STROKES
    else if (c >= 0x31F0 && c <= 0x31FF)
      UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
    else if (c >= 0x3200 && c <= 0x32FF)
      UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS
    else if (c >= 0x3300 && c <= 0x33FF)
      UnicodeBlock.CJK_COMPATIBILITY
    else if (c >= 0x3400 && c <= 0x4DBF)
      UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
    else if (c >= 0x4DC0 && c <= 0x4DFF)
      UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS
    else if (c >= 0x4E00 && c <= 0x9FFF)
      UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
    else if (c >= 0xA000 && c <= 0xA48F)
      UnicodeBlock.YI_SYLLABLES
    else if (c >= 0xA490 && c <= 0xA4CF)
      UnicodeBlock.YI_RADICALS
    else if (c >= 0xA4D0 && c <= 0xA4FF)
      UnicodeBlock.LISU
    else if (c >= 0xA500 && c <= 0xA63F)
      UnicodeBlock.VAI
    else if (c >= 0xA640 && c <= 0xA69F)
      UnicodeBlock.CYRILLIC_EXTENDED_B
    else if (c >= 0xA6A0 && c <= 0xA6FF)
      UnicodeBlock.BAMUM
    else if (c >= 0xA700 && c <= 0xA71F)
      UnicodeBlock.MODIFIER_TONE_LETTERS
    else if (c >= 0xA720 && c <= 0xA7FF)
      UnicodeBlock.LATIN_EXTENDED_D
    else if (c >= 0xA800 && c <= 0xA82F)
      UnicodeBlock.SYLOTI_NAGRI
    else if (c >= 0xA830 && c <= 0xA83F)
      UnicodeBlock.COMMON_INDIC_NUMBER_FORMS
    else if (c >= 0xA840 && c <= 0xA87F)
      UnicodeBlock.PHAGS_PA
    else if (c >= 0xA880 && c <= 0xA8DF)
      UnicodeBlock.SAURASHTRA
    else if (c >= 0xA8E0 && c <= 0xA8FF)
      UnicodeBlock.DEVANAGARI_EXTENDED
    else if (c >= 0xA900 && c <= 0xA92F)
      UnicodeBlock.KAYAH_LI
    else if (c >= 0xA930 && c <= 0xA95F)
      UnicodeBlock.REJANG
    else if (c >= 0xA960 && c <= 0xA97F)
      UnicodeBlock.HANGUL_JAMO_EXTENDED_A
    else if (c >= 0xA980 && c <= 0xA9DF)
      UnicodeBlock.JAVANESE
    else if (c >= 0xAA00 && c <= 0xAA5F)
      UnicodeBlock.CHAM
    else if (c >= 0xAA60 && c <= 0xAA7F)
      UnicodeBlock.MYANMAR_EXTENDED_A
    else if (c >= 0xAA80 && c <= 0xAADF)
      UnicodeBlock.TAI_VIET
    else if (c >= 0xAAE0 && c <= 0xAAFF)
      UnicodeBlock.MEETEI_MAYEK_EXTENSIONS
    else if (c >= 0xAB00 && c <= 0xAB2F)
      UnicodeBlock.ETHIOPIC_EXTENDED_A
    else if (c >= 0xABC0 && c <= 0xABFF)
      UnicodeBlock.MEETEI_MAYEK
    else if (c >= 0xAC00 && c <= 0xD7AF)
      UnicodeBlock.HANGUL_SYLLABLES
    else if (c >= 0xD7B0 && c <= 0xD7FF)
      UnicodeBlock.HANGUL_JAMO_EXTENDED_B
    else if (c >= 0xD800 && c <= 0xDB7F)
      UnicodeBlock.HIGH_SURROGATES
    else if (c >= 0xDB80 && c <= 0xDBFF)
      UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES
    else if (c >= 0xDC00 && c <= 0xDFFF)
      UnicodeBlock.LOW_SURROGATES
    else if (c >= 0xE000 && c <= 0xF8FF)
      UnicodeBlock.PRIVATE_USE_AREA
    else if (c >= 0xF900 && c <= 0xFAFF)
      UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
    else if (c >= 0xFB00 && c <= 0xFB4F)
      UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS
    else if (c >= 0xFB50 && c <= 0xFDFF)
      UnicodeBlock.ARABIC_PRESENTATION_FORMS_A
    else if (c >= 0xFE00 && c <= 0xFE0F)
      UnicodeBlock.VARIATION_SELECTORS
    else if (c >= 0xFE10 && c <= 0xFE1F)
      UnicodeBlock.VERTICAL_FORMS
    else if (c >= 0xFE20 && c <= 0xFE2F)
      UnicodeBlock.COMBINING_HALF_MARKS
    else if (c >= 0xFE30 && c <= 0xFE4F)
      UnicodeBlock.CJK_COMPATIBILITY_FORMS
    else if (c >= 0xFE50 && c <= 0xFE6F)
      UnicodeBlock.SMALL_FORM_VARIANTS
    else if (c >= 0xFE70 && c <= 0xFEFF)
      UnicodeBlock.ARABIC_PRESENTATION_FORMS_B
    else if (c >= 0xFF00 && c <= 0xFFEF)
      UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
    else if (c >= 0xFFF0 && c <= 0xFFFF)
      UnicodeBlock.SPECIALS
    else if (c >= 0x10000 && c <= 0x1007F)
      UnicodeBlock.LINEAR_B_SYLLABARY
    else if (c >= 0x10080 && c <= 0x100FF)
      UnicodeBlock.LINEAR_B_IDEOGRAMS
    else if (c >= 0x10100 && c <= 0x1013F)
      UnicodeBlock.AEGEAN_NUMBERS
    else if (c >= 0x10140 && c <= 0x1018F)
      UnicodeBlock.ANCIENT_GREEK_NUMBERS
    else if (c >= 0x10190 && c <= 0x101CF)
      UnicodeBlock.ANCIENT_SYMBOLS
    else if (c >= 0x101D0 && c <= 0x101FF)
      UnicodeBlock.PHAISTOS_DISC
    else if (c >= 0x10280 && c <= 0x1029F)
      UnicodeBlock.LYCIAN
    else if (c >= 0x102A0 && c <= 0x102DF)
      UnicodeBlock.CARIAN
    else if (c >= 0x10300 && c <= 0x1032F)
      UnicodeBlock.OLD_ITALIC
    else if (c >= 0x10330 && c <= 0x1034F)
      UnicodeBlock.GOTHIC
    else if (c >= 0x10380 && c <= 0x1039F)
      UnicodeBlock.UGARITIC
    else if (c >= 0x103A0 && c <= 0x103DF)
      UnicodeBlock.OLD_PERSIAN
    else if (c >= 0x10400 && c <= 0x1044F)
      UnicodeBlock.DESERET
    else if (c >= 0x10450 && c <= 0x1047F)
      UnicodeBlock.SHAVIAN
    else if (c >= 0x10480 && c <= 0x104AF)
      UnicodeBlock.OSMANYA
    else if (c >= 0x10800 && c <= 0x1083F)
      UnicodeBlock.CYPRIOT_SYLLABARY
    else if (c >= 0x10840 && c <= 0x1085F)
      UnicodeBlock.IMPERIAL_ARAMAIC
    else if (c >= 0x10900 && c <= 0x1091F)
      UnicodeBlock.PHOENICIAN
    else if (c >= 0x10920 && c <= 0x1093F)
      UnicodeBlock.LYDIAN
    else if (c >= 0x10980 && c <= 0x1099F)
      UnicodeBlock.MEROITIC_HIEROGLYPHS
    else if (c >= 0x109A0 && c <= 0x109FF)
      UnicodeBlock.MEROITIC_CURSIVE
    else if (c >= 0x10A00 && c <= 0x10A5F)
      UnicodeBlock.KHAROSHTHI
    else if (c >= 0x10A60 && c <= 0x10A7F)
      UnicodeBlock.OLD_SOUTH_ARABIAN
    else if (c >= 0x10B00 && c <= 0x10B3F)
      UnicodeBlock.AVESTAN
    else if (c >= 0x10B40 && c <= 0x10B5F)
      UnicodeBlock.INSCRIPTIONAL_PARTHIAN
    else if (c >= 0x10B60 && c <= 0x10B7F)
      UnicodeBlock.INSCRIPTIONAL_PAHLAVI
    else if (c >= 0x10C00 && c <= 0x10C4F)
      UnicodeBlock.OLD_TURKIC
    else if (c >= 0x10E60 && c <= 0x10E7F)
      UnicodeBlock.RUMI_NUMERAL_SYMBOLS
    else if (c >= 0x11000 && c <= 0x1107F)
      UnicodeBlock.BRAHMI
    else if (c >= 0x11080 && c <= 0x110CF)
      UnicodeBlock.KAITHI
    else if (c >= 0x110D0 && c <= 0x110FF)
      UnicodeBlock.SORA_SOMPENG
    else if (c >= 0x11100 && c <= 0x1114F)
      UnicodeBlock.CHAKMA
    else if (c >= 0x11180 && c <= 0x111DF)
      UnicodeBlock.SHARADA
    else if (c >= 0x11680 && c <= 0x116CF)
      UnicodeBlock.TAKRI
    else if (c >= 0x12000 && c <= 0x123FF)
      UnicodeBlock.CUNEIFORM
    else if (c >= 0x12400 && c <= 0x1247F)
      UnicodeBlock.CUNEIFORM_NUMBERS_AND_PUNCTUATION
    else if (c >= 0x13000 && c <= 0x1342F)
      UnicodeBlock.EGYPTIAN_HIEROGLYPHS
    else if (c >= 0x16800 && c <= 0x16A3F)
      UnicodeBlock.BAMUM_SUPPLEMENT
    else if (c >= 0x16F00 && c <= 0x16F9F)
      UnicodeBlock.MIAO
    else if (c >= 0x1B000 && c <= 0x1B0FF)
      UnicodeBlock.KANA_SUPPLEMENT
    else if (c >= 0x1D000 && c <= 0x1D0FF)
      UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS
    else if (c >= 0x1D100 && c <= 0x1D1FF)
      UnicodeBlock.MUSICAL_SYMBOLS
    else if (c >= 0x1D200 && c <= 0x1D24F)
      UnicodeBlock.ANCIENT_GREEK_MUSICAL_NOTATION
    else if (c >= 0x1D300 && c <= 0x1D35F)
      UnicodeBlock.TAI_XUAN_JING_SYMBOLS
    else if (c >= 0x1D360 && c <= 0x1D37F)
      UnicodeBlock.COUNTING_ROD_NUMERALS
    else if (c >= 0x1D400 && c <= 0x1D7FF)
      UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS
    else if (c >= 0x1EE00 && c <= 0x1EEFF)
      UnicodeBlock.ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS
    else if (c >= 0x1F000 && c <= 0x1F02F)
      UnicodeBlock.MAHJONG_TILES
    else if (c >= 0x1F030 && c <= 0x1F09F)
      UnicodeBlock.DOMINO_TILES
    else if (c >= 0x1F0A0 && c <= 0x1F0FF)
      UnicodeBlock.PLAYING_CARDS
    else if (c >= 0x1F100 && c <= 0x1F1FF)
      UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT
    else if (c >= 0x1F200 && c <= 0x1F2FF)
      UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT
    else if (c >= 0x1F300 && c <= 0x1F5FF)
      UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS
    else if (c >= 0x1F600 && c <= 0x1F64F)
      UnicodeBlock.EMOTICONS
    else if (c >= 0x1F680 && c <= 0x1F6FF)
      UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS
    else if (c >= 0x1F700 && c <= 0x1F77F)
      UnicodeBlock.ALCHEMICAL_SYMBOLS
    else if (c >= 0x20000 && c <= 0x2A6DF)
      UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
    else if (c >= 0x2A700 && c <= 0x2B73F)
      UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C
    else if (c >= 0x2B740 && c <= 0x2B81F)
      UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D
    else if (c >= 0x2F800 && c <= 0x2FA1F)
      UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT
    else if (c >= 0xE0000 && c <= 0xE007F)
      UnicodeBlock.TAGS
    else if (c >= 0xE0100 && c <= 0xE01EF)
      UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT
    else if (c >= 0xF0000 && c <= 0xFFFFF)
      UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A
    else if (c >= 0x100000 && c <= 0x10FFFF)
      UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B
    else
      UnicodeBlock.UNKNOWN
  }
}

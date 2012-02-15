name := "guess-language"
 

resolvers += "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots"

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots"

resolvers += "Scala Tools Release" at "http://scala-tools.org/repo-releases"



// Customize any further dependencies as desired
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "0.9.30" % "compile->default",
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.squeryl" %% "squeryl" % "0.9.4",
  "postgresql" % "postgresql" % "8.4-701.jdbc4"
)

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"

//scalacOptions += "-encoding"

//scalacOptions += "UTF-8"

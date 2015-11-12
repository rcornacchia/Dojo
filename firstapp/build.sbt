name := """firstapp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies += jdbc

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs

)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.34"


val appDependencies = Seq(
  "mysql" % "mysql-connector-java" % "5.1.21"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true


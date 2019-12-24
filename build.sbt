import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPyTest",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "me.shadaj" %% "scalapy-core" % "0.3.0"

)

fork := true

javaOptions += "-Djava.library.path=/usr/local/lib/python3.7/site-packages/jep"


// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

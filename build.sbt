// -*- scala -*-
name := "urlcode"

organization := "net.mashijp"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

resolvers += "mtgto repos" at "http://scala-irc-bot.github.com/scala-irc-bot/maven/"

resolvers += "twitter repos" at "http://maven.twttr.com"

libraryDependencies := Seq(
  "net.mtgto" %% "scala-irc-bot" % "0.2.0-SNAPSHOT" % "provided",
  "junit" % "junit" % "4.10" % "test",
  "org.specs2" %% "specs2" % "1.12.3" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-encoding", "UTF8")

ScctPlugin.instrumentSettings

testOptions in ScctTest += Tests.Argument(TestFrameworks.Specs2, "console", "junitxml")

org.scalastyle.sbt.ScalastylePlugin.Settings

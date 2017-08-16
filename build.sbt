name := """TrafficSignalFP"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "junit" % "junit" % "4.12"

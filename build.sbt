
name := "a"

description := "Project A from testing_dsbt."

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.5"

organization := "buongiorno"

organizationName := "Buongiorno, Inc."

credentials in ThisBuild += Credentials(Path.userHome / ".ivy2" / ".credentials-rover")

publishTo := Some("rover" at "http://localhost:8088/artifactory/toni-maven/")

publishMavenStyle := true


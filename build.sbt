name := "e"

description := "Project E from testing_dsbt, depends on B."

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.5"

organization := "buongiorno"

organizationName := "Buongiorno, Inc."

credentials in ThisBuild += Credentials(Path.userHome / ".ivy2" / ".credentials-rover")

publishTo := Some("rover" at "http://localhost:8088/artifactory/toni-maven/")

publishMavenStyle := true

libraryDependencies += "buongiorno" %% "b" % "0.1-SNAPSHOT"

resolvers += "rover" at "http://localhost:8088/artifactory/toni-maven/"

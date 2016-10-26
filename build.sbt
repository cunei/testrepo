name := "i"

description := "Project I from testing_dsbt, depends on E and G."

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.5"

organization := "buongiorno"

organizationName := "Buongiorno, Inc."

credentials in ThisBuild += Credentials(Path.userHome / ".ivy2" / ".credentials-rover")

publishTo := Some("rover" at "http://localhost:8088/artifactory/toni-maven/")

publishMavenStyle := true

libraryDependencies += "buongiorno" %% "e" % "0.1-SNAPSHOT"

libraryDependencies += "buongiorno" %% "g" % "0.1-SNAPSHOT"

resolvers += "rover" at "http://localhost:8088/artifactory/toni-maven/"

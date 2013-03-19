name := "g"

description := "Project G from testing_dsbt, depends on D."

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

organization := "buongiorno"

organizationName := "Buongiorno, Inc."

credentials in ThisBuild += Credentials(Path.userHome / ".ivy2" / ".credentials-rover")

publishTo := Some("rover" at "http://localhost:8088/artifactory/toni-maven/")

publishMavenStyle := true

libraryDependencies += "buongiorno" %% "d" % "0.1-SNAPSHOT"

resolvers += "rover" at "http://localhost:8088/artifactory/toni-maven/"

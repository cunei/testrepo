name := "c"

description := "Project C from testing_dsbt....."

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

organization := "buongiorno"

organizationName := "Buongiorno, Inc."

credentials in ThisBuild += Credentials(Path.userHome / ".ivy2" / ".credentials-rover")

publishTo := Some(Resolver.url("roverout", new URL("http://localhost:8088/artifactory/tonirepo/temp-distributed-build-snapshots/"))(Resolver.ivyStylePatterns))

publishMavenStyle := false

libraryDependencies += "buongiorno" %% "a" % "0.1-SNAPSHOT"

resolvers += "rover" at "http://localhost:8088/artifactory/toni-maven/"

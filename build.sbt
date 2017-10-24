name         := "fs-collections"
version      := "0.1"
scalaVersion := "2.12.3"
crossScalaVersions := Seq("2.11.11", "2.12.3")

resolvers ++= Seq(
  // com.github.*
  "jitpack" at "https://jitpack.io"
)

libraryDependencies ++= Seq(
  "com.github.frozenspider" %% "fs-common-utils"    % "0.1.3",
  // Test
  "junit"                   %  "junit"              % "4.12"  % "test",
  "org.scalactic"           %% "scalactic"          % "3.0.4" % "test",
  "org.scalatest"           %% "scalatest"          % "3.0.4" % "test"
)

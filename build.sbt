ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "logging-elk-example",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic"         % "1.4.4",
      "tf.tofu"       %% "tofu-logging"            % "0.10.8",
      "tf.tofu"       %% "tofu-logging-derivation" % "0.10.8",
      "tf.tofu"       %% "tofu-kernel-ce3-interop" % "0.10.8",
      "org.typelevel" %% "cats-effect"             % "3.3.14"
    ),
    scalacOptions ++= Seq("-Ymacro-annotations")
  )

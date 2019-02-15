scalaVersion := "2.12.7"

scalacOptions ++= Seq(
        "-Ypartial-unification",
        "-feature",
        "-language:existentials",
        "-language:higherKinds",
        "-language:implicitConversions",
        "-language:experimental.macros",
        // "-Xplugin-list",
        "-Xplugin-require:macroparadise",
        "-Xexperimental", 
        "-Ymacro-debug-lite"
)

// addCompilVerPlugin(
//   ("org.scalameta" % "paradise" % "3.0.0-M11").cross(CrossVersion.full))

libraryDependencies ++= Seq(
  compilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)
)

libraryDependencies += 
  "org.typelevel" %% "cats-tagless-macros" % "0.2.0"  //latest version indicated in the badge above



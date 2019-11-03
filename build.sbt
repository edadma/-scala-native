name := "-scala-native"

version := "0.1.0"

scalaVersion := "2.11.12"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

nativeMode := "debug"

nativeLinkingOptions := Seq( s"-L/${baseDirectory.value}/native-lib" )

scalacOptions ++= Seq( "-deprecation", "-feature", "-unchecked", "-language:postfixOps", "-language:implicitConversions", "-language:existentials" )

organization := "xyz.hyperreal"

mainClass in (Compile, run) := Some( "xyz.hyperreal." + name.value.replace('-', '_') + ".Main" )

licenses := Seq("ISC" -> url("https://opensource.org/licenses/ISC"))

homepage := Some(url("https://github.com/edadma/" + name.value))

enablePlugins(ScalaNativePlugin)

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.1" % "test"

testFrameworks += new TestFramework( "utest.runner.Framework" )

libraryDependencies ++= Seq(
  "com.github.scopt" %%% "scopt" % "3.7.0"
)

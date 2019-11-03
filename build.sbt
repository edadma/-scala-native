name := "-scala-native"

version := "0.1.0"

scalaVersion := "2.11.12"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

scalacOptions ++= Seq( "-deprecation", "-feature", "-unchecked", "-language:postfixOps", "-language:implicitConversions", "-language:existentials" )

organization := "xyz.hyperreal"

mainClass in (Compile, run) := Some( "xyz.hyperreal." + name.value.replace('-', '_') + ".Main" )

licenses := Seq("ISC" -> url("https://opensource.org/licenses/ISC"))

homepage := Some(url("https://github.com/edadma/" + name.value))

enablePlugins(ScalaNativePlugin)

import AssemblyKeys._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.2"

seq(assemblySettings: _*)

jarName in assembly <<= (name, version) { (name, version) => name + "-" + version + ".jar" }

mainClass in assembly := Some("HelloWorld")

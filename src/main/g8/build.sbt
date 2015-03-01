// ========== basic ==========
name := "$name$"
organization := "$organization$"
version := "$version$"
scalaVersion := "2.11.5"

// ========== for sbt-assembly ==========
assemblyJarName in assembly := name.value + "-" + version.value + ".jar"
mainClass in assembly := Some("$organization$.Main")

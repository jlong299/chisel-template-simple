# A simple template for Chisel project
> Note: the Chisel version of this project is 6.0.0-M3 
## Prerequisite
1. Install JVM
2. Install SBT (Scala Build Tool)
3. Install Firtool (to generate Verilog)

> See [Chisel Local Setup](https://github.com/chipsalliance/chisel/blob/main/SETUP.md) for details.
## Files introduction
- **project/build.properties**: specifies the sbt version
- **project/plugin.sbt**:  add sbt plugins
- **src/main/scala/example.scala**: source code
- **build.sbt**: sbt build file

## Generate Verilog file
Run command below to generate SV file.
```
sbt "runMain example.GenSV"
```
The generated SV file locates in folder **generated/**

> See example.scala for the module defination and SV emitting method.

## (Optional) If you prefer Mill
**build.sc** is the mill build file.

Run Mill command below to generate SV file
```
mill temp.runMain example.GenSV
```
## For v3.5.x and earlier version of Chisel
No need to install Firtool because v3.5.x and earlier ones use SFC (Scala FIRRTL Compiler).

A reference build.sbt of v3.5.x is as below.
```scala
scalaVersion := "2.12.13"
val chiselVersion = "3.5.5"

scalacOptions ++= Seq(
  "-feature",
  "-language:reflectiveCalls",
  "-deprecation",
  "-Xcheckinit",
  "-P:chiselplugin:genBundleElements",
)

addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % chiselVersion cross CrossVersion.full)
libraryDependencies += "edu.berkeley.cs" %% "chisel3" % chiselVersion
```
An example of Verilog emitting for v3.5.x is:
```scala
emitVerilog(new Example(), Array("--target-dir", "generated"))
```

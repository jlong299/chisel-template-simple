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

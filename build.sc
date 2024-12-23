// import Mill dependency
import mill._
import mill.define.Sources
import mill.modules.Util
import mill.scalalib.TestModule.ScalaTest
import scalalib._
// support BSP
import mill.bsp._

val pwd = os.Path("/home/long/work/chisel-template-simple/")

// If you want to use RootModule of the following line, pls remove the 'def millSourcePath' line.
// object `package` extends RootModule with SbtModule { m =>
object temp extends SbtModule { m =>
  override def millSourcePath = pwd
  // println(millSourcePath)
  override def scalaVersion = "2.13.10"
  override def scalacOptions = Seq(
    "-language:reflectiveCalls",
    "-deprecation",
    "-feature",
    "-Xcheckinit",
  )
  override def ivyDeps = Agg(
    ivy"org.chipsalliance::chisel:6.6.0",
  )
  override def scalacPluginIvyDeps = Agg(
    ivy"org.chipsalliance:::chisel-plugin:6.6.0",
  )
}


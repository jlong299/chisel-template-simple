package example

import chisel3._

class Example extends Module {
  val io = IO(new Bundle() {
    val in = Input(UInt(4.W))
    val out = Output(UInt(4.W))
  })  
  io.out := io.in
}

import circt.stage.ChiselStage

object GenSV extends App {
  ChiselStage.emitSystemVerilogFile(
    new Example,
    Array("--target-dir", "generated"), // target dir
    // following options are optional
    Array("--lowering-options=disallowLocalVariables,disallowPortDeclSharing")
  )
}
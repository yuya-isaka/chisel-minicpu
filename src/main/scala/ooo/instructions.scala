package ooo

import chisel3._
import chisel3.util._

/* Automatically generated by parse-opcodes */
object Instructions {
  def BEQ                = BitPat("b?????????????????000?????1100011")
  def BNE                = BitPat("b?????????????????001?????1100011")
  def BLT                = BitPat("b?????????????????100?????1100011")
  def BGE                = BitPat("b?????????????????101?????1100011")
  def BLTU               = BitPat("b?????????????????110?????1100011")
  def BGEU               = BitPat("b?????????????????111?????1100011")
  def JALR               = BitPat("b?????????????????000?????1100111")
  def JAL                = BitPat("b?????????????????????????1101111")
  def LUI                = BitPat("b?????????????????????????0110111")
  def AUIPC              = BitPat("b?????????????????????????0010111")
  def ADDI               = BitPat("b?????????????????000?????0010011")
  def SLLI               = BitPat("b000000???????????001?????0010011")
  def SLTI               = BitPat("b?????????????????010?????0010011")
  def SLTIU              = BitPat("b?????????????????011?????0010011")
  def XORI               = BitPat("b?????????????????100?????0010011")
  def SRLI               = BitPat("b000000???????????101?????0010011")
  def SRAI               = BitPat("b010000???????????101?????0010011")
  def ORI                = BitPat("b?????????????????110?????0010011")
  def ANDI               = BitPat("b?????????????????111?????0010011")
  def ADD                = BitPat("b0000000??????????000?????0110011")
  def SUB                = BitPat("b0100000??????????000?????0110011")
  def SLL                = BitPat("b0000000??????????001?????0110011")
  def SLT                = BitPat("b0000000??????????010?????0110011")
  def SLTU               = BitPat("b0000000??????????011?????0110011")
  def XOR                = BitPat("b0000000??????????100?????0110011")
  def SRL                = BitPat("b0000000??????????101?????0110011")
  def SRA                = BitPat("b0100000??????????101?????0110011")
  def OR                 = BitPat("b0000000??????????110?????0110011")
  def AND                = BitPat("b0000000??????????111?????0110011")
  def ADDIW              = BitPat("b?????????????????000?????0011011")
  def SLLIW              = BitPat("b0000000??????????001?????0011011")
  def SRLIW              = BitPat("b0000000??????????101?????0011011")
  def SRAIW              = BitPat("b0100000??????????101?????0011011")
  def ADDW               = BitPat("b0000000??????????000?????0111011")
  def SUBW               = BitPat("b0100000??????????000?????0111011")
  def SLLW               = BitPat("b0000000??????????001?????0111011")
  def SRLW               = BitPat("b0000000??????????101?????0111011")
  def SRAW               = BitPat("b0100000??????????101?????0111011")
  def LB                 = BitPat("b?????????????????000?????0000011")
  def LH                 = BitPat("b?????????????????001?????0000011")
  def LW                 = BitPat("b?????????????????010?????0000011")
  def LD                 = BitPat("b?????????????????011?????0000011")
  def LBU                = BitPat("b?????????????????100?????0000011")
  def LHU                = BitPat("b?????????????????101?????0000011")
  def LWU                = BitPat("b?????????????????110?????0000011")
  def SB                 = BitPat("b?????????????????000?????0100011")
  def SH                 = BitPat("b?????????????????001?????0100011")
  def SW                 = BitPat("b?????????????????010?????0100011")
  def SD                 = BitPat("b?????????????????011?????0100011")
  def FENCE              = BitPat("b?????????????????000?????0001111")
  def FENCE_I            = BitPat("b?????????????????001?????0001111")
  def MUL                = BitPat("b0000001??????????000?????0110011")
  def MULH               = BitPat("b0000001??????????001?????0110011")
  def MULHSU             = BitPat("b0000001??????????010?????0110011")
  def MULHU              = BitPat("b0000001??????????011?????0110011")
  def DIV                = BitPat("b0000001??????????100?????0110011")
  def DIVU               = BitPat("b0000001??????????101?????0110011")
  def REM                = BitPat("b0000001??????????110?????0110011")
  def REMU               = BitPat("b0000001??????????111?????0110011")
  def MULW               = BitPat("b0000001??????????000?????0111011")
  def DIVW               = BitPat("b0000001??????????100?????0111011")
  def DIVUW              = BitPat("b0000001??????????101?????0111011")
  def REMW               = BitPat("b0000001??????????110?????0111011")
  def REMUW              = BitPat("b0000001??????????111?????0111011")
  def LR_W               = BitPat("b00010??00000?????010?????0101111")
  def SC_W               = BitPat("b00011????????????010?????0101111")
  def LR_D               = BitPat("b00010??00000?????011?????0101111")
  def SC_D               = BitPat("b00011????????????011?????0101111")
  def ECALL              = BitPat("b00000000000000000000000001110011")
  def EBREAK             = BitPat("b00000000000100000000000001110011")
  def URET               = BitPat("b00000000001000000000000001110011")
  def MRET               = BitPat("b00110000001000000000000001110011")
  def DRET               = BitPat("b01111011001000000000000001110011")
  def SFENCE_VMA         = BitPat("b0001001??????????000000001110011")
  def WFI                = BitPat("b00010000010100000000000001110011")
  def CSRRW              = BitPat("b?????????????????001?????1110011")
  def CSRRS              = BitPat("b?????????????????010?????1110011")
  def CSRRC              = BitPat("b?????????????????011?????1110011")
  def CSRRWI             = BitPat("b?????????????????101?????1110011")
  def CSRRSI             = BitPat("b?????????????????110?????1110011")
  def CSRRCI             = BitPat("b?????????????????111?????1110011")
  def CUSTOM0            = BitPat("b?????????????????000?????0001011")
  def CUSTOM0_RS1        = BitPat("b?????????????????010?????0001011")
  def CUSTOM0_RS1_RS2    = BitPat("b?????????????????011?????0001011")
  def CUSTOM0_RD         = BitPat("b?????????????????100?????0001011")
  def CUSTOM0_RD_RS1     = BitPat("b?????????????????110?????0001011")
  def CUSTOM0_RD_RS1_RS2 = BitPat("b?????????????????111?????0001011")
  def CUSTOM1            = BitPat("b?????????????????000?????0101011")
  def CUSTOM1_RS1        = BitPat("b?????????????????010?????0101011")
  def CUSTOM1_RS1_RS2    = BitPat("b?????????????????011?????0101011")
  def CUSTOM1_RD         = BitPat("b?????????????????100?????0101011")
  def CUSTOM1_RD_RS1     = BitPat("b?????????????????110?????0101011")
  def CUSTOM1_RD_RS1_RS2 = BitPat("b?????????????????111?????0101011")
  def CUSTOM2            = BitPat("b?????????????????000?????1011011")
  def CUSTOM2_RS1        = BitPat("b?????????????????010?????1011011")
  def CUSTOM2_RS1_RS2    = BitPat("b?????????????????011?????1011011")
  def CUSTOM2_RD         = BitPat("b?????????????????100?????1011011")
  def CUSTOM2_RD_RS1     = BitPat("b?????????????????110?????1011011")
  def CUSTOM2_RD_RS1_RS2 = BitPat("b?????????????????111?????1011011")
  def CUSTOM3            = BitPat("b?????????????????000?????1111011")
  def CUSTOM3_RS1        = BitPat("b?????????????????010?????1111011")
  def CUSTOM3_RS1_RS2    = BitPat("b?????????????????011?????1111011")
  def CUSTOM3_RD         = BitPat("b?????????????????100?????1111011")
  def CUSTOM3_RD_RS1     = BitPat("b?????????????????110?????1111011")
  def CUSTOM3_RD_RS1_RS2 = BitPat("b?????????????????111?????1111011")
  def SLLI_RV32          = BitPat("b0000000??????????001?????0010011")
  def SRLI_RV32          = BitPat("b0000000??????????101?????0010011")
  def SRAI_RV32          = BitPat("b0100000??????????101?????0010011")
  def RDCYCLE            = BitPat("b11000000000000000010?????1110011")
  def RDTIME             = BitPat("b11000000000100000010?????1110011")
  def RDINSTRET          = BitPat("b11000000001000000010?????1110011")
  def RDCYCLEH           = BitPat("b11001000000000000010?????1110011")
  def RDTIMEH            = BitPat("b11001000000100000010?????1110011")
  def RDINSTRETH         = BitPat("b11001000001000000010?????1110011")
}


object CsrAddr {
  val cycle          = 0xc00
  val instret        = 0xc02
  val hpmcounter3    = 0xc03
  val hpmcounter4    = 0xc04
  val hpmcounter5    = 0xc05
  val hpmcounter6    = 0xc06
  val hpmcounter7    = 0xc07
  val hpmcounter8    = 0xc08
  val hpmcounter9    = 0xc09
  val hpmcounter10   = 0xc0a
  val hpmcounter11   = 0xc0b
  val hpmcounter12   = 0xc0c
  val hpmcounter13   = 0xc0d
  val hpmcounter14   = 0xc0e
  val hpmcounter15   = 0xc0f
  val hpmcounter16   = 0xc10
  val hpmcounter17   = 0xc11
  val hpmcounter18   = 0xc12
  val hpmcounter19   = 0xc13
  val hpmcounter20   = 0xc14
  val hpmcounter21   = 0xc15
  val hpmcounter22   = 0xc16
  val hpmcounter23   = 0xc17
  val hpmcounter24   = 0xc18
  val hpmcounter25   = 0xc19
  val hpmcounter26   = 0xc1a
  val hpmcounter27   = 0xc1b
  val hpmcounter28   = 0xc1c
  val hpmcounter29   = 0xc1d
  val hpmcounter30   = 0xc1e
  val hpmcounter31   = 0xc1f
  val mstatus        = 0x300
  val misa           = 0x301
  val medeleg        = 0x302
  val mideleg        = 0x303
  val mie            = 0x304
  val mtvec          = 0x305
  val mscratch       = 0x340
  val mcounteren     = 0x306
  val mepc           = 0x341
  val mcause         = 0x342
  val mtval          = 0x343
  val mip            = 0x344
  val tselect        = 0x7a0
  val tdata1         = 0x7a1
  val tdata2         = 0x7a2
  val tdata3         = 0x7a3
  val dcsr           = 0x7b0
  val dpc            = 0x7b1
  val dscratch       = 0x7b2
  val mcycle         = 0xb00
  val minstret       = 0xb02
  val mhpmcounter3   = 0xb03
  val mhpmcounter4   = 0xb04
  val mhpmcounter5   = 0xb05
  val mhpmcounter6   = 0xb06
  val mhpmcounter7   = 0xb07
  val mhpmcounter8   = 0xb08
  val mhpmcounter9   = 0xb09
  val mhpmcounter10  = 0xb0a
  val mhpmcounter11  = 0xb0b
  val mhpmcounter12  = 0xb0c
  val mhpmcounter13  = 0xb0d
  val mhpmcounter14  = 0xb0e
  val mhpmcounter15  = 0xb0f
  val mhpmcounter16  = 0xb10
  val mhpmcounter17  = 0xb11
  val mhpmcounter18  = 0xb12
  val mhpmcounter19  = 0xb13
  val mhpmcounter20  = 0xb14
  val mhpmcounter21  = 0xb15
  val mhpmcounter22  = 0xb16
  val mhpmcounter23  = 0xb17
  val mhpmcounter24  = 0xb18
  val mhpmcounter25  = 0xb19
  val mhpmcounter26  = 0xb1a
  val mhpmcounter27  = 0xb1b
  val mhpmcounter28  = 0xb1c
  val mhpmcounter29  = 0xb1d
  val mhpmcounter30  = 0xb1e
  val mhpmcounter31  = 0xb1f
  val mucounteren    = 0x320
  val mhpmevent3     = 0x323
  val mhpmevent4     = 0x324
  val mhpmevent5     = 0x325
  val mhpmevent6     = 0x326
  val mhpmevent7     = 0x327
  val mhpmevent8     = 0x328
  val mhpmevent9     = 0x329
  val mhpmevent10    = 0x32a
  val mhpmevent11    = 0x32b
  val mhpmevent12    = 0x32c
  val mhpmevent13    = 0x32d
  val mhpmevent14    = 0x32e
  val mhpmevent15    = 0x32f
  val mhpmevent16    = 0x330
  val mhpmevent17    = 0x331
  val mhpmevent18    = 0x332
  val mhpmevent19    = 0x333
  val mhpmevent20    = 0x334
  val mhpmevent21    = 0x335
  val mhpmevent22    = 0x336
  val mhpmevent23    = 0x337
  val mhpmevent24    = 0x338
  val mhpmevent25    = 0x339
  val mhpmevent26    = 0x33a
  val mhpmevent27    = 0x33b
  val mhpmevent28    = 0x33c
  val mhpmevent29    = 0x33d
  val mhpmevent30    = 0x33e
  val mhpmevent31    = 0x33f
  val mvendorid      = 0xf11
  val marchid        = 0xf12
  val mimpid         = 0xf13
  val mhartid        = 0xf14
  val cycleh         = 0xc80
  val instreth       = 0xc82
  val hpmcounter3h   = 0xc83
  val hpmcounter4h   = 0xc84
  val hpmcounter5h   = 0xc85
  val hpmcounter6h   = 0xc86
  val hpmcounter7h   = 0xc87
  val hpmcounter8h   = 0xc88
  val hpmcounter9h   = 0xc89
  val hpmcounter10h  = 0xc8a
  val hpmcounter11h  = 0xc8b
  val hpmcounter12h  = 0xc8c
  val hpmcounter13h  = 0xc8d
  val hpmcounter14h  = 0xc8e
  val hpmcounter15h  = 0xc8f
  val hpmcounter16h  = 0xc90
  val hpmcounter17h  = 0xc91
  val hpmcounter18h  = 0xc92
  val hpmcounter19h  = 0xc93
  val hpmcounter20h  = 0xc94
  val hpmcounter21h  = 0xc95
  val hpmcounter22h  = 0xc96
  val hpmcounter23h  = 0xc97
  val hpmcounter24h  = 0xc98
  val hpmcounter25h  = 0xc99
  val hpmcounter26h  = 0xc9a
  val hpmcounter27h  = 0xc9b
  val hpmcounter28h  = 0xc9c
  val hpmcounter29h  = 0xc9d
  val hpmcounter30h  = 0xc9e
  val hpmcounter31h  = 0xc9f
  val mcycleh        = 0xb80
  val minstreth      = 0xb82
  val mhpmcounter3h  = 0xb83
  val mhpmcounter4h  = 0xb84
  val mhpmcounter5h  = 0xb85
  val mhpmcounter6h  = 0xb86
  val mhpmcounter7h  = 0xb87
  val mhpmcounter8h  = 0xb88
  val mhpmcounter9h  = 0xb89
  val mhpmcounter10h = 0xb8a
  val mhpmcounter11h = 0xb8b
  val mhpmcounter12h = 0xb8c
  val mhpmcounter13h = 0xb8d
  val mhpmcounter14h = 0xb8e
  val mhpmcounter15h = 0xb8f
  val mhpmcounter16h = 0xb90
  val mhpmcounter17h = 0xb91
  val mhpmcounter18h = 0xb92
  val mhpmcounter19h = 0xb93
  val mhpmcounter20h = 0xb94
  val mhpmcounter21h = 0xb95
  val mhpmcounter22h = 0xb96
  val mhpmcounter23h = 0xb97
  val mhpmcounter24h = 0xb98
  val mhpmcounter25h = 0xb99
  val mhpmcounter26h = 0xb9a
  val mhpmcounter27h = 0xb9b
  val mhpmcounter28h = 0xb9c
  val mhpmcounter29h = 0xb9d
  val mhpmcounter30h = 0xb9e
  val mhpmcounter31h = 0xb9f
}

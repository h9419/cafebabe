package cafebabe

object ByteCodes {
  import ClassFileTypes._
  import AbstractByteCodes._

  sealed abstract class ByteCode(val code: U1, se: Option[Int], l: Option[Int]) extends AbstractByteCode {
    val size: Int = 1
    val stackEffect: Option[Int] = se
    val length: Option[Int] = l
    override def toStream(bs: ByteStream): ByteStream = bs << code
  }

  private def intToOptionInt(i: Int) = Some(i)

  case object AALOAD extends ByteCode(0x32, Some(-1), Some(1))
  case object AASTORE extends ByteCode(0x53, Some(-3), Some(1))
  case object ACONST_NULL extends ByteCode(0x1, Some(1), Some(1))
  case object ALOAD_0 extends ByteCode(0x2A, Some(1), Some(1))
  case object ALOAD_1 extends ByteCode(0x2B, Some(1), Some(1))
  case object ALOAD_2 extends ByteCode(0x2C, Some(1), Some(1))
  case object ALOAD_3 extends ByteCode(0x2D, Some(1), Some(1))
  case object ALOAD extends ByteCode(0x19, Some(1), Some(2))
  case object ANEWARRAY extends ByteCode(0xBD, Some(0), Some(3))
  case object ARETURN extends ByteCode(0xB0, Some(-1), Some(1))
  case object ARRAYLENGTH extends ByteCode(0xBE, Some(0), Some(1))
  case object ASTORE_0 extends ByteCode(0x4B, Some(-1), Some(1))
  case object ASTORE_1 extends ByteCode(0x4C, Some(-1), Some(1))
  case object ASTORE_2 extends ByteCode(0x4D, Some(-1), Some(1))
  case object ASTORE_3 extends ByteCode(0x4E, Some(-1), Some(1))
  case object ASTORE extends ByteCode(0x3A, Some(-1), Some(2))
  case object ATHROW extends ByteCode(0xBF, Some(-1), Some(1))
  case object BALOAD extends ByteCode(0x33, Some(-1), Some(1))
  case object BASTORE extends ByteCode(0x54, Some(-3), Some(1))
  case object BIPUSH extends ByteCode(0x10, Some(1), Some(2))
  case object CALOAD extends ByteCode(0x34, Some(-1), Some(1))
  case object CASTORE extends ByteCode(0x55, Some(-3), Some(1))
  case object CHECKCAST extends ByteCode(0xC0, Some(0), Some(3))
  case object D2F extends ByteCode(0x90, Some(-1), Some(1))
  case object D2I extends ByteCode(0x8E, Some(-1), Some(1))
  case object D2L extends ByteCode(0x8F, Some(0), Some(1))
  case object DADD extends ByteCode(0x63, Some(-2), Some(1))
  case object DALOAD extends ByteCode(0x31, Some(0), Some(1))
  case object DASTORE extends ByteCode(0x52, Some(-4), Some(1))
  case object DCMPG extends ByteCode(0x98, Some(-3), Some(1))
  case object DCMPL extends ByteCode(0x97, Some(-3), Some(1))
  case object DCONST_0 extends ByteCode(0xE, Some(2), Some(1))
  case object DCONST_1 extends ByteCode(0xF, Some(2), Some(1))
  case object DDIV extends ByteCode(0x6F, Some(-2), Some(1))
  case object DLOAD_0 extends ByteCode(0x26, Some(2), Some(1))
  case object DLOAD_1 extends ByteCode(0x27, Some(2), Some(1))
  case object DLOAD_2 extends ByteCode(0x28, Some(2), Some(1))
  case object DLOAD_3 extends ByteCode(0x29, Some(2), Some(1))
  case object DLOAD extends ByteCode(0x18, Some(2), Some(2))
  case object DMUL extends ByteCode(0x6B, Some(-2), Some(1))
  case object DNEG extends ByteCode(0x77, Some(0), Some(1))
  case object DREM extends ByteCode(0x73, Some(-2), Some(1))
  case object DRETURN extends ByteCode(0xAF, Some(-2), Some(1))
  case object DSTORE_0 extends ByteCode(0x47, Some(-2), Some(1))
  case object DSTORE_1 extends ByteCode(0x48, Some(-2), Some(1))
  case object DSTORE_2 extends ByteCode(0x49, Some(-2), Some(1))
  case object DSTORE_3 extends ByteCode(0x4A, Some(-2), Some(1))
  case object DSTORE extends ByteCode(0x39, Some(-2), Some(2))
  case object DSUB extends ByteCode(0x67, Some(-2), Some(1))
  case object DUP2 extends ByteCode(0x5C, Some(2), Some(1))
  case object DUP2_X1 extends ByteCode(0x5D, Some(2), Some(1))
  case object DUP2_X2 extends ByteCode(0x5E, Some(2), Some(1))
  case object DUP extends ByteCode(0x59, Some(1), Some(1))
  case object DUP_X1 extends ByteCode(0x5A, Some(1), Some(1))
  case object DUP_X2 extends ByteCode(0x5B, Some(1), Some(1))
  case object F2D extends ByteCode(0x8D, Some(1), Some(1))
  case object F2I extends ByteCode(0x8B, Some(0), Some(1))
  case object F2L extends ByteCode(0x8C, Some(1), Some(1))
  case object FADD extends ByteCode(0x62, Some(-1), Some(1))
  case object FALOAD extends ByteCode(0x30, Some(-1), Some(1))
  case object FASTORE extends ByteCode(0x51, Some(-3), Some(1))
  case object FCMPG extends ByteCode(0x96, Some(-1), Some(1))
  case object FCMPL extends ByteCode(0x95, Some(-1), Some(1))
  case object FCONST_0 extends ByteCode(0xB, Some(1), Some(1))
  case object FCONST_1 extends ByteCode(0xC, Some(1), Some(1))
  case object FCONST_2 extends ByteCode(0xD, Some(1), Some(1))
  case object FDIV extends ByteCode(0x6E, Some(-1), Some(1))
  case object FLOAD_0 extends ByteCode(0x22, Some(1), Some(1))
  case object FLOAD_1 extends ByteCode(0x23, Some(1), Some(1))
  case object FLOAD_2 extends ByteCode(0x24, Some(1), Some(1))
  case object FLOAD_3 extends ByteCode(0x25, Some(1), Some(1))
  case object FLOAD extends ByteCode(0x17, Some(1), Some(2))
  case object FMUL extends ByteCode(0x6A, Some(-1), Some(1))
  case object FNEG extends ByteCode(0x76, Some(0), Some(1))
  case object FREM extends ByteCode(0x72, Some(-1), Some(1))
  case object FRETURN extends ByteCode(0xAE, Some(-1), Some(1))
  case object FSTORE_0 extends ByteCode(0x43, Some(-1), Some(1))
  case object FSTORE_1 extends ByteCode(0x44, Some(-1), Some(1))
  case object FSTORE_2 extends ByteCode(0x45, Some(-1), Some(1))
  case object FSTORE_3 extends ByteCode(0x46, Some(-1), Some(1))
  case object FSTORE extends ByteCode(0x38, Some(-1), Some(2))
  case object FSUB extends ByteCode(0x66, Some(-1), Some(1))
  case object GETFIELD extends ByteCode(0xB4, None, Some(3))
  case object GETSTATIC extends ByteCode(0xB2, None, Some(3))
  case object GOTO extends ByteCode(0xA7, Some(0), Some(3))
  case object GOTO_W extends ByteCode(0xC8, Some(0), Some(5))
  case object I2B extends ByteCode(0x91, Some(0), Some(1))
  case object I2C extends ByteCode(0x92, Some(0), Some(1))
  case object I2D extends ByteCode(0x87, Some(1), Some(1))
  case object I2F extends ByteCode(0x86, Some(0), Some(1))
  case object I2L extends ByteCode(0x85, Some(1), Some(1))
  case object I2S extends ByteCode(0x93, Some(0), Some(1))
  case object IADD extends ByteCode(0x60, Some(-1), Some(1))
  case object IALOAD extends ByteCode(0x2E, Some(-1), Some(1))
  case object IAND extends ByteCode(0x7E, Some(-1), Some(1))
  case object IASTORE extends ByteCode(0x4F, Some(-3), Some(1))
  case object ICONST_0 extends ByteCode(0x3, Some(1), Some(1))
  case object ICONST_1 extends ByteCode(0x4, Some(1), Some(1))
  case object ICONST_2 extends ByteCode(0x5, Some(1), Some(1))
  case object ICONST_3 extends ByteCode(0x6, Some(1), Some(1))
  case object ICONST_4 extends ByteCode(0x7, Some(1), Some(1))
  case object ICONST_5 extends ByteCode(0x8, Some(1), Some(1))
  case object ICONST_M1 extends ByteCode(0x2, Some(1), Some(1))
  case object IDIV extends ByteCode(0x6C, Some(-1), Some(1))
  case object IF_ACMPEQ extends ByteCode(0xA5, Some(-2), Some(3))
  case object IF_ACMPNE extends ByteCode(0xA6, Some(-2), Some(3))
  case object IFEQ extends ByteCode(0x99, Some(-1), Some(3))
  case object IFGE extends ByteCode(0x9C, Some(-1), Some(3))
  case object IFGT extends ByteCode(0x9D, Some(-1), Some(3))
  case object IF_ICMPEQ extends ByteCode(0x9F, Some(-2), Some(3))
  case object IF_ICMPGE extends ByteCode(0xA2, Some(-2), Some(3))
  case object IF_ICMPGT extends ByteCode(0xA3, Some(-2), Some(3))
  case object IF_ICMPLE extends ByteCode(0xA4, Some(-2), Some(3))
  case object IF_ICMPLT extends ByteCode(0xA1, Some(-2), Some(3))
  case object IF_ICMPNE extends ByteCode(0xA0, Some(-2), Some(3))
  case object IFLE extends ByteCode(0x9E, Some(-1), Some(3))
  case object IFLT extends ByteCode(0x9B, Some(-1), Some(3))
  case object IFNE extends ByteCode(0x9A, Some(-1), Some(3))
  case object IFNONNULL extends ByteCode(0xC7, Some(-1), Some(3))
  case object IFNULL extends ByteCode(0xC6, Some(-1), Some(3))
  case object IINC extends ByteCode(0x84, Some(0), Some(3))
  case object ILOAD_0 extends ByteCode(0x1A, Some(1), Some(1))
  case object ILOAD_1 extends ByteCode(0x1B, Some(1), Some(1))
  case object ILOAD_2 extends ByteCode(0x1C, Some(1), Some(1))
  case object ILOAD_3 extends ByteCode(0x1D, Some(1), Some(1))
  case object ILOAD extends ByteCode(0x15, Some(1), Some(2))
  case object IMUL extends ByteCode(0x68, Some(-1), Some(1))
  case object INEG extends ByteCode(0x74, Some(0), Some(1))
  case object INSTANCEOF extends ByteCode(0xC1, Some(0), Some(3))
  case object INVOKEINTERFACE extends ByteCode(0xB9, None, Some(5))
  case object INVOKESPECIAL extends ByteCode(0xB7, None, Some(3))
  case object INVOKESTATIC extends ByteCode(0xB8, None, Some(3))
  case object INVOKEVIRTUAL extends ByteCode(0xB6, None, Some(3))
  case object IOR extends ByteCode(0x80, Some(-1), Some(1))
  case object IREM extends ByteCode(0x70, Some(-1), Some(1))
  case object IRETURN extends ByteCode(0xAC, Some(-1), Some(1))
  case object ISHL extends ByteCode(0x78, Some(-1), Some(1))
  case object ISHR extends ByteCode(0x7A, Some(-1), Some(1))
  case object ISTORE_0 extends ByteCode(0x3B, Some(-1), Some(1))
  case object ISTORE_1 extends ByteCode(0x3C, Some(-1), Some(1))
  case object ISTORE_2 extends ByteCode(0x3D, Some(-1), Some(1))
  case object ISTORE_3 extends ByteCode(0x3E, Some(-1), Some(1))
  case object ISTORE extends ByteCode(0x36, Some(-1), Some(2))
  case object ISUB extends ByteCode(0x64, Some(-1), Some(1))
  case object IUSHR extends ByteCode(0x7C, Some(-1), Some(1))
  case object IXOR extends ByteCode(0x82, Some(-1), Some(1))
  case object JSR extends ByteCode(0xA8, Some(1), Some(3))
  case object JSR_W extends ByteCode(0xC9, Some(1), Some(5))
  case object L2D extends ByteCode(0x8A, Some(0), Some(1))
  case object L2F extends ByteCode(0x89, Some(-1), Some(1))
  case object L2I extends ByteCode(0x88, Some(-1), Some(1))
  case object LADD extends ByteCode(0x61, Some(-2), Some(1))
  case object LALOAD extends ByteCode(0x2F, Some(0), Some(1))
  case object LAND extends ByteCode(0x7F, Some(-2), Some(1))
  case object LASTORE extends ByteCode(0x50, Some(-4), Some(1))
  case object LCMP extends ByteCode(0x94, Some(-3), Some(1))
  case object LCONST_0 extends ByteCode(0x9, Some(2), Some(1))
  case object LCONST_1 extends ByteCode(0xA, Some(2), Some(1))
  case object LDC2_W extends ByteCode(0x14, Some(2), Some(3))
  case object LDC extends ByteCode(0x12, Some(1), Some(2))
  case object LDC_W extends ByteCode(0x13, Some(1), Some(3))
  case object LDIV extends ByteCode(0x6D, Some(-2), Some(1))
  case object LLOAD_0 extends ByteCode(0x1E, Some(2), Some(1))
  case object LLOAD_1 extends ByteCode(0x1F, Some(2), Some(1))
  case object LLOAD_2 extends ByteCode(0x20, Some(2), Some(1))
  case object LLOAD_3 extends ByteCode(0x21, Some(2), Some(1))
  case object LLOAD extends ByteCode(0x16, Some(2), Some(2))
  case object LMUL extends ByteCode(0x69, Some(-2), Some(1))
  case object LNEG extends ByteCode(0x75, Some(0), Some(1))
  case object LOOKUPSWITCH extends ByteCode(0xAB, Some(-1), None)
  case object LOR extends ByteCode(0x81, Some(-2), Some(1))
  case object LREM extends ByteCode(0x71, Some(-2), Some(1))
  case object LRETURN extends ByteCode(0xAD, Some(-2), Some(1))
  case object LSHL extends ByteCode(0x79, Some(-1), Some(1))
  case object LSHR extends ByteCode(0x7B, Some(-1), Some(1))
  case object LSTORE_0 extends ByteCode(0x3F, Some(-2), Some(1))
  case object LSTORE_1 extends ByteCode(0x40, Some(-2), Some(1))
  case object LSTORE_2 extends ByteCode(0x41, Some(-2), Some(1))
  case object LSTORE_3 extends ByteCode(0x42, Some(-2), Some(1))
  case object LSTORE extends ByteCode(0x37, Some(-2), Some(2))
  case object LSUB extends ByteCode(0x65, Some(-2), Some(1))
  case object LUSHR extends ByteCode(0x7D, Some(-1), Some(1))
  case object LXOR extends ByteCode(0x83, Some(-2), Some(1))
  case object MONITORENTER extends ByteCode(0xC2, Some(-1), Some(1))
  case object MONITOREXIT extends ByteCode(0xC3, Some(-1), Some(1))
  case object MULTIANEWARRAY extends ByteCode(0xC5, None, Some(4))
  case object NEWARRAY extends ByteCode(0xBC, Some(0), Some(2))
  case object NEW extends ByteCode(0xBB, Some(1), Some(3))
  case object NOP extends ByteCode(0x0, Some(0), Some(1))
  case object POP2 extends ByteCode(0x58, Some(-2), Some(1))
  case object POP extends ByteCode(0x57, Some(-1), Some(1))
  case object PUTFIELD extends ByteCode(0xB5, None, Some(3))
  case object PUTSTATIC extends ByteCode(0xB3, None, Some(3))
  case object RET extends ByteCode(0xA9, Some(0), Some(2))
  case object RETURN extends ByteCode(0xB1, Some(0), Some(1))
  case object SALOAD extends ByteCode(0x35, Some(-1), Some(1))
  case object SASTORE extends ByteCode(0x56, Some(-3), Some(1))
  case object SIPUSH extends ByteCode(0x11, Some(1), Some(3))
  case object SWAP extends ByteCode(0x5F, Some(0), Some(1))
  case object TABLESWITCH extends ByteCode(0xAA, Some(-1), None)
  case object WIDE extends ByteCode(0xC4, None, None)
}

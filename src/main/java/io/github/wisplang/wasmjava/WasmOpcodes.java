package io.github.wisplang.wasmjava;// Created 2022-28-06T00:51:29

/**
 * All opcodes for WASM.
 *
 * @author KJP12
 * @see <a href="https://pengowray.github.io/wasm-ops/">WebAssembly Opcodes Table</a>
 * @since ${version}
 **/
public final class WasmOpcodes {
	private WasmOpcodes() {
		throw new UnsupportedOperationException();
	}

	public static final int
	// Block 0x0_

		UNREACHABLE = 0x00,
		NOP = 0x01,
		BLOCK = 0x02,
		LOOP = 0x03,
		IF = 0x04,
		ELSE = 0x05,
		TRY = 0x06,
		CATCH = 0x07,
		THROW = 0x08,
		RETHROW = 0x09,
		// RESERVED = 0x0A,
		END = 0x0B,
		BR = 0x0C,
		BR_IF = 0x0D,
		BR_TABLE = 0x0E,
		RETURN = 0x0F,

	// Block 0x1_

		CALL = 0x10,
		CALL_INDIRECT = 0x11,
		RETURN_CALL = 0x12,
		RETURN_CALL_INDIRECT = 0x13,
		// RESERVED = 0x14,
		// … 0x15,
		// … 0x16,
		// … 0x17,
		DELEGATE = 0x18,
		CATCH_ALL = 0x19,
		DROP = 0x1A,
		SELECT = 0x1B,
		SELECT_T = 0x1C,
		// RESERVED = 0x1D,
		// … 0x1E,
		// … 0x1F,

	// Block 0x2_

		LOCAL_GET = 0x20,
		LOCAL_SET = 0x21,
		LOCAL_TEE = 0x22,
		GLOBAL_GET = 0x23,
		GLOBAL_SET = 0x24,
		TABLE_GET = 0x25,
		TABLE_SET = 0x26,
		// RESERVED = 0x27,
		I32LOAD = 0x28,
		I64LOAD = 0x29,
		F32LOAD = 0x2A,
		F64LOAD = 0x2B,
		/**
		 * ILOAD as i8 - Signed Byte
		 */
		I32LOAD_S8 = 0x2C,
		/**
		 * ILOAD as u8 - Unsigned Byte
		 */
		I32LOAD_U8 = 0x2D,
		/**
		 * ILOAD as i16 - Signed Short
		 */
		I32LOAD_S16 = 0x2E,
		/**
		 * ILOAD as u16 - Unsigned Short
		 */
		I32LOAD_U16 = 0x2F,

	// Block 0x3_

		/**
		 * LLOAD as i8 - Signed Byte
		 */
		I64LOAD_S8 = 0x30,
		/**
		 * LLOAD as u8 - Unsigned Byte
		 */
		I64LOAD_U8 = 0x31,
		/**
		 * LLOAD as i16 - Signed Short
		 */
		I64LOAD_S16 = 0x32,
		/**
		 * LLOAD as u16 - Unsigned Short
		 */
		I64LOAD_U16 = 0x33,
		/**
		 * LLOAD as i32 - Signed Integer
		 */
		I64LOAD_S32 = 0x34,
		/**
		 * LLOAD as u32 - Unsigned Integer
		 */
		I64LOAD_U32 = 0x35,
		I32STORE = 0x36,
		I64STORE = 0x37,
		F32STORE = 0x38,
		F64STORE = 0x39,
		I32STORE_I8 = 0x3A,
		I32STORE_I16 = 0x3B,
		I64STORE_I8 = 0x3C,
		I64STORE_I16 = 0x3D,
		I64STORE_I32 = 0x3E,
		MEMORY_SIZE = 0x3F,

	// Block 0x4_

		MEMORY_GROW = 0x40,
		I32CONST = 0x41,
		I64CONST = 0x42,
		F32CONST = 0x43,
		F64CONST = 0x44,
		I32EQ_Z = 0x45, // I32 Comp
		I32EQ = 0x46,
		I32NE = 0x47,
		I32LT_S = 0x48,
		I32LT_U = 0x49,
		I32GT_S = 0x4A,
		I32GT_U = 0x4B,
		I32LE_S = 0x4C,
		I32LE_U = 0x4D,
		I32GE_S = 0x4E,
		I32GE_U = 0x4F,

	// Block 0x5_

		I64EQZ = 0x50,
		I64EQ = 0x51,
		I64NE = 0x52,
		I64LT_S = 0x53,
		I64LT_U = 0x54,
		I64GT_S = 0x55,
		I64GT_U = 0x56,
		I64LE_S = 0x57,
		I64LE_U = 0x58,
		I64GE_S = 0x59,
		I64GE_U = 0x5A,
		F32EQ = 0x5B,
		F32NE = 0x5C,
		F32LT = 0x5D,
		F32GT = 0x5E,
		F32LE = 0x5F,

	// Block 0x6_

		F32GE = 0x60,
		F64EQ = 0x61,
		F64NE = 0x62,
		F64LT = 0x63,
		F64GT = 0x64,
		F64LE = 0x65,
		F64GE = 0x66,
		/**
		 * Integer Count leading zeros
		 *
		 * @see Integer#numberOfLeadingZeros(int)
		 */
		I32CLZ = 0x67,
		/**
		 * Integer Count trailing zeros
		 *
		 * @see Integer#numberOfTrailingZeros(int)
		 */
		I32CTZ = 0x68,
		/**
		 * Number of 1 bits within the integer.
		 *
		 * @see Integer#bitCount(int)
		 * @see <a href="https://developer.mozilla.org/en-US/docs/WebAssembly/Reference/Numeric/Population_count">MDN WASM - {@code i32.popcnt}</a>
		 */
		I32POPCNT = 0x69,
		I32ADD = 0x6A,
		I32SUB = 0x6B,
		I32MUL = 0x6C,
		I32DIV_S = 0x6D,
		I32DIV_U = 0x6E,
		I32REM_S = 0x6F,

	// Block 0x7_

		I32REM_U = 0x70,
		I32AND = 0x71,
		I32OR = 0x72,
		I32XOR = 0x73,
		I32SHL = 0x74,
		/**
		 * Equivalent of ISHR
		 */
		I32SHR_S = 0x75,
		/**
		 * Equivalent of IUSHR
		 */
		I32SHR_U = 0x76,
		/**
		 * Rotate the integer to the left {@code n} bits.
		 *
		 * @see Integer#rotateLeft(int, int)
		 */
		I32ROTL = 0x77,
		/**
		 * Rotate the integer to the right {@code n} bits.
		 *
		 * @see Integer#rotateRight(int, int)
		 */
		I32ROTR = 0x78,
		/**
		 * Long Count leading zeros
		 *
		 * @see Long#numberOfLeadingZeros(long)
		 */
		I64CLZ = 0x79,
		/**
		 * Long Count trailing zeros
		 *
		 * @see Long#numberOfTrailingZeros(long)
		 */
		I64CTZ = 0x7A,
		/**
		 * Number of 1 bits within the long.
		 *
		 * @see Long#bitCount(long)
		 */
		I64POPCNT = 0x7B,
		I64ADD = 0x7C,
		I64SUB = 0x7D,
		I64MUL = 0x7E,
		I64DIV_S = 0x7F,
		I64DIV_U = 0x80,
		I64REM_S = 0x81,
		I64REM_U = 0x82,
		I64AND = 0x83,
		I64OR = 0x84,
		I64XOR = 0x85,
		I64SHL = 0x86,
		/**
		 * Equivalent of LSHR
		 */
		I64SHR_S = 0x87,
		/**
		 * Equivalent of LUSHR
		 */
		I64SHR_U = 0x88,
		/**
		 * Rotate the long to the left {@code n} bits.
		 *
		 * @see Long#rotateLeft(long, int)
		 */
		I64ROTL = 0x89,
		/**
		 * Rotate the long to the right {@code n} bits.
		 *
		 * @see Long#rotateRight(long, int)
		 */
		I64ROTR = 0x8A,
		F32ABS = 0x8B,
		F32NEG = 0x8C,
		F32CEIL = 0x8D,
		F32FLOOR = 0x8E,
		F32TRUNC = 0x8F,

	// Block 0x9_

		F32NEAREST = 0x90,
		F32SQRT = 0x91,
		F32ADD = 0x92,
		F32SUB = 0x93,
		F32MUL = 0x94,
		F32DIV = 0x95,
		F32MIN = 0x96,
		F32MAX = 0x97,
		F32COPYSIGN = 0x98,
		F64ABS = 0x99,
		F64NEG = 0x9A,
		F64CEIL = 0x9B,
		F64FLOOR = 0x9C,
		F64TRUNC = 0x9D,
		F64NEAREST = 0x9E,
		F64SQRT = 0x9F,

	// Block 0xA_

		F64ADD = 0xA0,
		F64SUB = 0xA1,
		F64MUL = 0xA2,
		F64DIV = 0xA3,
		F64MIN = 0xA4,
		F64MAX = 0xA5,
		F64COPYSIGN = 0xA6,
		I32WRAP_I64 = 0xA7,
		I32TRUNC_F32_S = 0xA8,
		I32TRUNC_F32_U = 0xA9,
		I32TRUNC_F64_S = 0xAA,
		I32TRUNC_F64_U = 0xAB,
		I64EXTEND_I32_S = 0xAC,
		I64EXTEND_I32_U = 0xAD,
		I64TRUNC_F32_S = 0xAE,
		I64TRUNC_F32_U = 0xAF,

	// Block 0xB_

		I64TRUNC_F64_S = 0xB0,
		I64TRUNC_F64_U = 0xB1,
		F32CONVERT_I32_S = 0xB2,
		F32CONVERT_I32_U = 0xB3,
		F32CONVERT_I64_S = 0xB4,
		F32CONVERT_I64_U = 0xB5,
		F32DEMOTE_F64 = 0xB6,
		F64CONVERT_I32_S = 0xB7,
		F64CONVERT_I32_U = 0xB8,
		F64CONVERT_I64_S = 0xB9,
		F64CONVERT_I64_U = 0xBA,
		F64PROMOTE_F32 = 0xBB,
		/**
		 * Casts a given float to its bitwise representation.
		 *
		 * @see Float#floatToIntBits(float)
		 */
		I32REINTERPRET_F32 = 0xBC,
		/**
		 * Casts a given double to its bitwise representation.
		 *
		 * @see Double#doubleToLongBits(double)
		 */
		I64REINTERPRET_F64 = 0xBD,
		/**
		 * Casts a given bitwise representation to a float.
		 *
		 * @see Float#intBitsToFloat(int)
		 */
		F32REINTERPRET_I32 = 0xBE,
		/**
		 * Casts a given bitwise representation to a double.
		 *
		 * @see Double#longBitsToDouble(long)
		 */
		F64REINTERPRET_I64 = 0xBF,

	// Block 0xC_

		I32EXTEND_8_S = 0xC0,
		I32EXTEND_16_S = 0xC1,
		I64EXTEND_8_S = 0xC2,
		I64EXTEND_16_S = 0xC3,
		I64EXTEND_32_S = 0xC4,
		// RESERVED = 0xC5,
		// … 0xC6,
		// … 0xC7,
		// … 0xC8,
		// … 0xC9,
		// … 0xCA,
		// … 0xCB,
		// … 0xCC,
		// … 0xCD,
		// … 0xCE,
		// … 0xCF,

	// Block 0xD_

		REFNULL = 0xD0,
		REFISNULL = 0xD1,
		REFFUNC = 0xD2,
		// RESERVED = 0xD3,
		// … 0xD4,
		// … 0xD5,
		// … 0xD6,
		// … 0xD7,
		// … 0xD8,
		// … 0xD9,
		// … 0xDA,
		// … 0xDB,
		// … 0xDC,
		// … 0xDD,
		// … 0xDE,
		// … 0xDF,

	// Block 0xE_ not present.

	// Block 0xF_

		// RESERVED = 0xF0,
		// … 0xF1,
		// … 0xF2,
		// … 0xF3,
		// … 0xF4,
		// … 0xF5,
		// … 0xF6,
		// … 0xF7,
		// … 0xF8,
		// … 0xF9,
		// … 0xFA,
		// … 0xFB,
		// … 0xFC,
		SIMD = 0xFD;
		// RESERVED = 0xFE,
		// … 0xFF,
}

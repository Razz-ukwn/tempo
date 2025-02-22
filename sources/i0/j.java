package i0;

public final class j implements Comparable<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9379a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9380b = Float.intBitsToFloat(1056964608);

    public static final class a {
    }

    static {
        a(1.0f);
        a(-1.0f);
    }

    public static short a(float f10) {
        int i8;
        int i10;
        f9379a.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 31;
        int i15 = 0;
        if (i12 == 255) {
            if (i13 != 0) {
                i10 = 512;
            }
            i8 = (i11 << 15) | (i14 << 10) | i15;
            return (short) i8;
        }
        int i16 = (i12 - 127) + 15;
        if (i16 >= 31) {
            i14 = 49;
        } else if (i16 > 0) {
            i15 = i13 >> 13;
            if ((i13 & 4096) != 0) {
                i8 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                return (short) i8;
            }
            i14 = i16;
        } else if (i16 >= -10) {
            int i17 = (i13 | 8388608) >> (1 - i16);
            if ((i17 & 4096) != 0) {
                i17 += 8192;
            }
            i10 = i17 >> 13;
            i14 = 0;
        } else {
            i14 = 0;
        }
        i8 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i8;
        i15 = i10;
        i8 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i8;
    }

    public static final float b(short s10) {
        int i8;
        int i10;
        int i11;
        short s11 = s10 & 65535;
        short s12 = 32768 & s11;
        int i12 = (s11 >>> 10) & 31;
        short s13 = s11 & 1023;
        if (i12 != 0) {
            int i13 = s13 << 13;
            if (i12 == 31) {
                i11 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i11 = (i12 - 15) + 127;
            }
            int i14 = i11;
            i10 = i13;
            i8 = i14;
        } else if (s13 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s13 + 1056964608) - f9380b;
            return s12 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i8 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (s12 << 16) | i10);
    }
}

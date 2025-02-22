package h0;

import e9.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f9062a = ((((long) Float.floatToIntBits(0.0f)) << 32) | (((long) Float.floatToIntBits(0.0f)) & 4294967295L));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f9063b = 0;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        if (b(j10) == c(j10)) {
            return "CornerRadius.circular(" + c.p(b(j10)) + ')';
        }
        return "CornerRadius.elliptical(" + c.p(b(j10)) + ", " + c.p(c(j10)) + ')';
    }
}

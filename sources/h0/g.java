package h0;

import cb.c;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final long f9086b = c.f(0.0f, 0.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final long f9087c = c.f(Float.NaN, Float.NaN);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f9088d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f9089a;

    public /* synthetic */ g(long j10) {
        this.f9089a = j10;
    }

    public static final float a(long j10) {
        if (j10 != f9087c) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float b(long j10) {
        if (j10 != f9087c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static String c(long j10) {
        if (!(j10 != f9087c)) {
            return "Size.Unspecified";
        }
        return "Size(" + e9.c.p(b(j10)) + ", " + e9.c.p(a(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f9089a == ((g) obj).f9089a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9089a);
    }

    public final String toString() {
        return c(this.f9089a);
    }
}

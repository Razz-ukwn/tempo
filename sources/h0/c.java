package h0;

import d2.f1;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final long f9068b = f1.f(0.0f, 0.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final long f9069c = f1.f(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d  reason: collision with root package name */
    public static final long f9070d = f1.f(Float.NaN, Float.NaN);

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f9071e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f9072a;

    public /* synthetic */ c(long j10) {
        this.f9072a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        if (j10 != f9070d) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float c(long j10) {
        if (j10 != f9070d) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static String d(long j10) {
        if (!(j10 != f9070d)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + e9.c.p(b(j10)) + ", " + e9.c.p(c(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f9072a == ((c) obj).f9072a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9072a);
    }

    public final String toString() {
        return d(this.f9072a);
    }
}

package f1;

import ag.n2;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final long f8029b = n2.a(Float.NaN, Float.NaN);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8030c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f8031a;

    static {
        float f10 = (float) 0;
        n2.a(f10, f10);
    }

    public /* synthetic */ f(long j10) {
        this.f8031a = j10;
    }

    public static final float a(long j10) {
        if (j10 != f8029b) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j10) {
        if (j10 != f8029b) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f8031a == ((f) obj).f8031a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8031a);
    }

    public final String toString() {
        long j10 = f8029b;
        long j11 = this.f8031a;
        if (!(j11 != j10)) {
            return "DpOffset.Unspecified";
        }
        return "(" + e.b(a(j11)) + ", " + e.b(b(j11)) + ')';
    }
}

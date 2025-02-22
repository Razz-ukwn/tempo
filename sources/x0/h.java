package x0;

import gc.b;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final long f16906b = b.c(0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f16907c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f16908a;

    public /* synthetic */ h(long j10) {
        this.f16908a = j10;
    }

    public static final int a(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int b(long j10) {
        int i8 = (int) (j10 >> 32);
        return i8 > a(j10) ? i8 : a(j10);
    }

    public static final int c(long j10) {
        int i8 = (int) (j10 >> 32);
        return i8 > a(j10) ? a(j10) : i8;
    }

    public static String d(long j10) {
        return "TextRange(" + ((int) (j10 >> 32)) + ", " + a(j10) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f16908a == ((h) obj).f16908a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16908a);
    }

    public final String toString() {
        return d(this.f16908a);
    }
}

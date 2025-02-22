package e1;

import i0.i;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f7767a;

    public b(long j10) {
        this.f7767a = j10;
        if (!(j10 != i.f9376e)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public final long a() {
        return this.f7767a;
    }

    public final void b() {
    }

    public final float c() {
        return i.c(this.f7767a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.b(this.f7767a, ((b) obj).f7767a);
    }

    public final int hashCode() {
        int i8 = i.f9377f;
        return Long.hashCode(this.f7767a);
    }

    public final String toString() {
        return "ColorStyle(value=" + i.h(this.f7767a) + ')';
    }
}

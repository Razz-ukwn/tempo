package z5;

import z5.d;

public final class a extends d.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d<a> f17722d;

    /* renamed from: b  reason: collision with root package name */
    public float f17723b;

    /* renamed from: c  reason: collision with root package name */
    public float f17724c;

    static {
        d<a> a10 = d.a(256, new a(0));
        f17722d = a10;
        a10.f17737f = 0.5f;
    }

    public a() {
    }

    public static a b(float f10, float f11) {
        a b10 = f17722d.b();
        b10.f17723b = f10;
        b10.f17724c = f11;
        return b10;
    }

    public final d.a a() {
        return new a(0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17723b == aVar.f17723b && this.f17724c == aVar.f17724c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17723b) ^ Float.floatToIntBits(this.f17724c);
    }

    public final String toString() {
        return this.f17723b + "x" + this.f17724c;
    }

    public a(int i8) {
        this.f17723b = 0.0f;
        this.f17724c = 0.0f;
    }
}

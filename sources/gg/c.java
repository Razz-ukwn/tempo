package gg;

import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public float f9002a;

    /* renamed from: b  reason: collision with root package name */
    public float f9003b;

    public c() {
        this(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(Float.valueOf(this.f9002a), Float.valueOf(cVar.f9002a)) && j.a(Float.valueOf(this.f9003b), Float.valueOf(cVar.f9003b));
    }

    public final int hashCode() {
        return Float.hashCode(this.f9003b) + (Float.hashCode(this.f9002a) * 31);
    }

    public final String toString() {
        return "Vector(x=" + this.f9002a + ", y=" + this.f9003b + ')';
    }

    public c(float f10, float f11) {
        this.f9002a = f10;
        this.f9003b = f11;
    }
}

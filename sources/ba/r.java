package ba;

import ba.b0;

public final class r extends b0.e.d.a.b.C0047d {

    /* renamed from: a  reason: collision with root package name */
    public final String f3557a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3558b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0047d.C0048a> f3559c;

    public r() {
        throw null;
    }

    public r(String str, int i8, c0 c0Var) {
        this.f3557a = str;
        this.f3558b = i8;
        this.f3559c = c0Var;
    }

    public final c0<b0.e.d.a.b.C0047d.C0048a> a() {
        return this.f3559c;
    }

    public final int b() {
        return this.f3558b;
    }

    public final String c() {
        return this.f3557a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.C0047d)) {
            return false;
        }
        b0.e.d.a.b.C0047d dVar = (b0.e.d.a.b.C0047d) obj;
        return this.f3557a.equals(dVar.c()) && this.f3558b == dVar.b() && this.f3559c.equals(dVar.a());
    }

    public final int hashCode() {
        return ((((this.f3557a.hashCode() ^ 1000003) * 1000003) ^ this.f3558b) * 1000003) ^ this.f3559c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f3557a + ", importance=" + this.f3558b + ", frames=" + this.f3559c + "}";
    }
}

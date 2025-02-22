package ba;

import ba.d0;

public final class x extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0.a f3592a;

    /* renamed from: b  reason: collision with root package name */
    public final d0.c f3593b;

    /* renamed from: c  reason: collision with root package name */
    public final d0.b f3594c;

    public x(y yVar, a0 a0Var, z zVar) {
        this.f3592a = yVar;
        this.f3593b = a0Var;
        this.f3594c = zVar;
    }

    public final d0.a a() {
        return this.f3592a;
    }

    public final d0.b b() {
        return this.f3594c;
    }

    public final d0.c c() {
        return this.f3593b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f3592a.equals(d0Var.a()) && this.f3593b.equals(d0Var.c()) && this.f3594c.equals(d0Var.b());
    }

    public final int hashCode() {
        return ((((this.f3592a.hashCode() ^ 1000003) * 1000003) ^ this.f3593b.hashCode()) * 1000003) ^ this.f3594c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f3592a + ", osData=" + this.f3593b + ", deviceData=" + this.f3594c + "}";
    }
}

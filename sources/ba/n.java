package ba;

import ba.b0;

public final class n extends b0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0047d> f3536a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.e.d.a.b.C0046b f3537b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.a f3538c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.c f3539d;

    /* renamed from: e  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0044a> f3540e;

    public n() {
        throw null;
    }

    public n(c0 c0Var, b0.e.d.a.b.C0046b bVar, b0.a aVar, b0.e.d.a.b.c cVar, c0 c0Var2) {
        this.f3536a = c0Var;
        this.f3537b = bVar;
        this.f3538c = aVar;
        this.f3539d = cVar;
        this.f3540e = c0Var2;
    }

    public final b0.a a() {
        return this.f3538c;
    }

    public final c0<b0.e.d.a.b.C0044a> b() {
        return this.f3540e;
    }

    public final b0.e.d.a.b.C0046b c() {
        return this.f3537b;
    }

    public final b0.e.d.a.b.c d() {
        return this.f3539d;
    }

    public final c0<b0.e.d.a.b.C0047d> e() {
        return this.f3536a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b)) {
            return false;
        }
        b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
        c0<b0.e.d.a.b.C0047d> c0Var = this.f3536a;
        if (c0Var != null ? c0Var.equals(bVar.e()) : bVar.e() == null) {
            b0.e.d.a.b.C0046b bVar2 = this.f3537b;
            if (bVar2 != null ? bVar2.equals(bVar.c()) : bVar.c() == null) {
                b0.a aVar = this.f3538c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f3539d.equals(bVar.d()) && this.f3540e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = 0;
        c0<b0.e.d.a.b.C0047d> c0Var = this.f3536a;
        int hashCode = ((c0Var == null ? 0 : c0Var.hashCode()) ^ 1000003) * 1000003;
        b0.e.d.a.b.C0046b bVar = this.f3537b;
        int hashCode2 = (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        b0.a aVar = this.f3538c;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return ((((i8 ^ hashCode2) * 1000003) ^ this.f3539d.hashCode()) * 1000003) ^ this.f3540e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f3536a + ", exception=" + this.f3537b + ", appExitInfo=" + this.f3538c + ", signal=" + this.f3539d + ", binaries=" + this.f3540e + "}";
    }
}

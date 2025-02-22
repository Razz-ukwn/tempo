package b0;

import b0.m;
import ff.m;
import rf.l;
import sf.j;

public final class f extends h {

    /* renamed from: e  reason: collision with root package name */
    public final l<Object, m> f2907e;

    /* renamed from: f  reason: collision with root package name */
    public int f2908f = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i8, k kVar, l<Object, m> lVar) {
        super(i8, kVar);
        j.f(kVar, "invalid");
        this.f2907e = lVar;
    }

    public final void c() {
        if (!this.f2912c) {
            k(this);
            super.c();
        }
    }

    public final l<Object, m> f() {
        return this.f2907e;
    }

    public final boolean g() {
        return true;
    }

    public final l<Object, m> h() {
        return null;
    }

    public final void j(h hVar) {
        j.f(hVar, "snapshot");
        this.f2908f++;
    }

    public final void k(h hVar) {
        j.f(hVar, "snapshot");
        int i8 = this.f2908f - 1;
        this.f2908f = i8;
        if (i8 == 0) {
            a();
        }
    }

    public final void l() {
    }

    public final void m(g0 g0Var) {
        j.f(g0Var, "state");
        m.a aVar = m.f2940a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public final h r(l<Object, ff.m> lVar) {
        m.d(this);
        return new d(this.f2911b, this.f2910a, lVar, this);
    }
}

package b0;

import b0.m;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class d extends h {

    /* renamed from: e  reason: collision with root package name */
    public final h f2898e;

    /* renamed from: f  reason: collision with root package name */
    public final l<Object, m> f2899f;

    public static final class a extends k implements l<Object, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l<Object, m> f2900a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Object, m> f2901b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l<Object, m> lVar, l<Object, m> lVar2) {
            super(1);
            this.f2900a = lVar;
            this.f2901b = lVar2;
        }

        public final Object invoke(Object obj) {
            j.f(obj, "state");
            this.f2900a.invoke(obj);
            this.f2901b.invoke(obj);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i8, k kVar, l<Object, m> lVar, h hVar) {
        super(i8, kVar);
        j.f(kVar, "invalid");
        j.f(hVar, "parent");
        this.f2898e = hVar;
        hVar.j(this);
        if (lVar != null) {
            l<Object, m> f10 = hVar.f();
            if (f10 != null) {
                lVar = new a(lVar, f10);
            }
        } else {
            lVar = hVar.f();
        }
        this.f2899f = lVar;
    }

    public final void c() {
        if (!this.f2912c) {
            int i8 = this.f2911b;
            h hVar = this.f2898e;
            if (i8 != hVar.d()) {
                a();
            }
            hVar.k(this);
            super.c();
        }
    }

    public final l<Object, m> f() {
        return this.f2899f;
    }

    public final boolean g() {
        return true;
    }

    public final l<Object, m> h() {
        return null;
    }

    public final void j(h hVar) {
        j.f(hVar, "snapshot");
        v.a();
        throw null;
    }

    public final void k(h hVar) {
        j.f(hVar, "snapshot");
        v.a();
        throw null;
    }

    public final void l() {
    }

    public final void m(g0 g0Var) {
        j.f(g0Var, "state");
        m.a aVar = m.f2940a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public final h r(l lVar) {
        return new d(this.f2911b, this.f2910a, lVar, this.f2898e);
    }
}

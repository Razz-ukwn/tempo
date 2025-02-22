package b0;

import ff.m;
import rf.l;
import sf.j;

public final class j0 extends h {

    /* renamed from: e  reason: collision with root package name */
    public final h f2926e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2927f = false;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2928g;

    /* renamed from: h  reason: collision with root package name */
    public final l<Object, m> f2929h;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = r3.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j0(b0.h r3, rf.l r4, boolean r5) {
        /*
            r2 = this;
            b0.k r0 = b0.k.f2930e
            r1 = 0
            r2.<init>(r1, r0)
            r2.f2926e = r3
            r2.f2927f = r1
            r2.f2928g = r5
            if (r3 == 0) goto L_0x0014
            rf.l r3 = r3.f()
            if (r3 != 0) goto L_0x001e
        L_0x0014:
            java.util.concurrent.atomic.AtomicReference<b0.a> r3 = b0.m.f2948i
            java.lang.Object r3 = r3.get()
            b0.a r3 = (b0.a) r3
            rf.l<java.lang.Object, ff.m> r3 = r3.f2887e
        L_0x001e:
            rf.l r3 = b0.m.j(r4, r3, r1)
            r2.f2929h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.j0.<init>(b0.h, rf.l, boolean):void");
    }

    public final void c() {
        h hVar;
        this.f2912c = true;
        if (this.f2928g && (hVar = this.f2926e) != null) {
            hVar.c();
        }
    }

    public final int d() {
        return s().d();
    }

    public final k e() {
        return s().e();
    }

    public final l<Object, m> f() {
        return this.f2929h;
    }

    public final boolean g() {
        return s().g();
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
        s().l();
    }

    public final void m(g0 g0Var) {
        j.f(g0Var, "state");
        s().m(g0Var);
    }

    public final h r(l<Object, m> lVar) {
        l<Object, m> j10 = m.j(lVar, this.f2929h, true);
        return !this.f2927f ? m.g(s().r((l<Object, m>) null), j10, true) : s().r(j10);
    }

    public final h s() {
        h hVar = this.f2926e;
        if (hVar != null) {
            return hVar;
        }
        a aVar = m.f2948i.get();
        j.e(aVar, "currentGlobalSnapshot.get()");
        return aVar;
    }
}

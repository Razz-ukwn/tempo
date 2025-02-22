package b0;

import ff.m;
import java.util.HashSet;
import java.util.Set;
import rf.l;
import sf.j;

public final class i0 extends b {

    /* renamed from: l  reason: collision with root package name */
    public final b f2917l;
    public final l<Object, m> m;

    /* renamed from: n  reason: collision with root package name */
    public final l<Object, m> f2918n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2919o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2920p;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r5.f2887e;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0(b0.b r5, rf.l<java.lang.Object, ff.m> r6, rf.l<java.lang.Object, ff.m> r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            b0.k r0 = b0.k.f2930e
            if (r5 == 0) goto L_0x0008
            rf.l<java.lang.Object, ff.m> r1 = r5.f2887e
            if (r1 != 0) goto L_0x0012
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<b0.a> r1 = b0.m.f2948i
            java.lang.Object r1 = r1.get()
            b0.a r1 = (b0.a) r1
            rf.l<java.lang.Object, ff.m> r1 = r1.f2887e
        L_0x0012:
            rf.l r1 = b0.m.j(r6, r1, r8)
            if (r5 == 0) goto L_0x001c
            rf.l<java.lang.Object, ff.m> r2 = r5.f2888f
            if (r2 != 0) goto L_0x0026
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<b0.a> r2 = b0.m.f2948i
            java.lang.Object r2 = r2.get()
            b0.a r2 = (b0.a) r2
            rf.l<java.lang.Object, ff.m> r2 = r2.f2888f
        L_0x0026:
            rf.l r2 = b0.m.b(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.f2917l = r5
            r4.m = r6
            r4.f2918n = r7
            r4.f2919o = r8
            r4.f2920p = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i0.<init>(b0.b, rf.l, rf.l, boolean, boolean):void");
    }

    public final b A() {
        b bVar = this.f2917l;
        if (bVar != null) {
            return bVar;
        }
        a aVar = m.f2948i.get();
        j.e(aVar, "currentGlobalSnapshot.get()");
        return aVar;
    }

    public final void c() {
        b bVar;
        this.f2912c = true;
        if (this.f2920p && (bVar = this.f2917l) != null) {
            bVar.c();
        }
    }

    public final int d() {
        return A().d();
    }

    public final k e() {
        return A().e();
    }

    public final boolean g() {
        return A().g();
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
        A().l();
    }

    public final void m(g0 g0Var) {
        j.f(g0Var, "state");
        A().m(g0Var);
    }

    public final void p(int i8) {
        v.a();
        throw null;
    }

    public final void q(k kVar) {
        j.f(kVar, "value");
        v.a();
        throw null;
    }

    public final h r(l<Object, m> lVar) {
        l<Object, m> j10 = m.j(lVar, this.f2887e, true);
        return !this.f2919o ? m.g(A().r((l<Object, m>) null), j10, true) : A().r(j10);
    }

    public final i t() {
        return A().t();
    }

    public final Set<g0> u() {
        return A().u();
    }

    public final void x(HashSet hashSet) {
        v.a();
        throw null;
    }

    public final b y(l<Object, m> lVar, l<Object, m> lVar2) {
        l<Object, m> j10 = m.j(lVar, this.f2887e, true);
        l b10 = m.b(lVar2, this.f2888f);
        return !this.f2919o ? new i0(A().y((l<Object, m>) null, b10), j10, b10, false, true) : A().y(j10, b10);
    }
}

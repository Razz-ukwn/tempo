package b0;

import b0.i;
import ff.g;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import rf.l;
import sf.j;

public class b extends h {

    /* renamed from: e  reason: collision with root package name */
    public final l<Object, m> f2887e;

    /* renamed from: f  reason: collision with root package name */
    public final l<Object, m> f2888f;

    /* renamed from: g  reason: collision with root package name */
    public Set<g0> f2889g;

    /* renamed from: h  reason: collision with root package name */
    public k f2890h = k.f2930e;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2891i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public int f2892j = 1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2893k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i8, k kVar, l<Object, m> lVar, l<Object, m> lVar2) {
        super(i8, kVar);
        j.f(kVar, "invalid");
        this.f2887e = lVar;
        this.f2888f = lVar2;
    }

    public final void b() {
        m.f2943d = m.f2943d.b(d()).a(this.f2890h);
    }

    public void c() {
        if (!this.f2912c) {
            super.c();
            k(this);
        }
    }

    public final l<Object, m> f() {
        return this.f2887e;
    }

    public boolean g() {
        return false;
    }

    public final l<Object, m> h() {
        return this.f2888f;
    }

    public void j(h hVar) {
        j.f(hVar, "snapshot");
        this.f2892j++;
    }

    public void k(h hVar) {
        j.f(hVar, "snapshot");
        int i8 = this.f2892j;
        if (i8 > 0) {
            int i10 = i8 - 1;
            this.f2892j = i10;
            if (i10 == 0 && !this.f2893k) {
                Set<g0> u7 = u();
                if (u7 != null) {
                    if (true ^ this.f2893k) {
                        x((HashSet) null);
                        int d10 = d();
                        for (g0 c3 : u7) {
                            for (h0 c10 = c3.c(); c10 != null; c10 = c10.f2915b) {
                                int i11 = c10.f2914a;
                                if (i11 == d10 || q.s0(this.f2890h, Integer.valueOf(i11))) {
                                    c10.f2914a = 0;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                }
                a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void l() {
        if (!this.f2893k && !this.f2912c) {
            s();
        }
    }

    public void m(g0 g0Var) {
        j.f(g0Var, "state");
        Set<g0> u7 = u();
        HashSet hashSet = u7;
        if (u7 == null) {
            HashSet hashSet2 = new HashSet();
            x(hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(g0Var);
    }

    public final void n() {
        for (int r10 : this.f2891i) {
            m.r(r10);
        }
        int i8 = this.f2913d;
        if (i8 >= 0) {
            m.r(i8);
            this.f2913d = -1;
        }
    }

    public h r(l<Object, m> lVar) {
        d dVar;
        if (!this.f2912c) {
            z();
            int d10 = d();
            w(d());
            Object obj = m.f2942c;
            synchronized (obj) {
                int i8 = m.f2944e;
                m.f2944e = i8 + 1;
                m.f2943d = m.f2943d.e(i8);
                dVar = new d(i8, m.e(d10 + 1, i8, e()), lVar, this);
            }
            if (!this.f2893k && !this.f2912c) {
                int d11 = d();
                synchronized (obj) {
                    int i10 = m.f2944e;
                    m.f2944e = i10 + 1;
                    p(i10);
                    m.f2943d = m.f2943d.e(d());
                    m mVar = m.f8717a;
                }
                q(m.e(d11 + 1, d(), e()));
            }
            return dVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public final void s() {
        w(d());
        m mVar = m.f8717a;
        if (!this.f2893k && !this.f2912c) {
            int d10 = d();
            synchronized (m.f2942c) {
                int i8 = m.f2944e;
                m.f2944e = i8 + 1;
                p(i8);
                m.f2943d = m.f2943d.e(d());
            }
            q(m.e(d10 + 1, d(), e()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r1 = (java.util.List) r5.f8706a;
        r2 = (java.util.Set) r5.f8707b;
        r9.f2893k = true;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        if (r2 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b8, code lost:
        if (r2.isEmpty() == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        if (r5 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        r5 = r1.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        if (r6 >= r5) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        ((rf.p) r1.get(r6)).invoke(r2, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r0 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        if (r0.isEmpty() == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dd, code lost:
        if (r4 != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00df, code lost:
        r4 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        if (r3 >= r4) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        ((rf.p) r1.get(r3)).invoke(r0, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r1 = b0.m.f2942c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        if (r2 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r2.hasNext() == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
        b0.m.n((b0.g0) r2.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010d, code lost:
        if (r0 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010f, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0117, code lost:
        if (r0.hasNext() == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0119, code lost:
        b0.m.n((b0.g0) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0123, code lost:
        r0 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0125, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0128, code lost:
        return b0.i.b.f2916a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0.i t() {
        /*
            r9 = this;
            java.util.Set r0 = r9.u()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            java.util.concurrent.atomic.AtomicReference<b0.a> r2 = b0.m.f2948i
            java.lang.Object r3 = r2.get()
            java.lang.String r4 = "currentGlobalSnapshot.get()"
            sf.j.e(r3, r4)
            b0.b r3 = (b0.b) r3
            b0.k r4 = b0.m.f2943d
            java.lang.Object r2 = r2.get()
            b0.a r2 = (b0.a) r2
            int r2 = r2.f2911b
            b0.k r2 = r4.b(r2)
            java.util.HashMap r2 = b0.m.c(r3, r9, r2)
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            java.lang.Object r3 = b0.m.f2942c
            monitor-enter(r3)
            b0.m.d(r9)     // Catch:{ all -> 0x012c }
            r4 = 1
            if (r0 == 0) goto L_0x0073
            int r5 = r0.size()     // Catch:{ all -> 0x012c }
            if (r5 != 0) goto L_0x0038
            goto L_0x0073
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<b0.a> r5 = b0.m.f2948i     // Catch:{ all -> 0x012c }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x012c }
            b0.a r5 = (b0.a) r5     // Catch:{ all -> 0x012c }
            int r6 = b0.m.f2944e     // Catch:{ all -> 0x012c }
            b0.k r7 = b0.m.f2943d     // Catch:{ all -> 0x012c }
            int r8 = r5.f2911b     // Catch:{ all -> 0x012c }
            b0.k r7 = r7.b(r8)     // Catch:{ all -> 0x012c }
            b0.i r2 = r9.v(r6, r2, r7)     // Catch:{ all -> 0x012c }
            b0.i$b r6 = b0.i.b.f2916a     // Catch:{ all -> 0x012c }
            boolean r6 = sf.j.a(r2, r6)     // Catch:{ all -> 0x012c }
            if (r6 != 0) goto L_0x0058
            monitor-exit(r3)
            return r2
        L_0x0058:
            r9.b()     // Catch:{ all -> 0x012c }
            b0.m$a r2 = b0.m.f2940a     // Catch:{ all -> 0x012c }
            b0.m.s(r5, r2)     // Catch:{ all -> 0x012c }
            java.util.Set<b0.g0> r2 = r5.f2889g     // Catch:{ all -> 0x012c }
            r9.x(r1)     // Catch:{ all -> 0x012c }
            r5.f2889g = r1     // Catch:{ all -> 0x012c }
            java.util.ArrayList r1 = b0.m.f2946g     // Catch:{ all -> 0x012c }
            java.util.ArrayList r1 = gf.q.P0(r1)     // Catch:{ all -> 0x012c }
            ff.g r5 = new ff.g     // Catch:{ all -> 0x012c }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x012c }
            goto L_0x00a6
        L_0x0073:
            r9.b()     // Catch:{ all -> 0x012c }
            java.util.concurrent.atomic.AtomicReference<b0.a> r2 = b0.m.f2948i     // Catch:{ all -> 0x012c }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x012c }
            b0.a r2 = (b0.a) r2     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "previousGlobalSnapshot"
            sf.j.e(r2, r5)     // Catch:{ all -> 0x012c }
            b0.m$a r5 = b0.m.f2940a     // Catch:{ all -> 0x012c }
            b0.m.s(r2, r5)     // Catch:{ all -> 0x012c }
            java.util.Set<b0.g0> r2 = r2.f2889g     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x009f
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x012c }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x009f
            java.util.ArrayList r1 = b0.m.f2946g     // Catch:{ all -> 0x012c }
            java.util.ArrayList r1 = gf.q.P0(r1)     // Catch:{ all -> 0x012c }
            ff.g r5 = new ff.g     // Catch:{ all -> 0x012c }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x012c }
            goto L_0x00a6
        L_0x009f:
            gf.s r2 = gf.s.f8978a     // Catch:{ all -> 0x012c }
            ff.g r5 = new ff.g     // Catch:{ all -> 0x012c }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x012c }
        L_0x00a6:
            monitor-exit(r3)
            A r1 = r5.f8706a
            java.util.List r1 = (java.util.List) r1
            B r2 = r5.f8707b
            java.util.Set r2 = (java.util.Set) r2
            r9.f2893k = r4
            r3 = 0
            if (r2 == 0) goto L_0x00bd
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r5 = r3
            goto L_0x00be
        L_0x00bd:
            r5 = r4
        L_0x00be:
            if (r5 != 0) goto L_0x00d3
            int r5 = r1.size()
            r6 = r3
        L_0x00c5:
            if (r6 >= r5) goto L_0x00d3
            java.lang.Object r7 = r1.get(r6)
            rf.p r7 = (rf.p) r7
            r7.invoke(r2, r9)
            int r6 = r6 + 1
            goto L_0x00c5
        L_0x00d3:
            if (r0 == 0) goto L_0x00dd
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r4 = r3
        L_0x00dd:
            if (r4 != 0) goto L_0x00f1
            int r4 = r1.size()
        L_0x00e3:
            if (r3 >= r4) goto L_0x00f1
            java.lang.Object r5 = r1.get(r3)
            rf.p r5 = (rf.p) r5
            r5.invoke(r0, r9)
            int r3 = r3 + 1
            goto L_0x00e3
        L_0x00f1:
            java.lang.Object r1 = b0.m.f2942c
            monitor-enter(r1)
            r9.n()     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x010d
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0129 }
        L_0x00fd:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0129 }
            if (r3 == 0) goto L_0x010d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0129 }
            b0.g0 r3 = (b0.g0) r3     // Catch:{ all -> 0x0129 }
            b0.m.n(r3)     // Catch:{ all -> 0x0129 }
            goto L_0x00fd
        L_0x010d:
            if (r0 == 0) goto L_0x0125
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0129 }
        L_0x0113:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0123
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0129 }
            b0.g0 r2 = (b0.g0) r2     // Catch:{ all -> 0x0129 }
            b0.m.n(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x0113
        L_0x0123:
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0129 }
        L_0x0125:
            monitor-exit(r1)
            b0.i$b r0 = b0.i.b.f2916a
            return r0
        L_0x0129:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x012c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.t():b0.i");
    }

    public Set<g0> u() {
        return this.f2889g;
    }

    public final i v(int i8, HashMap hashMap, k kVar) {
        h0 p10;
        h0 h0Var;
        j.f(kVar, "invalidSnapshots");
        k d10 = e().e(d()).d(this.f2890h);
        Set<g0> u7 = u();
        j.c(u7);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (g0 next : u7) {
            h0 c3 = next.c();
            h0 p11 = m.p(c3, i8, kVar);
            if (!(p11 == null || (p10 = m.p(c3, d(), d10)) == null || j.a(p11, p10))) {
                h0 p12 = m.p(c3, d(), e());
                if (p12 != null) {
                    if (hashMap == null || (h0Var = (h0) hashMap.get(p11)) == null) {
                        h0Var = next.h(p10, p11, p12);
                    }
                    if (h0Var == null) {
                        return new i.a(this);
                    }
                    if (!j.a(h0Var, p12)) {
                        if (j.a(h0Var, p11)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new g(next, p11.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(!j.a(h0Var, p10) ? new g(next, h0Var) : new g(next, p10.b()));
                        }
                    }
                } else {
                    m.o();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            s();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) arrayList.get(i10);
                g0 g0Var = (g0) gVar.f8706a;
                h0 h0Var2 = (h0) gVar.f8707b;
                h0Var2.f2914a = d();
                synchronized (m.f2942c) {
                    h0Var2.f2915b = g0Var.c();
                    g0Var.i(h0Var2);
                    m mVar = m.f8717a;
                }
            }
        }
        if (arrayList2 != null) {
            u7.removeAll(arrayList2);
        }
        return i.b.f2916a;
    }

    public final void w(int i8) {
        synchronized (m.f2942c) {
            this.f2890h = this.f2890h.e(i8);
            m mVar = m.f8717a;
        }
    }

    public void x(HashSet hashSet) {
        this.f2889g = hashSet;
    }

    public b y(l<Object, m> lVar, l<Object, m> lVar2) {
        c cVar;
        if (!this.f2912c) {
            z();
            w(d());
            Object obj = m.f2942c;
            synchronized (obj) {
                int i8 = m.f2944e;
                m.f2944e = i8 + 1;
                m.f2943d = m.f2943d.e(i8);
                k e10 = e();
                q(e10.e(i8));
                cVar = new c(i8, m.e(d() + 1, i8, e10), m.j(lVar, this.f2887e, true), m.b(lVar2, this.f2888f), this);
            }
            if (!this.f2893k && !this.f2912c) {
                int d10 = d();
                synchronized (obj) {
                    int i10 = m.f2944e;
                    m.f2944e = i10 + 1;
                    p(i10);
                    m.f2943d = m.f2943d.e(d());
                    m mVar = m.f8717a;
                }
                q(m.e(d10 + 1, d(), e()));
            }
            return cVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public final void z() {
        boolean z10 = true;
        if (this.f2893k) {
            if (!(this.f2913d >= 0)) {
                z10 = false;
            }
        }
        if (!z10) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }
}

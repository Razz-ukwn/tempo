package b0;

import b0.u;
import gf.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import t.r2;
import t.w2;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2940a = a.f2950a;

    /* renamed from: b  reason: collision with root package name */
    public static final w2 f2941b = new w2();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2942c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static k f2943d;

    /* renamed from: e  reason: collision with root package name */
    public static int f2944e;

    /* renamed from: f  reason: collision with root package name */
    public static final j f2945f = new j();

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayList f2946g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayList f2947h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReference<a> f2948i;

    /* renamed from: j  reason: collision with root package name */
    public static final h f2949j;

    public static final class a extends k implements l<k, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2950a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((k) obj, "it");
            return ff.m.f8717a;
        }
    }

    public static final class b extends k implements l<Object, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l<Object, ff.m> f2951a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Object, ff.m> f2952b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l<Object, ff.m> lVar, l<Object, ff.m> lVar2) {
            super(1);
            this.f2951a = lVar;
            this.f2952b = lVar2;
        }

        public final Object invoke(Object obj) {
            j.f(obj, "state");
            this.f2951a.invoke(obj);
            this.f2952b.invoke(obj);
            return ff.m.f8717a;
        }
    }

    static {
        k kVar = k.f2930e;
        f2943d = kVar;
        f2944e = 1;
        int i8 = f2944e;
        f2944e = i8 + 1;
        a aVar = new a(i8, kVar);
        f2943d = f2943d.e(aVar.f2911b);
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        f2948i = atomicReference;
        a aVar2 = atomicReference.get();
        j.e(aVar2, "currentGlobalSnapshot.get()");
        f2949j = aVar2;
    }

    public static final void a() {
        f(l.f2939a);
    }

    public static final l b(l lVar, l lVar2) {
        return (lVar == null || lVar2 == null || j.a(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new n(lVar, lVar2);
    }

    public static final HashMap c(b bVar, b bVar2, k kVar) {
        h0 p10;
        Set<g0> u7 = bVar2.u();
        int d10 = bVar.d();
        if (u7 == null) {
            return null;
        }
        k d11 = bVar2.e().e(bVar2.d()).d(bVar2.f2890h);
        HashMap hashMap = null;
        for (g0 next : u7) {
            h0 c3 = next.c();
            h0 p11 = p(c3, d10, kVar);
            if (!(p11 == null || (p10 = p(c3, d10, d11)) == null || j.a(p11, p10))) {
                h0 p12 = p(c3, bVar2.d(), bVar2.e());
                if (p12 != null) {
                    h0 h3 = next.h(p10, p11, p12);
                    if (h3 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(p11, h3);
                } else {
                    o();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final void d(h hVar) {
        if (!f2943d.c(hVar.d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final k e(int i8, int i10, k kVar) {
        j.f(kVar, "<this>");
        while (i8 < i10) {
            kVar = kVar.e(i8);
            i8++;
        }
        return kVar;
    }

    public static final <T> T f(l<? super k, ? extends T> lVar) {
        a aVar;
        T s10;
        ArrayList P0;
        h hVar = f2949j;
        j.d(hVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        a aVar2 = (a) hVar;
        Object obj = f2942c;
        synchronized (obj) {
            aVar = f2948i.get();
            j.e(aVar, "currentGlobalSnapshot.get()");
            s10 = s(aVar, lVar);
        }
        Set<g0> set = aVar.f2889g;
        if (set != null) {
            synchronized (obj) {
                P0 = q.P0(f2946g);
            }
            int size = P0.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((p) P0.get(i8)).invoke(set, aVar);
            }
        }
        synchronized (f2942c) {
            if (set != null) {
                for (g0 n2 : set) {
                    n(n2);
                }
                ff.m mVar = ff.m.f8717a;
            }
        }
        return s10;
    }

    public static final h g(h hVar, l<Object, ff.m> lVar, boolean z10) {
        boolean z11 = hVar instanceof b;
        if (!z11 && hVar != null) {
            return new j0(hVar, lVar, z10);
        }
        return new i0(z11 ? (b) hVar : null, lVar, (l<Object, ff.m>) null, false, z10);
    }

    public static final <T extends h0> T h(T t2) {
        T p10;
        j.f(t2, "r");
        h i8 = i();
        T p11 = p(t2, i8.d(), i8.e());
        if (p11 != null) {
            return p11;
        }
        synchronized (f2942c) {
            h i10 = i();
            p10 = p(t2, i10.d(), i10.e());
        }
        if (p10 != null) {
            return p10;
        }
        o();
        throw null;
    }

    public static final h i() {
        h hVar = (h) f2941b.f();
        if (hVar != null) {
            return hVar;
        }
        a aVar = f2948i.get();
        j.e(aVar, "currentGlobalSnapshot.get()");
        return aVar;
    }

    public static final l<Object, ff.m> j(l<Object, ff.m> lVar, l<Object, ff.m> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || j.a(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new b(lVar, lVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if ((r5 < 0 || r5 >= 64 ? !(r5 < 64 || r5 >= 128 || ((1 << (r5 + -64)) & 0) == 0) : ((1 << r5) & 0) != 0) == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends b0.h0> T k(T r12, b0.g0 r13) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r12, r0)
            java.lang.String r0 = "state"
            sf.j.f(r13, r0)
            b0.h0 r0 = r13.c()
            int r1 = f2944e
            b0.j r2 = f2945f
            int r3 = r2.f2921a
            r4 = 0
            if (r3 <= 0) goto L_0x001b
            int[] r1 = r2.f2922b
            r1 = r1[r4]
        L_0x001b:
            int r1 = r1 + -1
            r2 = 0
            r3 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0067
            int r5 = r0.f2914a
            if (r5 != 0) goto L_0x0026
            goto L_0x0060
        L_0x0026:
            if (r5 == 0) goto L_0x0053
            if (r5 > r1) goto L_0x0053
            int r5 = r5 + 0
            r6 = 1
            r7 = 0
            r9 = 1
            r11 = 64
            if (r5 < 0) goto L_0x0041
            if (r5 >= r11) goto L_0x0041
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
        L_0x003d:
            r5 = r6
            goto L_0x0050
        L_0x003f:
            r5 = r4
            goto L_0x0050
        L_0x0041:
            if (r5 < r11) goto L_0x003f
            r11 = 128(0x80, float:1.794E-43)
            if (r5 >= r11) goto L_0x003f
            int r5 = r5 + -64
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x003d
        L_0x0050:
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r6 = r4
        L_0x0054:
            if (r6 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x005a
            r3 = r0
            goto L_0x0064
        L_0x005a:
            int r1 = r0.f2914a
            int r2 = r3.f2914a
            if (r1 >= r2) goto L_0x0062
        L_0x0060:
            r2 = r0
            goto L_0x0067
        L_0x0062:
            r2 = r3
            goto L_0x0067
        L_0x0064:
            b0.h0 r0 = r0.f2915b
            goto L_0x001f
        L_0x0067:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L_0x006f
            r2.f2914a = r0
            goto L_0x007e
        L_0x006f:
            b0.h0 r2 = r12.b()
            r2.f2914a = r0
            b0.h0 r12 = r13.c()
            r2.f2915b = r12
            r13.i(r2)
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m.k(b0.h0, b0.g0):b0.h0");
    }

    public static final void l(h hVar, g0 g0Var) {
        j.f(g0Var, "state");
        l<Object, ff.m> h3 = hVar.h();
        if (h3 != null) {
            h3.invoke(g0Var);
        }
    }

    public static final h0 m(r2.a aVar, g0 g0Var, h hVar, r2.a aVar2) {
        h0 k10;
        j.f(aVar, "<this>");
        j.f(g0Var, "state");
        if (hVar.g()) {
            hVar.m(g0Var);
        }
        int d10 = hVar.d();
        if (aVar2.f2914a == d10) {
            return aVar2;
        }
        synchronized (f2942c) {
            k10 = k(aVar, g0Var);
        }
        k10.f2914a = d10;
        hVar.m(g0Var);
        return k10;
    }

    public static final boolean n(g0 g0Var) {
        h0 h0Var;
        int i8 = f2944e;
        j jVar = f2945f;
        if (jVar.f2921a > 0) {
            i8 = jVar.f2922b[0];
        }
        int i10 = i8 - 1;
        h0 h0Var2 = null;
        int i11 = 0;
        for (h0 c3 = g0Var.c(); c3 != null; c3 = c3.f2915b) {
            int i12 = c3.f2914a;
            if (i12 != 0) {
                if (i12 > i10) {
                    i11++;
                } else if (h0Var2 == null) {
                    h0Var2 = c3;
                } else {
                    if (i12 < h0Var2.f2914a) {
                        h0Var = h0Var2;
                        h0Var2 = c3;
                    } else {
                        h0Var = c3;
                    }
                    h0Var2.f2914a = 0;
                    h0Var2.a(h0Var);
                    h0Var2 = h0Var;
                }
            }
        }
        return i11 < 1;
    }

    public static final void o() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends h0> T p(T t2, int i8, k kVar) {
        T t10 = null;
        while (t2 != null) {
            int i10 = t2.f2914a;
            if ((i10 != 0 && i10 <= i8 && !kVar.c(i10)) && (t10 == null || t10.f2914a < t2.f2914a)) {
                t10 = t2;
            }
            t2 = t2.f2915b;
        }
        if (t10 != null) {
            return t10;
        }
        return null;
    }

    public static final <T extends h0> T q(T t2, g0 g0Var) {
        T p10;
        j.f(t2, "<this>");
        j.f(g0Var, "state");
        h i8 = i();
        l<Object, ff.m> f10 = i8.f();
        if (f10 != null) {
            f10.invoke(g0Var);
        }
        T p11 = p(t2, i8.d(), i8.e());
        if (p11 != null) {
            return p11;
        }
        synchronized (f2942c) {
            h i10 = i();
            h0 c3 = g0Var.c();
            j.d(c3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
            p10 = p(c3, i10.d(), i10.e());
            if (p10 == null) {
                o();
                throw null;
            }
        }
        return p10;
    }

    public static final void r(int i8) {
        int i10;
        j jVar = f2945f;
        int i11 = jVar.f2924d[i8];
        jVar.b(i11, jVar.f2921a - 1);
        jVar.f2921a--;
        int[] iArr = jVar.f2922b;
        int i12 = iArr[i11];
        int i13 = i11;
        while (i13 > 0) {
            int i14 = ((i13 + 1) >> 1) - 1;
            if (iArr[i14] <= i12) {
                break;
            }
            jVar.b(i14, i13);
            i13 = i14;
        }
        int[] iArr2 = jVar.f2922b;
        int i15 = jVar.f2921a >> 1;
        while (i11 < i15) {
            int i16 = (i11 + 1) << 1;
            int i17 = i16 - 1;
            if (i16 < jVar.f2921a && (i10 = iArr2[i16]) < iArr2[i17]) {
                if (i10 >= iArr2[i11]) {
                    break;
                }
                jVar.b(i16, i11);
                i11 = i16;
            } else if (iArr2[i17] >= iArr2[i11]) {
                break;
            } else {
                jVar.b(i17, i11);
                i11 = i17;
            }
        }
        jVar.f2924d[i8] = jVar.f2925e;
        jVar.f2925e = i8;
    }

    public static final <T> T s(h hVar, l<? super k, ? extends T> lVar) {
        T invoke = lVar.invoke(f2943d.b(hVar.d()));
        synchronized (f2942c) {
            int i8 = f2944e;
            f2944e = i8 + 1;
            k b10 = f2943d.b(hVar.d());
            f2943d = b10;
            f2948i.set(new a(i8, b10));
            hVar.c();
            f2943d = f2943d.e(i8);
            ff.m mVar = ff.m.f8717a;
        }
        return invoke;
    }

    public static final h0 t(u.a aVar, g0 g0Var, h hVar) {
        h0 k10;
        j.f(g0Var, "state");
        if (hVar.g()) {
            hVar.m(g0Var);
        }
        h0 p10 = p(aVar, hVar.d(), hVar.e());
        if (p10 == null) {
            o();
            throw null;
        } else if (p10.f2914a == hVar.d()) {
            return p10;
        } else {
            synchronized (f2942c) {
                k10 = k(p10, g0Var);
                k10.a(p10);
                k10.f2914a = hVar.d();
            }
            hVar.m(g0Var);
            return k10;
        }
    }
}

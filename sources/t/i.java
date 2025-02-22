package t;

import android.os.Trace;
import android.util.SparseArray;
import androidx.appcompat.widget.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rf.p;
import rf.q;
import s0.a0;
import s0.s1;
import sf.y;
import t.e0;
import t.h;

public final class i implements h {
    public int A;
    public final x2 B;
    public boolean C;
    public m2 D;
    public n2 E;
    public p2 F;
    public boolean G;
    public v.b<k0<Object>, ? extends y2<? extends Object>> H;
    public b I;
    public final ArrayList J;
    public boolean K;
    public int L;
    public int M;
    public final x2 N;
    public int O;
    public boolean P;
    public boolean Q;
    public final w0 R;
    public final x2 S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public final c<?> f15065a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f15066b;

    /* renamed from: c  reason: collision with root package name */
    public final n2 f15067c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<j2> f15068d;

    /* renamed from: e  reason: collision with root package name */
    public List<q<c<?>, p2, i2, ff.m>> f15069e;

    /* renamed from: f  reason: collision with root package name */
    public final List<q<c<?>, p2, i2, ff.m>> f15070f;

    /* renamed from: g  reason: collision with root package name */
    public final m0 f15071g;

    /* renamed from: h  reason: collision with root package name */
    public final x2 f15072h = new x2();

    /* renamed from: i  reason: collision with root package name */
    public q1 f15073i;

    /* renamed from: j  reason: collision with root package name */
    public int f15074j;

    /* renamed from: k  reason: collision with root package name */
    public final w0 f15075k = new w0();

    /* renamed from: l  reason: collision with root package name */
    public int f15076l;
    public final w0 m = new w0();

    /* renamed from: n  reason: collision with root package name */
    public int[] f15077n;

    /* renamed from: o  reason: collision with root package name */
    public HashMap<Integer, Integer> f15078o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15079p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15080q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f15081r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final w0 f15082s = new w0();

    /* renamed from: t  reason: collision with root package name */
    public w.d f15083t;

    /* renamed from: u  reason: collision with root package name */
    public final x2 f15084u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15085v;

    /* renamed from: w  reason: collision with root package name */
    public final w0 f15086w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15087x;

    /* renamed from: y  reason: collision with root package name */
    public final int f15088y;

    /* renamed from: z  reason: collision with root package name */
    public int f15089z;

    public static final class a implements j2 {
        public final void a() {
            throw null;
        }

        public final void b() {
            throw null;
        }

        public final void c() {
        }
    }

    public static final class b extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p<T, V, ff.m> f15090a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ V f15091b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, p pVar) {
            super(3);
            this.f15090a = pVar;
            this.f15091b = obj;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            c cVar = (c) obj;
            sf.j.f(cVar, "applier");
            sf.j.f((p2) obj2, "<anonymous parameter 1>");
            sf.j.f((i2) obj3, "<anonymous parameter 2>");
            this.f15090a.invoke(cVar.h(), this.f15091b);
            return ff.m.f8717a;
        }
    }

    public static final class c extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15092a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f15093b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i8, int i10) {
            super(3);
            this.f15092a = i8;
            this.f15093b = i10;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            c cVar = (c) obj;
            androidx.activity.f.e(cVar, "applier", (p2) obj2, "<anonymous parameter 1>", (i2) obj3, "<anonymous parameter 2>");
            cVar.d(this.f15092a, this.f15093b);
            return ff.m.f8717a;
        }
    }

    public static final class d extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15094a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f15095b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f15096c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i8, int i10, int i11) {
            super(3);
            this.f15094a = i8;
            this.f15095b = i10;
            this.f15096c = i11;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            c cVar = (c) obj;
            androidx.activity.f.e(cVar, "applier", (p2) obj2, "<anonymous parameter 1>", (i2) obj3, "<anonymous parameter 2>");
            cVar.c(this.f15094a, this.f15095b, this.f15096c);
            return ff.m.f8717a;
        }
    }

    public static final class e extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15097a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i8) {
            super(3);
            this.f15097a = i8;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            androidx.activity.f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
            p2Var.a(this.f15097a);
            return ff.m.f8717a;
        }
    }

    public static final class f extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f15098a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(int i8) {
            super(3);
            this.f15098a = i8;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            c cVar = (c) obj;
            androidx.activity.f.e(cVar, "applier", (p2) obj2, "<anonymous parameter 1>", (i2) obj3, "<anonymous parameter 2>");
            for (int i8 = 0; i8 < this.f15098a; i8++) {
                cVar.e();
            }
            return ff.m.f8717a;
        }
    }

    public static final class g extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f15099a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(b bVar) {
            super(3);
            this.f15099a = bVar;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            androidx.activity.f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
            b bVar = this.f15099a;
            sf.j.f(bVar, "anchor");
            p2Var.k(p2Var.c(bVar));
            return ff.m.f8717a;
        }
    }

    public static final class h extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f15100a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i1 f15101b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(i iVar, i1 i1Var) {
            super(3);
            this.f15100a = iVar;
            this.f15101b = i1Var;
        }

        /* JADX INFO: finally extract failed */
        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            androidx.activity.f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
            i1 i1Var = this.f15101b;
            i iVar = this.f15100a;
            iVar.getClass();
            n2 n2Var = new n2();
            p2 e10 = n2Var.e();
            try {
                e10.e();
                e10.J(126665345, i1Var.f15119a, false, h.a.f15061a);
                p2.t(e10);
                e10.K(i1Var.f15120b);
                p2Var.x(i1Var.f15123e, e10);
                e10.F();
                e10.i();
                e10.j();
                ff.m mVar = ff.m.f8717a;
                e10.f();
                iVar.f15066b.g(i1Var, new h1(n2Var));
                return ff.m.f8717a;
            } catch (Throwable th) {
                e10.f();
                throw th;
            }
        }
    }

    /* renamed from: t.i$i  reason: collision with other inner class name */
    public static final class C0281i extends sf.k implements p<h, Integer, v.b<k0<Object>, ? extends y2<? extends Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v1<?>[] f15102a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v.b<k0<Object>, y2<Object>> f15103b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0281i(v1<?>[] v1VarArr, v.b<k0<Object>, ? extends y2<? extends Object>> bVar) {
            super(2);
            this.f15102a = v1VarArr;
            this.f15103b = bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            h hVar = (h) obj;
            ((Number) obj2).intValue();
            hVar.c(935231726);
            e0.b bVar = e0.f15020a;
            hVar.c(721128344);
            w.d dVar = w.d.f16437c;
            sf.j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            w.f fVar = new w.f(dVar);
            for (v1<?> v1Var : this.f15102a) {
                hVar.c(680853375);
                boolean z10 = v1Var.f15254c;
                k0<T> k0Var = v1Var.f15252a;
                if (!z10) {
                    v.b<k0<Object>, y2<Object>> bVar2 = this.f15103b;
                    sf.j.f(bVar2, "<this>");
                    sf.j.f(k0Var, "key");
                    if (bVar2.containsKey(k0Var)) {
                        hVar.o();
                    }
                }
                sf.j.d(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                fVar.put(k0Var, k0Var.a(v1Var.f15253b, hVar));
                hVar.o();
            }
            w.d a10 = fVar.a();
            hVar.o();
            e0.b bVar3 = e0.f15020a;
            hVar.o();
            return a10;
        }
    }

    public static final class j extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f15104a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(Object obj) {
            super(3);
            this.f15104a = obj;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            androidx.activity.f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
            p2Var.L(this.f15104a);
            return ff.m.f8717a;
        }
    }

    public static final class k extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f15105a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(Object obj) {
            super(3);
            this.f15105a = obj;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            i2 i2Var = (i2) obj3;
            androidx.activity.f.e((c) obj, "<anonymous parameter 0>", (p2) obj2, "<anonymous parameter 1>", i2Var, "rememberManager");
            i2Var.d((j2) this.f15105a);
            return ff.m.f8717a;
        }
    }

    public static final class l extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f15106a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f15107b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(Object obj, int i8) {
            super(3);
            this.f15106a = obj;
            this.f15107b = i8;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            y1 y1Var;
            i0 i0Var;
            p2 p2Var = (p2) obj2;
            i2 i2Var = (i2) obj3;
            androidx.activity.f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", i2Var, "rememberManager");
            Object obj4 = this.f15106a;
            if (obj4 instanceof j2) {
                i2Var.d((j2) obj4);
            }
            int H = p2Var.H(p2Var.f15188b, p2Var.n(p2Var.f15203r));
            int g10 = p2Var.g(p2Var.f15188b, p2Var.n(p2Var.f15203r + 1));
            int i8 = this.f15107b;
            int i10 = H + i8;
            if (i10 >= H && i10 < g10) {
                int h3 = p2Var.h(i10);
                Object[] objArr = p2Var.f15189c;
                Object obj5 = objArr[h3];
                objArr[h3] = obj4;
                if (obj5 instanceof j2) {
                    i2Var.c((j2) obj5);
                } else if ((obj5 instanceof y1) && (i0Var = y1Var.f15284b) != null) {
                    (y1Var = (y1) obj5).f15284b = null;
                    y1Var.f15288f = null;
                    y1Var.f15289g = null;
                    i0Var.J = true;
                }
                return ff.m.f8717a;
            }
            StringBuilder b10 = a1.b("Write to an invalid slot index ", i8, " for group ");
            b10.append(p2Var.f15203r);
            e0.c(b10.toString().toString());
            throw null;
        }
    }

    public static final class m extends sf.k implements q<c<?>, p2, i2, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f15108a = new m();

        public m() {
            super(3);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            c cVar = (c) obj;
            sf.j.f(cVar, "applier");
            sf.j.f((p2) obj2, "<anonymous parameter 1>");
            sf.j.f((i2) obj3, "<anonymous parameter 2>");
            Object h3 = cVar.h();
            sf.j.d(h3, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((f) h3).h();
            return ff.m.f8717a;
        }
    }

    /* JADX INFO: finally extract failed */
    public i(s1 s1Var, g0 g0Var, n2 n2Var, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, m0 m0Var) {
        sf.j.f(g0Var, "parentContext");
        sf.j.f(m0Var, "composition");
        this.f15065a = s1Var;
        this.f15066b = g0Var;
        this.f15067c = n2Var;
        this.f15068d = hashSet;
        this.f15069e = arrayList;
        this.f15070f = arrayList2;
        this.f15071g = m0Var;
        w.d dVar = w.d.f16437c;
        sf.j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.f15083t = dVar;
        this.f15084u = new x2((Object) null);
        this.f15086w = new w0();
        this.f15088y = -1;
        b0.m.i();
        this.B = new x2();
        m2 d10 = n2Var.d();
        d10.c();
        this.D = d10;
        n2 n2Var2 = new n2();
        this.E = n2Var2;
        p2 e10 = n2Var2.e();
        e10.f();
        this.F = e10;
        m2 d11 = this.E.d();
        try {
            b a10 = d11.a(0);
            d11.c();
            this.I = a10;
            this.J = new ArrayList();
            this.N = new x2();
            this.Q = true;
            this.R = new w0();
            this.S = new x2();
            this.T = -1;
            this.U = -1;
            this.V = -1;
        } catch (Throwable th) {
            d11.c();
            throw th;
        }
    }

    public static final void L(p2 p2Var, c<Object> cVar, int i8) {
        while (true) {
            int i10 = p2Var.f15204s;
            if (!((i8 > i10 && i8 < p2Var.f15193g) || (i10 == 0 && i8 == 0))) {
                p2Var.G();
                if (p2Var.s(p2Var.f15204s)) {
                    cVar.e();
                }
                p2Var.i();
            } else {
                return;
            }
        }
    }

    public static final int a0(i iVar, int i8, boolean z10, int i10) {
        i iVar2 = iVar;
        int i11 = i8;
        int i12 = i10;
        m2 m2Var = iVar2.D;
        int[] iArr = m2Var.f15148b;
        int i13 = i11 * 5;
        int i14 = 1;
        if ((iArr[i13 + 1] & 134217728) != 0) {
            int i15 = iArr[i13];
            Object k10 = m2Var.k(iArr, i11);
            if (i15 == 126665345 && (k10 instanceof g1)) {
                g1 g1Var = (g1) k10;
                Object f10 = iVar2.D.f(i11, 0);
                b a10 = iVar2.D.a(i11);
                int g10 = iVar2.D.g(i11) + i11;
                ArrayList arrayList = iVar2.f15081r;
                e0.b bVar = e0.f15020a;
                ArrayList arrayList2 = new ArrayList();
                int d10 = e0.d(i11, arrayList);
                if (d10 < 0) {
                    d10 = -(d10 + 1);
                }
                while (d10 < arrayList.size()) {
                    x0 x0Var = (x0) arrayList.get(d10);
                    if (x0Var.f15272b >= g10) {
                        break;
                    }
                    arrayList2.add(x0Var);
                    d10++;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i16 = 0; i16 < size; i16++) {
                    x0 x0Var2 = (x0) arrayList2.get(i16);
                    arrayList3.add(new ff.g(x0Var2.f15271a, x0Var2.f15273c));
                }
                i1 i1Var = new i1(g1Var, f10, iVar2.f15071g, iVar2.f15067c, a10, arrayList3, iVar.z(i8));
                iVar2.f15066b.b(i1Var);
                iVar.W();
                iVar2.U(new h(iVar2, i1Var));
                if (!z10) {
                    return iVar2.D.j(i11);
                }
                iVar.O();
                iVar.Q();
                iVar.N();
                if (!iVar2.D.h(i11)) {
                    i14 = iVar2.D.j(i11);
                }
                if (i14 <= 0) {
                    return 0;
                }
                iVar2.V(i12, i14);
                return 0;
            } else if (i15 != 206 || !sf.j.a(k10, e0.f15030k)) {
                return iVar2.D.j(i11);
            } else {
                Object f11 = iVar2.D.f(i11, 0);
                if ((f11 instanceof a ? (a) f11 : null) == null) {
                    return iVar2.D.j(i11);
                }
                throw null;
            }
        } else if (!b7.a.d(iArr, i11)) {
            return iVar2.D.j(i11);
        } else {
            int g11 = iVar2.D.g(i11) + i11;
            int i17 = 0;
            for (int i18 = i11 + 1; i18 < g11; i18 += iVar2.D.g(i18)) {
                boolean h3 = iVar2.D.h(i18);
                if (h3) {
                    iVar.O();
                    iVar2.N.q(iVar2.D.i(i18));
                }
                i17 += a0(iVar2, i18, h3 || z10, h3 ? 0 : i12 + i17);
                if (h3) {
                    iVar.O();
                    iVar.Y();
                }
            }
            return i17;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[Catch:{ all -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(t.i r6, t.g1 r7, v.b r8, java.lang.Object r9) {
        /*
            r0 = 0
            r1 = 126665345(0x78cc281, float:2.1179178E-34)
            r2 = 0
            r6.b0(r7, r1, r2, r0)
            r6.p(r9)
            int r0 = r6.L
            r6.L = r1     // Catch:{ all -> 0x0063 }
            boolean r1 = r6.K     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0018
            t.p2 r1 = r6.F     // Catch:{ all -> 0x0063 }
            t.p2.t(r1)     // Catch:{ all -> 0x0063 }
        L_0x0018:
            boolean r1 = r6.K     // Catch:{ all -> 0x0063 }
            r3 = 1
            if (r1 == 0) goto L_0x001e
            goto L_0x002c
        L_0x001e:
            t.m2 r1 = r6.D     // Catch:{ all -> 0x0063 }
            java.lang.Object r1 = r1.e()     // Catch:{ all -> 0x0063 }
            boolean r1 = sf.j.a(r1, r8)     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x002c
            r1 = r3
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x003c
            t.x2 r4 = r6.f15084u     // Catch:{ all -> 0x0063 }
            t.m2 r5 = r6.D     // Catch:{ all -> 0x0063 }
            int r5 = r5.f15153g     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r4.f15278b     // Catch:{ all -> 0x0063 }
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch:{ all -> 0x0063 }
            r4.put(r5, r8)     // Catch:{ all -> 0x0063 }
        L_0x003c:
            t.m1 r4 = t.e0.f15027h     // Catch:{ all -> 0x0063 }
            r5 = 202(0xca, float:2.83E-43)
            r6.b0(r4, r5, r2, r8)     // Catch:{ all -> 0x0063 }
            boolean r8 = r6.K     // Catch:{ all -> 0x0063 }
            boolean r8 = r6.f15085v     // Catch:{ all -> 0x0063 }
            r6.f15085v = r1     // Catch:{ all -> 0x0063 }
            t.y r1 = new t.y     // Catch:{ all -> 0x0063 }
            r1.<init>(r7, r9)     // Catch:{ all -> 0x0063 }
            r7 = 694380496(0x296367d0, float:5.049417E-14)
            z.a r7 = z.b.c(r7, r1, r3)     // Catch:{ all -> 0x0063 }
            cb.d.N(r6, r7)     // Catch:{ all -> 0x0063 }
            r6.f15085v = r8     // Catch:{ all -> 0x0063 }
            r6.E(r2)
            r6.L = r0
            r6.E(r2)
            return
        L_0x0063:
            r7 = move-exception
            r6.E(r2)
            r6.L = r0
            r6.E(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.r(t.i, t.g1, v.b, java.lang.Object):void");
    }

    public final void A() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f15066b.getClass();
            this.B.b();
            this.f15081r.clear();
            this.f15069e.clear();
            this.f15084u.b();
            this.f15065a.clear();
            ff.m mVar = ff.m.f8717a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r4.size() <= 1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        gf.n.o0(r4, new t.o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r9.f15074j = 0;
        r9.C = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        g0();
        r10 = M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r10 == r11) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r11 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        o0(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        cb.d.U(new t.l(r9), new t.m(r9), new t.n(r11, r9, r10));
        H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r9.C = false;
        r4.clear();
        r10 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(u.b r10, z.a r11) {
        /*
            r9 = this;
            boolean r0 = r9.C
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "Compose:recompose"
            android.os.Trace.beginSection(r0)
            b0.h r0 = b0.m.i()     // Catch:{ all -> 0x0094 }
            int r0 = r0.d()     // Catch:{ all -> 0x0094 }
            r9.A = r0     // Catch:{ all -> 0x0094 }
            t.x2 r0 = r9.f15084u     // Catch:{ all -> 0x0094 }
            r0.b()     // Catch:{ all -> 0x0094 }
            int r0 = r10.f15631a     // Catch:{ all -> 0x0094 }
            r2 = 0
            r3 = r2
        L_0x001e:
            java.util.ArrayList r4 = r9.f15081r
            if (r3 >= r0) goto L_0x004a
            java.lang.Object[] r5 = r10.f15632b     // Catch:{ all -> 0x0094 }
            r5 = r5[r3]     // Catch:{ all -> 0x0094 }
            java.lang.String r6 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            sf.j.d(r5, r6)     // Catch:{ all -> 0x0094 }
            java.lang.Object r6 = r10.f15633c     // Catch:{ all -> 0x0094 }
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch:{ all -> 0x0094 }
            r6 = r6[r3]     // Catch:{ all -> 0x0094 }
            u.c r6 = (u.c) r6     // Catch:{ all -> 0x0094 }
            t.y1 r5 = (t.y1) r5     // Catch:{ all -> 0x0094 }
            t.b r7 = r5.f15285c     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x0046
            int r7 = r7.f14988a     // Catch:{ all -> 0x0094 }
            t.x0 r8 = new t.x0     // Catch:{ all -> 0x0094 }
            r8.<init>(r5, r7, r6)     // Catch:{ all -> 0x0094 }
            r4.add(r8)     // Catch:{ all -> 0x0094 }
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0046:
            android.os.Trace.endSection()
            return
        L_0x004a:
            int r10 = r4.size()     // Catch:{ all -> 0x0094 }
            if (r10 <= r1) goto L_0x0058
            t.o r10 = new t.o     // Catch:{ all -> 0x0094 }
            r10.<init>()     // Catch:{ all -> 0x0094 }
            gf.n.o0(r4, r10)     // Catch:{ all -> 0x0094 }
        L_0x0058:
            r9.f15074j = r2     // Catch:{ all -> 0x0094 }
            r9.C = r1     // Catch:{ all -> 0x0094 }
            r9.g0()     // Catch:{ all -> 0x008a }
            java.lang.Object r10 = r9.M()     // Catch:{ all -> 0x008a }
            if (r10 == r11) goto L_0x006a
            if (r11 == 0) goto L_0x006a
            r9.o0(r11)     // Catch:{ all -> 0x008a }
        L_0x006a:
            t.l r0 = new t.l     // Catch:{ all -> 0x008a }
            r0.<init>(r9)     // Catch:{ all -> 0x008a }
            t.m r1 = new t.m     // Catch:{ all -> 0x008a }
            r1.<init>(r9)     // Catch:{ all -> 0x008a }
            t.n r3 = new t.n     // Catch:{ all -> 0x008a }
            r3.<init>(r11, r9, r10)     // Catch:{ all -> 0x008a }
            cb.d.U(r0, r1, r3)     // Catch:{ all -> 0x008a }
            r9.H()     // Catch:{ all -> 0x008a }
            r9.C = r2     // Catch:{ all -> 0x0094 }
            r4.clear()     // Catch:{ all -> 0x0094 }
            ff.m r10 = ff.m.f8717a     // Catch:{ all -> 0x0094 }
            android.os.Trace.endSection()
            return
        L_0x008a:
            r10 = move-exception
            r9.C = r2     // Catch:{ all -> 0x0094 }
            r4.clear()     // Catch:{ all -> 0x0094 }
            r9.q()     // Catch:{ all -> 0x0094 }
            throw r10     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r10 = move-exception
            android.os.Trace.endSection()
            throw r10
        L_0x0099:
            java.lang.String r10 = "Reentrant composition is not supported"
            java.lang.String r10 = r10.toString()
            t.e0.c(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.B(u.b, z.a):void");
    }

    public final void C(int i8, int i10) {
        if (i8 > 0 && i8 != i10) {
            C(this.D.l(i8), i10);
            if (this.D.h(i8)) {
                this.N.q(this.D.i(i8));
            }
        }
    }

    public final void D() {
        this.f15087x = this.f15088y >= 0;
    }

    public final void E(boolean z10) {
        boolean z11;
        HashSet hashSet;
        int i8;
        int i10;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList;
        q1 q1Var;
        if (this.K) {
            p2 p2Var = this.F;
            int i11 = p2Var.f15204s;
            int i12 = p2Var.f15188b[p2Var.n(i11) * 5];
            p2 p2Var2 = this.F;
            int n2 = p2Var2.n(i11);
            int[] iArr = p2Var2.f15188b;
            int i13 = n2 * 5;
            int i14 = iArr[i13 + 1];
            Object obj = (536870912 & i14) != 0 ? p2Var2.f15189c[b7.a.t(i14 >> 30) + iArr[i13 + 4]] : null;
            p2 p2Var3 = this.F;
            int n10 = p2Var3.n(i11);
            j0(i12, obj, b7.a.f(p2Var3.f15188b, n10) ? p2Var3.f15189c[p2Var3.d(p2Var3.f15188b, n10)] : h.a.f15061a);
        } else {
            m2 m2Var = this.D;
            int i15 = m2Var.f15155i;
            int[] iArr2 = m2Var.f15148b;
            int i16 = iArr2[i15 * 5];
            Object k10 = m2Var.k(iArr2, i15);
            m2 m2Var2 = this.D;
            j0(i16, k10, m2Var2.b(m2Var2.f15148b, i15));
        }
        int i17 = this.f15076l;
        q1 q1Var2 = this.f15073i;
        ArrayList arrayList2 = this.f15081r;
        if (q1Var2 != null) {
            List<z0> list = q1Var2.f15209a;
            if (list.size() > 0) {
                ArrayList arrayList3 = q1Var2.f15212d;
                sf.j.f(arrayList3, "<this>");
                HashSet hashSet2 = new HashSet(arrayList3.size());
                int size = arrayList3.size();
                for (int i18 = 0; i18 < size; i18++) {
                    hashSet2.add(arrayList3.get(i18));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList3.size();
                int size3 = list.size();
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (i19 < size3) {
                    z0 z0Var = list.get(i19);
                    boolean contains = hashSet2.contains(z0Var);
                    int i22 = q1Var2.f15210b;
                    if (!contains) {
                        V(q1Var2.a(z0Var) + i22, z0Var.f15294d);
                        int i23 = z0Var.f15293c;
                        q1Var2.b(i23, 0);
                        m2 m2Var3 = this.D;
                        hashSet = hashSet2;
                        this.O = i23 - (m2Var3.f15153g - this.O);
                        m2Var3.m(i23);
                        a0(this, this.D.f15153g, false, 0);
                        O();
                        e0.b bVar = e0.f15020a;
                        P(false);
                        W();
                        U(bVar);
                        int i24 = this.O;
                        m2 m2Var4 = this.D;
                        this.O = b7.a.e(m2Var4.f15148b, m2Var4.f15153g) + i24;
                        this.D.n();
                        e0.a(i23, this.D.g(i23) + i23, arrayList2);
                    } else {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(z0Var)) {
                            if (i20 < size2) {
                                z0 z0Var2 = (z0) arrayList3.get(i20);
                                HashMap<Integer, u0> hashMap = q1Var2.f15213e;
                                if (z0Var2 != z0Var) {
                                    int a10 = q1Var2.a(z0Var2);
                                    linkedHashSet2.add(z0Var2);
                                    if (a10 != i21) {
                                        q1Var = q1Var2;
                                        u0 u0Var = hashMap.get(Integer.valueOf(z0Var2.f15293c));
                                        int i25 = u0Var != null ? u0Var.f15241c : z0Var2.f15294d;
                                        arrayList = arrayList3;
                                        int i26 = a10 + i22;
                                        int i27 = i22 + i21;
                                        if (i25 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            int i28 = this.W;
                                            if (i28 > 0) {
                                                i10 = size2;
                                                i8 = size3;
                                                if (this.U == i26 - i28 && this.V == i27 - i28) {
                                                    this.W = i28 + i25;
                                                }
                                            } else {
                                                i10 = size2;
                                                i8 = size3;
                                            }
                                            O();
                                            this.U = i26;
                                            this.V = i27;
                                            this.W = i25;
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i10 = size2;
                                            i8 = size3;
                                        }
                                        if (a10 > i21) {
                                            Collection<u0> values = hashMap.values();
                                            sf.j.e(values, "groupInfos.values");
                                            for (u0 u0Var2 : values) {
                                                int i29 = u0Var2.f15240b;
                                                if (a10 <= i29 && i29 < a10 + i25) {
                                                    u0Var2.f15240b = (i29 - a10) + i21;
                                                } else {
                                                    if (i21 <= i29 && i29 < a10) {
                                                        u0Var2.f15240b = i29 + i25;
                                                    }
                                                }
                                            }
                                        } else if (i21 > a10) {
                                            Collection<u0> values2 = hashMap.values();
                                            sf.j.e(values2, "groupInfos.values");
                                            for (u0 u0Var3 : values2) {
                                                int i30 = u0Var3.f15240b;
                                                if (a10 <= i30 && i30 < a10 + i25) {
                                                    u0Var3.f15240b = (i30 - a10) + i21;
                                                } else {
                                                    if (a10 + 1 <= i30 && i30 < i21) {
                                                        u0Var3.f15240b = i30 - i25;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        q1Var = q1Var2;
                                        arrayList = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i10 = size2;
                                        i8 = size3;
                                    }
                                } else {
                                    q1Var = q1Var2;
                                    arrayList = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i10 = size2;
                                    i8 = size3;
                                    i19++;
                                }
                                i20++;
                                sf.j.f(z0Var2, "keyInfo");
                                u0 u0Var4 = hashMap.get(Integer.valueOf(z0Var2.f15293c));
                                i21 += u0Var4 != null ? u0Var4.f15241c : z0Var2.f15294d;
                                hashSet2 = hashSet;
                                q1Var2 = q1Var;
                                arrayList3 = arrayList;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i10;
                                size3 = i8;
                            }
                            hashSet2 = hashSet;
                        }
                    }
                    i19++;
                    hashSet2 = hashSet;
                }
                O();
                if (list.size() > 0) {
                    m2 m2Var5 = this.D;
                    this.O = m2Var5.f15154h - (m2Var5.f15153g - this.O);
                    m2Var5.o();
                }
            }
        }
        int i31 = this.f15074j;
        while (true) {
            m2 m2Var6 = this.D;
            if ((m2Var6.f15156j > 0) || m2Var6.f15153g == m2Var6.f15154h) {
                break;
            }
            int i32 = m2Var6.f15153g;
            a0(this, i32, false, 0);
            O();
            e0.b bVar2 = e0.f15020a;
            P(false);
            W();
            U(bVar2);
            int i33 = this.O;
            m2 m2Var7 = this.D;
            this.O = b7.a.e(m2Var7.f15148b, m2Var7.f15153g) + i33;
            V(i31, this.D.n());
            e0.a(i32, this.D.f15153g, arrayList2);
        }
        boolean z12 = this.K;
        int i34 = -1;
        if (z12) {
            ArrayList arrayList4 = this.J;
            if (z10) {
                arrayList4.add(this.S.p());
                i17 = 1;
            }
            m2 m2Var8 = this.D;
            int i35 = m2Var8.f15156j;
            if (i35 > 0) {
                m2Var8.f15156j = i35 - 1;
                p2 p2Var4 = this.F;
                int i36 = p2Var4.f15204s;
                p2Var4.i();
                if (!(this.D.f15156j > 0)) {
                    int i37 = -2 - i36;
                    this.F.j();
                    this.F.f();
                    b bVar3 = this.I;
                    if (arrayList4.isEmpty()) {
                        a0 a0Var = new a0(this.E, bVar3);
                        P(false);
                        W();
                        U(a0Var);
                        z11 = false;
                    } else {
                        ArrayList P0 = gf.q.P0(arrayList4);
                        arrayList4.clear();
                        Q();
                        N();
                        b0 b0Var = new b0(this.E, bVar3, P0);
                        z11 = false;
                        P(false);
                        W();
                        U(b0Var);
                    }
                    this.K = z11;
                    if (!(this.f15067c.f15168b == 0 ? true : z11)) {
                        l0(i37, z11 ? 1 : 0);
                        m0(i37, i17);
                    }
                }
            } else {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
        } else {
            if (z10) {
                Y();
            }
            int i38 = this.D.f15155i;
            w0 w0Var = this.R;
            int i39 = w0Var.f15267b;
            if ((i39 > 0 ? w0Var.f15266a[i39 + -1] : -1) <= i38) {
                if (i39 > 0) {
                    i34 = w0Var.f15266a[i39 - 1];
                }
                if (i34 == i38) {
                    w0Var.a();
                    X(false, e0.f15022c);
                }
                int i40 = this.D.f15155i;
                if (i17 != p0(i40)) {
                    m0(i40, i17);
                }
                if (z10) {
                    i17 = 1;
                }
                this.D.d();
                O();
            } else {
                e0.c("Missed recording an endGroup".toString());
                throw null;
            }
        }
        q1 q1Var3 = (q1) this.f15072h.p();
        if (q1Var3 != null && !z12) {
            q1Var3.f15211c++;
        }
        this.f15073i = q1Var3;
        this.f15074j = this.f15075k.a() + i17;
        this.f15076l = this.m.a() + i17;
    }

    public final void F() {
        boolean z10 = false;
        E(false);
        E(false);
        int a10 = this.f15086w.a();
        e0.b bVar = e0.f15020a;
        if (a10 != 0) {
            z10 = true;
        }
        this.f15085v = z10;
        this.H = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.y1 G() {
        /*
            r10 = this;
            t.x2 r0 = r10.B
            java.lang.Object r1 = r0.f15278b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L_0x0016
            java.lang.Object r0 = r0.p()
            t.y1 r0 = (t.y1) r0
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r1 = r0.f15283a
            r1 = r1 & -9
            r0.f15283a = r1
        L_0x0020:
            r1 = 0
            if (r0 == 0) goto L_0x0066
            int r4 = r10.A
            u.a r5 = r0.f15288f
            if (r5 == 0) goto L_0x005b
            int r6 = r0.f15283a
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0031
            r6 = r2
            goto L_0x0032
        L_0x0031:
            r6 = r1
        L_0x0032:
            if (r6 != 0) goto L_0x005b
            int r6 = r5.f15628a
            r7 = r1
        L_0x0037:
            if (r7 >= r6) goto L_0x0052
            java.lang.Object[] r8 = r5.f15629b
            r8 = r8[r7]
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Any"
            sf.j.d(r8, r9)
            int[] r8 = r5.f15630c
            r8 = r8[r7]
            if (r8 == r4) goto L_0x004a
            r8 = r2
            goto L_0x004b
        L_0x004a:
            r8 = r1
        L_0x004b:
            if (r8 == 0) goto L_0x004f
            r6 = r2
            goto L_0x0053
        L_0x004f:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r6 == 0) goto L_0x005b
            t.x1 r6 = new t.x1
            r6.<init>(r0, r4, r5)
            goto L_0x005c
        L_0x005b:
            r6 = r3
        L_0x005c:
            if (r6 == 0) goto L_0x0066
            t.p r4 = new t.p
            r4.<init>(r6, r10)
            r10.U(r4)
        L_0x0066:
            if (r0 == 0) goto L_0x00a0
            int r4 = r0.f15283a
            r5 = r4 & 16
            if (r5 == 0) goto L_0x0070
            r5 = r2
            goto L_0x0071
        L_0x0070:
            r5 = r1
        L_0x0071:
            if (r5 != 0) goto L_0x00a0
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r2 = r1
        L_0x0078:
            if (r2 != 0) goto L_0x007e
            boolean r2 = r10.f15079p
            if (r2 == 0) goto L_0x00a0
        L_0x007e:
            t.b r2 = r0.f15285c
            if (r2 != 0) goto L_0x0099
            boolean r2 = r10.K
            if (r2 == 0) goto L_0x008f
            t.p2 r2 = r10.F
            int r3 = r2.f15204s
            t.b r2 = r2.b(r3)
            goto L_0x0097
        L_0x008f:
            t.m2 r2 = r10.D
            int r3 = r2.f15155i
            t.b r2 = r2.a(r3)
        L_0x0097:
            r0.f15285c = r2
        L_0x0099:
            int r2 = r0.f15283a
            r2 = r2 & -5
            r0.f15283a = r2
            r3 = r0
        L_0x00a0:
            r10.E(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.G():t.y1");
    }

    public final void H() {
        boolean z10 = false;
        E(false);
        this.f15066b.getClass();
        E(false);
        if (this.P) {
            X(false, e0.f15022c);
            this.P = false;
        }
        Q();
        if (((ArrayList) this.f15072h.f15278b).isEmpty()) {
            if (this.R.f15267b == 0) {
                z10 = true;
            }
            if (z10) {
                u();
                this.D.c();
                return;
            }
            e0.c("Missed recording an endGroup()".toString());
            throw null;
        }
        e0.c("Start/end imbalance".toString());
        throw null;
    }

    public final void I(boolean z10, q1 q1Var) {
        this.f15072h.q(this.f15073i);
        this.f15073i = q1Var;
        this.f15075k.b(this.f15074j);
        if (z10) {
            this.f15074j = 0;
        }
        this.m.b(this.f15076l);
        this.f15076l = 0;
    }

    public final y1 J() {
        if (this.f15089z == 0) {
            x2 x2Var = this.B;
            if (!((ArrayList) x2Var.f15278b).isEmpty()) {
                Object obj = x2Var.f15278b;
                return (y1) ((ArrayList) obj).get(((ArrayList) obj).size() - 1);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r14 = r5.f15063a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.util.ArrayList r20) {
        /*
            r19 = this;
            r7 = r19
            t.n2 r0 = r7.f15067c
            java.util.List<rf.q<t.c<?>, t.p2, t.i2, ff.m>> r1 = r7.f15070f
            java.util.List<rf.q<t.c<?>, t.p2, t.i2, ff.m>> r8 = r7.f15069e
            r7.f15069e = r1     // Catch:{ all -> 0x0060 }
            t.e0$c r1 = t.e0.f15024e     // Catch:{ all -> 0x0060 }
            r7.U(r1)     // Catch:{ all -> 0x0060 }
            int r9 = r20.size()     // Catch:{ all -> 0x0060 }
            r11 = 0
        L_0x0014:
            if (r11 >= r9) goto L_0x017f
            r12 = r20
            java.lang.Object r1 = r12.get(r11)     // Catch:{ all -> 0x0060 }
            ff.g r1 = (ff.g) r1     // Catch:{ all -> 0x0060 }
            A r2 = r1.f8706a     // Catch:{ all -> 0x0060 }
            t.i1 r2 = (t.i1) r2     // Catch:{ all -> 0x0060 }
            B r1 = r1.f8707b     // Catch:{ all -> 0x0060 }
            t.i1 r1 = (t.i1) r1     // Catch:{ all -> 0x0060 }
            t.b r3 = r2.f15123e     // Catch:{ all -> 0x0060 }
            t.n2 r4 = r2.f15122d
            int r5 = r4.b(r3)     // Catch:{ all -> 0x0060 }
            sf.t r13 = new sf.t     // Catch:{ all -> 0x0060 }
            r13.<init>()     // Catch:{ all -> 0x0060 }
            r19.Q()     // Catch:{ all -> 0x0060 }
            t.q r6 = new t.q     // Catch:{ all -> 0x0060 }
            r6.<init>(r13, r3)     // Catch:{ all -> 0x0060 }
            r7.U(r6)     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x00a0
            t.n2 r1 = r7.E     // Catch:{ all -> 0x0060 }
            boolean r1 = sf.j.a(r4, r1)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0063
            t.p2 r1 = r7.F     // Catch:{ all -> 0x0060 }
            boolean r1 = r1.f15205t     // Catch:{ all -> 0x0060 }
            t.e0.f(r1)     // Catch:{ all -> 0x0060 }
            t.n2 r1 = new t.n2     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            r7.E = r1     // Catch:{ all -> 0x0060 }
            t.p2 r1 = r1.e()     // Catch:{ all -> 0x0060 }
            r1.f()     // Catch:{ all -> 0x0060 }
            r7.F = r1     // Catch:{ all -> 0x0060 }
            goto L_0x0063
        L_0x0060:
            r0 = move-exception
            goto L_0x018c
        L_0x0063:
            t.m2 r14 = r4.d()     // Catch:{ all -> 0x0060 }
            r14.m(r5)     // Catch:{ all -> 0x009b }
            r7.O = r5     // Catch:{ all -> 0x009b }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x009b }
            r15.<init>()     // Catch:{ all -> 0x009b }
            t.r r6 = new t.r     // Catch:{ all -> 0x009b }
            r6.<init>(r7, r15, r14, r2)     // Catch:{ all -> 0x009b }
            r2 = 0
            r3 = 0
            r4 = 0
            gf.s r5 = gf.s.f8978a     // Catch:{ all -> 0x009b }
            r1 = r19
            r1.S(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x009b }
            boolean r1 = r15.isEmpty()     // Catch:{ all -> 0x009b }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0090
            t.s r1 = new t.s     // Catch:{ all -> 0x009b }
            r1.<init>(r13, r15)     // Catch:{ all -> 0x009b }
            r7.U(r1)     // Catch:{ all -> 0x009b }
        L_0x0090:
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x009b }
            r14.c()     // Catch:{ all -> 0x0060 }
            r17 = r0
            r16 = r9
            goto L_0x015c
        L_0x009b:
            r0 = move-exception
            r14.c()     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x00a0:
            t.g0 r5 = r7.f15066b     // Catch:{ all -> 0x0060 }
            t.h1 r5 = r5.h(r1)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x00ac
            t.n2 r6 = r5.f15063a     // Catch:{ all -> 0x0060 }
            if (r6 != 0) goto L_0x00ae
        L_0x00ac:
            t.n2 r6 = r1.f15122d     // Catch:{ all -> 0x0060 }
        L_0x00ae:
            if (r5 == 0) goto L_0x00b9
            t.n2 r14 = r5.f15063a     // Catch:{ all -> 0x0060 }
            if (r14 == 0) goto L_0x00b9
            t.b r14 = r14.a()     // Catch:{ all -> 0x0060 }
            goto L_0x00bb
        L_0x00b9:
            t.b r14 = r1.f15123e     // Catch:{ all -> 0x0060 }
        L_0x00bb:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0060 }
            r15.<init>()     // Catch:{ all -> 0x0060 }
            t.m2 r10 = r6.d()     // Catch:{ all -> 0x0060 }
            r16 = r9
            int r9 = r6.b(r14)     // Catch:{ all -> 0x017a }
            t.e0.b(r10, r15, r9)     // Catch:{ all -> 0x017a }
            ff.m r9 = ff.m.f8717a     // Catch:{ all -> 0x017a }
            r10.c()     // Catch:{ all -> 0x0060 }
            boolean r9 = r15.isEmpty()     // Catch:{ all -> 0x0060 }
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x00f8
            t.t r9 = new t.t     // Catch:{ all -> 0x0060 }
            r9.<init>(r13, r15)     // Catch:{ all -> 0x0060 }
            r7.U(r9)     // Catch:{ all -> 0x0060 }
            boolean r4 = sf.j.a(r4, r0)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x00f8
            int r3 = r0.b(r3)     // Catch:{ all -> 0x0060 }
            int r4 = r7.p0(r3)     // Catch:{ all -> 0x0060 }
            int r9 = r15.size()     // Catch:{ all -> 0x0060 }
            int r4 = r4 + r9
            r7.l0(r3, r4)     // Catch:{ all -> 0x0060 }
        L_0x00f8:
            t.u r3 = new t.u     // Catch:{ all -> 0x0060 }
            r3.<init>(r5, r7, r1, r2)     // Catch:{ all -> 0x0060 }
            r7.U(r3)     // Catch:{ all -> 0x0060 }
            t.m2 r9 = r6.d()     // Catch:{ all -> 0x0060 }
            t.m2 r10 = r7.D     // Catch:{ all -> 0x0175 }
            int[] r15 = r7.f15077n     // Catch:{ all -> 0x0175 }
            r3 = 0
            r7.f15077n = r3     // Catch:{ all -> 0x0175 }
            r7.D = r9     // Catch:{ all -> 0x0153 }
            int r3 = r6.b(r14)     // Catch:{ all -> 0x0153 }
            r9.m(r3)     // Catch:{ all -> 0x0153 }
            r7.O = r3     // Catch:{ all -> 0x0153 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0153 }
            r14.<init>()     // Catch:{ all -> 0x0153 }
            java.util.List<rf.q<t.c<?>, t.p2, t.i2, ff.m>> r6 = r7.f15069e     // Catch:{ all -> 0x0153 }
            r7.f15069e = r14     // Catch:{ all -> 0x016b }
            t.m0 r3 = r1.f15121c     // Catch:{ all -> 0x016b }
            t.m0 r4 = r2.f15121c     // Catch:{ all -> 0x016b }
            int r5 = r9.f15153g     // Catch:{ all -> 0x016b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x016b }
            java.util.List<ff.g<t.y1, u.c<java.lang.Object>>> r1 = r1.f15124f     // Catch:{ all -> 0x016b }
            r17 = r0
            t.v r0 = new t.v     // Catch:{ all -> 0x016b }
            r0.<init>(r7, r2)     // Catch:{ all -> 0x016b }
            r18 = r1
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r18
            r12 = r6
            r6 = r0
            r1.S(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0169 }
            r7.f15069e = r12     // Catch:{ all -> 0x0153 }
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x0153 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0155
            t.w r0 = new t.w     // Catch:{ all -> 0x0153 }
            r0.<init>(r13, r14)     // Catch:{ all -> 0x0153 }
            r7.U(r0)     // Catch:{ all -> 0x0153 }
            goto L_0x0155
        L_0x0153:
            r0 = move-exception
            goto L_0x0170
        L_0x0155:
            r7.D = r10     // Catch:{ all -> 0x0175 }
            r7.f15077n = r15     // Catch:{ all -> 0x0175 }
            r9.c()     // Catch:{ all -> 0x0060 }
        L_0x015c:
            t.e0$d r0 = t.e0.f15021b     // Catch:{ all -> 0x0060 }
            r7.U(r0)     // Catch:{ all -> 0x0060 }
            int r11 = r11 + 1
            r9 = r16
            r0 = r17
            goto L_0x0014
        L_0x0169:
            r0 = move-exception
            goto L_0x016d
        L_0x016b:
            r0 = move-exception
            r12 = r6
        L_0x016d:
            r7.f15069e = r12     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x0170:
            r7.D = r10     // Catch:{ all -> 0x0175 }
            r7.f15077n = r15     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            r9.c()     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x017a:
            r0 = move-exception
            r10.c()     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x017f:
            t.x r0 = t.x.f15270a     // Catch:{ all -> 0x0060 }
            r7.U(r0)     // Catch:{ all -> 0x0060 }
            r0 = 0
            r7.O = r0     // Catch:{ all -> 0x0060 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0060 }
            r7.f15069e = r8
            return
        L_0x018c:
            r7.f15069e = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.K(java.util.ArrayList):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: t.h$a$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M() {
        /*
            r4 = this;
            boolean r0 = r4.K
            t.h$a$a r1 = t.h.a.f15061a
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.f15080q
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x000d
            goto L_0x0035
        L_0x000d:
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected"
            java.lang.String r0 = r0.toString()
            t.e0.c(r0)
            r0 = 0
            throw r0
        L_0x0018:
            t.m2 r0 = r4.D
            int r2 = r0.f15156j
            if (r2 > 0) goto L_0x002e
            int r2 = r0.f15157k
            int r3 = r0.f15158l
            if (r2 < r3) goto L_0x0025
            goto L_0x002e
        L_0x0025:
            int r3 = r2 + 1
            r0.f15157k = r3
            java.lang.Object[] r0 = r0.f15150d
            r0 = r0[r2]
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            boolean r2 = r4.f15087x
            if (r2 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = r0
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.M():java.lang.Object");
    }

    public final void N() {
        x2 x2Var = this.N;
        if (!((ArrayList) x2Var.f15278b).isEmpty()) {
            ArrayList arrayList = (ArrayList) x2Var.f15278b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = arrayList.get(i8);
            }
            U(new z(objArr));
            x2Var.b();
        }
    }

    public final void O() {
        int i8 = this.W;
        this.W = 0;
        if (i8 > 0) {
            int i10 = this.T;
            if (i10 >= 0) {
                this.T = -1;
                c cVar = new c(i10, i8);
                Q();
                N();
                U(cVar);
                return;
            }
            int i11 = this.U;
            this.U = -1;
            int i12 = this.V;
            this.V = -1;
            d dVar = new d(i11, i12, i8);
            Q();
            N();
            U(dVar);
        }
    }

    public final void P(boolean z10) {
        int i8 = z10 ? this.D.f15155i : this.D.f15153g;
        int i10 = i8 - this.O;
        if (!(i10 >= 0)) {
            e0.c("Tried to seek backward".toString());
            throw null;
        } else if (i10 > 0) {
            U(new e(i10));
            this.O = i8;
        }
    }

    public final void Q() {
        int i8 = this.M;
        if (i8 > 0) {
            this.M = 0;
            U(new f(i8));
        }
    }

    public final boolean R(u.b bVar) {
        sf.j.f(bVar, "invalidationsRequested");
        if (this.f15069e.isEmpty()) {
            if (!(bVar.f15631a > 0) && !(!this.f15081r.isEmpty())) {
                return false;
            }
            B(bVar, (z.a) null);
            return !this.f15069e.isEmpty();
        }
        e0.c("Expected applyChanges() to have been called".toString());
        throw null;
    }

    public final <R> R S(m0 m0Var, m0 m0Var2, Integer num, List<ff.g<y1, u.c<Object>>> list, rf.a<? extends R> aVar) {
        R r10;
        m0 m0Var3 = m0Var;
        boolean z10 = this.Q;
        boolean z11 = this.C;
        int i8 = this.f15074j;
        try {
            this.Q = false;
            this.C = true;
            this.f15074j = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ff.g gVar = list.get(i10);
                y1 y1Var = (y1) gVar.f8706a;
                u.c cVar = (u.c) gVar.f8707b;
                if (cVar != null) {
                    int i11 = cVar.f15634a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        h0(y1Var, cVar.get(i12));
                    }
                } else {
                    h0(y1Var, (Object) null);
                }
            }
            if (m0Var3 != null) {
                r10 = m0Var.u(m0Var2, num != null ? num.intValue() : -1, aVar);
                if (r10 == null) {
                }
                return r10;
            }
            rf.a<? extends R> aVar2 = aVar;
            r10 = aVar.d();
            return r10;
        } finally {
            this.Q = z10;
            this.C = z11;
            this.f15074j = i8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (r9.f15272b < r3) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x00a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[LOOP:1: B:26:0x0069->B:43:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T() {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r1.C
            r2 = 1
            r1.C = r2
            t.m2 r3 = r1.D
            int r4 = r3.f15155i
            int r3 = r3.g(r4)
            int r3 = r3 + r4
            int r5 = r1.f15074j
            int r6 = r1.L
            int r7 = r1.f15076l
            java.util.ArrayList r8 = r1.f15081r
            t.m2 r9 = r1.D
            int r9 = r9.f15153g
            int r9 = t.e0.d(r9, r8)
            if (r9 >= 0) goto L_0x0025
            int r9 = r9 + 1
            int r9 = -r9
        L_0x0025:
            int r10 = r8.size()
            if (r9 >= r10) goto L_0x0036
            java.lang.Object r9 = r8.get(r9)
            t.x0 r9 = (t.x0) r9
            int r10 = r9.f15272b
            if (r10 >= r3) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r9 = 0
        L_0x0037:
            r13 = r4
            r12 = 0
        L_0x0039:
            if (r9 == 0) goto L_0x01ee
            int r14 = r9.f15272b
            int r15 = t.e0.d(r14, r8)
            if (r15 < 0) goto L_0x0049
            java.lang.Object r15 = r8.remove(r15)
            t.x0 r15 = (t.x0) r15
        L_0x0049:
            u.c<java.lang.Object> r15 = r9.f15273c
            t.y1 r9 = r9.f15271a
            if (r15 != 0) goto L_0x0053
            r9.getClass()
            goto L_0x00ae
        L_0x0053:
            u.b r10 = r9.f15289g
            if (r10 != 0) goto L_0x0058
            goto L_0x00ae
        L_0x0058:
            int r2 = r15.f15634a
            if (r2 <= 0) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x0068
            goto L_0x00a9
        L_0x0068:
            r2 = 0
        L_0x0069:
            int r11 = r15.f15634a
            if (r2 >= r11) goto L_0x006f
            r11 = 1
            goto L_0x0070
        L_0x006f:
            r11 = 0
        L_0x0070:
            if (r11 == 0) goto L_0x00a9
            java.lang.Object[] r11 = r15.f15635b
            int r17 = r2 + 1
            r2 = r11[r2]
            java.lang.String r11 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            sf.j.d(r2, r11)
            boolean r11 = r2 instanceof t.o0
            if (r11 == 0) goto L_0x009d
            t.o0 r2 = (t.o0) r2
            t.s2 r11 = r2.a()
            if (r11 != 0) goto L_0x008b
            t.b3 r11 = t.b3.f14997a
        L_0x008b:
            r18 = r15
            java.lang.Object r15 = r2.e()
            java.lang.Object r2 = r10.c(r2)
            boolean r2 = r11.a(r15, r2)
            if (r2 == 0) goto L_0x009f
            r2 = 1
            goto L_0x00a0
        L_0x009d:
            r18 = r15
        L_0x009f:
            r2 = 0
        L_0x00a0:
            if (r2 != 0) goto L_0x00a4
            r2 = 0
            goto L_0x00aa
        L_0x00a4:
            r2 = r17
            r15 = r18
            goto L_0x0069
        L_0x00a9:
            r2 = 1
        L_0x00aa:
            if (r2 == 0) goto L_0x00ae
            r2 = 0
            goto L_0x00af
        L_0x00ae:
            r2 = 1
        L_0x00af:
            if (r2 == 0) goto L_0x017d
            t.m2 r2 = r1.D
            r2.m(r14)
            t.m2 r2 = r1.D
            int r2 = r2.f15153g
            r1.Z(r13, r2, r4)
            t.m2 r10 = r1.D
            int r10 = r10.l(r2)
        L_0x00c3:
            if (r10 == r4) goto L_0x00d4
            t.m2 r11 = r1.D
            boolean r11 = r11.h(r10)
            if (r11 != 0) goto L_0x00d4
            t.m2 r11 = r1.D
            int r10 = r11.l(r10)
            goto L_0x00c3
        L_0x00d4:
            t.m2 r11 = r1.D
            boolean r11 = r11.h(r10)
            if (r11 == 0) goto L_0x00de
            r11 = 0
            goto L_0x00df
        L_0x00de:
            r11 = r5
        L_0x00df:
            if (r10 != r2) goto L_0x00e2
            goto L_0x0106
        L_0x00e2:
            int r12 = r1.p0(r10)
            t.m2 r13 = r1.D
            int r13 = r13.j(r2)
            int r12 = r12 - r13
            int r12 = r12 + r11
        L_0x00ee:
            if (r11 >= r12) goto L_0x0106
            if (r10 == r14) goto L_0x0106
            int r10 = r10 + 1
        L_0x00f4:
            if (r10 >= r14) goto L_0x0106
            t.m2 r13 = r1.D
            int r13 = r13.g(r10)
            int r13 = r13 + r10
            if (r14 < r13) goto L_0x00ee
            int r10 = r1.p0(r10)
            int r11 = r11 + r10
            r10 = r13
            goto L_0x00f4
        L_0x0106:
            r1.f15074j = r11
            t.m2 r10 = r1.D
            int r10 = r10.l(r2)
            int r10 = r1.w(r10, r4, r6)
            r1.L = r10
            r10 = 0
            r1.H = r10
            r9.getClass()
            rf.p<? super t.h, ? super java.lang.Integer, ff.m> r9 = r9.f15286d
            r11 = 1
            if (r9 == 0) goto L_0x0129
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r9.invoke(r1, r12)
            ff.m r16 = ff.m.f8717a
            goto L_0x012b
        L_0x0129:
            r16 = r10
        L_0x012b:
            if (r16 == 0) goto L_0x0171
            r1.H = r10
            t.m2 r9 = r1.D
            int[] r10 = r9.f15148b
            int r10 = b7.a.e(r10, r4)
            int r10 = r10 + r4
            int r12 = r9.f15153g
            if (r12 < r4) goto L_0x0140
            if (r12 > r10) goto L_0x0140
            r13 = r11
            goto L_0x0141
        L_0x0140:
            r13 = 0
        L_0x0141:
            if (r13 == 0) goto L_0x0152
            r9.f15155i = r4
            r9.f15154h = r10
            r10 = 0
            r9.f15157k = r10
            r9.f15158l = r10
            r18 = r0
            r13 = r2
            r12 = r11
            goto L_0x01c9
        L_0x0152:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Index "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = " is not a parent of "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            t.e0.c(r0)
            r2 = 0
            throw r2
        L_0x0171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid restart scope"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x017d:
            r2 = 0
            r10 = 0
            r11 = 1
            t.x2 r14 = r1.B
            r14.q(r9)
            t.i0 r15 = r9.f15284b
            if (r15 == 0) goto L_0x01c4
            u.a r2 = r9.f15288f
            if (r2 == 0) goto L_0x01c4
            int r10 = r9.f15283a
            r10 = r10 | 32
            r9.f15283a = r10
            int r10 = r2.f15628a     // Catch:{ all -> 0x01bc }
            r11 = 0
        L_0x0196:
            if (r11 >= r10) goto L_0x01b3
            r17 = r10
            java.lang.Object[] r10 = r2.f15629b     // Catch:{ all -> 0x01bc }
            r10 = r10[r11]     // Catch:{ all -> 0x01bc }
            r18 = r0
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            sf.j.d(r10, r0)     // Catch:{ all -> 0x01bc }
            int[] r0 = r2.f15630c     // Catch:{ all -> 0x01bc }
            r0 = r0[r11]     // Catch:{ all -> 0x01bc }
            r15.i(r10)     // Catch:{ all -> 0x01bc }
            int r11 = r11 + 1
            r10 = r17
            r0 = r18
            goto L_0x0196
        L_0x01b3:
            r18 = r0
            int r0 = r9.f15283a
            r0 = r0 & -33
            r9.f15283a = r0
            goto L_0x01c6
        L_0x01bc:
            r0 = move-exception
            int r2 = r9.f15283a
            r2 = r2 & -33
            r9.f15283a = r2
            throw r0
        L_0x01c4:
            r18 = r0
        L_0x01c6:
            r14.p()
        L_0x01c9:
            t.m2 r0 = r1.D
            int r0 = r0.f15153g
            int r0 = t.e0.d(r0, r8)
            if (r0 >= 0) goto L_0x01d6
            int r0 = r0 + 1
            int r0 = -r0
        L_0x01d6:
            int r2 = r8.size()
            if (r0 >= r2) goto L_0x01e8
            java.lang.Object r0 = r8.get(r0)
            t.x0 r0 = (t.x0) r0
            int r2 = r0.f15272b
            if (r2 >= r3) goto L_0x01e8
            r9 = r0
            goto L_0x01e9
        L_0x01e8:
            r9 = 0
        L_0x01e9:
            r0 = r18
            r2 = 1
            goto L_0x0039
        L_0x01ee:
            r18 = r0
            if (r12 == 0) goto L_0x0205
            r1.Z(r13, r4, r4)
            t.m2 r0 = r1.D
            r0.o()
            int r0 = r1.p0(r4)
            int r5 = r5 + r0
            r1.f15074j = r5
            int r7 = r7 + r0
            r1.f15076l = r7
            goto L_0x021a
        L_0x0205:
            t.m2 r0 = r1.D
            int r2 = r0.f15155i
            if (r2 < 0) goto L_0x0212
            int[] r0 = r0.f15148b
            int r10 = b7.a.j(r0, r2)
            goto L_0x0213
        L_0x0212:
            r10 = 0
        L_0x0213:
            r1.f15076l = r10
            t.m2 r0 = r1.D
            r0.o()
        L_0x021a:
            r1.L = r6
            r0 = r18
            r1.C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.T():void");
    }

    public final void U(q<? super c<?>, ? super p2, ? super i2, ff.m> qVar) {
        this.f15069e.add(qVar);
    }

    public final void V(int i8, int i10) {
        if (i10 > 0) {
            if (!(i8 >= 0)) {
                e0.c(("Invalid remove index " + i8).toString());
                throw null;
            } else if (this.T == i8) {
                this.W += i10;
            } else {
                O();
                this.T = i8;
                this.W = i10;
            }
        }
    }

    public final void W() {
        m2 m2Var = this.D;
        if (m2Var.f15149c > 0) {
            int i8 = m2Var.f15155i;
            w0 w0Var = this.R;
            int i10 = w0Var.f15267b;
            if ((i10 > 0 ? w0Var.f15266a[i10 - 1] : -2) != i8) {
                if (!this.P && this.Q) {
                    X(false, e0.f15023d);
                    this.P = true;
                }
                if (i8 > 0) {
                    b a10 = m2Var.a(i8);
                    w0Var.b(i8);
                    X(false, new g(a10));
                }
            }
        }
    }

    public final void X(boolean z10, q<? super c<?>, ? super p2, ? super i2, ff.m> qVar) {
        P(z10);
        U(qVar);
    }

    public final void Y() {
        x2 x2Var = this.N;
        if (!((ArrayList) x2Var.f15278b).isEmpty()) {
            x2Var.p();
        } else {
            this.M++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(int r7, int r8, int r9) {
        /*
            r6 = this;
            t.m2 r0 = r6.D
            t.e0$b r1 = t.e0.f15020a
            if (r7 != r8) goto L_0x0007
            goto L_0x001c
        L_0x0007:
            if (r7 == r9) goto L_0x006c
            if (r8 != r9) goto L_0x000d
            goto L_0x006c
        L_0x000d:
            int r1 = r0.l(r7)
            if (r1 != r8) goto L_0x0016
            r9 = r8
            goto L_0x006c
        L_0x0016:
            int r1 = r0.l(r8)
            if (r1 != r7) goto L_0x001e
        L_0x001c:
            r9 = r7
            goto L_0x006c
        L_0x001e:
            int r1 = r0.l(r7)
            int r2 = r0.l(r8)
            if (r1 != r2) goto L_0x002d
            int r9 = r0.l(r7)
            goto L_0x006c
        L_0x002d:
            r1 = 0
            r2 = r7
            r3 = r1
        L_0x0030:
            if (r2 <= 0) goto L_0x003b
            if (r2 == r9) goto L_0x003b
            int r2 = r0.l(r2)
            int r3 = r3 + 1
            goto L_0x0030
        L_0x003b:
            r2 = r8
            r4 = r1
        L_0x003d:
            if (r2 <= 0) goto L_0x0048
            if (r2 == r9) goto L_0x0048
            int r2 = r0.l(r2)
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0048:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L_0x004c:
            if (r2 >= r9) goto L_0x0055
            int r5 = r0.l(r5)
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0055:
            int r4 = r4 - r3
            r9 = r8
        L_0x0057:
            if (r1 >= r4) goto L_0x0060
            int r9 = r0.l(r9)
            int r1 = r1 + 1
            goto L_0x0057
        L_0x0060:
            if (r5 == r9) goto L_0x006b
            int r5 = r0.l(r5)
            int r9 = r0.l(r9)
            goto L_0x0060
        L_0x006b:
            r9 = r5
        L_0x006c:
            if (r7 <= 0) goto L_0x007e
            if (r7 == r9) goto L_0x007e
            boolean r1 = r0.h(r7)
            if (r1 == 0) goto L_0x0079
            r6.Y()
        L_0x0079:
            int r7 = r0.l(r7)
            goto L_0x006c
        L_0x007e:
            r6.C(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.Z(int, int, int):void");
    }

    public final void a() {
        this.f15079p = true;
    }

    public final y1 b() {
        return J();
    }

    public final void b0(Object obj, int i8, int i10, Object obj2) {
        q1 q1Var;
        Object obj3;
        h.a.C0280a aVar = obj;
        int i11 = i8;
        int i12 = i10;
        Object obj4 = obj2;
        if (!this.f15080q) {
            i0(i11, aVar, obj4);
            boolean z10 = i12 != 0;
            boolean z11 = this.K;
            h.a.C0280a aVar2 = h.a.f15061a;
            if (z11) {
                this.D.f15156j++;
                p2 p2Var = this.F;
                int i13 = p2Var.f15203r;
                if (z10) {
                    p2Var.J(i11, aVar2, true, aVar2);
                } else if (obj4 != null) {
                    if (aVar == null) {
                        aVar = aVar2;
                    }
                    p2Var.J(i11, aVar, false, obj4);
                } else {
                    if (aVar == null) {
                        aVar = aVar2;
                    }
                    p2Var.J(i11, aVar, false, aVar2);
                }
                q1 q1Var2 = this.f15073i;
                if (q1Var2 != null) {
                    int i14 = -2 - i13;
                    z0 z0Var = new z0(-1, i11, i14, -1);
                    q1Var2.f15213e.put(Integer.valueOf(i14), new u0(-1, this.f15074j - q1Var2.f15210b, 0));
                    q1Var2.f15212d.add(z0Var);
                }
                I(z10, (q1) null);
                return;
            }
            boolean z12 = !(i12 != 1) && this.f15087x;
            if (this.f15073i == null) {
                m2 m2Var = this.D;
                int i15 = m2Var.f15153g;
                int i16 = m2Var.f15154h;
                int i17 = i15 < i16 ? m2Var.f15148b[i15 * 5] : 0;
                if (!z12 && i17 == i11) {
                    if (sf.j.a(aVar, i15 < i16 ? m2Var.k(m2Var.f15148b, i15) : null)) {
                        e0(z10, obj4);
                    }
                }
                m2 m2Var2 = this.D;
                m2Var2.getClass();
                ArrayList arrayList = new ArrayList();
                if (m2Var2.f15156j <= 0) {
                    int i18 = m2Var2.f15153g;
                    while (i18 < m2Var2.f15154h) {
                        int i19 = i18 * 5;
                        int[] iArr = m2Var2.f15148b;
                        arrayList.add(new z0(m2Var2.k(iArr, i18), iArr[i19], i18, b7.a.g(iArr, i18) ? 1 : b7.a.j(iArr, i18)));
                        i18 += iArr[i19 + 3];
                    }
                }
                this.f15073i = new q1(this.f15074j, arrayList);
            }
            q1 q1Var3 = this.f15073i;
            if (q1Var3 != null) {
                Object y0Var = aVar != null ? new y0(Integer.valueOf(i8), aVar) : Integer.valueOf(i8);
                HashMap hashMap = (HashMap) q1Var3.f15214f.getValue();
                e0.b bVar = e0.f15020a;
                LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(y0Var);
                if (linkedHashSet == null || (obj3 = gf.q.w0(linkedHashSet)) == null) {
                    obj3 = null;
                } else {
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) hashMap.get(y0Var);
                    if (linkedHashSet2 != null) {
                        linkedHashSet2.remove(obj3);
                        if (linkedHashSet2.isEmpty()) {
                            hashMap.remove(y0Var);
                        }
                        ff.m mVar = ff.m.f8717a;
                    }
                }
                z0 z0Var2 = (z0) obj3;
                HashMap<Integer, u0> hashMap2 = q1Var3.f15213e;
                ArrayList arrayList2 = q1Var3.f15212d;
                int i20 = q1Var3.f15210b;
                if (z12 || z0Var2 == null) {
                    this.D.f15156j++;
                    this.K = true;
                    this.H = null;
                    if (this.F.f15205t) {
                        p2 e10 = this.E.e();
                        this.F = e10;
                        e10.G();
                        this.G = false;
                        this.H = null;
                    }
                    this.F.e();
                    p2 p2Var2 = this.F;
                    int i21 = p2Var2.f15203r;
                    if (z10) {
                        p2Var2.J(i11, aVar2, true, aVar2);
                    } else if (obj4 != null) {
                        if (aVar == null) {
                            aVar = aVar2;
                        }
                        p2Var2.J(i11, aVar, false, obj4);
                    } else {
                        if (aVar == null) {
                            aVar = aVar2;
                        }
                        p2Var2.J(i11, aVar, false, aVar2);
                    }
                    this.I = this.F.b(i21);
                    int i22 = -2 - i21;
                    z0 z0Var3 = new z0(-1, i11, i22, -1);
                    hashMap2.put(Integer.valueOf(i22), new u0(-1, this.f15074j - i20, 0));
                    arrayList2.add(z0Var3);
                    q1Var = new q1(z10 ? 0 : this.f15074j, new ArrayList());
                    I(z10, q1Var);
                    return;
                }
                arrayList2.add(z0Var2);
                this.f15074j = q1Var3.a(z0Var2) + i20;
                int i23 = z0Var2.f15293c;
                u0 u0Var = hashMap2.get(Integer.valueOf(i23));
                int i24 = u0Var != null ? u0Var.f15239a : -1;
                int i25 = q1Var3.f15211c;
                int i26 = i24 - i25;
                if (i24 > i25) {
                    Collection<u0> values = hashMap2.values();
                    sf.j.e(values, "groupInfos.values");
                    for (u0 u0Var2 : values) {
                        int i27 = u0Var2.f15239a;
                        if (i27 == i24) {
                            u0Var2.f15239a = i25;
                        } else {
                            if (i25 <= i27 && i27 < i24) {
                                u0Var2.f15239a = i27 + 1;
                            }
                        }
                    }
                } else if (i25 > i24) {
                    Collection<u0> values2 = hashMap2.values();
                    sf.j.e(values2, "groupInfos.values");
                    for (u0 u0Var3 : values2) {
                        int i28 = u0Var3.f15239a;
                        if (i28 == i24) {
                            u0Var3.f15239a = i25;
                        } else {
                            if (i24 + 1 <= i28 && i28 < i25) {
                                u0Var3.f15239a = i28 - 1;
                            }
                        }
                    }
                }
                m2 m2Var3 = this.D;
                this.O = i23 - (m2Var3.f15153g - this.O);
                m2Var3.m(i23);
                if (i26 > 0) {
                    d0 d0Var = new d0(i26);
                    P(false);
                    W();
                    U(d0Var);
                }
                e0(z10, obj4);
            }
            q1Var = null;
            I(z10, q1Var);
            return;
        }
        e0.c("A call to createNode(), emitNode() or useNode() expected".toString());
        throw null;
    }

    public final void c(int i8) {
        b0((Object) null, i8, 0, (Object) null);
    }

    public final void c0(int i8, m1 m1Var) {
        b0(m1Var, i8, 0, (Object) null);
    }

    public final Object d() {
        return M();
    }

    public final void d0(v1<?>[] v1VarArr) {
        boolean z10;
        v.b<k0<Object>, y2<Object>> bVar;
        sf.j.f(v1VarArr, "values");
        v.b bVar2 = this.H;
        if (bVar2 == null) {
            bVar2 = z(this.D.f15155i);
        }
        c0(201, e0.f15026g);
        c0(203, e0.f15028i);
        C0281i iVar = new C0281i(v1VarArr, bVar2);
        y.c(2, iVar);
        v.b bVar3 = (v.b) iVar.invoke(this, 1);
        E(false);
        if (this.K) {
            bVar = n0(bVar2, bVar3);
            this.G = true;
            z10 = false;
        } else {
            m2 m2Var = this.D;
            Object f10 = m2Var.f(m2Var.f15153g, 0);
            sf.j.d(f10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            v.b<k0<Object>, y2<Object>> bVar4 = (v.b) f10;
            m2 m2Var2 = this.D;
            Object f11 = m2Var2.f(m2Var2.f15153g, 1);
            sf.j.d(f11, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            v.b bVar5 = (v.b) f11;
            if (!h() || !sf.j.a(bVar5, bVar3)) {
                bVar = n0(bVar2, bVar3);
                z10 = true ^ sf.j.a(bVar, bVar4);
            } else {
                this.f15076l = this.D.n() + this.f15076l;
                z10 = false;
                bVar = bVar4;
            }
        }
        if (z10 && !this.K) {
            ((SparseArray) this.f15084u.f15278b).put(this.D.f15153g, bVar);
        }
        this.f15086w.b(this.f15085v ? 1 : 0);
        this.f15085v = z10;
        this.H = bVar;
        b0(e0.f15027h, 202, 0, bVar);
    }

    public final n2 e() {
        return this.f15067c;
    }

    public final void e0(boolean z10, Object obj) {
        if (z10) {
            m2 m2Var = this.D;
            if (m2Var.f15156j > 0) {
                return;
            }
            if (b7.a.g(m2Var.f15148b, m2Var.f15153g)) {
                m2Var.p();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
        if (!(obj == null || this.D.e() == obj)) {
            X(false, new j(obj));
        }
        this.D.p();
    }

    public final boolean f() {
        return this.K;
    }

    public final void f0() {
        b0((Object) null, 125, 2, (Object) null);
        this.f15080q = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: t.x0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.i g(int r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r8.b0(r0, r9, r1, r0)
            boolean r9 = r8.K
            t.x2 r2 = r8.B
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            t.m0 r4 = r8.f15071g
            if (r9 == 0) goto L_0x002a
            t.y1 r9 = new t.y1
            sf.j.d(r4, r3)
            t.i0 r4 = (t.i0) r4
            r9.<init>(r4)
            r2.q(r9)
            r8.o0(r9)
            int r0 = r8.A
            r9.f15287e = r0
            int r0 = r9.f15283a
            r0 = r0 & -17
            r9.f15283a = r0
            goto L_0x0090
        L_0x002a:
            java.util.ArrayList r9 = r8.f15081r
            t.m2 r5 = r8.D
            int r5 = r5.f15155i
            int r5 = t.e0.d(r5, r9)
            if (r5 < 0) goto L_0x003d
            java.lang.Object r9 = r9.remove(r5)
            r0 = r9
            t.x0 r0 = (t.x0) r0
        L_0x003d:
            t.m2 r9 = r8.D
            int r5 = r9.f15156j
            t.h$a$a r6 = t.h.a.f15061a
            if (r5 > 0) goto L_0x0055
            int r5 = r9.f15157k
            int r7 = r9.f15158l
            if (r5 < r7) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            int r7 = r5 + 1
            r9.f15157k = r7
            java.lang.Object[] r9 = r9.f15150d
            r9 = r9[r5]
            goto L_0x0056
        L_0x0055:
            r9 = r6
        L_0x0056:
            boolean r5 = sf.j.a(r9, r6)
            if (r5 == 0) goto L_0x006a
            t.y1 r9 = new t.y1
            sf.j.d(r4, r3)
            t.i0 r4 = (t.i0) r4
            r9.<init>(r4)
            r8.o0(r9)
            goto L_0x0071
        L_0x006a:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            sf.j.d(r9, r3)
            t.y1 r9 = (t.y1) r9
        L_0x0071:
            if (r0 == 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            if (r1 == 0) goto L_0x007d
            int r0 = r9.f15283a
            r0 = r0 | 8
            r9.f15283a = r0
            goto L_0x0083
        L_0x007d:
            int r0 = r9.f15283a
            r0 = r0 & -9
            r9.f15283a = r0
        L_0x0083:
            r2.q(r9)
            int r0 = r8.A
            r9.f15287e = r0
            int r0 = r9.f15283a
            r0 = r0 & -17
            r9.f15283a = r0
        L_0x0090:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.g(int):t.i");
    }

    public final void g0() {
        T t2;
        n2 n2Var = this.f15067c;
        this.D = n2Var.d();
        b0((Object) null, 100, 0, (Object) null);
        g0 g0Var = this.f15066b;
        g0Var.getClass();
        this.f15083t = h0.f15062a;
        boolean z10 = this.f15085v;
        e0.b bVar = e0.f15020a;
        this.f15086w.b(z10 ? 1 : 0);
        this.f15085v = p(this.f15083t);
        this.H = null;
        if (!this.f15079p) {
            g0Var.c();
            this.f15079p = false;
        }
        z2 z2Var = c0.a.f3657a;
        w.d dVar = this.f15083t;
        sf.j.f(dVar, "<this>");
        sf.j.f(z2Var, "key");
        if (dVar.containsKey(z2Var)) {
            y2 y2Var = (y2) dVar.get(z2Var);
            t2 = y2Var != null ? y2Var.getValue() : null;
        } else {
            t2 = z2Var.f15132a.getValue();
        }
        Set set = (Set) t2;
        if (set != null) {
            set.add(n2Var);
            g0Var.i(set);
        }
        g0Var.d();
        b0((Object) null, 1000, 0, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r3 = this;
            boolean r0 = r3.K
            r1 = 0
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f15087x
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3.f15085v
            if (r0 != 0) goto L_0x0025
            t.y1 r0 = r3.J()
            r2 = 1
            if (r0 == 0) goto L_0x0021
            int r0 = r0.f15283a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 != 0) goto L_0x0021
            r0 = r2
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.h():boolean");
    }

    public final boolean h0(y1 y1Var, Object obj) {
        sf.j.f(y1Var, "scope");
        b bVar = y1Var.f15285c;
        if (bVar == null) {
            return false;
        }
        n2 n2Var = this.f15067c;
        sf.j.f(n2Var, "slots");
        int b10 = n2Var.b(bVar);
        if (!this.C || b10 < this.D.f15153g) {
            return false;
        }
        ArrayList arrayList = this.f15081r;
        int d10 = e0.d(b10, arrayList);
        u.c cVar = null;
        if (d10 < 0) {
            int i8 = -(d10 + 1);
            if (obj != null) {
                cVar = new u.c();
                cVar.add(obj);
            }
            arrayList.add(i8, new x0(y1Var, b10, cVar));
        } else if (obj == null) {
            ((x0) arrayList.get(d10)).f15273c = null;
        } else {
            u.c<Object> cVar2 = ((x0) arrayList.get(d10)).f15273c;
            if (cVar2 != null) {
                cVar2.add(obj);
            }
        }
        return true;
    }

    public final void i(q.c cVar) {
        U(new c0(cVar));
    }

    public final void i0(int i8, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i8 != 207 || sf.j.a(obj2, h.a.f15061a)) {
                this.L = i8 ^ Integer.rotateLeft(this.L, 3);
            } else {
                this.L = obj2.hashCode() ^ Integer.rotateLeft(this.L, 3);
            }
        } else if (obj instanceof Enum) {
            this.L = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.L, 3);
        } else {
            this.L = obj.hashCode() ^ Integer.rotateLeft(this.L, 3);
        }
    }

    public final void j() {
        int i8 = 0;
        if (this.f15076l == 0) {
            y1 J2 = J();
            if (J2 != null) {
                J2.f15283a |= 16;
            }
            if (this.f15081r.isEmpty()) {
                m2 m2Var = this.D;
                int i10 = m2Var.f15155i;
                if (i10 >= 0) {
                    i8 = b7.a.j(m2Var.f15148b, i10);
                }
                this.f15076l = i8;
                this.D.o();
                return;
            }
            T();
            return;
        }
        e0.c("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }

    public final void j0(int i8, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null || i8 != 207 || sf.j.a(obj2, h.a.f15061a)) {
                k0(i8);
            } else {
                k0(obj2.hashCode());
            }
        } else if (obj instanceof Enum) {
            k0(((Enum) obj).ordinal());
        } else {
            k0(obj.hashCode());
        }
    }

    public final <V, T> void k(V v3, p<? super T, ? super V, ff.m> pVar) {
        sf.j.f(pVar, "block");
        b bVar = new b(v3, pVar);
        if (this.K) {
            this.J.add(bVar);
            return;
        }
        Q();
        N();
        U(bVar);
    }

    public final void k0(int i8) {
        this.L = Integer.rotateRight(Integer.hashCode(i8) ^ this.L, 3);
    }

    public final jf.f l() {
        return this.f15066b.e();
    }

    public final void l0(int i8, int i10) {
        if (p0(i8) == i10) {
            return;
        }
        if (i8 < 0) {
            HashMap<Integer, Integer> hashMap = this.f15078o;
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f15078o = hashMap;
            }
            hashMap.put(Integer.valueOf(i8), Integer.valueOf(i10));
            return;
        }
        int[] iArr = this.f15077n;
        if (iArr == null) {
            int i11 = this.D.f15149c;
            int[] iArr2 = new int[i11];
            Arrays.fill(iArr2, 0, i11, -1);
            this.f15077n = iArr2;
            iArr = iArr2;
        }
        iArr[i8] = i10;
    }

    public final void m(w1 w1Var) {
        y1 y1Var = w1Var instanceof y1 ? (y1) w1Var : null;
        if (y1Var != null) {
            y1Var.f15283a |= 1;
        }
    }

    public final void m0(int i8, int i10) {
        int p02 = p0(i8);
        if (p02 != i10) {
            int i11 = i10 - p02;
            x2 x2Var = this.f15072h;
            int size = ((ArrayList) x2Var.f15278b).size() - 1;
            while (i8 != -1) {
                int p03 = p0(i8) + i11;
                l0(i8, p03);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        q1 q1Var = (q1) ((ArrayList) x2Var.f15278b).get(i12);
                        if (q1Var != null && q1Var.b(i8, p03)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                if (i8 < 0) {
                    i8 = this.D.f15155i;
                } else if (!this.D.h(i8)) {
                    i8 = this.D.l(i8);
                } else {
                    return;
                }
            }
        }
    }

    public final void n(Object obj) {
        o0(obj);
    }

    public final v.b<k0<Object>, y2<Object>> n0(v.b<k0<Object>, ? extends y2<? extends Object>> bVar, v.b<k0<Object>, ? extends y2<? extends Object>> bVar2) {
        w.f builder = bVar.builder();
        builder.putAll(bVar2);
        w.d a10 = builder.a();
        c0(204, e0.f15029j);
        p(a10);
        p(bVar2);
        E(false);
        return a10;
    }

    public final void o() {
        E(false);
    }

    public final void o0(Object obj) {
        boolean z10 = this.K;
        Set<j2> set = this.f15068d;
        if (z10) {
            this.F.K(obj);
            if (obj instanceof j2) {
                U(new k(obj));
                set.add(obj);
                return;
            }
            return;
        }
        m2 m2Var = this.D;
        int k10 = (m2Var.f15157k - b7.a.k(m2Var.f15148b, m2Var.f15155i)) - 1;
        if (obj instanceof j2) {
            set.add(obj);
        }
        X(true, new l(obj, k10));
    }

    public final boolean p(Object obj) {
        if (sf.j.a(M(), obj)) {
            return false;
        }
        o0(obj);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r0 = r0[r2];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int p0(int r2) {
        /*
            r1 = this;
            if (r2 >= 0) goto L_0x0019
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r1.f15078o
            if (r0 == 0) goto L_0x0017
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0017
            int r2 = r2.intValue()
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            return r2
        L_0x0019:
            int[] r0 = r1.f15077n
            if (r0 == 0) goto L_0x0022
            r0 = r0[r2]
            if (r0 < 0) goto L_0x0022
            return r0
        L_0x0022:
            t.m2 r0 = r1.D
            int r2 = r0.j(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.p0(int):int");
    }

    public final void q() {
        u();
        this.f15072h.b();
        this.f15075k.f15267b = 0;
        this.m.f15267b = 0;
        this.f15082s.f15267b = 0;
        this.f15086w.f15267b = 0;
        this.f15084u.b();
        m2 m2Var = this.D;
        if (!m2Var.f15152f) {
            m2Var.c();
        }
        p2 p2Var = this.F;
        if (!p2Var.f15205t) {
            p2Var.f();
        }
        e0.f(this.F.f15205t);
        n2 n2Var = new n2();
        this.E = n2Var;
        p2 e10 = n2Var.e();
        e10.f();
        this.F = e10;
        this.L = 0;
        this.f15089z = 0;
        this.f15080q = false;
        this.K = false;
        this.f15087x = false;
        this.C = false;
    }

    public final void q0() {
        if (this.f15080q) {
            this.f15080q = false;
            if (!this.K) {
                m2 m2Var = this.D;
                Object i8 = m2Var.i(m2Var.f15155i);
                this.N.q(i8);
                if (this.f15087x && (i8 instanceof f)) {
                    Q();
                    N();
                    U(m.f15108a);
                    return;
                }
                return;
            }
            e0.c("useNode() called while inserting".toString());
            throw null;
        }
        e0.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final boolean s(float f10) {
        Object M2 = M();
        if (M2 instanceof Float) {
            if (f10 == ((Number) M2).floatValue()) {
                return false;
            }
        }
        o0(Float.valueOf(f10));
        return true;
    }

    public final boolean t(Object obj) {
        if (M() == obj) {
            return false;
        }
        o0(obj);
        return true;
    }

    public final void u() {
        this.f15073i = null;
        this.f15074j = 0;
        this.f15076l = 0;
        this.O = 0;
        this.L = 0;
        this.f15080q = false;
        this.P = false;
        this.R.f15267b = 0;
        this.B.b();
        this.f15077n = null;
        this.f15078o = null;
    }

    public final void v(u.b bVar, z.a aVar) {
        sf.j.f(bVar, "invalidationsRequested");
        if (this.f15069e.isEmpty()) {
            B(bVar, aVar);
        } else {
            e0.c("Expected applyChanges() to have been called".toString());
            throw null;
        }
    }

    public final int w(int i8, int i10, int i11) {
        Object b10;
        if (i8 == i10) {
            return i11;
        }
        m2 m2Var = this.D;
        int[] iArr = m2Var.f15148b;
        int i12 = i8 * 5;
        int i13 = 0;
        if ((iArr[i12 + 1] & 536870912) != 0) {
            Object k10 = m2Var.k(iArr, i8);
            if (k10 != null) {
                i13 = k10 instanceof Enum ? ((Enum) k10).ordinal() : k10 instanceof g1 ? 126665345 : k10.hashCode();
            }
        } else {
            i13 = iArr[i12];
            if (i13 == 207 && (b10 = m2Var.b(iArr, i8)) != null && !sf.j.a(b10, h.a.f15061a)) {
                i13 = b10.hashCode();
            }
        }
        return i13 == 126665345 ? i13 : Integer.rotateLeft(w(this.D.l(i8), i10, i11), 3) ^ i13;
    }

    public final Object x(z2 z2Var) {
        sf.j.f(z2Var, "key");
        Map map = this.H;
        if (map == null) {
            map = z(this.D.f15155i);
        }
        e0.b bVar = e0.f15020a;
        sf.j.f(map, "<this>");
        if (!map.containsKey(z2Var)) {
            return z2Var.f15132a.getValue();
        }
        y2 y2Var = (y2) map.get(z2Var);
        if (y2Var != null) {
            return y2Var.getValue();
        }
        return null;
    }

    public final void y(a0.a aVar) {
        sf.j.f(aVar, "factory");
        if (this.f15080q) {
            this.f15080q = false;
            if (this.K) {
                w0 w0Var = this.f15075k;
                int i8 = w0Var.f15266a[w0Var.f15267b - 1];
                p2 p2Var = this.F;
                b b10 = p2Var.b(p2Var.f15204s);
                this.f15076l++;
                this.J.add(new j(aVar, b10, i8));
                this.S.q(new k(i8, b10));
                return;
            }
            e0.c("createNode() can only be called when inserting".toString());
            throw null;
        }
        e0.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: v.b<t.k0<java.lang.Object>, ? extends t.y2<? extends java.lang.Object>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v.b<t.k0<java.lang.Object>, t.y2<java.lang.Object>> z(int r9) {
        /*
            r8 = this;
            boolean r0 = r8.K
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x007b
            boolean r0 = r8.G
            if (r0 == 0) goto L_0x007b
            t.p2 r0 = r8.F
            int r0 = r0.f15204s
        L_0x0010:
            if (r0 <= 0) goto L_0x007b
            t.p2 r3 = r8.F
            int[] r4 = r3.f15188b
            int r3 = r3.n(r0)
            int r3 = r3 * 5
            r3 = r4[r3]
            if (r3 != r2) goto L_0x0074
            t.p2 r3 = r8.F
            int r4 = r3.n(r0)
            int[] r5 = r3.f15188b
            int r4 = r4 * 5
            int r6 = r4 + 1
            r6 = r5[r6]
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r7 = r7 & r6
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            if (r7 == 0) goto L_0x0048
            java.lang.Object[] r3 = r3.f15189c
            int r4 = r4 + 4
            r4 = r5[r4]
            int r5 = r6 >> 30
            int r5 = b7.a.t(r5)
            int r5 = r5 + r4
            r3 = r3[r5]
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            t.m1 r4 = t.e0.f15027h
            boolean r3 = sf.j.a(r3, r4)
            if (r3 == 0) goto L_0x0074
            t.p2 r9 = r8.F
            int r0 = r9.n(r0)
            int[] r2 = r9.f15188b
            boolean r2 = b7.a.f(r2, r0)
            if (r2 == 0) goto L_0x006a
            java.lang.Object[] r2 = r9.f15189c
            int[] r3 = r9.f15188b
            int r9 = r9.d(r3, r0)
            r9 = r2[r9]
            goto L_0x006c
        L_0x006a:
            t.h$a$a r9 = t.h.a.f15061a
        L_0x006c:
            sf.j.d(r9, r1)
            v.b r9 = (v.b) r9
            r8.H = r9
            return r9
        L_0x0074:
            t.p2 r3 = r8.F
            int r0 = r3.z(r0)
            goto L_0x0010
        L_0x007b:
            t.m2 r0 = r8.D
            int r0 = r0.f15149c
            if (r0 <= 0) goto L_0x00bf
        L_0x0081:
            if (r9 <= 0) goto L_0x00bf
            t.m2 r0 = r8.D
            int r3 = r9 * 5
            int[] r4 = r0.f15148b
            r3 = r4[r3]
            if (r3 != r2) goto L_0x00b8
            java.lang.Object r0 = r0.k(r4, r9)
            t.m1 r3 = t.e0.f15027h
            boolean r0 = sf.j.a(r0, r3)
            if (r0 == 0) goto L_0x00b8
            t.x2 r0 = r8.f15084u
            java.lang.Object r0 = r0.f15278b
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r9)
            v.b r0 = (v.b) r0
            if (r0 != 0) goto L_0x00b5
            t.m2 r0 = r8.D
            int[] r2 = r0.f15148b
            java.lang.Object r9 = r0.b(r2, r9)
            sf.j.d(r9, r1)
            r0 = r9
            v.b r0 = (v.b) r0
        L_0x00b5:
            r8.H = r0
            return r0
        L_0x00b8:
            t.m2 r0 = r8.D
            int r9 = r0.l(r9)
            goto L_0x0081
        L_0x00bf:
            w.d r9 = r8.f15083t
            r8.H = r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.z(int):v.b");
    }
}

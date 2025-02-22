package t;

import androidx.activity.f;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.q;
import sf.j;
import sf.k;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15020a = b.f15032a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f15021b = d.f15034a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f15022c = a.f15031a;

    /* renamed from: d  reason: collision with root package name */
    public static final e f15023d = e.f15035a;

    /* renamed from: e  reason: collision with root package name */
    public static final c f15024e = c.f15033a;

    /* renamed from: f  reason: collision with root package name */
    public static final m1 f15025f = new m1("provider");

    /* renamed from: g  reason: collision with root package name */
    public static final m1 f15026g = new m1("provider");

    /* renamed from: h  reason: collision with root package name */
    public static final m1 f15027h = new m1("compositionLocalMap");

    /* renamed from: i  reason: collision with root package name */
    public static final m1 f15028i = new m1("providerValues");

    /* renamed from: j  reason: collision with root package name */
    public static final m1 f15029j = new m1("providers");

    /* renamed from: k  reason: collision with root package name */
    public static final m1 f15030k = new m1("reference");

    public static final class a extends k implements q<c<?>, p2, i2, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15031a = new a();

        public a() {
            super(3);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            j.f((c) obj, "<anonymous parameter 0>");
            j.f(p2Var, "slots");
            j.f((i2) obj3, "<anonymous parameter 2>");
            p2Var.i();
            return m.f8717a;
        }
    }

    public static final class b extends k implements q<c<?>, p2, i2, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15032a = new b();

        public b() {
            super(3);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            i2 i2Var = (i2) obj3;
            j.f((c) obj, "<anonymous parameter 0>");
            j.f(p2Var, "slots");
            j.f(i2Var, "rememberManager");
            e0.e(p2Var, i2Var);
            return m.f8717a;
        }
    }

    public static final class c extends k implements q<c<?>, p2, i2, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f15033a = new c();

        public c() {
            super(3);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
            if (p2Var.m == 0) {
                p2Var.B();
                p2Var.f15203r = 0;
                p2Var.f15193g = (p2Var.f15188b.length / 5) - p2Var.f15192f;
                p2Var.f15194h = 0;
                p2Var.f15195i = 0;
                p2Var.f15199n = 0;
                return m.f8717a;
            }
            e0.c("Cannot reset when inserting".toString());
            throw null;
        }
    }

    public static final class d extends k implements q<c<?>, p2, i2, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f15034a = new d();

        public d() {
            super(3);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            j.f((c) obj, "<anonymous parameter 0>");
            j.f(p2Var, "slots");
            j.f((i2) obj3, "<anonymous parameter 2>");
            p2Var.G();
            return m.f8717a;
        }
    }

    public static final class e extends k implements q<c<?>, p2, i2, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f15035a = new e();

        public e() {
            super(3);
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            p2 p2Var = (p2) obj2;
            j.f((c) obj, "<anonymous parameter 0>");
            j.f(p2Var, "slots");
            j.f((i2) obj3, "<anonymous parameter 2>");
            p2Var.k(0);
            return m.f8717a;
        }
    }

    public static final void a(int i8, int i10, ArrayList arrayList) {
        int d10 = d(i8, arrayList);
        if (d10 < 0) {
            d10 = -(d10 + 1);
        }
        while (d10 < arrayList.size() && ((x0) arrayList.get(d10)).f15272b < i10) {
            arrayList.remove(d10);
        }
    }

    public static final void b(m2 m2Var, ArrayList arrayList, int i8) {
        if (m2Var.h(i8)) {
            arrayList.add(m2Var.i(i8));
            return;
        }
        int i10 = i8 + 1;
        int g10 = m2Var.g(i8) + i8;
        while (i10 < g10) {
            b(m2Var, arrayList, i10);
            i10 += m2Var.g(i10);
        }
    }

    public static final void c(String str) {
        j.f(str, "message");
        throw new g(b2.c.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int d(int i8, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int h3 = j.h(((x0) list.get(i11)).f15272b, i8);
            if (h3 < 0) {
                i10 = i11 + 1;
            } else if (h3 <= 0) {
                return i11;
            } else {
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r0 = (t.y1) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(t.p2 r4, t.i2 r5) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r4, r0)
            java.lang.String r0 = "rememberManager"
            sf.j.f(r5, r0)
            int[] r0 = r4.f15188b
            int r1 = r4.f15203r
            int r1 = r4.n(r1)
            int r0 = r4.g(r0, r1)
            int[] r1 = r4.f15188b
            int r2 = r4.f15203r
            int r3 = r4.o(r2)
            int r3 = r3 + r2
            int r2 = r4.n(r3)
            int r1 = r4.g(r1, r2)
            t.q2 r2 = new t.q2
            r2.<init>(r0, r1, r4)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r2.next()
            boolean r1 = r0 instanceof t.f
            if (r1 == 0) goto L_0x0040
            r1 = r0
            t.f r1 = (t.f) r1
            r5.b(r1)
        L_0x0040:
            boolean r1 = r0 instanceof t.j2
            if (r1 == 0) goto L_0x004a
            r1 = r0
            t.j2 r1 = (t.j2) r1
            r5.c(r1)
        L_0x004a:
            boolean r1 = r0 instanceof t.y1
            if (r1 == 0) goto L_0x002c
            t.y1 r0 = (t.y1) r0
            t.i0 r1 = r0.f15284b
            if (r1 == 0) goto L_0x002c
            r3 = 1
            r1.J = r3
            r1 = 0
            r0.f15284b = r1
            r0.f15288f = r1
            r0.f15289g = r1
            goto L_0x002c
        L_0x005f:
            r4.C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e0.e(t.p2, t.i2):void");
    }

    public static final void f(boolean z10) {
        if (!z10) {
            c("Check failed".toString());
            throw null;
        }
    }
}

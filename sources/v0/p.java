package v0;

import d0.g;
import d2.f1;
import ff.m;
import gf.q;
import gf.s;
import h0.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q0.h;
import rf.l;
import s0.a0;
import s0.i;
import s0.p1;
import s0.q1;
import s0.s0;
import sf.j;
import sf.k;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f16069a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16070b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f16071c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16072d;

    /* renamed from: e  reason: collision with root package name */
    public p f16073e;

    /* renamed from: f  reason: collision with root package name */
    public final j f16074f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16075g;

    public static final class a extends g.c implements p1 {
        public final j G;

        public a(l<? super x, m> lVar) {
            j jVar = new j();
            jVar.f16062b = false;
            jVar.f16063c = false;
            lVar.invoke(jVar);
            this.G = jVar;
        }

        public final j c() {
            return this.G;
        }
    }

    public static final class b extends k implements l<a0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16076a = new b();

        public b() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
            if (r2.f16062b == true) goto L_0x001a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r2) {
            /*
                r1 = this;
                s0.a0 r2 = (s0.a0) r2
                java.lang.String r0 = "it"
                sf.j.f(r2, r0)
                s0.p1 r2 = gc.b.n(r2)
                if (r2 == 0) goto L_0x0019
                v0.j r2 = s0.q1.a(r2)
                if (r2 == 0) goto L_0x0019
                boolean r2 = r2.f16062b
                r0 = 1
                if (r2 != r0) goto L_0x0019
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.p.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends k implements l<a0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16077a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            a0 a0Var = (a0) obj;
            j.f(a0Var, "it");
            return Boolean.valueOf(gc.b.n(a0Var) != null);
        }
    }

    public p(p1 p1Var, boolean z10, a0 a0Var) {
        j.f(p1Var, "outerSemanticsNode");
        j.f(a0Var, "layoutNode");
        this.f16069a = p1Var;
        this.f16070b = z10;
        this.f16071c = a0Var;
        this.f16074f = q1.a(p1Var);
        this.f16075g = a0Var.f14312b;
    }

    public final p a(g gVar, l<? super x, m> lVar) {
        p pVar = new p(new a(lVar), false, new a0(this.f16075g + (gVar != null ? 1000000000 : 2000000000), true));
        pVar.f16072d = true;
        pVar.f16073e = this;
        return pVar;
    }

    public final s0 b() {
        p1 p1Var = null;
        if (this.f16072d) {
            p h3 = h();
            if (h3 != null) {
                return h3.b();
            }
            return null;
        }
        p1 m = gc.b.m(this.f16071c);
        if (this.f16074f.f16062b) {
            p1Var = m;
        }
        if (p1Var == null) {
            p1Var = this.f16069a;
        }
        return i.d(p1Var, 8);
    }

    public final void c(List list) {
        List<p> m = m(false);
        int size = m.size();
        for (int i8 = 0; i8 < size; i8++) {
            p pVar = m.get(i8);
            if (pVar.k()) {
                list.add(pVar);
            } else if (!pVar.f16074f.f16063c) {
                pVar.c(list);
            }
        }
    }

    public final d d() {
        s0 b10 = b();
        if (b10 != null) {
            if (!b10.l0()) {
                b10 = null;
            }
            if (b10 != null) {
                return com.google.android.gms.internal.p000firebaseauthapi.g.c(b10);
            }
        }
        return d.f9073e;
    }

    public final d e() {
        s0 b10 = b();
        d dVar = d.f9073e;
        if (b10 == null) {
            return dVar;
        }
        if (!b10.l0()) {
            b10 = null;
        }
        if (b10 == null) {
            return dVar;
        }
        h d10 = com.google.android.gms.internal.p000firebaseauthapi.g.d(b10);
        d c3 = com.google.android.gms.internal.p000firebaseauthapi.g.c(b10);
        s0 s0Var = (s0) d10;
        long j10 = s0Var.f12811c;
        float f10 = (float) ((int) (j10 >> 32));
        float a10 = (float) f1.i.a(j10);
        float p10 = f1.p(c3.f9074a, 0.0f, f10);
        float p11 = f1.p(c3.f9075b, 0.0f, a10);
        float p12 = f1.p(c3.f9076c, 0.0f, f10);
        float p13 = f1.p(c3.f9077d, 0.0f, a10);
        if (p10 == p12) {
            return dVar;
        }
        if (p11 == p13) {
            return dVar;
        }
        long q02 = s0Var.q0(f1.f(p10, p11));
        long q03 = s0Var.q0(f1.f(p12, p11));
        long q04 = s0Var.q0(f1.f(p12, p13));
        long q05 = s0Var.q0(f1.f(p10, p13));
        float b11 = h0.c.b(q02);
        float[] fArr = {h0.c.b(q03), h0.c.b(q05), h0.c.b(q04)};
        for (int i8 = 0; i8 < 3; i8++) {
            b11 = Math.min(b11, fArr[i8]);
        }
        float c10 = h0.c.c(q02);
        float[] fArr2 = {h0.c.c(q03), h0.c.c(q05), h0.c.c(q04)};
        for (int i10 = 0; i10 < 3; i10++) {
            c10 = Math.min(c10, fArr2[i10]);
        }
        float b12 = h0.c.b(q02);
        float[] fArr3 = {h0.c.b(q03), h0.c.b(q05), h0.c.b(q04)};
        for (int i11 = 0; i11 < 3; i11++) {
            b12 = Math.max(b12, fArr3[i11]);
        }
        float c11 = h0.c.c(q02);
        float[] fArr4 = {h0.c.c(q03), h0.c.c(q05), h0.c.c(q04)};
        for (int i12 = 0; i12 < 3; i12++) {
            c11 = Math.max(c11, fArr4[i12]);
        }
        return new d(b11, c10, b12, c11);
    }

    public final List<p> f(boolean z10, boolean z11) {
        if (!z10 && this.f16074f.f16063c) {
            return s.f8978a;
        }
        if (!k()) {
            return m(z11);
        }
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        return arrayList;
    }

    public final j g() {
        boolean k10 = k();
        j jVar = this.f16074f;
        if (!k10) {
            return jVar;
        }
        jVar.getClass();
        j jVar2 = new j();
        jVar2.f16062b = jVar.f16062b;
        jVar2.f16063c = jVar.f16063c;
        jVar2.f16061a.putAll(jVar.f16061a);
        l(jVar2);
        return jVar2;
    }

    public final p h() {
        p pVar = this.f16073e;
        if (pVar != null) {
            return pVar;
        }
        boolean z10 = this.f16070b;
        a0 a0Var = this.f16071c;
        a0 i8 = z10 ? gc.b.i(a0Var, b.f16076a) : null;
        if (i8 == null) {
            i8 = gc.b.i(a0Var, c.f16077a);
        }
        p1 n2 = i8 != null ? gc.b.n(i8) : null;
        if (n2 == null) {
            return null;
        }
        return new p(n2, z10, i.e(n2));
    }

    public final List<p> i() {
        return f(false, true);
    }

    public final d j() {
        p1 p1Var;
        if (!this.f16074f.f16062b || (p1Var = gc.b.m(this.f16071c)) == null) {
            p1Var = this.f16069a;
        }
        j.f(p1Var, "<this>");
        boolean z10 = p1Var.s().F;
        d dVar = d.f9073e;
        if (!z10) {
            return dVar;
        }
        if (!(k.a(p1Var.c(), i.f16044b) != null)) {
            return com.google.android.gms.internal.p000firebaseauthapi.g.c(i.d(p1Var, 8));
        }
        s0 d10 = i.d(p1Var, 8);
        if (!d10.l0()) {
            return dVar;
        }
        h d11 = com.google.android.gms.internal.p000firebaseauthapi.g.d(d10);
        h0.b bVar = d10.Q;
        if (bVar == null) {
            bVar = new h0.b();
            d10.Q = bVar;
        }
        long U = d10.U(d10.b0());
        bVar.f9064a = -h0.g.b(U);
        bVar.f9065b = -h0.g.a(U);
        bVar.f9066c = h0.g.b(U) + ((float) d10.C());
        bVar.f9067d = h0.g.a(U) + ((float) f1.i.a(d10.f12811c));
        while (d10 != d11) {
            d10.w0(bVar, false, true);
            if (bVar.b()) {
                return dVar;
            }
            d10 = d10.E;
            j.c(d10);
        }
        return new d(bVar.f9064a, bVar.f9065b, bVar.f9066c, bVar.f9067d);
    }

    public final boolean k() {
        return this.f16070b && this.f16074f.f16062b;
    }

    public final void l(j jVar) {
        if (!this.f16074f.f16063c) {
            List<p> m = m(false);
            int size = m.size();
            for (int i8 = 0; i8 < size; i8++) {
                p pVar = m.get(i8);
                if (!pVar.k()) {
                    j jVar2 = pVar.f16074f;
                    j.f(jVar2, "child");
                    for (Map.Entry entry : jVar2.f16061a.entrySet()) {
                        w wVar = (w) entry.getKey();
                        Object value = entry.getValue();
                        LinkedHashMap linkedHashMap = jVar.f16061a;
                        Object obj = linkedHashMap.get(wVar);
                        j.d(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        T invoke = wVar.f16116b.invoke(obj, value);
                        if (invoke != null) {
                            linkedHashMap.put(wVar, invoke);
                        }
                    }
                    pVar.l(jVar);
                }
            }
        }
    }

    public final List<p> m(boolean z10) {
        if (this.f16072d) {
            return s.f8978a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        gc.b.j(this.f16071c, arrayList2);
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new p((p1) arrayList2.get(i8), this.f16070b));
        }
        if (z10) {
            w wVar = r.f16093p;
            j jVar = this.f16074f;
            g gVar = (g) k.a(jVar, wVar);
            if (gVar != null && jVar.f16062b && (!arrayList.isEmpty())) {
                arrayList.add(a(gVar, new n(gVar)));
            }
            w wVar2 = r.f16079a;
            if (jVar.b(wVar2) && (!arrayList.isEmpty()) && jVar.f16062b) {
                List list = (List) k.a(jVar, wVar2);
                String str = list != null ? (String) q.v0(list) : null;
                if (str != null) {
                    arrayList.add(0, a((g) null, new o(str)));
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ p(p1 p1Var, boolean z10) {
        this(p1Var, z10, i.e(p1Var));
    }
}

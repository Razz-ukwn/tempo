package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import h0.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import q4.a;
import rf.l;
import s0.a0;
import sf.j;
import v0.i;
import v0.k;
import v0.p;
import v0.r;
import v0.w;
import x0.g;

public final class i0 {
    public static final boolean a(p pVar) {
        return k.a(pVar.g(), r.f16087i) == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (sf.j.a(v0.k.a(r2.f16074f, v0.r.f16089k), java.lang.Boolean.TRUE) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r2 = s0.q1.a(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(v0.p r2) {
        /*
            boolean r0 = g(r2)
            if (r0 == 0) goto L_0x0017
            v0.w<java.lang.Boolean> r0 = v0.r.f16089k
            v0.j r1 = r2.f16074f
            java.lang.Object r0 = v0.k.a(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = sf.j.a(r0, r1)
            if (r0 != 0) goto L_0x0017
            goto L_0x003e
        L_0x0017:
            androidx.compose.ui.platform.h0 r0 = androidx.compose.ui.platform.h0.f1294a
            s0.a0 r2 = r2.f16071c
            s0.a0 r2 = e(r2, r0)
            r0 = 0
            if (r2 == 0) goto L_0x003f
            s0.p1 r2 = gc.b.n(r2)
            if (r2 == 0) goto L_0x003b
            v0.j r2 = s0.q1.a(r2)
            if (r2 == 0) goto L_0x003b
            v0.w<java.lang.Boolean> r1 = v0.r.f16089k
            java.lang.Object r2 = v0.k.a(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r2 = sf.j.a(r2, r1)
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            if (r2 != 0) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.i0.b(v0.p):boolean");
    }

    public static final boolean c(p pVar) {
        return pVar.g().b(r.f16100w);
    }

    public static final t2 d(int i8, ArrayList arrayList) {
        j.f(arrayList, "<this>");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((t2) arrayList.get(i10)).f1466a == i8) {
                return (t2) arrayList.get(i10);
            }
        }
        return null;
    }

    public static final a0 e(a0 a0Var, l<? super a0, Boolean> lVar) {
        for (a0 q10 = a0Var.q(); q10 != null; q10 = q10.q()) {
            if (lVar.invoke(q10).booleanValue()) {
                return q10;
            }
        }
        return null;
    }

    public static final void f(Region region, p pVar, LinkedHashMap linkedHashMap, p pVar2) {
        a0 a0Var;
        a0 a0Var2 = pVar2.f16071c;
        boolean z10 = false;
        boolean z11 = !a0Var2.M || !a0Var2.y();
        boolean isEmpty = region.isEmpty();
        int i8 = pVar.f16075g;
        int i10 = pVar2.f16075g;
        if (isEmpty && i10 != i8) {
            return;
        }
        if (!z11 || pVar2.f16072d) {
            Rect rect = new Rect(a.g(pVar2.j().f9074a), a.g(pVar2.j().f9075b), a.g(pVar2.j().f9076c), a.g(pVar2.j().f9077d));
            Region region2 = new Region();
            region2.set(rect);
            if (i10 == i8) {
                i10 = -1;
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i10);
                Rect bounds = region2.getBounds();
                j.e(bounds, "region.bounds");
                linkedHashMap.put(valueOf, new u2(pVar2, bounds));
                List<p> i11 = pVar2.i();
                for (int size = i11.size() - 1; -1 < size; size--) {
                    f(region, pVar, linkedHashMap, i11.get(size));
                }
                region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (pVar2.f16072d) {
                p h3 = pVar2.h();
                if (!(h3 == null || (a0Var = h3.f16071c) == null || !a0Var.M)) {
                    z10 = true;
                }
                d d10 = z10 ? h3.d() : new d(0.0f, 0.0f, 10.0f, 10.0f);
                linkedHashMap.put(Integer.valueOf(i10), new u2(pVar2, new Rect(a.g(d10.f9074a), a.g(d10.f9075b), a.g(d10.f9076c), a.g(d10.f9077d))));
            } else if (i10 == -1) {
                Integer valueOf2 = Integer.valueOf(i10);
                Rect bounds2 = region2.getBounds();
                j.e(bounds2, "region.bounds");
                linkedHashMap.put(valueOf2, new u2(pVar2, bounds2));
            }
        }
    }

    public static final boolean g(p pVar) {
        v0.j jVar = pVar.f16074f;
        w<v0.a<l<List<g>, Boolean>>> wVar = i.f16043a;
        return jVar.b(i.f16049g);
    }
}

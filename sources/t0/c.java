package t0;

import e2.i;
import java.util.ArrayList;
import java.util.List;
import v0.b;
import v0.j;
import v0.k;
import v0.p;
import v0.r;
import v0.w;

public final class c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: gf.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(java.util.ArrayList r11) {
        /*
            int r0 = r11.size()
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L_0x0009
            return r2
        L_0x0009:
            int r0 = r11.size()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            int r0 = r11.size()
            if (r0 != r2) goto L_0x0017
            goto L_0x007a
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r3 = r11.get(r1)
            int r4 = cb.d.H(r11)
            r5 = r1
        L_0x0025:
            if (r5 >= r4) goto L_0x007c
            int r5 = r5 + 1
            java.lang.Object r6 = r11.get(r5)
            r7 = r6
            v0.p r7 = (v0.p) r7
            v0.p r3 = (v0.p) r3
            h0.d r8 = r3.d()
            long r8 = r8.a()
            float r8 = h0.c.b(r8)
            h0.d r9 = r7.d()
            long r9 = r9.a()
            float r9 = h0.c.b(r9)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            h0.d r3 = r3.d()
            long r9 = r3.a()
            float r3 = h0.c.c(r9)
            h0.d r7 = r7.d()
            long r9 = r7.a()
            float r7 = h0.c.c(r9)
            float r3 = r3 - r7
            float r3 = java.lang.Math.abs(r3)
            long r7 = d2.f1.f(r8, r3)
            h0.c r3 = new h0.c
            r3.<init>(r7)
            r0.add(r3)
            r3 = r6
            goto L_0x0025
        L_0x007a:
            gf.s r0 = gf.s.f8978a
        L_0x007c:
            r11 = r0
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            if (r11 != r2) goto L_0x008e
            java.lang.Object r11 = gf.q.u0(r0)
            h0.c r11 = (h0.c) r11
            long r3 = r11.f9072a
            goto L_0x00cf
        L_0x008e:
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L_0x00de
            java.lang.Object r11 = gf.q.u0(r0)
            int r3 = cb.d.H(r0)
            if (r2 > r3) goto L_0x00cb
            r4 = r2
        L_0x009f:
            java.lang.Object r5 = r0.get(r4)
            h0.c r5 = (h0.c) r5
            long r5 = r5.f9072a
            h0.c r11 = (h0.c) r11
            long r7 = r11.f9072a
            float r11 = h0.c.b(r7)
            float r9 = h0.c.b(r5)
            float r9 = r9 + r11
            float r11 = h0.c.c(r7)
            float r5 = h0.c.c(r5)
            float r5 = r5 + r11
            long r5 = d2.f1.f(r9, r5)
            h0.c r11 = new h0.c
            r11.<init>(r5)
            if (r4 == r3) goto L_0x00cb
            int r4 = r4 + 1
            goto L_0x009f
        L_0x00cb:
            h0.c r11 = (h0.c) r11
            long r3 = r11.f9072a
        L_0x00cf:
            float r11 = h0.c.b(r3)
            float r0 = h0.c.c(r3)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r2 = r1
        L_0x00dd:
            return r2
        L_0x00de:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Empty collection can't be reduced."
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.c.a(java.util.ArrayList):boolean");
    }

    public static final boolean b(p pVar) {
        return (k.a(pVar.g(), r.f16084f) == null && k.a(pVar.g(), r.f16083e) == null) ? false : true;
    }

    public static final void c(i iVar, p pVar) {
        if (((b) k.a(pVar.g(), r.f16084f)) != null) {
            iVar.k(i.c.a(0, 0, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (k.a(pVar.g(), r.f16083e) != null) {
            List<p> i8 = pVar.i();
            int size = i8.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar2 = i8.get(i10);
                if (pVar2.g().b(r.f16098u)) {
                    arrayList.add(pVar2);
                }
            }
        }
        int i11 = 1;
        if (!arrayList.isEmpty()) {
            boolean a10 = a(arrayList);
            int size2 = a10 ? 1 : arrayList.size();
            if (a10) {
                i11 = arrayList.size();
            }
            iVar.k(i.c.a(size2, i11, 0));
        }
    }

    public static final void d(i iVar, p pVar) {
        if (((v0.c) k.a(pVar.g(), r.f16085g)) != null) {
            j g10 = pVar.g();
            w<Boolean> wVar = r.f16098u;
            g10.getClass();
            sf.j.f(wVar, "key");
            b bVar = b.f15322a;
            sf.j.f(bVar, "defaultValue");
            Object obj = g10.f16061a.get(wVar);
            if (obj == null) {
                obj = bVar.d();
            }
            iVar.l(i.d.a(0, 0, 0, 0, false, ((Boolean) obj).booleanValue()));
        }
        p h3 = pVar.h();
        if (h3 != null && k.a(h3.g(), r.f16083e) != null) {
            b bVar2 = (b) k.a(h3.g(), r.f16084f);
            if (pVar.g().b(r.f16098u)) {
                ArrayList arrayList = new ArrayList();
                List<p> i8 = h3.i();
                int size = i8.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    p pVar2 = i8.get(i11);
                    if (pVar2.g().b(r.f16098u)) {
                        arrayList.add(pVar2);
                        if (pVar2.f16071c.N < pVar.f16071c.N) {
                            i10++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a10 = a(arrayList);
                    int i12 = a10 ? 0 : i10;
                    int i13 = a10 ? i10 : 0;
                    j g11 = pVar.g();
                    w<Boolean> wVar2 = r.f16098u;
                    g11.getClass();
                    sf.j.f(wVar2, "key");
                    a aVar = a.f15321a;
                    sf.j.f(aVar, "defaultValue");
                    Object obj2 = g11.f16061a.get(wVar2);
                    if (obj2 == null) {
                        obj2 = aVar.d();
                    }
                    iVar.l(i.d.a(i12, 1, i13, 1, false, ((Boolean) obj2).booleanValue()));
                }
            }
        }
    }
}

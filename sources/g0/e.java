package g0;

import d0.g;
import s0.a0;
import s0.i;
import s0.p0;
import sf.j;

public final class e {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r3 = ((g0.s) r3).G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final g0.r a(g0.d r3) {
        /*
            d0.g$c r0 = r3.s()
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0061
            u.d r0 = new u.d
            r1 = 16
            d0.g$c[] r1 = new d0.g.c[r1]
            r0.<init>(r1)
            d0.g$c r1 = r3.s()
            d0.g$c r1 = r1.f7181e
            if (r1 != 0) goto L_0x0021
            d0.g$c r3 = r3.s()
            s0.i.a(r0, r3)
            goto L_0x0024
        L_0x0021:
            r0.b(r1)
        L_0x0024:
            boolean r3 = r0.i()
            if (r3 == 0) goto L_0x005e
            int r3 = r0.f15640c
            r1 = 1
            int r3 = r3 - r1
            java.lang.Object r3 = r0.k(r3)
            d0.g$c r3 = (d0.g.c) r3
            int r2 = r3.f7179c
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x003e
            s0.i.a(r0, r3)
            goto L_0x0024
        L_0x003e:
            if (r3 == 0) goto L_0x0024
            int r2 = r3.f7178b
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x005b
            boolean r2 = r3 instanceof g0.s
            if (r2 == 0) goto L_0x0024
            g0.s r3 = (g0.s) r3
            g0.r r3 = r3.G
            int r2 = r3.ordinal()
            if (r2 == 0) goto L_0x005a
            if (r2 == r1) goto L_0x005a
            r1 = 2
            if (r2 == r1) goto L_0x005a
            goto L_0x0024
        L_0x005a:
            return r3
        L_0x005b:
            d0.g$c r3 = r3.f7181e
            goto L_0x003e
        L_0x005e:
            g0.r r3 = g0.r.f8780d
            return r3
        L_0x0061:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.e.a(g0.d):g0.r");
    }

    public static final void b(s sVar) {
        p0 p0Var;
        j.f(sVar, "<this>");
        g.c cVar = sVar.f7177a;
        if (cVar.F) {
            g.c cVar2 = cVar.f7180d;
            a0 e10 = i.e(sVar);
            while (e10 != null) {
                if ((e10.V.f14404e.f7179c & 5120) != 0) {
                    while (cVar2 != null) {
                        int i8 = cVar2.f7178b;
                        if ((i8 & 5120) != 0) {
                            if (!((i8 & 1024) != 0)) {
                                if (cVar2 instanceof d) {
                                    d dVar = (d) cVar2;
                                    dVar.e(a(dVar));
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            } else {
                                return;
                            }
                        }
                        cVar2 = cVar2.f7180d;
                    }
                }
                e10 = e10.q();
                cVar2 = (e10 == null || (p0Var = e10.V) == null) ? null : p0Var.f14403d;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

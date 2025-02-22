package s0;

import d0.g;
import sf.j;
import u.d;

public final class i {
    public static final void a(d dVar, g.c cVar) {
        d<a0> s10 = e(cVar).s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            int i10 = i8 - 1;
            T[] tArr = s10.f15638a;
            do {
                dVar.b(((a0) tArr[i10]).V.f14404e);
                i10--;
            } while (i10 >= 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r0 = r4.V;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList b(s0.h r4, int r5) {
        /*
            d0.g$c r0 = r4.s()
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x0043
            d0.g$c r0 = r4.s()
            d0.g$c r0 = r0.f7180d
            s0.a0 r4 = e(r4)
            r1 = 0
            r2 = r1
        L_0x0014:
            if (r4 == 0) goto L_0x0042
            s0.p0 r3 = r4.V
            d0.g$c r3 = r3.f14404e
            int r3 = r3.f7179c
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0033
        L_0x001f:
            if (r0 == 0) goto L_0x0033
            int r3 = r0.f7178b
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0030
            if (r2 != 0) goto L_0x002d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x002d:
            r2.add(r0)
        L_0x0030:
            d0.g$c r0 = r0.f7180d
            goto L_0x001f
        L_0x0033:
            s0.a0 r4 = r4.q()
            if (r4 == 0) goto L_0x0040
            s0.p0 r0 = r4.V
            if (r0 == 0) goto L_0x0040
            s0.r$a r0 = r0.f14403d
            goto L_0x0014
        L_0x0040:
            r0 = r1
            goto L_0x0014
        L_0x0042:
            return r2
        L_0x0043:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Check failed."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.i.b(s0.h, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r0 = r3.V;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final d0.g.c c(s0.h r3, int r4) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r3, r0)
            d0.g$c r0 = r3.s()
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x003e
            d0.g$c r0 = r3.s()
            d0.g$c r0 = r0.f7180d
            s0.a0 r3 = e(r3)
        L_0x0017:
            r1 = 0
            if (r3 == 0) goto L_0x003d
            s0.p0 r2 = r3.V
            d0.g$c r2 = r2.f14404e
            int r2 = r2.f7179c
            r2 = r2 & r4
            if (r2 == 0) goto L_0x002e
        L_0x0023:
            if (r0 == 0) goto L_0x002e
            int r2 = r0.f7178b
            r2 = r2 & r4
            if (r2 == 0) goto L_0x002b
            return r0
        L_0x002b:
            d0.g$c r0 = r0.f7180d
            goto L_0x0023
        L_0x002e:
            s0.a0 r3 = r3.q()
            if (r3 == 0) goto L_0x003b
            s0.p0 r0 = r3.V
            if (r0 == 0) goto L_0x003b
            s0.r$a r0 = r0.f14403d
            goto L_0x0017
        L_0x003b:
            r0 = r1
            goto L_0x0017
        L_0x003d:
            return r1
        L_0x003e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Check failed."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.i.c(s0.h, int):d0.g$c");
    }

    public static final s0 d(h hVar, int i8) {
        j.f(hVar, "$this$requireCoordinator");
        s0 s0Var = hVar.s().C;
        j.c(s0Var);
        if (s0Var.e0() != hVar || !v0.c(i8)) {
            return s0Var;
        }
        s0 s0Var2 = s0Var.D;
        j.c(s0Var2);
        return s0Var2;
    }

    public static final a0 e(h hVar) {
        j.f(hVar, "<this>");
        s0 s0Var = hVar.s().C;
        if (s0Var != null) {
            return s0Var.C;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final b1 f(h hVar) {
        j.f(hVar, "<this>");
        b1 b1Var = e(hVar).D;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}

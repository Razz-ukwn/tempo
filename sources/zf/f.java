package zf;

import cb.d;

public class f extends d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String n0(java.lang.String r12) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r12, r0)
            java.lang.String r0 = "|"
            boolean r1 = zf.j.t0(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00a5
            java.util.List r1 = zf.n.K0(r12)
            int r12 = r12.length()
            int r2 = r1.size()
            r3 = 0
            int r2 = r2 * r3
            int r2 = r2 + r12
            int r12 = cb.d.H(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = r3
        L_0x002e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r1.next()
            int r7 = r5 + 1
            r8 = 0
            if (r5 < 0) goto L_0x008f
            java.lang.String r6 = (java.lang.String) r6
            if (r5 == 0) goto L_0x0043
            if (r5 != r12) goto L_0x004a
        L_0x0043:
            boolean r5 = zf.j.t0(r6)
            if (r5 == 0) goto L_0x004a
            goto L_0x0088
        L_0x004a:
            int r5 = r6.length()
            r9 = r3
        L_0x004f:
            r10 = -1
            if (r9 >= r5) goto L_0x0062
            char r11 = r6.charAt(r9)
            boolean r11 = cb.b.C(r11)
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r9 = r9 + 1
            goto L_0x004f
        L_0x0062:
            r9 = r10
        L_0x0063:
            if (r9 != r10) goto L_0x0066
            goto L_0x007a
        L_0x0066:
            boolean r5 = zf.j.w0(r9, r6, r0, r3)
            if (r5 == 0) goto L_0x007a
            int r5 = r0.length()
            int r5 = r5 + r9
            java.lang.String r8 = r6.substring(r5)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            sf.j.e(r8, r5)
        L_0x007a:
            if (r8 == 0) goto L_0x0087
            zf.e r5 = zf.e.f17976a
            java.lang.Object r5 = r5.invoke(r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0088
        L_0x0087:
            r8 = r6
        L_0x0088:
            if (r8 == 0) goto L_0x008d
            r4.add(r8)
        L_0x008d:
            r5 = r7
            goto L_0x002e
        L_0x008f:
            cb.d.i0()
            throw r8
        L_0x0093:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r2)
            gf.q.y0(r4, r12, "\n", "", "", -1, "...", (rf.l) null)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            sf.j.e(r12, r0)
            return r12
        L_0x00a5:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.f.n0(java.lang.String):java.lang.String");
    }
}

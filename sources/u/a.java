package u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f15628a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15629b = new Object[4];

    /* renamed from: c  reason: collision with root package name */
    public int[] f15630c = new int[4];

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r4 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.String r0 = "key"
            sf.j.f(r14, r0)
            int r0 = r12.f15628a
            r1 = -1
            if (r0 <= 0) goto L_0x006a
            int r0 = r0 + r1
            int r2 = java.lang.System.identityHashCode(r14)
            r3 = 0
        L_0x0010:
            if (r3 > r0) goto L_0x005e
            int r4 = r3 + r0
            int r4 = r4 >>> 1
            java.lang.Object[] r5 = r12.f15629b
            r5 = r5[r4]
            int r6 = java.lang.System.identityHashCode(r5)
            if (r6 >= r2) goto L_0x0023
            int r3 = r4 + 1
            goto L_0x0010
        L_0x0023:
            if (r6 <= r2) goto L_0x0028
            int r0 = r4 + -1
            goto L_0x0010
        L_0x0028:
            if (r5 != r14) goto L_0x002b
            goto L_0x0061
        L_0x002b:
            int r0 = r4 + -1
        L_0x002d:
            if (r1 >= r0) goto L_0x0041
            java.lang.Object[] r3 = r12.f15629b
            r3 = r3[r0]
            if (r3 != r14) goto L_0x0037
        L_0x0035:
            r4 = r0
            goto L_0x0061
        L_0x0037:
            int r3 = java.lang.System.identityHashCode(r3)
            if (r3 == r2) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            int r0 = r0 + -1
            goto L_0x002d
        L_0x0041:
            int r4 = r4 + 1
            int r0 = r12.f15628a
        L_0x0045:
            if (r4 >= r0) goto L_0x0058
            java.lang.Object[] r3 = r12.f15629b
            r3 = r3[r4]
            if (r3 != r14) goto L_0x004e
            goto L_0x0061
        L_0x004e:
            int r3 = java.lang.System.identityHashCode(r3)
            int r4 = r4 + 1
            if (r3 == r2) goto L_0x0045
            int r0 = -r4
            goto L_0x0035
        L_0x0058:
            int r0 = r12.f15628a
            int r0 = r0 + 1
            int r0 = -r0
            goto L_0x0035
        L_0x005e:
            int r3 = r3 + 1
            int r4 = -r3
        L_0x0061:
            if (r4 < 0) goto L_0x006b
            int[] r14 = r12.f15630c
            r0 = r14[r4]
            r14[r4] = r13
            return r0
        L_0x006a:
            r4 = r1
        L_0x006b:
            int r4 = r4 + 1
            int r0 = -r4
            int r2 = r12.f15628a
            java.lang.Object[] r3 = r12.f15629b
            int r4 = r3.length
            if (r2 != r4) goto L_0x00a0
            int r4 = r3.length
            int r4 = r4 * 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r3.length
            int r5 = r5 * 2
            int[] r11 = new int[r5]
            int r5 = r0 + 1
            gf.l.V(r5, r0, r2, r3, r4)
            int[] r2 = r12.f15630c
            int r3 = r12.f15628a
            gf.l.U(r5, r0, r3, r2, r11)
            java.lang.Object[] r5 = r12.f15629b
            r7 = 0
            r8 = 0
            r10 = 6
            r6 = r4
            r9 = r0
            gf.l.X(r5, r6, r7, r8, r9, r10)
            int[] r2 = r12.f15630c
            r3 = 6
            gf.l.W(r2, r11, r0, r3)
            r12.f15629b = r4
            r12.f15630c = r11
            goto L_0x00ac
        L_0x00a0:
            int r4 = r0 + 1
            gf.l.V(r4, r0, r2, r3, r3)
            int[] r2 = r12.f15630c
            int r3 = r12.f15628a
            gf.l.U(r4, r0, r3, r2, r2)
        L_0x00ac:
            java.lang.Object[] r2 = r12.f15629b
            r2[r0] = r14
            int[] r14 = r12.f15630c
            r14[r0] = r13
            int r13 = r12.f15628a
            int r13 = r13 + 1
            r12.f15628a = r13
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a.a(int, java.lang.Object):int");
    }
}

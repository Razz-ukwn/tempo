package m1;

import l1.d;

public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f11155k = new int[2];

    public l(d dVar) {
        super(dVar);
        this.f11173h.f11146e = 4;
        this.f11174i.f11146e = 5;
        this.f11171f = 0;
    }

    public static void m(int[] iArr, int i8, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i8;
        int i15 = i12 - i11;
        if (i13 == -1) {
            int i16 = (int) ((((float) i15) * f10) + 0.5f);
            int i17 = (int) ((((float) i14) / f10) + 0.5f);
            if (i16 <= i14) {
                iArr[0] = i16;
                iArr[1] = i15;
            } else if (i17 <= i15) {
                iArr[0] = i14;
                iArr[1] = i17;
            }
        } else if (i13 == 0) {
            iArr[0] = (int) ((((float) i15) * f10) + 0.5f);
            iArr[1] = i15;
        } else if (i13 == 1) {
            iArr[0] = i14;
            iArr[1] = (int) ((((float) i14) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0243, code lost:
        if (r3 != 1) goto L_0x029e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(m1.d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f11175j
            int r1 = q.g.c(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0374
            m1.g r1 = r0.f11170e
            boolean r4 = r1.f11151j
            m1.f r5 = r0.f11173h
            m1.f r6 = r0.f11174i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x029e
            int r4 = r0.f11169d
            if (r4 != r3) goto L_0x029e
            l1.d r4 = r0.f11167b
            int r9 = r4.f10875s
            r10 = 2
            if (r9 == r10) goto L_0x0287
            if (r9 == r3) goto L_0x0028
            goto L_0x029e
        L_0x0028:
            int r9 = r4.f10876t
            r10 = -1
            if (r9 == 0) goto L_0x0060
            if (r9 != r3) goto L_0x0030
            goto L_0x0060
        L_0x0030:
            int r9 = r4.f10841a0
            if (r9 == r10) goto L_0x004f
            if (r9 == 0) goto L_0x0044
            if (r9 == r8) goto L_0x003a
            r4 = r2
            goto L_0x005b
        L_0x003a:
            m1.n r9 = r4.f10848e
            m1.g r9 = r9.f11170e
            int r9 = r9.f11148g
            float r9 = (float) r9
            float r4 = r4.Z
            goto L_0x0058
        L_0x0044:
            m1.n r9 = r4.f10848e
            m1.g r9 = r9.f11170e
            int r9 = r9.f11148g
            float r9 = (float) r9
            float r4 = r4.Z
            float r9 = r9 / r4
            goto L_0x0059
        L_0x004f:
            m1.n r9 = r4.f10848e
            m1.g r9 = r9.f11170e
            int r9 = r9.f11148g
            float r9 = (float) r9
            float r4 = r4.Z
        L_0x0058:
            float r9 = r9 * r4
        L_0x0059:
            float r9 = r9 + r7
            int r4 = (int) r9
        L_0x005b:
            r1.d(r4)
            goto L_0x029e
        L_0x0060:
            m1.n r9 = r4.f10848e
            m1.f r11 = r9.f11173h
            m1.f r9 = r9.f11174i
            l1.c r12 = r4.K
            l1.c r12 = r12.f10831f
            if (r12 == 0) goto L_0x006e
            r12 = r8
            goto L_0x006f
        L_0x006e:
            r12 = r2
        L_0x006f:
            l1.c r13 = r4.L
            l1.c r13 = r13.f10831f
            if (r13 == 0) goto L_0x0077
            r13 = r8
            goto L_0x0078
        L_0x0077:
            r13 = r2
        L_0x0078:
            l1.c r14 = r4.M
            l1.c r14 = r14.f10831f
            if (r14 == 0) goto L_0x0080
            r14 = r8
            goto L_0x0081
        L_0x0080:
            r14 = r2
        L_0x0081:
            l1.c r15 = r4.N
            l1.c r15 = r15.f10831f
            if (r15 == 0) goto L_0x0089
            r15 = r8
            goto L_0x008a
        L_0x0089:
            r15 = r2
        L_0x008a:
            int r3 = r4.f10841a0
            if (r12 == 0) goto L_0x01a2
            if (r13 == 0) goto L_0x01a2
            if (r14 == 0) goto L_0x01a2
            if (r15 == 0) goto L_0x01a2
            float r4 = r4.Z
            boolean r10 = r11.f11151j
            int[] r12 = f11155k
            if (r10 == 0) goto L_0x00eb
            boolean r10 = r9.f11151j
            if (r10 == 0) goto L_0x00eb
            boolean r7 = r5.f11144c
            if (r7 == 0) goto L_0x00ea
            boolean r7 = r6.f11144c
            if (r7 != 0) goto L_0x00a9
            goto L_0x00ea
        L_0x00a9:
            java.util.ArrayList r7 = r5.f11153l
            java.lang.Object r7 = r7.get(r2)
            m1.f r7 = (m1.f) r7
            int r7 = r7.f11148g
            int r5 = r5.f11147f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.f11153l
            java.lang.Object r5 = r5.get(r2)
            m1.f r5 = (m1.f) r5
            int r5 = r5.f11148g
            int r6 = r6.f11147f
            int r18 = r5 - r6
            int r5 = r11.f11148g
            int r6 = r11.f11147f
            int r19 = r5 + r6
            int r5 = r9.f11148g
            int r6 = r9.f11147f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            l1.d r1 = r0.f11167b
            m1.n r1 = r1.f10848e
            m1.g r1 = r1.f11170e
            r2 = r12[r8]
            r1.d(r2)
        L_0x00ea:
            return
        L_0x00eb:
            boolean r10 = r5.f11151j
            java.util.ArrayList r13 = r11.f11153l
            if (r10 == 0) goto L_0x013f
            boolean r10 = r6.f11151j
            if (r10 == 0) goto L_0x013f
            boolean r10 = r11.f11144c
            if (r10 == 0) goto L_0x013e
            boolean r10 = r9.f11144c
            if (r10 != 0) goto L_0x00fe
            goto L_0x013e
        L_0x00fe:
            int r10 = r5.f11148g
            int r14 = r5.f11147f
            int r17 = r10 + r14
            int r10 = r6.f11148g
            int r14 = r6.f11147f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            m1.f r10 = (m1.f) r10
            int r10 = r10.f11148g
            int r14 = r11.f11147f
            int r19 = r10 + r14
            java.util.ArrayList r10 = r9.f11153l
            java.lang.Object r10 = r10.get(r2)
            m1.f r10 = (m1.f) r10
            int r10 = r10.f11148g
            int r14 = r9.f11147f
            int r20 = r10 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r10 = r12[r2]
            r1.d(r10)
            l1.d r10 = r0.f11167b
            m1.n r10 = r10.f10848e
            m1.g r10 = r10.f11170e
            r14 = r12[r8]
            r10.d(r14)
            goto L_0x013f
        L_0x013e:
            return
        L_0x013f:
            boolean r10 = r5.f11144c
            if (r10 == 0) goto L_0x01a1
            boolean r10 = r6.f11144c
            if (r10 == 0) goto L_0x01a1
            boolean r10 = r11.f11144c
            if (r10 == 0) goto L_0x01a1
            boolean r10 = r9.f11144c
            if (r10 != 0) goto L_0x0150
            goto L_0x01a1
        L_0x0150:
            java.util.ArrayList r10 = r5.f11153l
            java.lang.Object r10 = r10.get(r2)
            m1.f r10 = (m1.f) r10
            int r10 = r10.f11148g
            int r14 = r5.f11147f
            int r17 = r10 + r14
            java.util.ArrayList r10 = r6.f11153l
            java.lang.Object r10 = r10.get(r2)
            m1.f r10 = (m1.f) r10
            int r10 = r10.f11148g
            int r14 = r6.f11147f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            m1.f r10 = (m1.f) r10
            int r10 = r10.f11148g
            int r11 = r11.f11147f
            int r19 = r10 + r11
            java.util.ArrayList r10 = r9.f11153l
            java.lang.Object r10 = r10.get(r2)
            m1.f r10 = (m1.f) r10
            int r10 = r10.f11148g
            int r9 = r9.f11147f
            int r20 = r10 - r9
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            l1.d r3 = r0.f11167b
            m1.n r3 = r3.f10848e
            m1.g r3 = r3.f11170e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x029e
        L_0x01a1:
            return
        L_0x01a2:
            if (r12 == 0) goto L_0x0216
            if (r14 == 0) goto L_0x0216
            boolean r9 = r5.f11144c
            if (r9 == 0) goto L_0x0215
            boolean r9 = r6.f11144c
            if (r9 != 0) goto L_0x01af
            goto L_0x0215
        L_0x01af:
            float r4 = r4.Z
            java.util.ArrayList r9 = r5.f11153l
            java.lang.Object r9 = r9.get(r2)
            m1.f r9 = (m1.f) r9
            int r9 = r9.f11148g
            int r11 = r5.f11147f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.f11153l
            java.lang.Object r11 = r11.get(r2)
            m1.f r11 = (m1.f) r11
            int r11 = r11.f11148g
            int r12 = r6.f11147f
            int r11 = r11 - r12
            if (r3 == r10) goto L_0x01f4
            if (r3 == 0) goto L_0x01f4
            if (r3 == r8) goto L_0x01d3
            goto L_0x029e
        L_0x01d3:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01e6
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01e6:
            r1.d(r3)
            l1.d r3 = r0.f11167b
            m1.n r3 = r3.f10848e
            m1.g r3 = r3.f11170e
            r3.d(r10)
            goto L_0x029e
        L_0x01f4:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x0207
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0207:
            r1.d(r3)
            l1.d r3 = r0.f11167b
            m1.n r3 = r3.f10848e
            m1.g r3 = r3.f11170e
            r3.d(r10)
            goto L_0x029e
        L_0x0215:
            return
        L_0x0216:
            if (r13 == 0) goto L_0x029e
            if (r15 == 0) goto L_0x029e
            boolean r12 = r11.f11144c
            if (r12 == 0) goto L_0x0286
            boolean r12 = r9.f11144c
            if (r12 != 0) goto L_0x0223
            goto L_0x0286
        L_0x0223:
            float r4 = r4.Z
            java.util.ArrayList r12 = r11.f11153l
            java.lang.Object r12 = r12.get(r2)
            m1.f r12 = (m1.f) r12
            int r12 = r12.f11148g
            int r11 = r11.f11147f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f11153l
            java.lang.Object r11 = r11.get(r2)
            m1.f r11 = (m1.f) r11
            int r11 = r11.f11148g
            int r9 = r9.f11147f
            int r11 = r11 - r9
            if (r3 == r10) goto L_0x0266
            if (r3 == 0) goto L_0x0246
            if (r3 == r8) goto L_0x0266
            goto L_0x029e
        L_0x0246:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0259
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0259:
            r1.d(r10)
            l1.d r4 = r0.f11167b
            m1.n r4 = r4.f10848e
            m1.g r4 = r4.f11170e
            r4.d(r3)
            goto L_0x029e
        L_0x0266:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0279
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0279:
            r1.d(r10)
            l1.d r4 = r0.f11167b
            m1.n r4 = r4.f10848e
            m1.g r4 = r4.f11170e
            r4.d(r3)
            goto L_0x029e
        L_0x0286:
            return
        L_0x0287:
            l1.d r3 = r4.W
            if (r3 == 0) goto L_0x029e
            m1.l r3 = r3.f10846d
            m1.g r3 = r3.f11170e
            boolean r9 = r3.f11151j
            if (r9 == 0) goto L_0x029e
            float r4 = r4.f10880x
            int r3 = r3.f11148g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x029e:
            boolean r3 = r5.f11144c
            if (r3 == 0) goto L_0x0373
            boolean r3 = r6.f11144c
            if (r3 != 0) goto L_0x02a8
            goto L_0x0373
        L_0x02a8:
            boolean r3 = r5.f11151j
            if (r3 == 0) goto L_0x02b5
            boolean r3 = r6.f11151j
            if (r3 == 0) goto L_0x02b5
            boolean r3 = r1.f11151j
            if (r3 == 0) goto L_0x02b5
            return
        L_0x02b5:
            boolean r3 = r1.f11151j
            java.util.ArrayList r4 = r5.f11153l
            java.util.ArrayList r9 = r6.f11153l
            if (r3 != 0) goto L_0x02f0
            int r3 = r0.f11169d
            r10 = 3
            if (r3 != r10) goto L_0x02f0
            l1.d r3 = r0.f11167b
            int r10 = r3.f10875s
            if (r10 != 0) goto L_0x02f0
            boolean r3 = r3.y()
            if (r3 != 0) goto L_0x02f0
            java.lang.Object r3 = r4.get(r2)
            m1.f r3 = (m1.f) r3
            java.lang.Object r2 = r9.get(r2)
            m1.f r2 = (m1.f) r2
            int r3 = r3.f11148g
            int r4 = r5.f11147f
            int r3 = r3 + r4
            int r2 = r2.f11148g
            int r4 = r6.f11147f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02f0:
            boolean r3 = r1.f11151j
            if (r3 != 0) goto L_0x0339
            int r3 = r0.f11169d
            r10 = 3
            if (r3 != r10) goto L_0x0339
            int r3 = r0.f11166a
            if (r3 != r8) goto L_0x0339
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0339
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0339
            java.lang.Object r3 = r4.get(r2)
            m1.f r3 = (m1.f) r3
            java.lang.Object r8 = r9.get(r2)
            m1.f r8 = (m1.f) r8
            int r3 = r3.f11148g
            int r10 = r5.f11147f
            int r3 = r3 + r10
            int r8 = r8.f11148g
            int r10 = r6.f11147f
            int r8 = r8 + r10
            int r8 = r8 - r3
            int r3 = r1.m
            int r3 = java.lang.Math.min(r8, r3)
            l1.d r8 = r0.f11167b
            int r10 = r8.f10879w
            int r8 = r8.f10878v
            int r3 = java.lang.Math.max(r8, r3)
            if (r10 <= 0) goto L_0x0336
            int r3 = java.lang.Math.min(r10, r3)
        L_0x0336:
            r1.d(r3)
        L_0x0339:
            boolean r3 = r1.f11151j
            if (r3 != 0) goto L_0x033e
            return
        L_0x033e:
            java.lang.Object r3 = r4.get(r2)
            m1.f r3 = (m1.f) r3
            java.lang.Object r2 = r9.get(r2)
            m1.f r2 = (m1.f) r2
            int r4 = r3.f11148g
            int r8 = r5.f11147f
            int r8 = r8 + r4
            int r9 = r2.f11148g
            int r10 = r6.f11147f
            int r10 = r10 + r9
            l1.d r11 = r0.f11167b
            float r11 = r11.f10853g0
            if (r3 != r2) goto L_0x035c
            r11 = r7
            goto L_0x035e
        L_0x035c:
            r4 = r8
            r9 = r10
        L_0x035e:
            int r9 = r9 - r4
            int r2 = r1.f11148g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r11
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.f11148g
            int r1 = r1.f11148g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x0373:
            return
        L_0x0374:
            l1.d r1 = r0.f11167b
            l1.c r3 = r1.K
            l1.c r1 = r1.M
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.l.a(m1.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        r0 = r12.f11167b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r12 = this;
            l1.d r0 = r12.f11167b
            boolean r1 = r0.f10840a
            m1.g r2 = r12.f11170e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.r()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f11151j
            m1.f r1 = r12.f11174i
            m1.f r3 = r12.f11173h
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 0
            if (r0 != 0) goto L_0x0076
            l1.d r0 = r12.f11167b
            int[] r8 = r0.V
            r8 = r8[r7]
            r12.f11169d = r8
            if (r8 == r6) goto L_0x00a6
            if (r8 != r5) goto L_0x006c
            l1.d r9 = r0.W
            if (r9 == 0) goto L_0x006c
            int[] r10 = r9.V
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0033
            if (r10 != r5) goto L_0x006c
        L_0x0033:
            int r0 = r9.r()
            l1.d r4 = r12.f11167b
            l1.c r4 = r4.K
            int r4 = r4.e()
            int r0 = r0 - r4
            l1.d r4 = r12.f11167b
            l1.c r4 = r4.M
            int r4 = r4.e()
            int r0 = r0 - r4
            m1.l r4 = r9.f10846d
            m1.f r4 = r4.f11173h
            l1.d r5 = r12.f11167b
            l1.c r5 = r5.K
            int r5 = r5.e()
            m1.p.b(r3, r4, r5)
            m1.l r3 = r9.f10846d
            m1.f r3 = r3.f11174i
            l1.d r4 = r12.f11167b
            l1.c r4 = r4.M
            int r4 = r4.e()
            int r4 = -r4
            m1.p.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006c:
            if (r8 != r4) goto L_0x00a6
            int r0 = r0.r()
            r2.d(r0)
            goto L_0x00a6
        L_0x0076:
            int r0 = r12.f11169d
            if (r0 != r5) goto L_0x00a6
            l1.d r0 = r12.f11167b
            l1.d r8 = r0.W
            if (r8 == 0) goto L_0x00a6
            int[] r9 = r8.V
            r9 = r9[r7]
            if (r9 == r4) goto L_0x0088
            if (r9 != r5) goto L_0x00a6
        L_0x0088:
            m1.l r2 = r8.f10846d
            m1.f r2 = r2.f11173h
            l1.c r0 = r0.K
            int r0 = r0.e()
            m1.p.b(r3, r2, r0)
            m1.l r0 = r8.f10846d
            m1.f r0 = r0.f11174i
            l1.d r2 = r12.f11167b
            l1.c r2 = r2.M
            int r2 = r2.e()
            int r2 = -r2
            m1.p.b(r1, r0, r2)
            return
        L_0x00a6:
            boolean r0 = r2.f11151j
            if (r0 == 0) goto L_0x017e
            l1.d r0 = r12.f11167b
            boolean r8 = r0.f10840a
            if (r8 == 0) goto L_0x017e
            l1.c[] r5 = r0.S
            r6 = r5[r7]
            l1.c r8 = r6.f10831f
            if (r8 == 0) goto L_0x0118
            r9 = r5[r4]
            l1.c r9 = r9.f10831f
            if (r9 == 0) goto L_0x0118
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x00df
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f11147f = r0
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11147f = r0
            goto L_0x0304
        L_0x00df:
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r7]
            m1.f r0 = m1.p.h(r0)
            if (r0 == 0) goto L_0x00f8
            l1.d r2 = r12.f11167b
            l1.c[] r2 = r2.S
            r2 = r2[r7]
            int r2 = r2.e()
            m1.p.b(r3, r0, r2)
        L_0x00f8:
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r4]
            m1.f r0 = m1.p.h(r0)
            if (r0 == 0) goto L_0x0112
            l1.d r2 = r12.f11167b
            l1.c[] r2 = r2.S
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            m1.p.b(r1, r0, r2)
        L_0x0112:
            r3.f11143b = r4
            r1.f11143b = r4
            goto L_0x0304
        L_0x0118:
            if (r8 == 0) goto L_0x0134
            m1.f r0 = m1.p.h(r6)
            if (r0 == 0) goto L_0x0304
            l1.d r4 = r12.f11167b
            l1.c[] r4 = r4.S
            r4 = r4[r7]
            int r4 = r4.e()
            m1.p.b(r3, r0, r4)
            int r0 = r2.f11148g
            m1.p.b(r1, r3, r0)
            goto L_0x0304
        L_0x0134:
            r5 = r5[r4]
            l1.c r6 = r5.f10831f
            if (r6 == 0) goto L_0x0156
            m1.f r0 = m1.p.h(r5)
            if (r0 == 0) goto L_0x0304
            l1.d r5 = r12.f11167b
            l1.c[] r5 = r5.S
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            m1.p.b(r1, r0, r4)
            int r0 = r2.f11148g
            int r0 = -r0
            m1.p.b(r3, r1, r0)
            goto L_0x0304
        L_0x0156:
            boolean r4 = r0 instanceof l1.h
            if (r4 != 0) goto L_0x0304
            l1.d r4 = r0.W
            if (r4 == 0) goto L_0x0304
            l1.c$a r4 = l1.c.a.B
            l1.c r0 = r0.j(r4)
            l1.c r0 = r0.f10831f
            if (r0 != 0) goto L_0x0304
            l1.d r0 = r12.f11167b
            l1.d r4 = r0.W
            m1.l r4 = r4.f10846d
            m1.f r4 = r4.f11173h
            int r0 = r0.s()
            m1.p.b(r3, r4, r0)
            int r0 = r2.f11148g
            m1.p.b(r1, r3, r0)
            goto L_0x0304
        L_0x017e:
            int r0 = r12.f11169d
            if (r0 != r6) goto L_0x0264
            l1.d r0 = r12.f11167b
            int r8 = r0.f10875s
            r9 = 2
            java.util.ArrayList r10 = r2.f11152k
            java.util.ArrayList r11 = r2.f11153l
            if (r8 == r9) goto L_0x024b
            if (r8 == r6) goto L_0x0191
            goto L_0x0264
        L_0x0191:
            int r8 = r0.f10876t
            if (r8 != r6) goto L_0x0216
            r3.f11142a = r12
            r1.f11142a = r12
            m1.n r6 = r0.f10848e
            m1.f r8 = r6.f11173h
            r8.f11142a = r12
            m1.f r6 = r6.f11174i
            r6.f11142a = r12
            r2.f11142a = r12
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x01ed
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            r11.add(r0)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.g r6 = r0.f11170e
            r6.f11142a = r12
            m1.f r0 = r0.f11173h
            r11.add(r0)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.f r0 = r0.f11174i
            r11.add(r0)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.f r0 = r0.f11173h
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.f r0 = r0.f11174i
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            goto L_0x0264
        L_0x01ed:
            l1.d r0 = r12.f11167b
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x020a
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            java.util.ArrayList r0 = r0.f11153l
            r0.add(r2)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            r10.add(r0)
            goto L_0x0264
        L_0x020a:
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            java.util.ArrayList r0 = r0.f11153l
            r0.add(r2)
            goto L_0x0264
        L_0x0216:
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            r11.add(r0)
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.f r0 = r0.f11173h
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            l1.d r0 = r12.f11167b
            m1.n r0 = r0.f10848e
            m1.f r0 = r0.f11174i
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            r2.f11143b = r4
            r10.add(r3)
            r10.add(r1)
            java.util.ArrayList r0 = r3.f11153l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f11153l
            r0.add(r2)
            goto L_0x0264
        L_0x024b:
            l1.d r0 = r0.W
            if (r0 != 0) goto L_0x0250
            goto L_0x0264
        L_0x0250:
            m1.n r0 = r0.f10848e
            m1.g r0 = r0.f11170e
            r11.add(r0)
            java.util.ArrayList r0 = r0.f11152k
            r0.add(r2)
            r2.f11143b = r4
            r10.add(r3)
            r10.add(r1)
        L_0x0264:
            l1.d r0 = r12.f11167b
            l1.c[] r6 = r0.S
            r8 = r6[r7]
            l1.c r9 = r8.f10831f
            if (r9 == 0) goto L_0x02b6
            r10 = r6[r4]
            l1.c r10 = r10.f10831f
            if (r10 == 0) goto L_0x02b6
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0295
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f11147f = r0
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f11147f = r0
            goto L_0x0304
        L_0x0295:
            l1.d r0 = r12.f11167b
            l1.c[] r0 = r0.S
            r0 = r0[r7]
            m1.f r0 = m1.p.h(r0)
            l1.d r1 = r12.f11167b
            l1.c[] r1 = r1.S
            r1 = r1[r4]
            m1.f r1 = m1.p.h(r1)
            if (r0 == 0) goto L_0x02ae
            r0.b(r12)
        L_0x02ae:
            if (r1 == 0) goto L_0x02b3
            r1.b(r12)
        L_0x02b3:
            r12.f11175j = r5
            goto L_0x0304
        L_0x02b6:
            if (r9 == 0) goto L_0x02cf
            m1.f r0 = m1.p.h(r8)
            if (r0 == 0) goto L_0x0304
            l1.d r5 = r12.f11167b
            l1.c[] r5 = r5.S
            r5 = r5[r7]
            int r5 = r5.e()
            m1.p.b(r3, r0, r5)
            r12.c(r1, r3, r4, r2)
            goto L_0x0304
        L_0x02cf:
            r5 = r6[r4]
            l1.c r6 = r5.f10831f
            if (r6 == 0) goto L_0x02ee
            m1.f r0 = m1.p.h(r5)
            if (r0 == 0) goto L_0x0304
            l1.d r5 = r12.f11167b
            l1.c[] r5 = r5.S
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            m1.p.b(r1, r0, r4)
            r0 = -1
            r12.c(r3, r1, r0, r2)
            goto L_0x0304
        L_0x02ee:
            boolean r5 = r0 instanceof l1.h
            if (r5 != 0) goto L_0x0304
            l1.d r5 = r0.W
            if (r5 == 0) goto L_0x0304
            m1.l r5 = r5.f10846d
            m1.f r5 = r5.f11173h
            int r0 = r0.s()
            m1.p.b(r3, r5, r0)
            r12.c(r1, r3, r4, r2)
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.l.d():void");
    }

    public final void e() {
        f fVar = this.f11173h;
        if (fVar.f11151j) {
            this.f11167b.f10843b0 = fVar.f11148g;
        }
    }

    public final void f() {
        this.f11168c = null;
        this.f11173h.c();
        this.f11174i.c();
        this.f11170e.c();
        this.f11172g = false;
    }

    public final boolean k() {
        return this.f11169d != 3 || this.f11167b.f10875s == 0;
    }

    public final void n() {
        this.f11172g = false;
        f fVar = this.f11173h;
        fVar.c();
        fVar.f11151j = false;
        f fVar2 = this.f11174i;
        fVar2.c();
        fVar2.f11151j = false;
        this.f11170e.f11151j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f11167b.f10861k0;
    }
}

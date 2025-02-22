package f3;

import ag.c0;

public final class d extends e2<Object> {
    public final /* synthetic */ f<Object> m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar, e eVar, c0 c0Var) {
        super(eVar, c0Var);
        this.m = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(f3.t1 r17, f3.t1 r18, int r19, f3.c2.a.C0133a r20, jf.d r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r21
            boolean r4 = r3 instanceof f3.b
            if (r4 == 0) goto L_0x001b
            r4 = r3
            f3.b r4 = (f3.b) r4
            int r5 = r4.D
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.D = r5
            goto L_0x0020
        L_0x001b:
            f3.b r4 = new f3.b
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.B
            kf.a r5 = kf.a.f10464a
            int r6 = r4.D
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0046
            if (r6 != r7) goto L_0x003e
            int r1 = r4.f8076e
            rf.a r2 = r4.f8075d
            f3.v0 r5 = r4.f8074c
            f3.v0 r6 = r4.f8073b
            f3.d r4 = r4.f8072a
            cb.b.J(r3)
            r9 = r1
            r1 = r6
            r6 = r2
            r2 = r5
            goto L_0x0093
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            cb.b.J(r3)
            int r3 = r17.a()
            r6 = 0
            f3.f<java.lang.Object> r9 = r0.m
            if (r3 != 0) goto L_0x0060
            r20.d()
            f3.e r1 = r9.f8180d
            int r2 = r18.a()
            r1.a(r8, r2)
            goto L_0x0232
        L_0x0060:
            int r3 = r18.a()
            if (r3 != 0) goto L_0x0074
            r20.d()
            f3.e r2 = r9.f8180d
            int r1 = r17.a()
            r2.b(r8, r1)
            goto L_0x0232
        L_0x0074:
            ag.c0 r3 = r9.f8179c
            f3.c r10 = new f3.c
            r10.<init>(r1, r2, r9, r6)
            r4.f8072a = r0
            r4.f8073b = r1
            r4.f8074c = r2
            r6 = r20
            r4.f8075d = r6
            r9 = r19
            r4.f8076e = r9
            r4.D = r7
            java.lang.Object r3 = cb.b.M(r3, r10, r4)
            if (r3 != r5) goto L_0x0092
            return r5
        L_0x0092:
            r4 = r0
        L_0x0093:
            f3.u0 r3 = (f3.u0) r3
            r6.d()
            f3.f<java.lang.Object> r4 = r4.m
            androidx.recyclerview.widget.p r4 = r4.f8178b
            java.lang.String r5 = "<this>"
            sf.j.f(r1, r5)
            java.lang.String r5 = "callback"
            sf.j.f(r4, r5)
            java.lang.String r5 = "newList"
            sf.j.f(r2, r5)
            java.lang.String r5 = "diffResult"
            sf.j.f(r3, r5)
            androidx.recyclerview.widget.k$d r5 = r3.f8504a
            boolean r3 = r3.f8505b
            if (r3 == 0) goto L_0x012e
            f3.x0 r6 = new f3.x0
            r6.<init>(r1, r2, r4)
            r5.b(r6)
            int r10 = r1.c()
            int r11 = r6.f8538c
            int r10 = java.lang.Math.min(r10, r11)
            int r11 = r2.c()
            int r12 = r6.f8538c
            int r11 = r11 - r12
            f3.z r12 = f3.z.f8561c
            if (r11 <= 0) goto L_0x00dc
            if (r10 <= 0) goto L_0x00d8
            r4.c(r12, r8, r10)
        L_0x00d8:
            r4.a(r8, r11)
            goto L_0x00e8
        L_0x00dc:
            if (r11 >= 0) goto L_0x00e8
            int r13 = -r11
            r4.b(r8, r13)
            int r10 = r10 + r11
            if (r10 <= 0) goto L_0x00e8
            r4.c(r12, r8, r10)
        L_0x00e8:
            int r10 = r2.c()
            r6.f8538c = r10
            int r10 = r1.d()
            int r11 = r6.f8539d
            int r10 = java.lang.Math.min(r10, r11)
            int r11 = r2.d()
            int r13 = r6.f8539d
            int r11 = r11 - r13
            int r14 = r6.f8538c
            int r15 = r6.f8540e
            int r14 = r14 + r15
            int r14 = r14 + r13
            int r13 = r14 - r10
            int r15 = r1.a()
            int r15 = r15 - r10
            if (r13 == r15) goto L_0x0110
            r15 = r7
            goto L_0x0111
        L_0x0110:
            r15 = r8
        L_0x0111:
            if (r11 <= 0) goto L_0x0117
            r4.a(r14, r11)
            goto L_0x011f
        L_0x0117:
            if (r11 >= 0) goto L_0x011f
            int r14 = r14 + r11
            int r7 = -r11
            r4.b(r14, r7)
            int r10 = r10 + r11
        L_0x011f:
            if (r10 <= 0) goto L_0x0126
            if (r15 == 0) goto L_0x0126
            r4.c(r12, r13, r10)
        L_0x0126:
            int r4 = r2.d()
            r6.f8539d = r4
            goto L_0x01d3
        L_0x012e:
            int r6 = r1.c()
            int r7 = r2.c()
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = r1.c()
            int r10 = r1.b()
            int r10 = r10 + r7
            int r7 = r2.c()
            int r11 = r2.b()
            int r11 = r11 + r7
            int r7 = java.lang.Math.min(r10, r11)
            int r10 = r7 - r6
            if (r10 <= 0) goto L_0x015a
            r4.b(r6, r10)
            r4.a(r6, r10)
        L_0x015a:
            int r10 = java.lang.Math.min(r6, r7)
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = r1.c()
            int r11 = r2.a()
            if (r7 <= r11) goto L_0x016d
            r7 = r11
        L_0x016d:
            int r11 = r1.c()
            int r12 = r1.b()
            int r12 = r12 + r11
            int r11 = r2.a()
            if (r12 <= r11) goto L_0x017d
            r12 = r11
        L_0x017d:
            f3.z r11 = f3.z.f8559a
            int r13 = r10 - r7
            if (r13 <= 0) goto L_0x0186
            r4.c(r11, r7, r13)
        L_0x0186:
            int r12 = r12 - r6
            if (r12 <= 0) goto L_0x018c
            r4.c(r11, r6, r12)
        L_0x018c:
            int r7 = r2.c()
            int r11 = r1.a()
            if (r7 <= r11) goto L_0x0197
            r7 = r11
        L_0x0197:
            int r11 = r2.c()
            int r12 = r2.b()
            int r12 = r12 + r11
            int r11 = r1.a()
            if (r12 <= r11) goto L_0x01a7
            r12 = r11
        L_0x01a7:
            f3.z r11 = f3.z.f8560b
            int r10 = r10 - r7
            if (r10 <= 0) goto L_0x01af
            r4.c(r11, r7, r10)
        L_0x01af:
            int r12 = r12 - r6
            if (r12 <= 0) goto L_0x01b5
            r4.c(r11, r6, r12)
        L_0x01b5:
            int r6 = r2.a()
            int r7 = r1.a()
            int r6 = r6 - r7
            if (r6 <= 0) goto L_0x01c8
            int r7 = r1.a()
            r4.a(r7, r6)
            goto L_0x01d3
        L_0x01c8:
            if (r6 >= 0) goto L_0x01d3
            int r7 = r1.a()
            int r7 = r7 + r6
            int r6 = -r6
            r4.b(r7, r6)
        L_0x01d3:
            if (r3 != 0) goto L_0x01e2
            int r1 = r2.a()
            wf.f r1 = d2.f1.P(r8, r1)
            int r1 = d2.f1.r(r9, r1)
            goto L_0x022d
        L_0x01e2:
            int r3 = r1.c()
            int r3 = r9 - r3
            int r4 = r1.b()
            if (r3 < 0) goto L_0x01f2
            if (r3 >= r4) goto L_0x01f2
            r4 = 1
            goto L_0x01f3
        L_0x01f2:
            r4 = r8
        L_0x01f3:
            if (r4 == 0) goto L_0x0221
            r4 = r8
        L_0x01f6:
            int r6 = r4 + 1
            int r7 = r4 / 2
            int r4 = r4 % 2
            r10 = -1
            r11 = 1
            if (r4 != r11) goto L_0x0202
            r4 = r10
            goto L_0x0203
        L_0x0202:
            r4 = r11
        L_0x0203:
            int r7 = r7 * r4
            int r7 = r7 + r3
            if (r7 < 0) goto L_0x021a
            int r4 = r1.b()
            if (r7 < r4) goto L_0x020e
            goto L_0x021a
        L_0x020e:
            int r4 = r5.a(r7)
            if (r4 == r10) goto L_0x021a
            int r1 = r2.c()
            int r1 = r1 + r4
            goto L_0x022d
        L_0x021a:
            r4 = 29
            if (r6 <= r4) goto L_0x021f
            goto L_0x0221
        L_0x021f:
            r4 = r6
            goto L_0x01f6
        L_0x0221:
            int r1 = r2.a()
            wf.f r1 = d2.f1.P(r8, r1)
            int r1 = d2.f1.r(r9, r1)
        L_0x022d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
        L_0x0232:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.d.c(f3.t1, f3.t1, int, f3.c2$a$a, jf.d):java.lang.Object");
    }
}

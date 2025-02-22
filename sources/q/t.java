package q;

public final class t implements s {

    /* renamed from: a  reason: collision with root package name */
    public final float f12767a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f12768b;

    public t() {
        this(0.0f, 0.0f, 7);
    }

    public t(float f10, float f11, float f12) {
        this.f12767a = f12;
        b0 b0Var = new b0();
        if (f10 >= 0.0f) {
            b0Var.f12662g = f10;
            b0Var.f12658c = false;
            double d10 = b0Var.f12657b;
            if (((float) (d10 * d10)) > 0.0f) {
                b0Var.f12657b = Math.sqrt((double) f11);
                b0Var.f12658c = false;
                this.f12768b = b0Var;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final float b(long j10, float f10, float f11, float f12) {
        b0 b0Var = this.f12768b;
        b0Var.f12656a = f11;
        return Float.intBitsToFloat((int) (b0Var.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x027a A[LOOP:2: B:100:0x0272->B:104:0x027a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c(float r44, float r45, float r46) {
        /*
            r43 = this;
            r0 = r43
            q.b0 r1 = r0.f12768b
            double r2 = r1.f12657b
            double r2 = r2 * r2
            float r2 = (float) r2
            float r1 = r1.f12662g
            float r3 = r44 - r45
            float r4 = r0.f12767a
            float r3 = r3 / r4
            float r4 = r46 / r4
            double r5 = (double) r2
            double r1 = (double) r1
            double r7 = (double) r4
            double r3 = (double) r3
            r9 = 1065353216(0x3f800000, float:1.0)
            double r9 = (double) r9
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r1 * r11
            double r15 = java.lang.Math.sqrt(r5)
            double r13 = r13 * r15
            double r11 = -r13
            double r13 = r13 * r13
            r15 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r5 = r5 * r15
            double r13 = r13 - r5
            q.r r5 = gc.b.f(r13)
            r15 = r9
            double r9 = r5.f12764a
            double r9 = r9 + r11
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = r9 / r17
            r5.f12764a = r9
            double r9 = r5.f12765b
            double r9 = r9 / r17
            r5.f12765b = r9
            q.r r6 = gc.b.f(r13)
            double r9 = r6.f12764a
            r13 = -1
            double r13 = (double) r13
            double r9 = r9 * r13
            r19 = r1
            double r0 = r6.f12765b
            double r0 = r0 * r13
            double r9 = r9 + r11
            double r9 = r9 / r17
            r6.f12764a = r9
            double r0 = r0 / r17
            r6.f12765b = r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r9 = 1
            if (r2 != 0) goto L_0x005b
            r11 = r9
            goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            if (r11 == 0) goto L_0x006b
            int r11 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x0064
            r11 = r9
            goto L_0x0065
        L_0x0064:
            r11 = 0
        L_0x0065:
            if (r11 == 0) goto L_0x006b
            r0 = 0
            goto L_0x02a9
        L_0x006b:
            if (r2 >= 0) goto L_0x006e
            double r7 = -r7
        L_0x006e:
            double r2 = java.lang.Math.abs(r3)
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            r17 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r30 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r4 <= 0) goto L_0x0197
            double r4 = r5.f12764a
            double r11 = r6.f12764a
            double r19 = r4 * r2
            double r19 = r19 - r7
            double r6 = r4 - r11
            double r13 = r19 / r6
            double r22 = r2 - r13
            double r2 = r15 / r22
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r4
            double r19 = r15 / r13
            double r19 = java.lang.Math.abs(r19)
            double r19 = java.lang.Math.log(r19)
            double r0 = r19 / r11
            boolean r8 = java.lang.Double.isInfinite(r2)
            if (r8 != 0) goto L_0x00b5
            boolean r8 = java.lang.Double.isNaN(r2)
            if (r8 != 0) goto L_0x00b5
            r8 = r9
            goto L_0x00b6
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x00bb
            r2 = r0
            goto L_0x00d2
        L_0x00bb:
            boolean r8 = java.lang.Double.isInfinite(r0)
            if (r8 != 0) goto L_0x00c9
            boolean r8 = java.lang.Double.isNaN(r0)
            if (r8 != 0) goto L_0x00c9
            r8 = r9
            goto L_0x00ca
        L_0x00c9:
            r8 = 0
        L_0x00ca:
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            double r2 = java.lang.Math.max(r2, r0)
        L_0x00d2:
            double r0 = r22 * r4
            double r8 = -r13
            double r8 = r8 * r11
            double r8 = r0 / r8
            double r8 = java.lang.Math.log(r8)
            double r19 = r11 - r4
            double r8 = r8 / r19
            boolean r19 = java.lang.Double.isNaN(r8)
            if (r19 != 0) goto L_0x0129
            r19 = 0
            int r21 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r21 > 0) goto L_0x00ed
            goto L_0x0129
        L_0x00ed:
            int r21 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x0119
            double r19 = r4 * r8
            double r19 = java.lang.Math.exp(r19)
            double r19 = r19 * r22
            double r8 = r8 * r11
            double r8 = java.lang.Math.exp(r8)
            double r8 = r8 * r13
            double r8 = r8 + r19
            double r8 = -r8
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x0119
            r8 = 0
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0114
            int r0 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0114
            r8 = r15
            r0 = 0
            goto L_0x0116
        L_0x0114:
            r0 = r2
            r8 = r15
        L_0x0116:
            double r2 = -r8
            r8 = r2
            goto L_0x0125
        L_0x0119:
            r8 = r15
            double r2 = r13 * r11
            double r2 = r2 * r11
            double r2 = -r2
            double r0 = r0 * r4
            double r2 = r2 / r0
            double r0 = java.lang.Math.log(r2)
            double r0 = r0 / r6
        L_0x0125:
            r2 = r0
            r41 = r8
            goto L_0x012d
        L_0x0129:
            r8 = r15
            double r0 = -r8
            r41 = r0
        L_0x012d:
            q.z r0 = new q.z
            r32 = r0
            r33 = r22
            r35 = r4
            r37 = r13
            r39 = r11
            r32.<init>(r33, r35, r37, r39, r41)
            q.a0 r1 = new q.a0
            r21 = r1
            r24 = r4
            r26 = r13
            r28 = r11
            r21.<init>(r22, r24, r26, r28)
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
            java.lang.Object r4 = r0.invoke(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            double r4 = java.lang.Math.abs(r4)
            r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0166
            goto L_0x02a2
        L_0x0166:
            r10 = 0
        L_0x0167:
            int r4 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x02a2
            r4 = 100
            if (r10 >= r4) goto L_0x02a2
            int r10 = r10 + 1
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
            java.lang.Object r4 = r0.invoke(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
            java.lang.Object r6 = r1.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            double r4 = r4 / r6
            double r4 = r2 - r4
            double r2 = r2 - r4
            double r30 = java.lang.Math.abs(r2)
            r2 = r4
            goto L_0x0167
        L_0x0197:
            r0 = r15
            int r4 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x01b4
            double r9 = r5.f12764a
            double r11 = r9 * r2
            double r7 = r7 - r11
            double r4 = r5.f12765b
            double r7 = r7 / r4
            double r2 = r2 * r2
            double r7 = r7 * r7
            double r7 = r7 + r2
            double r2 = java.lang.Math.sqrt(r7)
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r2 = r0 / r9
            goto L_0x02a2
        L_0x01b4:
            double r4 = r5.f12764a
            double r11 = r4 * r2
            double r6 = r7 - r11
            double r13 = r0 / r2
            double r13 = java.lang.Math.abs(r13)
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r4
            double r15 = r0 / r6
            double r15 = java.lang.Math.abs(r15)
            double r15 = java.lang.Math.log(r15)
            r19 = r15
            r8 = 0
        L_0x01d2:
            r10 = 6
            if (r8 >= r10) goto L_0x01e4
            double r19 = r19 / r4
            double r19 = java.lang.Math.abs(r19)
            double r19 = java.lang.Math.log(r19)
            double r19 = r15 - r19
            int r8 = r8 + 1
            goto L_0x01d2
        L_0x01e4:
            double r9 = r19 / r4
            boolean r15 = java.lang.Double.isInfinite(r13)
            if (r15 != 0) goto L_0x01f4
            boolean r15 = java.lang.Double.isNaN(r13)
            if (r15 != 0) goto L_0x01f4
            r8 = 1
            goto L_0x01f5
        L_0x01f4:
            r8 = 0
        L_0x01f5:
            r15 = 1
            r8 = r8 ^ r15
            if (r8 == 0) goto L_0x01fb
            r13 = r9
            goto L_0x0212
        L_0x01fb:
            boolean r8 = java.lang.Double.isInfinite(r9)
            if (r8 != 0) goto L_0x0209
            boolean r8 = java.lang.Double.isNaN(r9)
            if (r8 != 0) goto L_0x0209
            r8 = r15
            goto L_0x020a
        L_0x0209:
            r8 = 0
        L_0x020a:
            r8 = r8 ^ r15
            if (r8 == 0) goto L_0x020e
            goto L_0x0212
        L_0x020e:
            double r13 = java.lang.Math.max(r13, r9)
        L_0x0212:
            double r11 = r11 + r6
            double r8 = -r11
            double r10 = r4 * r6
            double r8 = r8 / r10
            boolean r10 = java.lang.Double.isNaN(r8)
            if (r10 != 0) goto L_0x0252
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0224
            goto L_0x0252
        L_0x0224:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0247
            double r10 = r4 * r8
            double r15 = java.lang.Math.exp(r10)
            double r15 = r15 * r2
            double r8 = r8 * r6
            double r10 = java.lang.Math.exp(r10)
            double r10 = r10 * r8
            double r10 = r10 + r15
            double r8 = -r10
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0247
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0252
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0252
            r13 = r8
            goto L_0x0252
        L_0x0247:
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r8 / r4
            double r8 = -r11
            double r10 = r2 / r6
            double r8 = r8 - r10
            r28 = r0
            goto L_0x0256
        L_0x0252:
            double r9 = -r0
            r28 = r9
            r8 = r13
        L_0x0256:
            q.x r0 = new q.x
            r21 = r0
            r22 = r2
            r24 = r6
            r26 = r4
            r21.<init>(r22, r24, r26, r28)
            q.y r1 = new q.y
            r21 = r1
            r22 = r6
            r24 = r4
            r26 = r2
            r21.<init>(r22, r24, r26)
            r2 = r8
            r10 = 0
        L_0x0272:
            int r4 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x02a2
            r4 = 100
            if (r10 >= r4) goto L_0x02a2
            int r10 = r10 + 1
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            java.lang.Object r5 = r0.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            java.lang.Double r7 = java.lang.Double.valueOf(r2)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            double r7 = r7.doubleValue()
            double r5 = r5 / r7
            double r5 = r2 - r5
            double r2 = r2 - r5
            double r30 = java.lang.Math.abs(r2)
            r2 = r5
            goto L_0x0272
        L_0x02a2:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r0
            long r0 = (long) r2
        L_0x02a9:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.t.c(float, float, float):long");
    }

    public final float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    public final float e(long j10, float f10, float f11, float f12) {
        b0 b0Var = this.f12768b;
        b0Var.f12656a = f11;
        return Float.intBitsToFloat((int) (b0Var.a(f10, f12, j10 / 1000000) >> 32));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(float f10, float f11, int i8) {
        this((i8 & 1) != 0 ? 1.0f : f10, (i8 & 2) != 0 ? 1500.0f : f11, (i8 & 4) != 0 ? 0.01f : 0.0f);
    }
}

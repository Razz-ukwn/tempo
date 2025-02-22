package q7;

import com.google.android.gms.internal.measurement.k2;

public final class j7 extends i7 {

    /* renamed from: g  reason: collision with root package name */
    public final k2 f13143g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f13144h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j7(b bVar, String str, int i8, k2 k2Var) {
        super(i8, str);
        this.f13144h = bVar;
        this.f13143g = k2Var;
    }

    public final int a() {
        return this.f13143g.t();
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v16, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Long r17, java.lang.Long r18, com.google.android.gms.internal.measurement.x3 r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.measurement.ma.a()
            q7.b r1 = r0.f13144h
            q7.k4 r2 = r1.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.f r2 = r2.C
            java.lang.String r3 = r0.f13127a
            q7.f2 r4 = q7.g2.W
            boolean r2 = r2.r(r3, r4)
            com.google.android.gms.internal.measurement.k2 r3 = r0.f13143g
            boolean r4 = r3.z()
            boolean r5 = r3.A()
            boolean r6 = r3.B()
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x002e
            if (r5 != 0) goto L_0x002e
            if (r6 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = r7
            goto L_0x002f
        L_0x002e:
            r4 = r8
        L_0x002f:
            r5 = 0
            q7.k4 r1 = r1.f13121a
            if (r20 == 0) goto L_0x0059
            if (r4 != 0) goto L_0x0059
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            int r2 = r0.f13128b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3.C()
            if (r4 == 0) goto L_0x0051
            int r3 = r3.t()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x0051:
            java.lang.String r3 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            q7.q2 r1 = r1.J
            r1.d(r2, r5, r3)
            return r8
        L_0x0059:
            com.google.android.gms.internal.measurement.e2 r9 = r3.u()
            boolean r10 = r9.z()
            boolean r11 = r19.J()
            r12 = 0
            if (r11 == 0) goto L_0x00a4
            boolean r11 = r9.B()
            if (r11 != 0) goto L_0x008d
            r9 = r1
            q7.x3 r9 = (q7.x3) r9
            q7.s2 r9 = r9.E
            q7.x3.l(r9)
            r10 = r1
            q7.x3 r10 = (q7.x3) r10
            q7.n2 r10 = r10.I
            java.lang.String r11 = r19.y()
            java.lang.String r10 = r10.f(r11)
            java.lang.String r11 = "No number filter for long property. property"
            q7.q2 r9 = r9.E
            r9.c(r10, r11)
            goto L_0x0196
        L_0x008d:
            long r14 = r19.u()
            com.google.android.gms.internal.measurement.i2 r9 = r9.v()
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x009e }
            r11.<init>(r14)     // Catch:{ NumberFormatException -> 0x009e }
            java.lang.Boolean r5 = q7.i7.d(r11, r9, r12)     // Catch:{ NumberFormatException -> 0x009e }
        L_0x009e:
            java.lang.Boolean r5 = q7.i7.f(r5, r10)
            goto L_0x0196
        L_0x00a4:
            boolean r11 = r19.I()
            if (r11 == 0) goto L_0x00e9
            boolean r11 = r9.B()
            if (r11 != 0) goto L_0x00ce
            r9 = r1
            q7.x3 r9 = (q7.x3) r9
            q7.s2 r9 = r9.E
            q7.x3.l(r9)
            r10 = r1
            q7.x3 r10 = (q7.x3) r10
            q7.n2 r10 = r10.I
            java.lang.String r11 = r19.y()
            java.lang.String r10 = r10.f(r11)
            java.lang.String r11 = "No number filter for double property. property"
            q7.q2 r9 = r9.E
            r9.c(r10, r11)
            goto L_0x0196
        L_0x00ce:
            double r11 = r19.t()
            com.google.android.gms.internal.measurement.i2 r9 = r9.v()
            java.math.BigDecimal r13 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00e3 }
            r13.<init>(r11)     // Catch:{ NumberFormatException -> 0x00e3 }
            double r11 = java.lang.Math.ulp(r11)     // Catch:{ NumberFormatException -> 0x00e3 }
            java.lang.Boolean r5 = q7.i7.d(r13, r9, r11)     // Catch:{ NumberFormatException -> 0x00e3 }
        L_0x00e3:
            java.lang.Boolean r5 = q7.i7.f(r5, r10)
            goto L_0x0196
        L_0x00e9:
            boolean r11 = r19.L()
            if (r11 == 0) goto L_0x017a
            boolean r11 = r9.D()
            if (r11 != 0) goto L_0x0161
            boolean r11 = r9.B()
            if (r11 != 0) goto L_0x0119
            r9 = r1
            q7.x3 r9 = (q7.x3) r9
            q7.s2 r9 = r9.E
            q7.x3.l(r9)
            r10 = r1
            q7.x3 r10 = (q7.x3) r10
            q7.n2 r10 = r10.I
            java.lang.String r11 = r19.y()
            java.lang.String r10 = r10.f(r11)
            java.lang.String r11 = "No string or number filter defined. property"
            q7.q2 r9 = r9.E
            r9.c(r10, r11)
            goto L_0x0196
        L_0x0119:
            java.lang.String r11 = r19.z()
            boolean r11 = q7.v6.J(r11)
            if (r11 == 0) goto L_0x0140
            java.lang.String r11 = r19.z()
            com.google.android.gms.internal.measurement.i2 r9 = r9.v()
            boolean r14 = q7.v6.J(r11)
            if (r14 != 0) goto L_0x0132
            goto L_0x013b
        L_0x0132:
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x013b }
            r14.<init>(r11)     // Catch:{ NumberFormatException -> 0x013b }
            java.lang.Boolean r5 = q7.i7.d(r14, r9, r12)     // Catch:{ NumberFormatException -> 0x013b }
        L_0x013b:
            java.lang.Boolean r5 = q7.i7.f(r5, r10)
            goto L_0x0196
        L_0x0140:
            r9 = r1
            q7.x3 r9 = (q7.x3) r9
            q7.s2 r9 = r9.E
            q7.x3.l(r9)
            r10 = r1
            q7.x3 r10 = (q7.x3) r10
            q7.n2 r10 = r10.I
            java.lang.String r11 = r19.y()
            java.lang.String r10 = r10.f(r11)
            java.lang.String r11 = r19.z()
            java.lang.String r12 = "Invalid user property value for Numeric number filter. property, value"
            q7.q2 r9 = r9.E
            r9.d(r10, r11, r12)
            goto L_0x0196
        L_0x0161:
            java.lang.String r5 = r19.z()
            com.google.android.gms.internal.measurement.n2 r9 = r9.w()
            r11 = r1
            q7.x3 r11 = (q7.x3) r11
            q7.s2 r11 = r11.E
            q7.x3.l(r11)
            java.lang.Boolean r5 = q7.i7.e(r5, r9, r11)
            java.lang.Boolean r5 = q7.i7.f(r5, r10)
            goto L_0x0196
        L_0x017a:
            r9 = r1
            q7.x3 r9 = (q7.x3) r9
            q7.s2 r9 = r9.E
            q7.x3.l(r9)
            r10 = r1
            q7.x3 r10 = (q7.x3) r10
            q7.n2 r10 = r10.I
            java.lang.String r11 = r19.y()
            java.lang.String r10 = r10.f(r11)
            java.lang.String r11 = "User property has no value, property"
            q7.q2 r9 = r9.E
            r9.c(r10, r11)
        L_0x0196:
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            if (r5 != 0) goto L_0x01a2
            java.lang.String r9 = "null"
            goto L_0x01a3
        L_0x01a2:
            r9 = r5
        L_0x01a3:
            java.lang.String r10 = "Property filter result"
            q7.q2 r1 = r1.J
            r1.c(r9, r10)
            if (r5 != 0) goto L_0x01ad
            return r7
        L_0x01ad:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.f13129c = r1
            if (r6 == 0) goto L_0x01bb
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            return r8
        L_0x01bb:
            if (r20 == 0) goto L_0x01c3
            boolean r1 = r3.z()
            if (r1 == 0) goto L_0x01c5
        L_0x01c3:
            r0.f13130d = r5
        L_0x01c5:
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x0204
            if (r4 == 0) goto L_0x0204
            boolean r1 = r19.K()
            if (r1 == 0) goto L_0x0204
            long r4 = r19.v()
            if (r17 == 0) goto L_0x01dd
            long r4 = r17.longValue()
        L_0x01dd:
            if (r2 == 0) goto L_0x01f1
            boolean r1 = r3.z()
            if (r1 == 0) goto L_0x01f1
            boolean r1 = r3.A()
            if (r1 != 0) goto L_0x01f1
            if (r18 == 0) goto L_0x01f1
            long r4 = r18.longValue()
        L_0x01f1:
            boolean r1 = r3.A()
            if (r1 == 0) goto L_0x01fe
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f13132f = r1
            goto L_0x0204
        L_0x01fe:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f13131e = r1
        L_0x0204:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.j7.g(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.x3, boolean):boolean");
    }
}

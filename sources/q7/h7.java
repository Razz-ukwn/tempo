package q7;

import com.google.android.gms.internal.measurement.c2;

public final class h7 extends i7 {

    /* renamed from: g  reason: collision with root package name */
    public final c2 f13110g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f13111h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h7(b bVar, String str, int i8, c2 c2Var) {
        super(i8, str);
        this.f13111h = bVar;
        this.f13110g = c2Var;
    }

    public final int a() {
        return this.f13110g.u();
    }

    public final boolean b() {
        return this.f13110g.G();
    }

    public final boolean c() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0446 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0447  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Long r18, java.lang.Long r19, com.google.android.gms.internal.measurement.f3 r20, long r21, q7.p r23, boolean r24) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.measurement.ma.a()
            q7.b r1 = r0.f13111h
            q7.k4 r2 = r1.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.f r2 = r2.C
            q7.f2 r3 = q7.g2.Y
            java.lang.String r4 = r0.f13127a
            boolean r2 = r2.r(r4, r3)
            com.google.android.gms.internal.measurement.c2 r3 = r0.f13110g
            boolean r5 = r3.F()
            if (r5 == 0) goto L_0x0022
            r5 = r23
            long r5 = r5.f13257e
            goto L_0x0024
        L_0x0022:
            r5 = r21
        L_0x0024:
            q7.k4 r7 = r1.f13121a
            r8 = r7
            q7.x3 r8 = (q7.x3) r8
            q7.s2 r8 = r8.E
            q7.x3.l(r8)
            java.lang.String r8 = r8.v()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            r10 = 1
            int r12 = r0.f13128b
            r13 = 0
            if (r8 == 0) goto L_0x010d
            r8 = r7
            q7.x3 r8 = (q7.x3) r8
            q7.s2 r8 = r8.E
            q7.x3.l(r8)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r15 = r3.H()
            if (r15 == 0) goto L_0x0058
            int r15 = r3.u()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0059
        L_0x0058:
            r15 = 0
        L_0x0059:
            r11 = r7
            q7.x3 r11 = (q7.x3) r11
            q7.n2 r11 = r11.I
            java.lang.String r9 = r3.z()
            java.lang.String r9 = r11.d(r9)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            q7.q2 r8 = r8.J
            r8.e(r11, r14, r15, r9)
            r8 = r7
            q7.x3 r8 = (q7.x3) r8
            q7.s2 r8 = r8.E
            q7.x3.l(r8)
            q7.t6 r1 = r1.f13208b
            q7.v6 r1 = r1.C
            q7.t6.H(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "\nevent_filter {\n"
            r9.append(r11)
            boolean r11 = r3.H()
            if (r11 == 0) goto L_0x0099
            int r11 = r3.u()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r14 = "filter_id"
            q7.v6.t(r9, r13, r14, r11)
        L_0x0099:
            q7.k4 r11 = r1.f13121a
            q7.x3 r11 = (q7.x3) r11
            q7.n2 r11 = r11.I
            java.lang.String r14 = r3.z()
            java.lang.String r11 = r11.d(r14)
            java.lang.String r14 = "event_name"
            q7.v6.t(r9, r13, r14, r11)
            boolean r11 = r3.D()
            boolean r14 = r3.E()
            boolean r15 = r3.F()
            java.lang.String r11 = q7.v6.r(r11, r14, r15)
            boolean r14 = r11.isEmpty()
            if (r14 != 0) goto L_0x00c7
            java.lang.String r14 = "filter_type"
            q7.v6.t(r9, r13, r14, r11)
        L_0x00c7:
            boolean r11 = r3.G()
            if (r11 == 0) goto L_0x00d6
            com.google.android.gms.internal.measurement.i2 r11 = r3.y()
            java.lang.String r14 = "event_count_filter"
            q7.v6.u(r9, r10, r14, r11)
        L_0x00d6:
            int r11 = r3.t()
            if (r11 <= 0) goto L_0x00fa
            java.lang.String r11 = "  filters {\n"
            r9.append(r11)
            com.google.android.gms.internal.measurement.l7 r11 = r3.A()
            java.util.Iterator r11 = r11.iterator()
        L_0x00e9:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x00fa
            java.lang.Object r14 = r11.next()
            com.google.android.gms.internal.measurement.e2 r14 = (com.google.android.gms.internal.measurement.e2) r14
            r15 = 2
            r1.p(r9, r15, r14)
            goto L_0x00e9
        L_0x00fa:
            q7.v6.q(r10, r9)
            java.lang.String r1 = "}\n}\n"
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r9 = "Filter definition"
            q7.q2 r8 = r8.J
            r8.c(r1, r9)
        L_0x010d:
            boolean r1 = r3.H()
            if (r1 == 0) goto L_0x0488
            int r1 = r3.u()
            r8 = 256(0x100, float:3.59E-43)
            if (r1 <= r8) goto L_0x011d
            goto L_0x0488
        L_0x011d:
            boolean r1 = r3.D()
            boolean r4 = r3.E()
            boolean r8 = r3.F()
            if (r1 != 0) goto L_0x0132
            if (r4 != 0) goto L_0x0132
            if (r8 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r1 = r13
            goto L_0x0133
        L_0x0132:
            r1 = r10
        L_0x0133:
            if (r24 == 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            q7.x3 r7 = (q7.x3) r7
            q7.s2 r1 = r7.E
            q7.x3.l(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            boolean r4 = r3.H()
            if (r4 == 0) goto L_0x0151
            int r3 = r3.u()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L_0x0152
        L_0x0151:
            r11 = 0
        L_0x0152:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            q7.q2 r1 = r1.J
            r1.d(r2, r11, r3)
            return r10
        L_0x015a:
            java.lang.String r4 = r20.A()
            boolean r8 = r3.G()
            r11 = 0
            if (r8 == 0) goto L_0x0183
            com.google.android.gms.internal.measurement.i2 r8 = r3.y()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0174 }
            r9.<init>(r5)     // Catch:{ NumberFormatException -> 0x0174 }
            java.lang.Boolean r5 = q7.i7.d(r9, r8, r11)     // Catch:{ NumberFormatException -> 0x0174 }
            goto L_0x0175
        L_0x0174:
            r5 = 0
        L_0x0175:
            if (r5 != 0) goto L_0x0179
            goto L_0x02a4
        L_0x0179:
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0183
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L_0x0430
        L_0x0183:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            com.google.android.gms.internal.measurement.l7 r6 = r3.A()
            java.util.Iterator r6 = r6.iterator()
        L_0x0190:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01c8
            java.lang.Object r8 = r6.next()
            com.google.android.gms.internal.measurement.e2 r8 = (com.google.android.gms.internal.measurement.e2) r8
            java.lang.String r9 = r8.x()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x01c0
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            java.lang.String r6 = "null or empty param name in filter. event"
            q7.q2 r5 = r5.E
            r5.c(r4, r6)
            goto L_0x02a4
        L_0x01c0:
            java.lang.String r8 = r8.x()
            r5.add(r8)
            goto L_0x0190
        L_0x01c8:
            o.a r6 = new o.a
            r6.<init>()
            java.util.List r8 = r20.B()
            java.util.Iterator r8 = r8.iterator()
        L_0x01d5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x025f
            java.lang.Object r9 = r8.next()
            com.google.android.gms.internal.measurement.j3 r9 = (com.google.android.gms.internal.measurement.j3) r9
            java.lang.String r14 = r9.z()
            boolean r14 = r5.contains(r14)
            if (r14 == 0) goto L_0x01d5
            boolean r14 = r9.O()
            if (r14 == 0) goto L_0x0209
            java.lang.String r14 = r9.z()
            boolean r15 = r9.O()
            if (r15 == 0) goto L_0x0204
            long r15 = r9.w()
            java.lang.Long r9 = java.lang.Long.valueOf(r15)
            goto L_0x0205
        L_0x0204:
            r9 = 0
        L_0x0205:
            r6.put(r14, r9)
            goto L_0x01d5
        L_0x0209:
            boolean r14 = r9.M()
            if (r14 == 0) goto L_0x0227
            java.lang.String r14 = r9.z()
            boolean r15 = r9.M()
            if (r15 == 0) goto L_0x0222
            double r15 = r9.t()
            java.lang.Double r9 = java.lang.Double.valueOf(r15)
            goto L_0x0223
        L_0x0222:
            r9 = 0
        L_0x0223:
            r6.put(r14, r9)
            goto L_0x01d5
        L_0x0227:
            boolean r14 = r9.Q()
            if (r14 == 0) goto L_0x0239
            java.lang.String r14 = r9.z()
            java.lang.String r9 = r9.A()
            r6.put(r14, r9)
            goto L_0x01d5
        L_0x0239:
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r8 = r9.z()
            java.lang.String r6 = r6.e(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
            q7.q2 r5 = r5.E
            r5.d(r4, r6, r8)
            goto L_0x02a4
        L_0x025f:
            com.google.android.gms.internal.measurement.l7 r5 = r3.A()
            java.util.Iterator r5 = r5.iterator()
        L_0x0267:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x042e
            java.lang.Object r8 = r5.next()
            com.google.android.gms.internal.measurement.e2 r8 = (com.google.android.gms.internal.measurement.e2) r8
            boolean r9 = r8.A()
            if (r9 == 0) goto L_0x0281
            boolean r9 = r8.z()
            if (r9 == 0) goto L_0x0281
            r9 = r10
            goto L_0x0282
        L_0x0281:
            r9 = r13
        L_0x0282:
            java.lang.String r14 = r8.x()
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x02a7
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            java.lang.String r6 = "Event has empty param name. event"
            q7.q2 r5 = r5.E
            r5.c(r4, r6)
        L_0x02a4:
            r11 = 0
            goto L_0x0430
        L_0x02a7:
            r15 = 0
            java.lang.Object r10 = r6.getOrDefault(r14, r15)
            boolean r15 = r10 instanceof java.lang.Long
            if (r15 == 0) goto L_0x02fd
            boolean r15 = r8.B()
            if (r15 != 0) goto L_0x02d8
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r6 = r6.e(r14)
            java.lang.String r8 = "No number filter for long param. event, param"
            q7.q2 r5 = r5.E
            r5.d(r4, r6, r8)
            goto L_0x02a4
        L_0x02d8:
            java.lang.Long r10 = (java.lang.Long) r10
            long r14 = r10.longValue()
            com.google.android.gms.internal.measurement.i2 r8 = r8.v()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x02ec }
            r10.<init>(r14)     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.Boolean r8 = q7.i7.d(r10, r8, r11)     // Catch:{ NumberFormatException -> 0x02ec }
            goto L_0x02ed
        L_0x02ec:
            r8 = 0
        L_0x02ed:
            if (r8 != 0) goto L_0x02f0
            goto L_0x02a4
        L_0x02f0:
            boolean r8 = r8.booleanValue()
            if (r8 != r9) goto L_0x02fa
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L_0x0430
        L_0x02fa:
            r10 = 1
            goto L_0x0267
        L_0x02fd:
            boolean r15 = r10 instanceof java.lang.Double
            if (r15 == 0) goto L_0x0351
            boolean r15 = r8.B()
            if (r15 != 0) goto L_0x032a
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r6 = r6.e(r14)
            java.lang.String r8 = "No number filter for double param. event, param"
            q7.q2 r5 = r5.E
            r5.d(r4, r6, r8)
            goto L_0x02a4
        L_0x032a:
            java.lang.Double r10 = (java.lang.Double) r10
            double r14 = r10.doubleValue()
            com.google.android.gms.internal.measurement.i2 r8 = r8.v()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0342 }
            r10.<init>(r14)     // Catch:{ NumberFormatException -> 0x0342 }
            double r14 = java.lang.Math.ulp(r14)     // Catch:{ NumberFormatException -> 0x0342 }
            java.lang.Boolean r8 = q7.i7.d(r10, r8, r14)     // Catch:{ NumberFormatException -> 0x0342 }
            goto L_0x0343
        L_0x0342:
            r8 = 0
        L_0x0343:
            if (r8 != 0) goto L_0x0347
            goto L_0x02a4
        L_0x0347:
            boolean r8 = r8.booleanValue()
            if (r8 != r9) goto L_0x02fa
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L_0x0430
        L_0x0351:
            boolean r15 = r10 instanceof java.lang.String
            if (r15 == 0) goto L_0x03e5
            boolean r15 = r8.D()
            if (r15 == 0) goto L_0x036e
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.gms.internal.measurement.n2 r8 = r8.w()
            r14 = r7
            q7.x3 r14 = (q7.x3) r14
            q7.s2 r14 = r14.E
            q7.x3.l(r14)
            java.lang.Boolean r8 = q7.i7.e(r10, r8, r14)
            goto L_0x0391
        L_0x036e:
            boolean r15 = r8.B()
            if (r15 == 0) goto L_0x03c2
            java.lang.String r10 = (java.lang.String) r10
            boolean r15 = q7.v6.J(r10)
            if (r15 == 0) goto L_0x039f
            com.google.android.gms.internal.measurement.i2 r8 = r8.v()
            boolean r14 = q7.v6.J(r10)
            if (r14 != 0) goto L_0x0388
        L_0x0386:
            r8 = 0
            goto L_0x0391
        L_0x0388:
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0386 }
            r14.<init>(r10)     // Catch:{ NumberFormatException -> 0x0386 }
            java.lang.Boolean r8 = q7.i7.d(r14, r8, r11)     // Catch:{ NumberFormatException -> 0x0386 }
        L_0x0391:
            if (r8 != 0) goto L_0x0395
            goto L_0x02a4
        L_0x0395:
            boolean r8 = r8.booleanValue()
            if (r8 != r9) goto L_0x02fa
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L_0x0430
        L_0x039f:
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r6 = r6.e(r14)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            q7.q2 r5 = r5.E
            r5.d(r4, r6, r8)
            goto L_0x02a4
        L_0x03c2:
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r6 = r6.e(r14)
            java.lang.String r8 = "No filter for String param. event, param"
            q7.q2 r5 = r5.E
            r5.d(r4, r6, r8)
            goto L_0x02a4
        L_0x03e5:
            if (r10 != 0) goto L_0x040b
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r6 = r6.e(r14)
            java.lang.String r8 = "Missing param for filter. event, param"
            q7.q2 r5 = r5.J
            r5.d(r4, r6, r8)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L_0x0430
        L_0x040b:
            r5 = r7
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r4 = r6.d(r4)
            r6 = r7
            q7.x3 r6 = (q7.x3) r6
            q7.n2 r6 = r6.I
            java.lang.String r6 = r6.e(r14)
            java.lang.String r8 = "Unknown param type. event, param"
            q7.q2 r5 = r5.E
            r5.d(r4, r6, r8)
            goto L_0x02a4
        L_0x042e:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
        L_0x0430:
            q7.x3 r7 = (q7.x3) r7
            q7.s2 r4 = r7.E
            q7.x3.l(r4)
            if (r11 != 0) goto L_0x043c
            java.lang.String r5 = "null"
            goto L_0x043d
        L_0x043c:
            r5 = r11
        L_0x043d:
            java.lang.String r6 = "Event filter result"
            q7.q2 r4 = r4.J
            r4.c(r5, r6)
            if (r11 != 0) goto L_0x0447
            return r13
        L_0x0447:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.f13129c = r4
            boolean r5 = r11.booleanValue()
            if (r5 != 0) goto L_0x0453
            r5 = 1
            return r5
        L_0x0453:
            r0.f13130d = r4
            if (r1 == 0) goto L_0x0486
            boolean r1 = r20.M()
            if (r1 == 0) goto L_0x0486
            long r4 = r20.w()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            boolean r4 = r3.E()
            if (r4 == 0) goto L_0x0479
            if (r2 == 0) goto L_0x0476
            boolean r2 = r3.G()
            if (r2 != 0) goto L_0x0474
            goto L_0x0476
        L_0x0474:
            r1 = r18
        L_0x0476:
            r0.f13132f = r1
            goto L_0x0486
        L_0x0479:
            if (r2 == 0) goto L_0x0484
            boolean r2 = r3.G()
            if (r2 != 0) goto L_0x0482
            goto L_0x0484
        L_0x0482:
            r1 = r19
        L_0x0484:
            r0.f13131e = r1
        L_0x0486:
            r1 = 1
            return r1
        L_0x0488:
            q7.x3 r7 = (q7.x3) r7
            q7.s2 r1 = r7.E
            q7.x3.l(r1)
            q7.r2 r2 = q7.s2.r(r4)
            boolean r4 = r3.H()
            if (r4 == 0) goto L_0x04a2
            int r3 = r3.u()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L_0x04a3
        L_0x04a2:
            r11 = 0
        L_0x04a3:
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            q7.q2 r1 = r1.E
            r1.d(r2, r3, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.h7.g(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.f3, long, q7.p, boolean):boolean");
    }
}

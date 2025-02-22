package s6;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14772a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14773b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14774c;

    public /* synthetic */ n(int i8, Object obj, Object obj2) {
        this.f14772a = i8;
        this.f14773b = obj;
        this.f14774c = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04e2, code lost:
        if (android.text.TextUtils.isEmpty(r1.I) == false) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0663, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0665, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0666, code lost:
        r3.a(0, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0671, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02c4, code lost:
        if (r8.equals(q7.h.f13093b) == false) goto L_0x02ca;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:213:0x0644, B:216:0x0649] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0503  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.f14772a
            r3 = 0
            r4 = 0
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L_0x0634;
                case 1: goto L_0x0594;
                case 2: goto L_0x055c;
                case 3: goto L_0x013e;
                case 4: goto L_0x00ee;
                case 5: goto L_0x00c2;
                case 6: goto L_0x007d;
                case 7: goto L_0x005c;
                case 8: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            r2 = r1
            r1 = r6
            r4 = r7
            goto L_0x0672
        L_0x0011:
            java.lang.Object r0 = r1.f14774c
            r2 = r0
            q7.w5 r2 = (q7.w5) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.f14774c     // Catch:{ all -> 0x0059 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0059 }
            r0.f13406a = r7     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r1.f14774c     // Catch:{ all -> 0x0059 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0059 }
            q7.x5 r0 = r0.f13408c     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.o()     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            java.lang.Object r0 = r1.f14774c     // Catch:{ all -> 0x0059 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0059 }
            q7.x5 r0 = r0.f13408c     // Catch:{ all -> 0x0059 }
            q7.k4 r0 = r0.f13121a     // Catch:{ all -> 0x0059 }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x0059 }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x0059 }
            q7.x3.l(r0)     // Catch:{ all -> 0x0059 }
            q7.q2 r0 = r0.J     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "Connected to service"
            r0.b(r3)     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r1.f14774c     // Catch:{ all -> 0x0059 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0059 }
            q7.x5 r0 = r0.f13408c     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r1.f14773b     // Catch:{ all -> 0x0059 }
            q7.j2 r3 = (q7.j2) r3     // Catch:{ all -> 0x0059 }
            r0.i()     // Catch:{ all -> 0x0059 }
            u6.q.i(r3)     // Catch:{ all -> 0x0059 }
            r0.f13433d = r3     // Catch:{ all -> 0x0059 }
            r0.t()     // Catch:{ all -> 0x0059 }
            r0.s()     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            java.lang.Object r0 = r1.f14774c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            q7.x3 r0 = r0.f5666a
            q7.x5 r0 = r0.u()
            java.lang.Object r2 = r1.f14773b
            com.google.android.gms.internal.measurement.u0 r2 = (com.google.android.gms.internal.measurement.u0) r2
            r0.i()
            r0.j()
            q7.c7 r3 = r0.r(r7)
            q7.y3 r4 = new q7.y3
            r4.<init>(r0, r3, r2)
            r0.u(r4)
            return
        L_0x007d:
            java.lang.Object r0 = r1.f14773b
            r2 = r0
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.f14773b     // Catch:{ all -> 0x00b6 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r3 = r1.f14774c     // Catch:{ all -> 0x00b6 }
            r4 = r3
            q7.a5 r4 = (q7.a5) r4     // Catch:{ all -> 0x00b6 }
            q7.k4 r4 = r4.f13121a     // Catch:{ all -> 0x00b6 }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ all -> 0x00b6 }
            q7.f r4 = r4.C     // Catch:{ all -> 0x00b6 }
            q7.a5 r3 = (q7.a5) r3     // Catch:{ all -> 0x00b6 }
            q7.k4 r3 = r3.f13121a     // Catch:{ all -> 0x00b6 }
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x00b6 }
            q7.k2 r3 = r3.q()     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r3.n()     // Catch:{ all -> 0x00b6 }
            q7.f2 r5 = q7.g2.L     // Catch:{ all -> 0x00b6 }
            boolean r3 = r4.r(r3, r5)     // Catch:{ all -> 0x00b6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00b6 }
            r0.set(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = r1.f14773b     // Catch:{ all -> 0x00bf }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x00bf }
            r0.notify()     // Catch:{ all -> 0x00bf }
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            return
        L_0x00b6:
            r0 = move-exception
            java.lang.Object r3 = r1.f14773b     // Catch:{ all -> 0x00bf }
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch:{ all -> 0x00bf }
            r3.notify()     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            throw r0
        L_0x00c2:
            java.lang.Object r0 = r1.f14773b
            q7.a5 r0 = (q7.a5) r0
            java.lang.Object r2 = r1.f14774c
            java.lang.String r2 = (java.lang.String) r2
            q7.k4 r3 = r0.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.k2 r3 = r3.q()
            java.lang.String r4 = r3.L
            if (r4 == 0) goto L_0x00dd
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r6 = r7
        L_0x00de:
            r3.L = r2
            if (r6 == 0) goto L_0x00ed
            q7.k4 r0 = r0.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.k2 r0 = r0.q()
            r0.p()
        L_0x00ed:
            return
        L_0x00ee:
            java.lang.Object r0 = r1.f14774c
            q7.h4 r0 = (q7.h4) r0
            q7.t6 r2 = r0.f13101a
            r2.b()
            q7.t6 r0 = r0.f13101a
            java.lang.Object r2 = r1.f14773b
            q7.c7 r2 = (q7.c7) r2
            q7.w3 r3 = r0.h()
            r3.i()
            r0.f()
            java.lang.String r3 = r2.f12948a
            u6.q.f(r3)
            java.lang.String r3 = r2.R
            q7.h r3 = q7.h.b(r3)
            java.lang.String r4 = r2.f12948a
            q7.h r5 = r0.K(r4)
            q7.s2 r6 = r0.e()
            java.lang.String r8 = "Setting consent, package, consent"
            q7.q2 r6 = r6.J
            r6.d(r4, r3, r8)
            r0.r(r4, r3)
            java.util.EnumMap r4 = r3.f13094a
            java.util.Set r4 = r4.keySet()
            q7.g[] r6 = new q7.g[r7]
            java.lang.Object[] r4 = r4.toArray(r6)
            q7.g[] r4 = (q7.g[]) r4
            boolean r3 = r3.g(r5, r4)
            if (r3 == 0) goto L_0x013d
            r0.p(r2)
        L_0x013d:
            return
        L_0x013e:
            java.lang.Object r0 = r1.f14774c
            q7.x3 r0 = (q7.x3) r0
            java.lang.Object r8 = r1.f14773b
            q7.n4 r8 = (q7.n4) r8
            q7.w3 r9 = r0.F
            q7.x3.l(r9)
            r9.i()
            q7.f r9 = r0.C
            q7.k4 r10 = r9.f13121a
            q7.x3 r10 = (q7.x3) r10
            r10.getClass()
            q7.n r10 = new q7.n
            r10.<init>(r0)
            r10.l()
            r0.R = r10
            q7.k2 r10 = new q7.k2
            long r11 = r8.f13225f
            r10.<init>(r0, r11)
            r10.k()
            r0.S = r10
            q7.m2 r11 = new q7.m2
            r11.<init>(r0)
            r11.k()
            r0.P = r11
            q7.x5 r11 = new q7.x5
            r11.<init>(r0)
            r11.k()
            r0.Q = r11
            q7.a7 r11 = r0.H
            boolean r12 = r11.f13137b
            if (r12 != 0) goto L_0x0554
            r11.M()
            q7.k4 r12 = r11.f13121a
            q7.x3 r12 = (q7.x3) r12
            r12.b()
            r11.f13137b = r6
            q7.g3 r12 = r0.D
            boolean r13 = r12.f13137b
            if (r13 != 0) goto L_0x054c
            r12.n()
            q7.k4 r13 = r12.f13121a
            q7.x3 r13 = (q7.x3) r13
            r13.b()
            r12.f13137b = r6
            q7.k2 r12 = r0.S
            boolean r13 = r12.f13417b
            if (r13 != 0) goto L_0x0544
            r12.m()
            q7.k4 r13 = r12.f13121a
            q7.x3 r13 = (q7.x3) r13
            r13.b()
            r12.f13417b = r6
            q7.s2 r12 = r0.E
            q7.x3.l(r12)
            r9.n()
            r13 = 77000(0x12cc8, double:3.8043E-319)
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "App measurement initialized, version"
            q7.q2 r14 = r12.H
            r14.c(r9, r13)
            q7.x3.l(r12)
            java.lang.String r9 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r14.b(r9)
            java.lang.String r9 = r10.n()
            java.lang.String r10 = r0.f13421b
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0200
            boolean r10 = r11.S(r9)
            if (r10 == 0) goto L_0x01f0
            q7.x3.l(r12)
            java.lang.String r9 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r14.b(r9)
            goto L_0x0200
        L_0x01f0:
            q7.x3.l(r12)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r9 = r10.concat(r9)
            r14.b(r9)
        L_0x0200:
            q7.x3.l(r12)
            java.lang.String r9 = "Debug-level message logging enabled"
            q7.q2 r10 = r12.I
            r10.b(r9)
            int r9 = r0.f13420a0
            java.util.concurrent.atomic.AtomicInteger r10 = r0.f13422b0
            int r11 = r10.get()
            if (r9 == r11) goto L_0x022c
            q7.x3.l(r12)
            int r9 = r0.f13420a0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r10.get()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "Not all components initialized"
            q7.q2 r12 = r12.B
            r12.d(r9, r10, r11)
        L_0x022c:
            r0.T = r6
            com.google.android.gms.internal.measurement.a1 r8 = r8.f13226g
            q7.w3 r9 = r0.F
            q7.x3.l(r9)
            r9.i()
            q7.g3 r9 = r0.D
            q7.x3.j(r9)
            q7.h r10 = r9.o()
            r9.i()
            android.content.SharedPreferences r11 = r9.m()
            java.lang.String r12 = "consent_source"
            r13 = 100
            int r11 = r11.getInt(r12, r13)
            q7.f r12 = r0.C
            q7.k4 r14 = r12.f13121a
            java.lang.String r14 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r14 = r12.q(r14)
            java.lang.String r15 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r15 = r12.q(r15)
            long r6 = r0.f13424c0
            q7.a5 r13 = r0.L
            r2 = -10
            if (r14 != 0) goto L_0x026a
            if (r15 == 0) goto L_0x0277
        L_0x026a:
            boolean r17 = r9.t(r2)
            if (r17 == 0) goto L_0x0277
            q7.h r8 = new q7.h
            r8.<init>(r14, r15)
            r15 = r2
            goto L_0x02ca
        L_0x0277:
            q7.k2 r14 = r0.q()
            java.lang.String r14 = r14.o()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            r15 = 30
            if (r14 != 0) goto L_0x02a0
            if (r11 == 0) goto L_0x0297
            if (r11 == r15) goto L_0x0297
            r14 = 10
            if (r11 == r14) goto L_0x0297
            if (r11 == r15) goto L_0x0297
            if (r11 == r15) goto L_0x0297
            r14 = 40
            if (r11 != r14) goto L_0x02a0
        L_0x0297:
            q7.x3.k(r13)
            q7.h r8 = q7.h.f13093b
            r13.v(r8, r2, r6)
            goto L_0x02c7
        L_0x02a0:
            q7.k2 r2 = r0.q()
            java.lang.String r2 = r2.o()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x02c7
            if (r8 == 0) goto L_0x02c7
            android.os.Bundle r2 = r8.C
            if (r2 == 0) goto L_0x02c7
            boolean r8 = r9.t(r15)
            if (r8 == 0) goto L_0x02c7
            q7.h r8 = q7.h.a(r2)
            q7.h r2 = q7.h.f13093b
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x02c7
            goto L_0x02ca
        L_0x02c7:
            r8 = r3
            r15 = 100
        L_0x02ca:
            if (r8 == 0) goto L_0x02d3
            q7.x3.k(r13)
            r13.v(r8, r15, r6)
            r10 = r8
        L_0x02d3:
            q7.x3.k(r13)
            r13.w(r10)
            q7.d3 r2 = r9.f13074e
            long r10 = r2.a()
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            q7.s2 r5 = r0.E
            if (r4 != 0) goto L_0x02f6
            q7.x3.l(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = "Persisting first open"
            q7.q2 r10 = r5.J
            r10.c(r4, r8)
            r2.b(r6)
        L_0x02f6:
            q7.x3.k(r13)
            q7.e7 r4 = r13.J
            boolean r8 = r4.b()
            if (r8 == 0) goto L_0x0313
            boolean r8 = r4.c()
            if (r8 == 0) goto L_0x0313
            q7.x3 r4 = r4.f12981a
            q7.g3 r4 = r4.D
            q7.x3.j(r4)
            q7.f3 r4 = r4.Q
            r4.b(r3)
        L_0x0313:
            boolean r4 = r0.i()
            q7.a7 r8 = r0.H
            if (r4 != 0) goto L_0x039e
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x053d
            q7.x3.j(r8)
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r2 = r8.R(r2)
            if (r2 != 0) goto L_0x0336
            q7.x3.l(r5)
            java.lang.String r2 = "App is missing INTERNET permission"
            q7.q2 r3 = r5.B
            r3.b(r2)
        L_0x0336:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r8.R(r2)
            if (r2 != 0) goto L_0x0348
            q7.x3.l(r5)
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            q7.q2 r3 = r5.B
            r3.b(r2)
        L_0x0348:
            android.content.Context r0 = r0.f13419a
            b7.b r2 = b7.c.a(r0)
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x0392
            boolean r2 = r12.v()
            if (r2 != 0) goto L_0x0392
            boolean r2 = q7.a7.Y(r0)
            if (r2 != 0) goto L_0x036a
            q7.x3.l(r5)
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            q7.q2 r3 = r5.B
            r3.b(r2)
        L_0x036a:
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementJobService"
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0385 }
            if (r3 != 0) goto L_0x0373
            goto L_0x0385
        L_0x0373:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0385 }
            r4.<init>(r0, r2)     // Catch:{ NameNotFoundException -> 0x0385 }
            r2 = 0
            android.content.pm.ServiceInfo r0 = r3.getServiceInfo(r4, r2)     // Catch:{ NameNotFoundException -> 0x0385 }
            if (r0 == 0) goto L_0x0385
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0385 }
            if (r0 == 0) goto L_0x0385
            r7 = 1
            goto L_0x0386
        L_0x0385:
            r7 = 0
        L_0x0386:
            if (r7 != 0) goto L_0x0392
            q7.x3.l(r5)
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            q7.q2 r2 = r5.B
            r2.b(r0)
        L_0x0392:
            q7.x3.l(r5)
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            q7.q2 r2 = r5.B
            r2.b(r0)
            goto L_0x053d
        L_0x039e:
            q7.k2 r4 = r0.q()
            java.lang.String r4 = r4.o()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            q7.f3 r10 = r9.B
            if (r4 == 0) goto L_0x03c2
            q7.k2 r4 = r0.q()
            r4.j()
            java.lang.String r4 = r4.I
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x03be
            goto L_0x03c2
        L_0x03be:
            r16 = r12
            goto L_0x0469
        L_0x03c2:
            q7.x3.j(r8)
            q7.k2 r4 = r0.q()
            java.lang.String r4 = r4.o()
            r9.i()
            android.content.SharedPreferences r11 = r9.m()
            java.lang.String r14 = "gmp_app_id"
            java.lang.String r11 = r11.getString(r14, r3)
            q7.k2 r15 = r0.q()
            r15.j()
            java.lang.String r15 = r15.I
            r9.i()
            android.content.SharedPreferences r1 = r9.m()
            r16 = r12
            java.lang.String r12 = "admob_app_id"
            java.lang.String r1 = r1.getString(r12, r3)
            r8.getClass()
            boolean r1 = q7.a7.Z(r4, r11, r15, r1)
            if (r1 == 0) goto L_0x0436
            q7.x3.l(r5)
            java.lang.String r1 = "Rechecking which service to use due to a GMP App Id change"
            q7.q2 r4 = r5.H
            r4.b(r1)
            r9.i()
            java.lang.Boolean r1 = r9.p()
            android.content.SharedPreferences r4 = r9.m()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.clear()
            r4.apply()
            if (r1 == 0) goto L_0x041f
            r9.q(r1)
        L_0x041f:
            q7.m2 r1 = r0.r()
            r1.n()
            q7.x5 r1 = r0.Q
            r1.x()
            q7.x5 r1 = r0.Q
            r1.w()
            r2.b(r6)
            r10.b(r3)
        L_0x0436:
            q7.k2 r1 = r0.q()
            java.lang.String r1 = r1.o()
            r9.i()
            android.content.SharedPreferences r2 = r9.m()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r14, r1)
            r2.apply()
            q7.k2 r1 = r0.q()
            r1.j()
            java.lang.String r1 = r1.I
            r9.i()
            android.content.SharedPreferences r2 = r9.m()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r12, r1)
            r2.apply()
        L_0x0469:
            q7.h r1 = r9.o()
            q7.g r2 = q7.g.f13016c
            boolean r1 = r1.f(r2)
            if (r1 != 0) goto L_0x0478
            r10.b(r3)
        L_0x0478:
            q7.x3.k(r13)
            java.lang.String r1 = r10.a()
            java.util.concurrent.atomic.AtomicReference r2 = r13.C
            r2.set(r1)
            com.google.android.gms.internal.measurement.ja r1 = com.google.android.gms.internal.measurement.ja.f5342b
            com.google.android.gms.internal.measurement.g5 r1 = r1.f5343a
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.ka r1 = (com.google.android.gms.internal.measurement.ka) r1
            r1.zza()
            q7.f2 r1 = q7.g2.f13031e0
            r2 = r16
            boolean r1 = r2.r(r3, r1)
            if (r1 == 0) goto L_0x04c7
            q7.x3.j(r8)
            q7.k4 r1 = r8.f13121a     // Catch:{ ClassNotFoundException -> 0x04ae }
            q7.x3 r1 = (q7.x3) r1     // Catch:{ ClassNotFoundException -> 0x04ae }
            android.content.Context r1 = r1.f13419a     // Catch:{ ClassNotFoundException -> 0x04ae }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x04ae }
            java.lang.String r4 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x04ae }
            goto L_0x04c7
        L_0x04ae:
            q7.f3 r1 = r9.P
            java.lang.String r4 = r1.a()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x04c7
            q7.x3.l(r5)
            java.lang.String r4 = "Remote config removed with active feature rollouts"
            q7.q2 r5 = r5.E
            r5.b(r4)
            r1.b(r3)
        L_0x04c7:
            q7.k2 r1 = r0.q()
            java.lang.String r1 = r1.o()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x04e4
            q7.k2 r1 = r0.q()
            r1.j()
            java.lang.String r1 = r1.I
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x053d
        L_0x04e4:
            boolean r1 = r0.g()
            android.content.SharedPreferences r3 = r9.f13072c
            if (r3 != 0) goto L_0x04ee
            r3 = 0
            goto L_0x04f4
        L_0x04ee:
            java.lang.String r4 = "deferred_analytics_collection"
            boolean r3 = r3.contains(r4)
        L_0x04f4:
            if (r3 != 0) goto L_0x0501
            boolean r2 = r2.t()
            if (r2 != 0) goto L_0x0501
            r2 = r1 ^ 1
            r9.r(r2)
        L_0x0501:
            if (r1 == 0) goto L_0x0509
            q7.x3.k(r13)
            r13.E()
        L_0x0509:
            q7.i6 r1 = r0.G
            q7.x3.k(r1)
            q7.h6 r1 = r1.f13125d
            r1.a()
            q7.x5 r1 = r0.u()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.y(r2)
            q7.x5 r0 = r0.u()
            q7.c3 r1 = r9.S
            android.os.Bundle r1 = r1.a()
            r0.i()
            r0.j()
            r2 = 0
            q7.c7 r2 = r0.r(r2)
            q7.h3 r3 = new q7.h3
            r4 = 2
            r3.<init>(r4, r0, r2, r1)
            r0.u(r3)
        L_0x053d:
            q7.b3 r0 = r9.I
            r1 = 1
            r0.a(r1)
            return
        L_0x0544:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x054c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x0554:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        L_0x055c:
            r2 = r1
            r1 = r6
            java.lang.Object r0 = r2.f14773b
            q7.k4 r0 = (q7.k4) r0
            r0.c()
            boolean r0 = q2.d.c()
            if (r0 == 0) goto L_0x0577
            java.lang.Object r0 = r2.f14773b
            q7.k4 r0 = (q7.k4) r0
            q7.w3 r0 = r0.h()
            r0.q(r2)
            goto L_0x0593
        L_0x0577:
            java.lang.Object r0 = r2.f14774c
            q7.m r0 = (q7.m) r0
            long r6 = r0.f13197c
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0583
            r6 = r1
            goto L_0x0584
        L_0x0583:
            r6 = 0
        L_0x0584:
            java.lang.Object r0 = r2.f14774c
            q7.m r0 = (q7.m) r0
            r0.f13197c = r4
            if (r6 == 0) goto L_0x0593
            java.lang.Object r0 = r2.f14774c
            q7.m r0 = (q7.m) r0
            r0.b()
        L_0x0593:
            return
        L_0x0594:
            r2 = r1
            r1 = r6
            java.lang.Object r0 = r2.f14774c
            com.google.android.gms.common.api.internal.r0 r0 = (com.google.android.gms.common.api.internal.r0) r0
            java.lang.Object r4 = r2.f14773b
            s7.l r4 = (s7.l) r4
            r7.b r5 = com.google.android.gms.common.api.internal.r0.f4322j
            t6.b r5 = r4.f14807b
            int r6 = r5.f15379b
            if (r6 != 0) goto L_0x05a8
            r6 = r1
            goto L_0x05a9
        L_0x05a8:
            r6 = 0
        L_0x05a9:
            if (r6 == 0) goto L_0x0627
            u6.j0 r4 = r4.f14808c
            u6.q.i(r4)
            t6.b r5 = r4.f15830c
            int r6 = r5.f15379b
            if (r6 != 0) goto L_0x05b8
            r6 = r1
            goto L_0x05b9
        L_0x05b8:
            r6 = 0
        L_0x05b9:
            if (r6 != 0) goto L_0x05dc
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r4 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r1 = r4.concat(r1)
            java.lang.String r4 = "SignInCoordinator"
            android.util.Log.wtf(r4, r1, r3)
            com.google.android.gms.common.api.internal.q0 r1 = r0.f4329i
            com.google.android.gms.common.api.internal.e0 r1 = (com.google.android.gms.common.api.internal.e0) r1
            r1.b(r5)
            r7.f r0 = r0.f4328h
            r0.g()
            goto L_0x0633
        L_0x05dc:
            com.google.android.gms.common.api.internal.q0 r1 = r0.f4329i
            android.os.IBinder r4 = r4.f15829b
            if (r4 != 0) goto L_0x05e3
            goto L_0x05f7
        L_0x05e3:
            int r3 = u6.j.a.f15827b
            java.lang.String r3 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r3 = r4.queryLocalInterface(r3)
            boolean r5 = r3 instanceof u6.j
            if (r5 == 0) goto L_0x05f2
            u6.j r3 = (u6.j) r3
            goto L_0x05f7
        L_0x05f2:
            u6.k1 r3 = new u6.k1
            r3.<init>(r4)
        L_0x05f7:
            com.google.android.gms.common.api.internal.e0 r1 = (com.google.android.gms.common.api.internal.e0) r1
            r1.getClass()
            if (r3 == 0) goto L_0x0611
            java.util.Set r4 = r0.f4326f
            if (r4 != 0) goto L_0x0603
            goto L_0x0611
        L_0x0603:
            r1.f4255c = r3
            r1.f4256d = r4
            boolean r5 = r1.f4257e
            if (r5 == 0) goto L_0x062e
            com.google.android.gms.common.api.a$e r1 = r1.f4253a
            r1.n(r3, r4)
            goto L_0x062e
        L_0x0611:
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r4 = "GoogleApiManager"
            java.lang.String r5 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r4, r5, r3)
            t6.b r3 = new t6.b
            r4 = 4
            r3.<init>(r4)
            r1.b(r3)
            goto L_0x062e
        L_0x0627:
            com.google.android.gms.common.api.internal.q0 r1 = r0.f4329i
            com.google.android.gms.common.api.internal.e0 r1 = (com.google.android.gms.common.api.internal.e0) r1
            r1.b(r5)
        L_0x062e:
            r7.f r0 = r0.f4328h
            r0.g()
        L_0x0633:
            return
        L_0x0634:
            r2 = r1
            java.lang.Object r0 = r2.f14773b
            r3 = r0
            s6.p r3 = (s6.p) r3
            java.lang.Object r0 = r2.f14774c
            android.os.IBinder r0 = (android.os.IBinder) r0
            monitor-enter(r3)
            if (r0 != 0) goto L_0x0649
            java.lang.String r0 = "Null service connection"
            r1 = 0
            r3.a(r1, r0)     // Catch:{ all -> 0x0663 }
            monitor-exit(r3)     // Catch:{ all -> 0x0663 }
            goto L_0x066f
        L_0x0649:
            androidx.appcompat.widget.l r1 = new androidx.appcompat.widget.l     // Catch:{ RemoteException -> 0x0665 }
            r1.<init>((android.os.IBinder) r0)     // Catch:{ RemoteException -> 0x0665 }
            r3.f14780c = r1     // Catch:{ RemoteException -> 0x0665 }
            r0 = 2
            r3.f14778a = r0     // Catch:{ all -> 0x0663 }
            s6.u r0 = r3.f14783f     // Catch:{ all -> 0x0663 }
            java.lang.Object r0 = r0.f14791c     // Catch:{ all -> 0x0663 }
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch:{ all -> 0x0663 }
            s6.l r1 = new s6.l     // Catch:{ all -> 0x0663 }
            r1.<init>(r3)     // Catch:{ all -> 0x0663 }
            r0.execute(r1)     // Catch:{ all -> 0x0663 }
            monitor-exit(r3)     // Catch:{ all -> 0x0663 }
            goto L_0x066f
        L_0x0663:
            r0 = move-exception
            goto L_0x0670
        L_0x0665:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0663 }
            r4 = 0
            r3.a(r4, r0)     // Catch:{ all -> 0x0663 }
            monitor-exit(r3)     // Catch:{ all -> 0x0663 }
        L_0x066f:
            return
        L_0x0670:
            monitor-exit(r3)     // Catch:{ all -> 0x0663 }
            throw r0
        L_0x0672:
            java.lang.Object r0 = r2.f14774c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            q7.x3 r0 = r0.f5666a
            q7.a5 r0 = r0.L
            q7.x3.k(r0)
            java.lang.Object r3 = r2.f14773b
            androidx.compose.ui.platform.j3 r3 = (androidx.compose.ui.platform.j3) r3
            r0.i()
            r0.j()
            if (r3 == 0) goto L_0x0697
            androidx.compose.ui.platform.j3 r5 = r0.f12899d
            if (r3 == r5) goto L_0x0697
            if (r5 != 0) goto L_0x0691
            r6 = r1
            goto L_0x0692
        L_0x0691:
            r6 = r4
        L_0x0692:
            java.lang.String r1 = "EventInterceptor already set."
            u6.q.k(r6, r1)
        L_0x0697:
            r0.f12899d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.n.run():void");
    }

    public /* synthetic */ n(Object obj, Object obj2, int i8) {
        this.f14772a = i8;
        this.f14774c = obj;
        this.f14773b = obj2;
    }
}

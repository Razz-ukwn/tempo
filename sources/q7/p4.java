package q7;

public final /* synthetic */ class p4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13273b;

    public /* synthetic */ p4(Object obj, int i8) {
        this.f13272a = i8;
        this.f13273b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.f13272a
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0208
        L_0x000a:
            java.lang.Object r0 = r1.f13273b
            q7.j5 r0 = (q7.j5) r0
            q7.f5 r2 = r0.F
            r0.f13140e = r2
            return
        L_0x0013:
            java.lang.Object r0 = r1.f13273b
            q7.a5 r0 = (q7.a5) r0
            r0.i()
            q7.k4 r0 = r0.f13121a
            r3 = r0
            q7.x3 r3 = (q7.x3) r3
            q7.g3 r0 = r3.D
            q7.x3.j(r0)
            q7.b3 r0 = r0.N
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x01fb
            q7.g3 r0 = r3.D
            q7.x3.j(r0)
            q7.d3 r0 = r0.O
            long r4 = r0.a()
            q7.g3 r0 = r3.D
            q7.x3.j(r0)
            r6 = 1
            long r6 = r6 + r4
            q7.d3 r0 = r0.O
            r0.b(r6)
            r6 = 5
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0062
            q7.s2 r0 = r3.E
            q7.x3.l(r0)
            java.lang.String r4 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            q7.q2 r0 = r0.E
            r0.b(r4)
            q7.g3 r0 = r3.D
            q7.x3.j(r0)
            q7.b3 r0 = r0.N
            r0.a(r2)
            goto L_0x0207
        L_0x0062:
            q7.w3 r0 = r3.F
            q7.x3.l(r0)
            r0.i()
            q7.e5 r4 = r3.N
            q7.x3.l(r4)
            q7.x3.l(r4)
            q7.k2 r0 = r3.q()
            java.lang.String r5 = r0.n()
            q7.g3 r6 = r3.D
            q7.x3.j(r6)
            r6.i()
            q7.k4 r0 = r6.f13121a
            r7 = r0
            q7.x3 r7 = (q7.x3) r7
            ag.m r8 = r7.J
            r8.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r10 = r6.C
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x00a9
            long r12 = r6.E
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            android.util.Pair r0 = new android.util.Pair
            boolean r7 = r6.D
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.<init>(r10, r7)
            goto L_0x00e5
        L_0x00a9:
            q7.f r10 = r7.C
            q7.f2 r12 = q7.g2.f13026c
            long r12 = r10.o(r5, r12)
            long r12 = r12 + r8
            r6.E = r12
            q7.x3 r0 = (q7.x3) r0     // Catch:{ Exception -> 0x00c9 }
            android.content.Context r0 = r0.f13419a     // Catch:{ Exception -> 0x00c9 }
            o6.a$a r0 = o6.a.a(r0)     // Catch:{ Exception -> 0x00c9 }
            r6.C = r11     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r8 = r0.f12194a     // Catch:{ Exception -> 0x00c9 }
            if (r8 == 0) goto L_0x00c4
            r6.C = r8     // Catch:{ Exception -> 0x00c9 }
        L_0x00c4:
            boolean r0 = r0.f12195b     // Catch:{ Exception -> 0x00c9 }
            r6.D = r0     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d8
        L_0x00c9:
            r0 = move-exception
            q7.s2 r7 = r7.E
            q7.x3.l(r7)
            java.lang.String r8 = "Unable to get advertising id"
            q7.q2 r7 = r7.I
            r7.c(r0, r8)
            r6.C = r11
        L_0x00d8:
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r7 = r6.C
            boolean r8 = r6.D
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.<init>(r7, r8)
        L_0x00e5:
            q7.f r7 = r3.C
            java.lang.String r8 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r7 = r7.q(r8)
            r8 = 0
            if (r7 == 0) goto L_0x00f9
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r7 = r8
            goto L_0x00fa
        L_0x00f9:
            r7 = r2
        L_0x00fa:
            q7.s2 r9 = r3.E
            if (r7 == 0) goto L_0x01f0
            java.lang.Object r7 = r0.second
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x01f0
            java.lang.Object r7 = r0.first
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0114
            goto L_0x01f0
        L_0x0114:
            q7.x3.l(r4)
            r4.k()
            q7.k4 r7 = r4.f13121a
            q7.x3 r7 = (q7.x3) r7
            android.content.Context r10 = r7.f13419a
            java.lang.String r11 = "connectivity"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            if (r10 == 0) goto L_0x012f
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x012f }
            goto L_0x0130
        L_0x012f:
            r10 = 0
        L_0x0130:
            if (r10 == 0) goto L_0x01e5
            boolean r10 = r10.isConnected()
            if (r10 == 0) goto L_0x01e5
            q7.a7 r9 = r3.H
            q7.x3.j(r9)
            q7.k2 r10 = r3.q()
            q7.k4 r10 = r10.f13121a
            q7.x3 r10 = (q7.x3) r10
            q7.f r10 = r10.C
            r10.n()
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            q7.d3 r6 = r6.O
            long r12 = r6.a()
            r14 = -1
            long r12 = r12 + r14
            q7.k4 r6 = r9.f13121a
            u6.q.f(r0)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            u6.q.f(r5)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.String r10 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            r14 = 4
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.String r15 = "v%s.%s"
            r11 = 2
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r17 = 77000(0x12cc8, double:3.8043E-319)
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r2[r8] = r17     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            int r9 = r9.k0()     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r16 = 1
            r2[r16] = r9     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.String r2 = java.lang.String.format(r15, r2)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r14[r8] = r2     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r14[r16] = r0     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r14[r11] = r5     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r2 = 3
            r14[r2] = r0     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = java.lang.String.format(r10, r14)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r2 = r6
            q7.x3 r2 = (q7.x3) r2     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            q7.f r2 = r2.C     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            java.lang.String r8 = "debug.deferred.deeplink"
            java.lang.String r2 = r2.j(r8)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            boolean r2 = r5.equals(r2)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            if (r2 == 0) goto L_0x01aa
            java.lang.String r2 = "&ddl_test=1"
            java.lang.String r0 = r0.concat(r2)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
        L_0x01aa:
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r2.<init>(r0)     // Catch:{ MalformedURLException -> 0x01b3, IllegalArgumentException -> 0x01b1 }
            r11 = r2
            goto L_0x01c7
        L_0x01b1:
            r0 = move-exception
            goto L_0x01b4
        L_0x01b3:
            r0 = move-exception
        L_0x01b4:
            q7.x3 r6 = (q7.x3) r6
            q7.s2 r2 = r6.E
            q7.x3.l(r2)
            java.lang.String r0 = r0.getMessage()
            q7.q2 r2 = r2.B
            java.lang.String r6 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r2.c(r0, r6)
            r11 = 0
        L_0x01c7:
            if (r11 == 0) goto L_0x0207
            q7.x3.l(r4)
            r3.u r0 = new r3.u
            r0.<init>((java.lang.Object) r3)
            r4.i()
            r4.k()
            q7.w3 r2 = r7.F
            q7.x3.l(r2)
            q7.d5 r3 = new q7.d5
            r3.<init>(r4, r5, r11, r0)
            r2.p(r3)
            goto L_0x0207
        L_0x01e5:
            q7.x3.l(r9)
            java.lang.String r0 = "Network is not available for Deferred Deep Link request. Skipping"
            q7.q2 r2 = r9.E
            r2.b(r0)
            goto L_0x0207
        L_0x01f0:
            q7.x3.l(r9)
            java.lang.String r0 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
            q7.q2 r2 = r9.I
            r2.b(r0)
            goto L_0x0207
        L_0x01fb:
            q7.s2 r0 = r3.E
            q7.x3.l(r0)
            java.lang.String r2 = "Deferred Deep Link already retrieved. Not fetching again."
            q7.q2 r0 = r0.I
            r0.b(r2)
        L_0x0207:
            return
        L_0x0208:
            java.lang.Object r0 = r1.f13273b
            t7.a r0 = (t7.a) r0
            java.lang.Object r2 = r0.f15432a
            monitor-enter(r2)
            boolean r3 = r0.b()     // Catch:{ all -> 0x023b }
            if (r3 != 0) goto L_0x0217
            monitor-exit(r2)     // Catch:{ all -> 0x023b }
            goto L_0x023a
        L_0x0217:
            java.lang.String r3 = "WakeLock"
            java.lang.String r4 = r0.f15441j     // Catch:{ all -> 0x023b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x023b }
            java.lang.String r5 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x023b }
            android.util.Log.e(r3, r4)     // Catch:{ all -> 0x023b }
            r0.d()     // Catch:{ all -> 0x023b }
            boolean r3 = r0.b()     // Catch:{ all -> 0x023b }
            if (r3 != 0) goto L_0x0233
            monitor-exit(r2)     // Catch:{ all -> 0x023b }
            goto L_0x023a
        L_0x0233:
            r3 = 1
            r0.f15434c = r3     // Catch:{ all -> 0x023b }
            r0.e()     // Catch:{ all -> 0x023b }
            monitor-exit(r2)     // Catch:{ all -> 0x023b }
        L_0x023a:
            return
        L_0x023b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x023b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.p4.run():void");
    }
}

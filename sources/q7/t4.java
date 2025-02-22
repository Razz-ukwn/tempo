package q7;

public final class t4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13339b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13340c;

    public /* synthetic */ t4(int i8, Object obj, Object obj2) {
        this.f13338a = i8;
        this.f13339b = obj;
        this.f13340c = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014c A[SYNTHETIC, Splitter:B:39:0x014c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.f13338a
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0164;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0060;
                case 3: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x024f
        L_0x000a:
            java.lang.Object r0 = r1.f13340c
            java.lang.Object r3 = r1.f13339b
            r4 = r3
            q7.x5 r4 = (q7.x5) r4
            q7.j2 r5 = r4.f13433d
            if (r5 != 0) goto L_0x0026
            q7.k4 r0 = r4.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r2 = "Discarding data. Failed to send app launch"
            q7.q2 r0 = r0.B
            r0.b(r2)
            goto L_0x005f
        L_0x0026:
            r6 = r0
            q7.c7 r6 = (q7.c7) r6     // Catch:{ RemoteException -> 0x004e }
            u6.q.i(r6)     // Catch:{ RemoteException -> 0x004e }
            r6 = r0
            q7.c7 r6 = (q7.c7) r6     // Catch:{ RemoteException -> 0x004e }
            r5.v(r6)     // Catch:{ RemoteException -> 0x004e }
            r6 = r3
            q7.x5 r6 = (q7.x5) r6     // Catch:{ RemoteException -> 0x004e }
            q7.k4 r6 = r6.f13121a     // Catch:{ RemoteException -> 0x004e }
            q7.x3 r6 = (q7.x3) r6     // Catch:{ RemoteException -> 0x004e }
            q7.m2 r6 = r6.r()     // Catch:{ RemoteException -> 0x004e }
            r6.o()     // Catch:{ RemoteException -> 0x004e }
            r6 = r3
            q7.x5 r6 = (q7.x5) r6     // Catch:{ RemoteException -> 0x004e }
            q7.c7 r0 = (q7.c7) r0     // Catch:{ RemoteException -> 0x004e }
            r6.m(r5, r2, r0)     // Catch:{ RemoteException -> 0x004e }
            q7.x5 r3 = (q7.x5) r3     // Catch:{ RemoteException -> 0x004e }
            r3.t()     // Catch:{ RemoteException -> 0x004e }
            goto L_0x005f
        L_0x004e:
            r0 = move-exception
            q7.k4 r2 = r4.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r2 = r2.E
            q7.x3.l(r2)
            java.lang.String r3 = "Failed to send app launch to the service"
            q7.q2 r2 = r2.B
            r2.c(r0, r3)
        L_0x005f:
            return
        L_0x0060:
            java.lang.Object r0 = r1.f13340c
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            monitor-enter(r3)
            java.lang.Object r0 = r1.f13340c     // Catch:{ all -> 0x0099 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x0099 }
            java.lang.Object r2 = r1.f13339b     // Catch:{ all -> 0x0099 }
            r4 = r2
            q7.a5 r4 = (q7.a5) r4     // Catch:{ all -> 0x0099 }
            q7.k4 r4 = r4.f13121a     // Catch:{ all -> 0x0099 }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ all -> 0x0099 }
            q7.f r4 = r4.C     // Catch:{ all -> 0x0099 }
            q7.a5 r2 = (q7.a5) r2     // Catch:{ all -> 0x0099 }
            q7.k4 r2 = r2.f13121a     // Catch:{ all -> 0x0099 }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x0099 }
            q7.k2 r2 = r2.q()     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = r2.n()     // Catch:{ all -> 0x0099 }
            q7.f2 r5 = q7.g2.O     // Catch:{ all -> 0x0099 }
            int r2 = r4.l(r2, r5)     // Catch:{ all -> 0x0099 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0099 }
            r0.set(r2)     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = r1.f13340c     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x00a2 }
            r0.notify()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a2 }
            return
        L_0x0099:
            r0 = move-exception
            java.lang.Object r2 = r1.f13340c     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x00a2 }
            r2.notify()     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a2 }
            throw r0
        L_0x00a5:
            java.lang.Object r0 = r1.f13339b
            r3 = r0
            q7.a5 r3 = (q7.a5) r3
            q7.k4 r0 = r3.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.i6 r0 = r0.G
            q7.x3.k(r0)
            com.google.android.gms.internal.measurement.hc r4 = com.google.android.gms.internal.measurement.hc.f5316b
            com.google.android.gms.internal.measurement.g5 r4 = r4.f5317a
            java.lang.Object r4 = r4.zza()
            com.google.android.gms.internal.measurement.ic r4 = (com.google.android.gms.internal.measurement.ic) r4
            r4.zza()
            q7.k4 r4 = r0.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.f r4 = r4.C
            q7.f2 r5 = q7.g2.f13052p0
            boolean r4 = r4.r(r2, r5)
            q7.k4 r0 = r0.f13121a
            if (r4 == 0) goto L_0x0126
            q7.x3 r0 = (q7.x3) r0
            q7.g3 r4 = r0.D
            q7.x3.j(r4)
            q7.h r4 = r4.o()
            q7.g r5 = q7.g.f13016c
            boolean r4 = r4.f(r5)
            if (r4 != 0) goto L_0x00f0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r4 = "Analytics storage consent denied; will not get session id"
            q7.q2 r0 = r0.G
            r0.b(r4)
            goto L_0x0134
        L_0x00f0:
            q7.g3 r4 = r0.D
            q7.x3.j(r4)
            ag.m r5 = r0.J
            r5.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            boolean r4 = r4.s(r5)
            if (r4 != 0) goto L_0x0134
            q7.g3 r4 = r0.D
            q7.x3.j(r4)
            q7.d3 r4 = r4.K
            long r4 = r4.a()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0116
            goto L_0x0134
        L_0x0116:
            q7.g3 r0 = r0.D
            q7.x3.j(r0)
            q7.d3 r0 = r0.K
            long r4 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L_0x0135
        L_0x0126:
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r4 = "getSessionId has been disabled."
            q7.q2 r0 = r0.G
            r0.b(r4)
        L_0x0134:
            r0 = r2
        L_0x0135:
            java.lang.Object r4 = r1.f13340c
            if (r0 == 0) goto L_0x014c
            q7.k4 r2 = r3.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.a7 r2 = r2.H
            q7.x3.j(r2)
            com.google.android.gms.internal.measurement.u0 r4 = (com.google.android.gms.internal.measurement.u0) r4
            long r5 = r0.longValue()
            r2.G(r4, r5)
            goto L_0x0163
        L_0x014c:
            com.google.android.gms.internal.measurement.u0 r4 = (com.google.android.gms.internal.measurement.u0) r4     // Catch:{ RemoteException -> 0x0152 }
            r4.q(r2)     // Catch:{ RemoteException -> 0x0152 }
            goto L_0x0163
        L_0x0152:
            r0 = move-exception
            q7.k4 r2 = r3.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r2 = r2.E
            q7.x3.l(r2)
            java.lang.String r3 = "getSessionId failed with exception"
            q7.q2 r2 = r2.B
            r2.c(r0, r3)
        L_0x0163:
            return
        L_0x0164:
            java.lang.String r0 = "app_id"
            java.lang.Object r2 = r1.f13339b
            q7.a5 r2 = (q7.a5) r2
            java.lang.Object r3 = r1.f13340c
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.i()
            r2.j()
            u6.q.i(r3)
            java.lang.String r4 = "name"
            java.lang.String r9 = r3.getString(r4)
            java.lang.String r4 = "origin"
            java.lang.String r4 = r3.getString(r4)
            u6.q.f(r9)
            u6.q.f(r4)
            java.lang.String r5 = "value"
            java.lang.Object r6 = r3.get(r5)
            u6.q.i(r6)
            q7.k4 r2 = r2.f13121a
            r14 = r2
            q7.x3 r14 = (q7.x3) r14
            boolean r6 = r14.g()
            if (r6 != 0) goto L_0x01ab
            q7.s2 r0 = r14.E
            q7.x3.l(r0)
            java.lang.String r2 = "Conditional property not set since app measurement is disabled"
            q7.q2 r0 = r0.J
            r0.b(r2)
            goto L_0x024e
        L_0x01ab:
            q7.w6 r17 = new q7.w6
            java.lang.String r6 = "triggered_timestamp"
            long r6 = r3.getLong(r6)
            java.lang.Object r8 = r3.get(r5)
            r5 = r17
            r10 = r4
            r5.<init>(r6, r8, r9, r10)
            r5 = r2
            q7.x3 r5 = (q7.x3) r5     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.a7 r10 = r5.H     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.x3.j(r10)     // Catch:{ IllegalArgumentException -> 0x024e }
            r3.getString(r0)     // Catch:{ IllegalArgumentException -> 0x024e }
            java.lang.String r5 = "triggered_event_name"
            java.lang.String r11 = r3.getString(r5)     // Catch:{ IllegalArgumentException -> 0x024e }
            java.lang.String r5 = "triggered_event_params"
            android.os.Bundle r12 = r3.getBundle(r5)     // Catch:{ IllegalArgumentException -> 0x024e }
            r5 = 0
            r16 = 1
            r13 = r4
            r7 = r14
            r14 = r5
            q7.s r21 = r10.q0(r11, r12, r13, r14, r16)     // Catch:{ IllegalArgumentException -> 0x024e }
            r5 = r2
            q7.x3 r5 = (q7.x3) r5     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.a7 r10 = r5.H     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.x3.j(r10)     // Catch:{ IllegalArgumentException -> 0x024e }
            r3.getString(r0)     // Catch:{ IllegalArgumentException -> 0x024e }
            java.lang.String r5 = "timed_out_event_name"
            java.lang.String r11 = r3.getString(r5)     // Catch:{ IllegalArgumentException -> 0x024e }
            java.lang.String r5 = "timed_out_event_params"
            android.os.Bundle r12 = r3.getBundle(r5)     // Catch:{ IllegalArgumentException -> 0x024e }
            r14 = 0
            r16 = 1
            r13 = r4
            q7.s r18 = r10.q0(r11, r12, r13, r14, r16)     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.a7 r10 = r2.H     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.x3.j(r10)     // Catch:{ IllegalArgumentException -> 0x024e }
            r3.getString(r0)     // Catch:{ IllegalArgumentException -> 0x024e }
            java.lang.String r2 = "expired_event_name"
            java.lang.String r11 = r3.getString(r2)     // Catch:{ IllegalArgumentException -> 0x024e }
            java.lang.String r2 = "expired_event_params"
            android.os.Bundle r12 = r3.getBundle(r2)     // Catch:{ IllegalArgumentException -> 0x024e }
            r14 = 0
            r16 = 1
            r13 = r4
            q7.s r24 = r10.q0(r11, r12, r13, r14, r16)     // Catch:{ IllegalArgumentException -> 0x024e }
            q7.c r2 = new q7.c
            java.lang.String r11 = r3.getString(r0)
            java.lang.String r0 = "creation_timestamp"
            long r14 = r3.getLong(r0)
            r16 = 0
            java.lang.String r0 = "trigger_event_name"
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r5 = "trigger_timeout"
            long r19 = r3.getLong(r5)
            java.lang.String r5 = "time_to_live"
            long r22 = r3.getLong(r5)
            r10 = r2
            r12 = r4
            r13 = r17
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r24)
            q7.x5 r0 = r7.u()
            r0.n(r2)
        L_0x024e:
            return
        L_0x024f:
            java.lang.Object r0 = r1.f13339b
            r2 = r0
            q7.w5 r2 = (q7.w5) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.f13339b     // Catch:{ all -> 0x0298 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0298 }
            r3 = 0
            r0.f13406a = r3     // Catch:{ all -> 0x0298 }
            java.lang.Object r0 = r1.f13339b     // Catch:{ all -> 0x0298 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0298 }
            q7.x5 r0 = r0.f13408c     // Catch:{ all -> 0x0298 }
            boolean r0 = r0.o()     // Catch:{ all -> 0x0298 }
            if (r0 != 0) goto L_0x0296
            java.lang.Object r0 = r1.f13339b     // Catch:{ all -> 0x0298 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0298 }
            q7.x5 r0 = r0.f13408c     // Catch:{ all -> 0x0298 }
            q7.k4 r0 = r0.f13121a     // Catch:{ all -> 0x0298 }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x0298 }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x0298 }
            q7.x3.l(r0)     // Catch:{ all -> 0x0298 }
            q7.q2 r0 = r0.I     // Catch:{ all -> 0x0298 }
            java.lang.String r3 = "Connected to remote service"
            r0.b(r3)     // Catch:{ all -> 0x0298 }
            java.lang.Object r0 = r1.f13339b     // Catch:{ all -> 0x0298 }
            q7.w5 r0 = (q7.w5) r0     // Catch:{ all -> 0x0298 }
            q7.x5 r0 = r0.f13408c     // Catch:{ all -> 0x0298 }
            java.lang.Object r3 = r1.f13340c     // Catch:{ all -> 0x0298 }
            q7.j2 r3 = (q7.j2) r3     // Catch:{ all -> 0x0298 }
            r0.i()     // Catch:{ all -> 0x0298 }
            u6.q.i(r3)     // Catch:{ all -> 0x0298 }
            r0.f13433d = r3     // Catch:{ all -> 0x0298 }
            r0.t()     // Catch:{ all -> 0x0298 }
            r0.s()     // Catch:{ all -> 0x0298 }
        L_0x0296:
            monitor-exit(r2)     // Catch:{ all -> 0x0298 }
            return
        L_0x0298:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0298 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t4.run():void");
    }
}

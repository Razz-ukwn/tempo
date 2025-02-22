package s6;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f14769a;

    public /* synthetic */ l(p pVar) {
        this.f14769a = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r4 = r0.f14779b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f14786c;
        r5.arg1 = r1.f14784a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.b());
        r4.putString("pkg", ((android.content.Context) r0.f14783f.f14790b).getPackageName());
        r4.putBundle("data", r1.f14787d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.f14780c;
        r3 = (android.os.Messenger) r1.f1058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        if (r3 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        r1 = (s6.h) r1.f1059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00aa, code lost:
        if (r1 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        r1 = r1.f14760a;
        r1.getClass();
        r1.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            s6.p r0 = r8.f14769a
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f14778a     // Catch:{ all -> 0x00c9 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            return
        L_0x000a:
            java.util.ArrayDeque r1 = r0.f14781d     // Catch:{ all -> 0x00c9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x0017
            r0.c()     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            return
        L_0x0017:
            java.util.ArrayDeque r1 = r0.f14781d     // Catch:{ all -> 0x00c9 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00c9 }
            s6.r r1 = (s6.r) r1     // Catch:{ all -> 0x00c9 }
            android.util.SparseArray<s6.r<?>> r3 = r0.f14782e     // Catch:{ all -> 0x00c9 }
            int r4 = r1.f14784a     // Catch:{ all -> 0x00c9 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00c9 }
            s6.u r3 = r0.f14783f     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f14791c     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch:{ all -> 0x00c9 }
            s6.o r4 = new s6.o     // Catch:{ all -> 0x00c9 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00c9 }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = r5.toString()
            android.util.Log.d(r3, r4)
        L_0x0062:
            s6.u r3 = r0.f14783f
            java.lang.Object r3 = r3.f14790b
            android.content.Context r3 = (android.content.Context) r3
            android.os.Messenger r4 = r0.f14779b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f14786c
            r5.what = r6
            int r6 = r1.f14784a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f14787d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            androidx.appcompat.widget.l r1 = r0.f14780c     // Catch:{ RemoteException -> 0x00b6 }
            java.lang.Object r3 = r1.f1058b     // Catch:{ RemoteException -> 0x00b6 }
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch:{ RemoteException -> 0x00b6 }
            if (r3 == 0) goto L_0x00a6
            r3.send(r5)     // Catch:{ RemoteException -> 0x00b6 }
            goto L_0x0002
        L_0x00a6:
            java.lang.Object r1 = r1.f1059c     // Catch:{ RemoteException -> 0x00b6 }
            s6.h r1 = (s6.h) r1     // Catch:{ RemoteException -> 0x00b6 }
            if (r1 == 0) goto L_0x00b8
            android.os.Messenger r1 = r1.f14760a     // Catch:{ RemoteException -> 0x00b6 }
            r1.getClass()     // Catch:{ RemoteException -> 0x00b6 }
            r1.send(r5)     // Catch:{ RemoteException -> 0x00b6 }
            goto L_0x0002
        L_0x00b6:
            r1 = move-exception
            goto L_0x00c0
        L_0x00b8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00b6 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00b6 }
            throw r1     // Catch:{ RemoteException -> 0x00b6 }
        L_0x00c0:
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x00c9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.l.run():void");
    }
}

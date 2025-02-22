package androidx.activity;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f595a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f596b;

    public /* synthetic */ l(Object obj, int i8) {
        this.f595a = i8;
        this.f596b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r3 != 2) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r4 = r0.f1869d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        if (r3 != 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3 = y1.k.f17122a;
        y1.k.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r1 = r0.f1868c;
        r3 = r0.f1866a;
        r1.getClass();
        r1 = v1.h.f16128a.b(r3, new z1.l[]{r2}, 0);
        r2 = v1.o.e(r0.f1866a, r2.f17652a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r2 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r1 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        y1.k.a.a("EmojiCompat.MetadataRepo.create");
        r3 = new androidx.emoji2.text.o(r1, androidx.emoji2.text.n.a(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        y1.k.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        y1.k.a.b();
        r1 = r0.f1869d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2 = r0.f1873h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        if (r2 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0070, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r2 = y1.k.f17122a;
        y1.k.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0076, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2 = y1.k.f17122a;
        y1.k.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0085, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009c, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r3 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
        monitor-enter(r0.f1869d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r2 = r0.f1873h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a3, code lost:
        if (r2 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a5, code lost:
        r2.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a9, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = r0.d();
        r3 = r2.f17656e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f596b
            androidx.emoji2.text.m$b r0 = (androidx.emoji2.text.m.b) r0
            java.lang.String r1 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r0.f1869d
            monitor-enter(r2)
            androidx.emoji2.text.f$i r3 = r0.f1873h     // Catch:{ all -> 0x00b0 }
            if (r3 != 0) goto L_0x0010
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x00ac
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            z1.l r2 = r0.d()     // Catch:{ all -> 0x009d }
            int r3 = r2.f17656e     // Catch:{ all -> 0x009d }
            r4 = 2
            if (r3 != r4) goto L_0x0022
            java.lang.Object r4 = r0.f1869d     // Catch:{ all -> 0x009d }
            monitor-enter(r4)     // Catch:{ all -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            goto L_0x0022
        L_0x001f:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x009d }
        L_0x0022:
            if (r3 != 0) goto L_0x0086
            java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = y1.k.f17122a     // Catch:{ all -> 0x007f }
            y1.k.a.a(r1)     // Catch:{ all -> 0x007f }
            androidx.emoji2.text.m$a r1 = r0.f1868c     // Catch:{ all -> 0x007f }
            android.content.Context r3 = r0.f1866a     // Catch:{ all -> 0x007f }
            r1.getClass()     // Catch:{ all -> 0x007f }
            r1 = 1
            z1.l[] r1 = new z1.l[r1]     // Catch:{ all -> 0x007f }
            r4 = 0
            r1[r4] = r2     // Catch:{ all -> 0x007f }
            v1.n r5 = v1.h.f16128a     // Catch:{ all -> 0x007f }
            android.graphics.Typeface r1 = r5.b(r3, r1, r4)     // Catch:{ all -> 0x007f }
            android.content.Context r3 = r0.f1866a     // Catch:{ all -> 0x007f }
            android.net.Uri r2 = r2.f17652a     // Catch:{ all -> 0x007f }
            java.nio.MappedByteBuffer r2 = v1.o.e(r3, r2)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0077
            if (r1 == 0) goto L_0x0077
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            y1.k.a.a(r3)     // Catch:{ all -> 0x0070 }
            androidx.emoji2.text.o r3 = new androidx.emoji2.text.o     // Catch:{ all -> 0x0070 }
            q2.b r2 = androidx.emoji2.text.n.a(r2)     // Catch:{ all -> 0x0070 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0070 }
            y1.k.a.b()     // Catch:{ all -> 0x007f }
            y1.k.a.b()     // Catch:{ all -> 0x009d }
            java.lang.Object r1 = r0.f1869d     // Catch:{ all -> 0x009d }
            monitor-enter(r1)     // Catch:{ all -> 0x009d }
            androidx.emoji2.text.f$i r2 = r0.f1873h     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0068
            r2.b(r3)     // Catch:{ all -> 0x006d }
        L_0x0068:
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            r0.b()     // Catch:{ all -> 0x009d }
            goto L_0x00ac
        L_0x006d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            throw r2     // Catch:{ all -> 0x009d }
        L_0x0070:
            r1 = move-exception
            int r2 = y1.k.f17122a     // Catch:{ all -> 0x007f }
            y1.k.a.b()     // Catch:{ all -> 0x007f }
            throw r1     // Catch:{ all -> 0x007f }
        L_0x0077:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x007f }
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1 = move-exception
            int r2 = y1.k.f17122a     // Catch:{ all -> 0x009d }
            y1.k.a.b()     // Catch:{ all -> 0x009d }
            throw r1     // Catch:{ all -> 0x009d }
        L_0x0086:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            r4.<init>(r1)     // Catch:{ all -> 0x009d }
            r4.append(r3)     // Catch:{ all -> 0x009d }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x009d }
            r2.<init>(r1)     // Catch:{ all -> 0x009d }
            throw r2     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            java.lang.Object r3 = r0.f1869d
            monitor-enter(r3)
            androidx.emoji2.text.f$i r2 = r0.f1873h     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x00a8
            r2.a(r1)     // Catch:{ all -> 0x00ad }
        L_0x00a8:
            monitor-exit(r3)     // Catch:{ all -> 0x00ad }
            r0.b()
        L_0x00ac:
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ad }
            throw r0
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.l.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        if (r5 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = "this$0"
            java.lang.Object r1 = r8.f596b
            int r2 = r8.f595a
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r2) {
                case 1: goto L_0x005c;
                case 2: goto L_0x0056;
                case 3: goto L_0x004b;
                case 4: goto L_0x0047;
                case 5: goto L_0x001b;
                case 6: goto L_0x0014;
                case 7: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x00e2
        L_0x000e:
            i3.o r1 = (i3.o) r1
            sf.j.f(r1, r0)
            throw r5
        L_0x0014:
            androidx.activity.f.d(r1)
            sf.j.f(r5, r0)
            throw r5
        L_0x001b:
            i3.m r1 = (i3.m) r1
            sf.j.f(r1, r0)
            i3.j r0 = r1.f9496f     // Catch:{ RemoteException -> 0x003e }
            if (r0 == 0) goto L_0x0046
            i3.m$b r2 = r1.f9497g     // Catch:{ RemoteException -> 0x003e }
            java.lang.String r3 = r1.f9491a     // Catch:{ RemoteException -> 0x003e }
            int r0 = r0.i(r2, r3)     // Catch:{ RemoteException -> 0x003e }
            r1.f9494d = r0     // Catch:{ RemoteException -> 0x003e }
            i3.k r0 = r1.f9492b     // Catch:{ RemoteException -> 0x003e }
            i3.k$c r1 = r1.f9495e     // Catch:{ RemoteException -> 0x003e }
            if (r1 == 0) goto L_0x0038
            r0.a(r1)     // Catch:{ RemoteException -> 0x003e }
            goto L_0x0046
        L_0x0038:
            java.lang.String r0 = "observer"
            sf.j.l(r0)     // Catch:{ RemoteException -> 0x003e }
            throw r5     // Catch:{ RemoteException -> 0x003e }
        L_0x003e:
            r0 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r2 = "Cannot register multi-instance invalidation callback"
            android.util.Log.w(r1, r2, r0)
        L_0x0046:
            return
        L_0x0047:
            r8.a()
            return
        L_0x004b:
            rf.a r1 = (rf.a) r1
            java.lang.String r0 = "$tmp0"
            sf.j.f(r1, r0)
            r1.d()
            return
        L_0x0056:
            androidx.appcompat.widget.o1 r1 = (androidx.appcompat.widget.o1) r1
            r1.b(r3)
            return
        L_0x005c:
            android.content.Context r1 = (android.content.Context) r1
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L_0x00df
            e.r$a r0 = e.e.f7616a
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r2 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r2)
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            int r2 = r2.getComponentEnabledSetting(r0)
            if (r2 == r4) goto L_0x00df
            boolean r2 = y1.a.a()
            java.lang.String r3 = "locale"
            if (r2 == 0) goto L_0x00b8
            o.b<java.lang.ref.WeakReference<e.e>> r2 = e.e.C
            r2.getClass()
            o.b$a r6 = new o.b$a
            r6.<init>()
        L_0x0089:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r6.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            e.e r2 = (e.e) r2
            if (r2 == 0) goto L_0x0089
            android.content.Context r2 = r2.f()
            if (r2 == 0) goto L_0x0089
            java.lang.Object r5 = r2.getSystemService(r3)
        L_0x00a7:
            if (r5 == 0) goto L_0x00bd
            android.os.LocaleList r2 = e.e.b.a(r5)
            y1.h r5 = new y1.h
            y1.j r6 = new y1.j
            r6.<init>(r2)
            r5.<init>(r6)
            goto L_0x00bf
        L_0x00b8:
            y1.h r5 = e.e.f7618c
            if (r5 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            y1.h r5 = y1.h.f17118b
        L_0x00bf:
            y1.i r2 = r5.f17119a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00d8
            java.lang.String r2 = e.r.b(r1)
            java.lang.Object r3 = r1.getSystemService(r3)
            if (r3 == 0) goto L_0x00d8
            android.os.LocaleList r2 = e.e.a.a(r2)
            e.e.b.b(r3, r2)
        L_0x00d8:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r4, r4)
        L_0x00df:
            e.e.B = r4
            return
        L_0x00e2:
            com.google.firebase.messaging.FirebaseMessaging r1 = (com.google.firebase.messaging.FirebaseMessaging) r1
            android.content.Context r0 = r1.f6334d
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 != 0) goto L_0x00ed
            r1 = r0
        L_0x00ed:
            java.lang.String r2 = "com.google.firebase.messaging"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "proxy_notification_initialized"
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L_0x00fc
            goto L_0x0143
        L_0x00fc:
            java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r2 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0125 }
            android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0125 }
            if (r6 == 0) goto L_0x0125
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0125 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r6.getApplicationInfo(r2, r7)     // Catch:{ NameNotFoundException -> 0x0125 }
            if (r2 == 0) goto L_0x0125
            android.os.Bundle r6 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0125 }
            if (r6 == 0) goto L_0x0125
            boolean r6 = r6.containsKey(r1)     // Catch:{ NameNotFoundException -> 0x0125 }
            if (r6 == 0) goto L_0x0125
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0125 }
            boolean r1 = r2.getBoolean(r1)     // Catch:{ NameNotFoundException -> 0x0125 }
            goto L_0x0126
        L_0x0125:
            r1 = r4
        L_0x0126:
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r2 < r6) goto L_0x012d
            r3 = r4
        L_0x012d:
            if (r3 != 0) goto L_0x0133
            com.google.android.gms.tasks.Tasks.forResult(r5)
            goto L_0x0143
        L_0x0133:
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            wa.u r3 = new wa.u
            r3.<init>(r0, r1, r2)
            r3.run()
            r2.getTask()
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.l.run():void");
    }
}

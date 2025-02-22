package v9;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import t9.e;

public final /* synthetic */ class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsRegistrar f16345a;

    public /* synthetic */ c(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f16345a = crashlyticsRegistrar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x04d1 A[Catch:{ Exception -> 0x04f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a9 A[Catch:{ NameNotFoundException -> 0x0524 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0278 A[LOOP:3: B:48:0x0272->B:50:0x0278, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(t9.v r41) {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = r1.f16345a
            r2.getClass()
            java.lang.Class<m9.f> r2 = m9.f.class
            java.lang.Object r2 = r0.a(r2)
            m9.f r2 = (m9.f) r2
            java.lang.Class<w9.a> r3 = w9.a.class
            qa.a r3 = r0.h(r3)
            java.lang.Class<o9.a> r4 = o9.a.class
            qa.a r4 = r0.h(r4)
            java.lang.Class<ra.f> r5 = ra.f.class
            java.lang.Object r0 = r0.a(r5)
            ra.f r0 = (ra.f) r0
            r2.a()
            android.content.Context r12 = r2.f11331a
            java.lang.String r5 = r12.getPackageName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Initializing Firebase Crashlytics 18.3.6 for "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r13 = "FirebaseCrashlytics"
            r7 = 0
            android.util.Log.i(r13, r6, r7)
            ea.e r14 = new ea.e
            r14.<init>(r12)
            z9.c0 r15 = new z9.c0
            r15.<init>(r2)
            z9.g0 r11 = new z9.g0
            r11.<init>(r12, r5, r0, r15)
            w9.b r6 = new w9.b
            r6.<init>(r3)
            v9.a r0 = new v9.a
            r0.<init>(r4)
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r16 = z9.f0.a(r3)
            z9.x r10 = new z9.x
            j0.m r8 = new j0.m
            r3 = 5
            r8.<init>(r0, r3)
            j0.n r9 = new j0.n
            r3 = 4
            r9.<init>(r0, r3)
            r3 = r10
            r4 = r2
            r5 = r11
            r7 = r15
            r1 = r10
            r10 = r14
            r0 = r11
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.a()
            m9.i r2 = r2.f11333c
            java.lang.String r2 = r2.f11344b
            java.lang.String r5 = z9.f.e(r12)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r3 = "com.google.firebase.crashlytics.build_ids_lib"
            java.lang.String r4 = "array"
            int r3 = z9.f.f(r12, r3, r4)
            java.lang.String r7 = "com.google.firebase.crashlytics.build_ids_arch"
            int r7 = z9.f.f(r12, r7, r4)
            java.lang.String r8 = "com.google.firebase.crashlytics.build_ids_build_id"
            int r4 = z9.f.f(r12, r8, r4)
            if (r3 == 0) goto L_0x0118
            if (r7 == 0) goto L_0x0118
            if (r4 != 0) goto L_0x00a7
            goto L_0x0118
        L_0x00a7:
            android.content.res.Resources r9 = r12.getResources()
            java.lang.String[] r3 = r9.getStringArray(r3)
            android.content.res.Resources r9 = r12.getResources()
            java.lang.String[] r7 = r9.getStringArray(r7)
            android.content.res.Resources r9 = r12.getResources()
            java.lang.String[] r4 = r9.getStringArray(r4)
            int r9 = r3.length
            int r10 = r4.length
            if (r9 != r10) goto L_0x00e5
            int r9 = r7.length
            int r10 = r4.length
            if (r9 == r10) goto L_0x00c8
            goto L_0x00e5
        L_0x00c8:
            r9 = 0
        L_0x00c9:
            int r10 = r4.length
            if (r9 >= r10) goto L_0x00e1
            z9.d r10 = new z9.d
            r11 = r3[r9]
            r8 = r7[r9]
            r26 = r1
            r1 = r4[r9]
            r10.<init>(r11, r8, r1)
            r6.add(r10)
            int r9 = r9 + 1
            r1 = r26
            goto L_0x00c9
        L_0x00e1:
            r26 = r1
            r3 = 3
            goto L_0x0145
        L_0x00e5:
            r26 = r1
            r1 = 3
            java.lang.Object[] r8 = new java.lang.Object[r1]
            int r1 = r3.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r8[r3] = r1
            int r1 = r7.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r8[r3] = r1
            int r1 = r4.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r8[r3] = r1
            java.lang.String r1 = "Lengths did not match: %d %d %d"
            java.lang.String r1 = java.lang.String.format(r1, r8)
            r8 = 3
            boolean r3 = android.util.Log.isLoggable(r13, r8)
            if (r3 == 0) goto L_0x0116
            r3 = 0
            android.util.Log.d(r13, r1, r3)
            r1 = r3
            r3 = r8
            goto L_0x0146
        L_0x0116:
            r3 = r8
            goto L_0x0145
        L_0x0118:
            r26 = r1
            r8 = 3
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 0
            r1[r8] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r1[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "Could not find resources: %d %d %d"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r3 = 3
            boolean r4 = android.util.Log.isLoggable(r13, r3)
            if (r4 == 0) goto L_0x0145
            r4 = 0
            android.util.Log.d(r13, r1, r4)
            r1 = r4
            goto L_0x0146
        L_0x0145:
            r1 = 0
        L_0x0146:
            java.lang.String r4 = "Mapping file ID is: "
            java.lang.String r4 = j0.t.a(r4, r5)
            boolean r7 = android.util.Log.isLoggable(r13, r3)
            if (r7 == 0) goto L_0x0155
            android.util.Log.d(r13, r4, r1)
        L_0x0155:
            java.util.Iterator r1 = r6.iterator()
        L_0x0159:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0189
            java.lang.Object r4 = r1.next()
            z9.d r4 = (z9.d) r4
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r3 = r4.f17810a
            r8 = 0
            r7[r8] = r3
            java.lang.String r3 = r4.f17811b
            r8 = 1
            r7[r8] = r3
            java.lang.String r3 = r4.f17812c
            r4 = 2
            r7[r4] = r3
            java.lang.String r3 = "Build id for %s on %s: %s"
            java.lang.String r3 = java.lang.String.format(r3, r7)
            r4 = 3
            boolean r7 = android.util.Log.isLoggable(r13, r4)
            if (r7 == 0) goto L_0x0187
            r7 = 0
            android.util.Log.d(r13, r3, r7)
        L_0x0187:
            r3 = r4
            goto L_0x0159
        L_0x0189:
            w9.c r11 = new w9.c
            r11.<init>(r12)
            java.lang.String r8 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x0524 }
            java.lang.String r10 = r0.d()     // Catch:{ NameNotFoundException -> 0x0524 }
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0524 }
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r8, r4)     // Catch:{ NameNotFoundException -> 0x0524 }
            int r4 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0524 }
            java.lang.String r24 = java.lang.Integer.toString(r4)     // Catch:{ NameNotFoundException -> 0x0524 }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x0524 }
            if (r3 != 0) goto L_0x01ab
            java.lang.String r3 = "0.0"
        L_0x01ab:
            r23 = r3
            z9.a r9 = new z9.a     // Catch:{ NameNotFoundException -> 0x0524 }
            r3 = r9
            r4 = r2
            r7 = r10
            r39 = r9
            r9 = r24
            r1 = r10
            r10 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NameNotFoundException -> 0x0524 }
            java.lang.String r3 = "Installer package name is: "
            java.lang.String r1 = j0.t.a(r3, r1)
            r3 = 2
            boolean r4 = android.util.Log.isLoggable(r13, r3)
            if (r4 == 0) goto L_0x01cd
            r3 = 0
            android.util.Log.v(r13, r1, r3)
        L_0x01cd:
            java.lang.String r1 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r1 = z9.f0.a(r1)
            ag.i0 r3 = new ag.i0
            r3.<init>()
            java.lang.String r4 = r0.d()
            cb.c r8 = new cb.c
            r8.<init>()
            e.s r9 = new e.s
            r9.<init>((java.lang.Object) r8)
            androidx.lifecycle.u r10 = new androidx.lifecycle.u
            r10.<init>((ea.e) r14)
            java.util.Locale r5 = java.util.Locale.US
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r2
            java.lang.String r7 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r6 = java.lang.String.format(r5, r7, r6)
            com.google.android.gms.internal.firebase-auth-api.vh r11 = new com.google.android.gms.internal.firebase-auth-api.vh
            r11.<init>(r6, r3)
            r3 = 2
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r7 = z9.g0.f17833h
            java.lang.String r14 = ""
            java.lang.String r3 = r3.replaceAll(r7, r14)
            r14 = 0
            r6[r14] = r3
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r14 = ""
            java.lang.String r3 = r3.replaceAll(r7, r14)
            r14 = 1
            r6[r14] = r3
            java.lang.String r3 = "%s/%s"
            java.lang.String r18 = java.lang.String.format(r5, r3, r6)
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r5 = ""
            java.lang.String r19 = r3.replaceAll(r7, r5)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = ""
            java.lang.String r20 = r3.replaceAll(r7, r5)
            r3 = 4
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r6 = z9.f.e(r12)
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r2
            r6 = 2
            r5[r6] = r23
            r6 = 3
            r5[r6] = r24
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0247:
            java.lang.String r14 = ""
            if (r7 >= r3) goto L_0x0266
            r3 = r5[r7]
            r16 = r5
            if (r3 == 0) goto L_0x0260
            java.lang.String r5 = "-"
            java.lang.String r3 = r3.replace(r5, r14)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r5)
            r6.add(r3)
        L_0x0260:
            int r7 = r7 + 1
            r3 = 4
            r5 = r16
            goto L_0x0247
        L_0x0266:
            java.util.Collections.sort(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r5 = r6.iterator()
        L_0x0272:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0282
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r3.append(r6)
            goto L_0x0272
        L_0x0282:
            java.lang.String r3 = r3.toString()
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x0291
            java.lang.String r3 = z9.f.k(r3)
            goto L_0x0292
        L_0x0291:
            r3 = 0
        L_0x0292:
            r22 = r3
            if (r4 == 0) goto L_0x0298
            r3 = 4
            goto L_0x0299
        L_0x0298:
            r3 = 1
        L_0x0299:
            int r25 = j0.e.f(r3)
            ga.g r7 = new ga.g
            r16 = r7
            r17 = r2
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            ga.d r2 = new ga.d
            r5 = r2
            r6 = r12
            r12 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r0 = r2.f8910a
            java.lang.String r3 = "com.google.firebase.crashlytics"
            r4 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r4)
            java.lang.String r3 = "existing_instance_identifier"
            java.lang.String r0 = r0.getString(r3, r14)
            ga.g r3 = r2.f8911b
            java.lang.String r3 = r3.f8924f
            boolean r0 = r0.equals(r3)
            r3 = 1
            r0 = r0 ^ r3
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<ga.b>> r4 = r2.f8918i
            java.util.concurrent.atomic.AtomicReference<ga.b> r5 = r2.f8917h
            if (r0 != 0) goto L_0x02e7
            ga.b r0 = r2.a(r3)
            if (r0 == 0) goto L_0x02e7
            r5.set(r0)
            java.lang.Object r3 = r4.get()
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3
            r3.trySetResult(r0)
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            goto L_0x032b
        L_0x02e7:
            r0 = 3
            ga.b r0 = r2.a(r0)
            if (r0 == 0) goto L_0x02fa
            r5.set(r0)
            java.lang.Object r3 = r4.get()
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3
            r3.trySetResult(r0)
        L_0x02fa:
            z9.c0 r0 = r2.f8916g
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r3 = r0.f17809h
            com.google.android.gms.tasks.Task r3 = r3.getTask()
            java.lang.Object r4 = r0.f17804c
            monitor-enter(r4)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f17805d     // Catch:{ all -> 0x0521 }
            com.google.android.gms.tasks.Task r0 = r0.getTask()     // Catch:{ all -> 0x0521 }
            monitor-exit(r4)     // Catch:{ all -> 0x0521 }
            java.util.concurrent.ExecutorService r4 = z9.j0.f17848a
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource
            r4.<init>()
            j0.q r5 = new j0.q
            r5.<init>(r4)
            r3.continueWith(r1, r5)
            r0.continueWith(r1, r5)
            com.google.android.gms.tasks.Task r0 = r4.getTask()
            ga.c r3 = new ga.c
            r3.<init>(r2)
            com.google.android.gms.tasks.Task r0 = r0.onSuccessTask(r1, r3)
        L_0x032b:
            cb.c r3 = new cb.c
            r3.<init>()
            r0.continueWith(r1, r3)
            r3 = r26
            z9.g r0 = r3.m
            ea.e r4 = r3.f17903i
            android.content.Context r5 = r3.f17895a
            if (r5 == 0) goto L_0x0363
            android.content.res.Resources r6 = r5.getResources()
            if (r6 == 0) goto L_0x0363
            java.lang.String r7 = "bool"
            java.lang.String r8 = "com.crashlytics.RequireBuildId"
            int r7 = z9.f.f(r5, r8, r7)
            if (r7 <= 0) goto L_0x0352
            boolean r6 = r6.getBoolean(r7)
            goto L_0x0364
        L_0x0352:
            java.lang.String r6 = "string"
            int r6 = z9.f.f(r5, r8, r6)
            if (r6 <= 0) goto L_0x0363
            java.lang.String r6 = r5.getString(r6)
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            goto L_0x0364
        L_0x0363:
            r6 = 1
        L_0x0364:
            java.lang.String r7 = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"
            if (r6 != 0) goto L_0x0378
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r13, r6)
            if (r6 == 0) goto L_0x0375
            java.lang.String r6 = "Configured not to require a build ID."
            r8 = 0
            android.util.Log.v(r13, r6, r8)
        L_0x0375:
            r6 = r39
            goto L_0x0382
        L_0x0378:
            r6 = r39
            java.lang.String r8 = r6.f17787b
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0384
        L_0x0382:
            r8 = 1
            goto L_0x03d4
        L_0x0384:
            java.lang.String r8 = "."
            android.util.Log.e(r13, r8)
            java.lang.String r9 = ".     |  | "
            android.util.Log.e(r13, r9)
            java.lang.String r9 = ".     |  |"
            android.util.Log.e(r13, r9)
            android.util.Log.e(r13, r9)
            java.lang.String r10 = ".   \\ |  | /"
            android.util.Log.e(r13, r10)
            java.lang.String r10 = ".    \\    /"
            android.util.Log.e(r13, r10)
            java.lang.String r10 = ".     \\  /"
            android.util.Log.e(r13, r10)
            java.lang.String r10 = ".      \\/"
            android.util.Log.e(r13, r10)
            android.util.Log.e(r13, r8)
            android.util.Log.e(r13, r7)
            android.util.Log.e(r13, r8)
            java.lang.String r10 = ".      /\\"
            android.util.Log.e(r13, r10)
            java.lang.String r10 = ".     /  \\"
            android.util.Log.e(r13, r10)
            java.lang.String r10 = ".    /    \\"
            android.util.Log.e(r13, r10)
            java.lang.String r10 = ".   / |  | \\"
            android.util.Log.e(r13, r10)
            android.util.Log.e(r13, r9)
            android.util.Log.e(r13, r9)
            android.util.Log.e(r13, r9)
            android.util.Log.e(r13, r8)
            r8 = 0
        L_0x03d4:
            if (r8 == 0) goto L_0x051b
            z9.e r7 = new z9.e
            z9.g0 r8 = r3.f17902h
            r7.<init>(r8)
            java.lang.String r7 = z9.e.f17817b
            t.w2 r8 = new t.w2     // Catch:{ Exception -> 0x04fe }
            java.lang.String r9 = "crash_marker"
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r4)     // Catch:{ Exception -> 0x04fe }
            r3.f17900f = r8     // Catch:{ Exception -> 0x04fe }
            t.w2 r8 = new t.w2     // Catch:{ Exception -> 0x04fe }
            java.lang.String r9 = "initialization_marker"
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r4)     // Catch:{ Exception -> 0x04fe }
            r3.f17899e = r8     // Catch:{ Exception -> 0x04fe }
            aa.g r32 = new aa.g     // Catch:{ Exception -> 0x04fe }
            r32.<init>()     // Catch:{ Exception -> 0x04fe }
            aa.c r8 = new aa.c     // Catch:{ Exception -> 0x04fe }
            r8.<init>(r4)     // Catch:{ Exception -> 0x04fe }
            ha.a r4 = new ha.a     // Catch:{ Exception -> 0x04fe }
            r9 = 1
            ha.c[] r9 = new ha.c[r9]     // Catch:{ Exception -> 0x04fe }
            d2.f1 r10 = new d2.f1     // Catch:{ Exception -> 0x04fe }
            r10.<init>()     // Catch:{ Exception -> 0x04fe }
            r11 = 0
            r9[r11] = r10     // Catch:{ Exception -> 0x04fe }
            r4.<init>(r9)     // Catch:{ Exception -> 0x04fe }
            android.content.Context r9 = r3.f17895a     // Catch:{ Exception -> 0x04fe }
            z9.g0 r10 = r3.f17902h     // Catch:{ Exception -> 0x04fe }
            ea.e r11 = r3.f17903i     // Catch:{ Exception -> 0x04fe }
            k7.g r12 = r3.f17897c     // Catch:{ Exception -> 0x04fe }
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r6
            r31 = r8
            r33 = r4
            r34 = r2
            r35 = r12
            z9.i0 r36 = z9.i0.b(r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x04fe }
            z9.p r4 = new z9.p     // Catch:{ Exception -> 0x04fe }
            android.content.Context r9 = r3.f17895a     // Catch:{ Exception -> 0x04fe }
            z9.g r10 = r3.m     // Catch:{ Exception -> 0x04fe }
            z9.g0 r11 = r3.f17902h     // Catch:{ Exception -> 0x04fe }
            z9.c0 r12 = r3.f17896b     // Catch:{ Exception -> 0x04fe }
            ea.e r14 = r3.f17903i     // Catch:{ Exception -> 0x04fe }
            t.w2 r15 = r3.f17900f     // Catch:{ Exception -> 0x04fe }
            r41 = r1
            w9.a r1 = r3.f17907n     // Catch:{ Exception -> 0x04fb }
            r16 = r13
            x9.a r13 = r3.f17905k     // Catch:{ Exception -> 0x04f7 }
            r27 = r4
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r14
            r33 = r15
            r34 = r6
            r35 = r8
            r37 = r1
            r38 = r13
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ Exception -> 0x04f7 }
            r3.f17901g = r4     // Catch:{ Exception -> 0x04f7 }
            t.w2 r1 = r3.f17899e     // Catch:{ Exception -> 0x04f7 }
            java.lang.Object r4 = r1.f15269b     // Catch:{ Exception -> 0x04f7 }
            ea.e r4 = (ea.e) r4     // Catch:{ Exception -> 0x04f7 }
            java.lang.Object r1 = r1.f15268a     // Catch:{ Exception -> 0x04f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04f7 }
            r4.getClass()     // Catch:{ Exception -> 0x04f7 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x04f7 }
            java.io.File r4 = r4.f7904b     // Catch:{ Exception -> 0x04f7 }
            r6.<init>(r4, r1)     // Catch:{ Exception -> 0x04f7 }
            boolean r1 = r6.exists()     // Catch:{ Exception -> 0x04f7 }
            z9.y r4 = new z9.y     // Catch:{ Exception -> 0x04f7 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x04f7 }
            com.google.android.gms.tasks.Task r0 = r0.a(r4)     // Catch:{ Exception -> 0x04f7 }
            java.lang.Object r0 = z9.j0.a(r0)     // Catch:{ Exception -> 0x0484 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0484 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x04f7 }
            r4.equals(r0)     // Catch:{ Exception -> 0x04f7 }
        L_0x0484:
            z9.p r0 = r3.f17901g     // Catch:{ Exception -> 0x04f7 }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x04f7 }
            r0.getClass()     // Catch:{ Exception -> 0x04f7 }
            z9.s r6 = new z9.s     // Catch:{ Exception -> 0x04f7 }
            r6.<init>(r0, r7)     // Catch:{ Exception -> 0x04f7 }
            z9.g r7 = r0.f17866d     // Catch:{ Exception -> 0x04f7 }
            r7.a(r6)     // Catch:{ Exception -> 0x04f7 }
            z9.k r6 = new z9.k     // Catch:{ Exception -> 0x04f7 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x04f7 }
            z9.b0 r7 = new z9.b0     // Catch:{ Exception -> 0x04f7 }
            w9.a r8 = r0.f17871i     // Catch:{ Exception -> 0x04f7 }
            r7.<init>(r6, r2, r4, r8)     // Catch:{ Exception -> 0x04f7 }
            r0.f17874l = r7     // Catch:{ Exception -> 0x04f7 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r7)     // Catch:{ Exception -> 0x04f7 }
            if (r1 == 0) goto L_0x04e6
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r5.checkCallingOrSelfPermission(r0)     // Catch:{ Exception -> 0x04f7 }
            if (r0 != 0) goto L_0x04b4
            r0 = 1
            goto L_0x04b5
        L_0x04b4:
            r0 = 0
        L_0x04b5:
            if (r0 == 0) goto L_0x04ce
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch:{ Exception -> 0x04f7 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x04f7 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x04f7 }
            if (r0 == 0) goto L_0x04cc
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ Exception -> 0x04f7 }
            if (r0 == 0) goto L_0x04cc
            goto L_0x04ce
        L_0x04cc:
            r0 = 0
            goto L_0x04cf
        L_0x04ce:
            r0 = 1
        L_0x04cf:
            if (r0 == 0) goto L_0x04e6
            java.lang.String r0 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r1 = 3
            r5 = r16
            boolean r1 = android.util.Log.isLoggable(r5, r1)     // Catch:{ Exception -> 0x04e4 }
            if (r1 == 0) goto L_0x04e0
            r1 = 0
            android.util.Log.d(r5, r0, r1)     // Catch:{ Exception -> 0x04e4 }
        L_0x04e0:
            r3.b(r2)     // Catch:{ Exception -> 0x04e4 }
            goto L_0x050a
        L_0x04e4:
            r0 = move-exception
            goto L_0x0502
        L_0x04e6:
            r5 = r16
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r0)
            if (r0 == 0) goto L_0x04f5
            java.lang.String r0 = "Successfully configured exception handler."
            r1 = 0
            android.util.Log.d(r5, r0, r1)
        L_0x04f5:
            r0 = 1
            goto L_0x050b
        L_0x04f7:
            r0 = move-exception
            r5 = r16
            goto L_0x0502
        L_0x04fb:
            r0 = move-exception
        L_0x04fc:
            r5 = r13
            goto L_0x0502
        L_0x04fe:
            r0 = move-exception
            r41 = r1
            goto L_0x04fc
        L_0x0502:
            java.lang.String r1 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r5, r1, r0)
            r0 = 0
            r3.f17901g = r0
        L_0x050a:
            r0 = 0
        L_0x050b:
            v9.d r1 = new v9.d
            r1.<init>(r0, r3, r2)
            r2 = r41
            com.google.android.gms.tasks.Tasks.call(r2, r1)
            v9.e r0 = new v9.e
            r0.<init>(r3)
            goto L_0x052d
        L_0x051b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0521:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0521 }
            throw r0
        L_0x0524:
            r0 = move-exception
            r5 = r13
            r1 = 0
            java.lang.String r2 = "Error retrieving app package info."
            android.util.Log.e(r5, r2, r0)
            r0 = r1
        L_0x052d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.c.e(t9.v):java.lang.Object");
    }
}

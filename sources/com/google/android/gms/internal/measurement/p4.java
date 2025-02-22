package com.google.android.gms.internal.measurement;

public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile c5 f5460a = b5.f5163a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5461b = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r0, r5)
            return r1
        L_0x001d:
            com.google.android.gms.internal.measurement.c5 r6 = f5460a
            boolean r6 = r6.b()
            if (r6 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.c5 r5 = f5460a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0032:
            java.lang.Object r6 = f5461b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.c5 r0 = f5460a     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.measurement.c5 r5 = f5460a     // Catch:{ all -> 0x00a1 }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x00a1 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00a1 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a1 }
            return r5
        L_0x004b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x0077
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a1 }
            r4 = 29
            if (r3 >= r4) goto L_0x0065
            r3 = r1
            goto L_0x0067
        L_0x0065:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0067:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x00a1 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0088
        L_0x0077:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0088 }
            int r5 = r5.flags     // Catch:{ all -> 0x00a1 }
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.measurement.e5 r0 = new com.google.android.gms.internal.measurement.e5     // Catch:{ all -> 0x00a1 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a1 }
            f5460a = r0     // Catch:{ all -> 0x00a1 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.measurement.c5 r5 = f5460a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x00a1:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a1 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p4.a(android.content.Context, android.net.Uri):boolean");
    }
}

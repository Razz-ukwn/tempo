package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q2.d;

public abstract class z4 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f5617f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static volatile i4 f5618g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f5619h = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final w4 f5620a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5621b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5622c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f5623d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f5624e;

    static {
        new AtomicReference();
        new d((Object) null);
    }

    public /* synthetic */ z4(w4 w4Var, String str, Object obj) {
        if (w4Var.f5567a != null) {
            this.f5620a = w4Var;
            this.f5621b = str;
            this.f5622c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract Object a(String str);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dc A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ed A[Catch:{ all -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f5619h
            int r0 = r0.get()
            int r1 = r8.f5623d
            if (r1 >= r0) goto L_0x00f7
            monitor-enter(r8)
            int r1 = r8.f5623d     // Catch:{ all -> 0x008b }
            if (r1 >= r0) goto L_0x00f3
            com.google.android.gms.internal.measurement.i4 r1 = f5618g     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.b5 r2 = com.google.android.gms.internal.measurement.b5.f5163a     // Catch:{ all -> 0x008b }
            r3 = 0
            if (r1 == 0) goto L_0x0051
            com.google.android.gms.internal.measurement.g5 r2 = r1.f5323b     // Catch:{ all -> 0x008b }
            java.lang.Object r2 = r2.zza()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.c5 r2 = (com.google.android.gms.internal.measurement.c5) r2     // Catch:{ all -> 0x008b }
            boolean r4 = r2.b()     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r2.a()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.m4 r4 = (com.google.android.gms.internal.measurement.m4) r4     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.w4 r5 = r8.f5620a     // Catch:{ all -> 0x008b }
            android.net.Uri r5 = r5.f5567a     // Catch:{ all -> 0x008b }
            java.lang.String r6 = r8.f5621b     // Catch:{ all -> 0x008b }
            r4.getClass()     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0051
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008b }
            o.f r4 = r4.f5397a     // Catch:{ all -> 0x008b }
            java.lang.Object r4 = r4.getOrDefault(r5, r3)     // Catch:{ all -> 0x008b }
            o.f r4 = (o.f) r4     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            java.lang.String r5 = ""
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x008b }
            java.lang.Object r4 = r4.getOrDefault(r5, r3)     // Catch:{ all -> 0x008b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x008b }
            goto L_0x0052
        L_0x0051:
            r4 = r3
        L_0x0052:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.w4 r5 = r8.f5620a     // Catch:{ all -> 0x008b }
            android.net.Uri r5 = r5.f5567a     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x00ea
            android.content.Context r6 = r1.f5322a     // Catch:{ all -> 0x008b }
            boolean r5 = com.google.android.gms.internal.measurement.p4.a(r6, r5)     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0075
            android.content.Context r5 = r1.f5322a     // Catch:{ all -> 0x008b }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.w4 r6 = r8.f5620a     // Catch:{ all -> 0x008b }
            android.net.Uri r6 = r6.f5567a     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.r4 r7 = com.google.android.gms.internal.measurement.r4.f5497a     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.k4 r5 = com.google.android.gms.internal.measurement.k4.a(r5, r6, r7)     // Catch:{ all -> 0x008b }
            goto L_0x0076
        L_0x0075:
            r5 = r3
        L_0x0076:
            if (r5 == 0) goto L_0x008e
            java.lang.String r6 = r8.f5621b     // Catch:{ all -> 0x008b }
            java.util.Map r5 = r5.b()     // Catch:{ all -> 0x008b }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x008b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r8.a(r5)     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r0 = move-exception
            goto L_0x00f5
        L_0x008e:
            r5 = r3
        L_0x008f:
            if (r5 != 0) goto L_0x00d6
            com.google.android.gms.internal.measurement.w4 r5 = r8.f5620a     // Catch:{ all -> 0x008b }
            boolean r5 = r5.f5568b     // Catch:{ all -> 0x008b }
            if (r5 != 0) goto L_0x00d0
            android.content.Context r1 = r1.f5322a     // Catch:{ all -> 0x008b }
            java.lang.Class<com.google.android.gms.internal.measurement.n4> r5 = com.google.android.gms.internal.measurement.n4.class
            monitor-enter(r5)     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.measurement.n4 r6 = com.google.android.gms.internal.measurement.n4.f5414c     // Catch:{ all -> 0x00cd }
            if (r6 != 0) goto L_0x00b5
            java.lang.String r6 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r6 = cb.d.s(r1, r6)     // Catch:{ all -> 0x00cd }
            if (r6 != 0) goto L_0x00ae
            com.google.android.gms.internal.measurement.n4 r6 = new com.google.android.gms.internal.measurement.n4     // Catch:{ all -> 0x00cd }
            r6.<init>(r1)     // Catch:{ all -> 0x00cd }
            goto L_0x00b3
        L_0x00ae:
            com.google.android.gms.internal.measurement.n4 r6 = new com.google.android.gms.internal.measurement.n4     // Catch:{ all -> 0x00cd }
            r6.<init>()     // Catch:{ all -> 0x00cd }
        L_0x00b3:
            com.google.android.gms.internal.measurement.n4.f5414c = r6     // Catch:{ all -> 0x00cd }
        L_0x00b5:
            com.google.android.gms.internal.measurement.n4 r1 = com.google.android.gms.internal.measurement.n4.f5414c     // Catch:{ all -> 0x00cd }
            monitor-exit(r5)     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.measurement.w4 r5 = r8.f5620a     // Catch:{ all -> 0x008b }
            boolean r5 = r5.f5568b     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x00c0
            r5 = r3
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r5 = r8.f5621b     // Catch:{ all -> 0x008b }
        L_0x00c2:
            java.lang.String r1 = r1.a(r5)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x00d0
            java.lang.Object r3 = r8.a(r1)     // Catch:{ all -> 0x008b }
            goto L_0x00d0
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x008b }
        L_0x00d0:
            if (r3 != 0) goto L_0x00d5
            java.lang.Object r5 = r8.f5622c     // Catch:{ all -> 0x008b }
            goto L_0x00d6
        L_0x00d5:
            r5 = r3
        L_0x00d6:
            boolean r1 = r2.b()     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x00e5
            if (r4 != 0) goto L_0x00e1
            java.lang.Object r5 = r8.f5622c     // Catch:{ all -> 0x008b }
            goto L_0x00e5
        L_0x00e1:
            java.lang.Object r5 = r8.a(r4)     // Catch:{ all -> 0x008b }
        L_0x00e5:
            r8.f5624e = r5     // Catch:{ all -> 0x008b }
            r8.f5623d = r0     // Catch:{ all -> 0x008b }
            goto L_0x00f3
        L_0x00ea:
            o.a r0 = com.google.android.gms.internal.measurement.a5.f5146a     // Catch:{ all -> 0x008b }
            throw r3     // Catch:{ all -> 0x008b }
        L_0x00ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            r0.<init>(r5)     // Catch:{ all -> 0x008b }
            throw r0     // Catch:{ all -> 0x008b }
        L_0x00f3:
            monitor-exit(r8)     // Catch:{ all -> 0x008b }
            goto L_0x00f7
        L_0x00f5:
            monitor-exit(r8)     // Catch:{ all -> 0x008b }
            throw r0
        L_0x00f7:
            java.lang.Object r0 = r8.f5624e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z4.b():java.lang.Object");
    }
}

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;

public final class g1 extends s1 {
    public final /* synthetic */ String B = null;
    public final /* synthetic */ Context C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ y1 E;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5283e = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g1(y1 y1Var, Context context, Bundle bundle) {
        super(y1Var, true);
        this.E = y1Var;
        this.C = context;
        this.D = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[Catch:{ Exception -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.dynamite"
            r1 = 1
            r2 = 0
            com.google.android.gms.internal.measurement.y1 r3 = r14.E     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = r14.f5283e     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = r14.B     // Catch:{ Exception -> 0x00a4 }
            r3.getClass()     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0023
            java.lang.String r3 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class<com.google.android.gms.internal.measurement.y1> r4 = com.google.android.gms.internal.measurement.y1.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x001e }
            java.lang.Class.forName(r3, r2, r4)     // Catch:{ ClassNotFoundException -> 0x001e }
            r3 = r1
            goto L_0x001f
        L_0x001e:
            r3 = r2
        L_0x001f:
            if (r3 != 0) goto L_0x0023
            r3 = r1
            goto L_0x0024
        L_0x0023:
            r3 = r2
        L_0x0024:
            r4 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = r14.B     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = r14.f5283e     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.measurement.y1 r6 = r14.E     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = r6.f5593a     // Catch:{ Exception -> 0x00a4 }
            r11 = r3
            r10 = r5
            r9 = r6
            goto L_0x0036
        L_0x0033:
            r9 = r4
            r10 = r9
            r11 = r10
        L_0x0036:
            android.content.Context r3 = r14.C     // Catch:{ Exception -> 0x00a4 }
            u6.q.i(r3)     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.measurement.y1 r3 = r14.E     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r5 = r14.C     // Catch:{ Exception -> 0x00a4 }
            r3.getClass()     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.dynamite.b r6 = com.google.android.gms.dynamite.DynamiteModule.f4348b     // Catch:{ a -> 0x0053 }
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.c(r5, r6, r0)     // Catch:{ a -> 0x0053 }
            java.lang.String r6 = "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"
            android.os.IBinder r5 = r5.b(r6)     // Catch:{ a -> 0x0053 }
            com.google.android.gms.internal.measurement.r0 r4 = com.google.android.gms.internal.measurement.q0.asInterface(r5)     // Catch:{ a -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r5 = move-exception
            r3.a(r5, r1, r2)     // Catch:{ Exception -> 0x00a4 }
        L_0x0057:
            r3.f5600h = r4     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.measurement.y1 r3 = r14.E     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.measurement.r0 r3 = r3.f5600h     // Catch:{ Exception -> 0x00a4 }
            if (r3 != 0) goto L_0x0069
            com.google.android.gms.internal.measurement.y1 r0 = r14.E     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.f5593a     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r0, r3)     // Catch:{ Exception -> 0x00a4 }
            return
        L_0x0069:
            android.content.Context r3 = r14.C     // Catch:{ Exception -> 0x00a4 }
            int r3 = com.google.android.gms.dynamite.DynamiteModule.a(r3, r0)     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r4 = r14.C     // Catch:{ Exception -> 0x00a4 }
            int r0 = com.google.android.gms.dynamite.DynamiteModule.d(r4, r0, r2)     // Catch:{ Exception -> 0x00a4 }
            int r4 = java.lang.Math.max(r3, r0)     // Catch:{ Exception -> 0x00a4 }
            if (r0 >= r3) goto L_0x007d
            r8 = r1
            goto L_0x007e
        L_0x007d:
            r8 = r2
        L_0x007e:
            com.google.android.gms.internal.measurement.a1 r0 = new com.google.android.gms.internal.measurement.a1     // Catch:{ Exception -> 0x00a4 }
            long r6 = (long) r4     // Catch:{ Exception -> 0x00a4 }
            r4 = 77000(0x12cc8, double:3.8043E-319)
            android.os.Bundle r12 = r14.D     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r3 = r14.C     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r13 = q7.s3.a(r3)     // Catch:{ Exception -> 0x00a4 }
            r3 = r0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.measurement.y1 r3 = r14.E     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.measurement.r0 r3 = r3.f5600h     // Catch:{ Exception -> 0x00a4 }
            u6.q.i(r3)     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r4 = r14.C     // Catch:{ Exception -> 0x00a4 }
            c7.b r5 = new c7.b     // Catch:{ Exception -> 0x00a4 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00a4 }
            long r6 = r14.f5510a     // Catch:{ Exception -> 0x00a4 }
            r3.initialize(r5, r0, r6)     // Catch:{ Exception -> 0x00a4 }
            return
        L_0x00a4:
            r0 = move-exception
            com.google.android.gms.internal.measurement.y1 r3 = r14.E
            r3.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g1.a():void");
    }
}

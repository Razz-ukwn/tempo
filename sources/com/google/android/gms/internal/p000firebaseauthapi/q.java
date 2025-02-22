package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import m9.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q  reason: invalid package */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4821a;

    /* renamed from: b  reason: collision with root package name */
    public y f4822b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4823c;

    /* renamed from: d  reason: collision with root package name */
    public final f f4824d;

    public q(Context context, f fVar, String str) {
        u6.q.i(context);
        this.f4821a = context;
        u6.q.i(fVar);
        this.f4824d = fVar;
        this.f4823c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0097 A[SYNTHETIC, Splitter:B:12:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.net.HttpURLConnection r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error getting App Check token; using placeholder token instead. Error: "
            java.lang.String r1 = r6.f4823c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "/FirebaseCore-Android"
            java.lang.String r1 = r1.concat(r2)
            com.google.android.gms.internal.firebase-auth-api.y r2 = r6.f4822b
            if (r2 != 0) goto L_0x001f
            com.google.android.gms.internal.firebase-auth-api.y r2 = new com.google.android.gms.internal.firebase-auth-api.y
            android.content.Context r3 = r6.f4821a
            java.lang.String r4 = r3.getPackageName()
            r2.<init>(r3, r4)
            r6.f4822b = r2
        L_0x001f:
            com.google.android.gms.internal.firebase-auth-api.y r2 = r6.f4822b
            java.lang.String r2 = r2.f5084a
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            com.google.android.gms.internal.firebase-auth-api.y r2 = r6.f4822b
            java.lang.String r2 = r2.f5085b
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "Accept-Language"
            java.lang.String r3 = ag.d.l()
            r7.setRequestProperty(r2, r3)
            java.lang.String r2 = "X-Client-Version"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Firebase-Locale"
            r2 = 0
            r7.setRequestProperty(r1, r2)
            m9.f r1 = r6.f4824d
            r1.a()
            m9.i r3 = r1.f11333c
            java.lang.String r3 = r3.f11344b
            java.lang.String r4 = "X-Firebase-GMPID"
            r7.setRequestProperty(r4, r3)
            com.google.firebase.auth.FirebaseAuth r3 = com.google.firebase.auth.FirebaseAuth.getInstance(r1)
            qa.b r3 = r3.f6319p
            java.lang.Object r3 = r3.get()
            oa.g r3 = (oa.g) r3
            java.lang.String r4 = "LocalRequestInterceptor"
            if (r3 == 0) goto L_0x0082
            com.google.android.gms.tasks.Task r3 = r3.a()     // Catch:{ ExecutionException -> 0x0070, InterruptedException -> 0x006e }
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)     // Catch:{ ExecutionException -> 0x0070, InterruptedException -> 0x006e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ ExecutionException -> 0x0070, InterruptedException -> 0x006e }
            goto L_0x0083
        L_0x006e:
            r3 = move-exception
            goto L_0x0071
        L_0x0070:
            r3 = move-exception
        L_0x0071:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "Unable to get heartbeats: "
            java.lang.String r3 = r5.concat(r3)
            android.util.Log.w(r4, r3)
        L_0x0082:
            r3 = r2
        L_0x0083:
            java.lang.String r5 = "X-Firebase-Client"
            r7.setRequestProperty(r5, r3)
            com.google.firebase.auth.FirebaseAuth r1 = com.google.firebase.auth.FirebaseAuth.getInstance(r1)
            qa.b r1 = r1.f6318o
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.firebase-auth-api.nh r1 = (com.google.android.gms.internal.p000firebaseauthapi.nh) r1
            if (r1 != 0) goto L_0x0097
            goto L_0x00cf
        L_0x0097:
            com.google.android.gms.tasks.Task r1 = r1.zza()     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            java.lang.Object r1 = com.google.android.gms.tasks.Tasks.await(r1)     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            com.google.android.gms.internal.firebase-auth-api.mh r1 = (com.google.android.gms.internal.p000firebaseauthapi.mh) r1     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            m9.g r3 = r1.a()     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            if (r3 == 0) goto L_0x00b6
            m9.g r3 = r1.a()     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            android.util.Log.w(r4, r0)     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
        L_0x00b6:
            java.lang.String r2 = r1.b()     // Catch:{ ExecutionException -> 0x00bd, InterruptedException -> 0x00bb }
            goto L_0x00cf
        L_0x00bb:
            r0 = move-exception
            goto L_0x00be
        L_0x00bd:
            r0 = move-exception
        L_0x00be:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unexpected error getting App Check token: "
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.e(r4, r0)
        L_0x00cf:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "X-Firebase-AppCheck"
            r7.setRequestProperty(r0, r2)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.q.a(java.net.HttpURLConnection):void");
    }
}

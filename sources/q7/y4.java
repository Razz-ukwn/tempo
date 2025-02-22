package q7;

import android.net.Uri;

public final class y4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f13442a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f13443b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13444c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f13445d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z4 f13446e;

    public y4(z4 z4Var, boolean z10, Uri uri, String str, String str2) {
        this.f13446e = z4Var;
        this.f13442a = z10;
        this.f13443b = uri;
        this.f13444c = str;
        this.f13445d = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010b A[Catch:{ RuntimeException -> 0x01ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d A[Catch:{ RuntimeException -> 0x01ac }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            android.net.Uri r0 = r1.f13443b
            java.lang.String r5 = r1.f13445d
            q7.z4 r2 = r1.f13446e
            q7.a5 r13 = r2.f13466a
            r13.i()
            q7.k4 r2 = r13.f13121a     // Catch:{ RuntimeException -> 0x01ac }
            q7.k4 r3 = r13.f13121a
            q7.x3 r2 = (q7.x3) r2     // Catch:{ RuntimeException -> 0x01ac }
            q7.a7 r2 = r2.H     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3.j(r2)     // Catch:{ RuntimeException -> 0x01ac }
            com.google.android.gms.internal.measurement.qc r4 = com.google.android.gms.internal.measurement.qc.f5492b     // Catch:{ RuntimeException -> 0x01ac }
            com.google.android.gms.internal.measurement.g5 r6 = r4.f5493a     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.Object r6 = r6.zza()     // Catch:{ RuntimeException -> 0x01ac }
            com.google.android.gms.internal.measurement.rc r6 = (com.google.android.gms.internal.measurement.rc) r6     // Catch:{ RuntimeException -> 0x01ac }
            r6.zza()     // Catch:{ RuntimeException -> 0x01ac }
            r6 = r3
            q7.x3 r6 = (q7.x3) r6     // Catch:{ RuntimeException -> 0x01ac }
            q7.f r6 = r6.C     // Catch:{ RuntimeException -> 0x01ac }
            q7.f2 r7 = q7.g2.f13054q0     // Catch:{ RuntimeException -> 0x01ac }
            r8 = 0
            boolean r6 = r6.r(r8, r7)     // Catch:{ RuntimeException -> 0x01ac }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "utm_medium"
            java.lang.String r14 = "_cis"
            java.lang.String r15 = "utm_source"
            java.lang.String r10 = "utm_campaign"
            java.lang.String r8 = "gclid"
            if (r9 == 0) goto L_0x0044
            goto L_0x008f
        L_0x0044:
            boolean r9 = r5.contains(r8)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            boolean r9 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            boolean r9 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            boolean r9 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            java.lang.String r9 = "utm_id"
            boolean r9 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            java.lang.String r9 = "dclid"
            boolean r9 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            java.lang.String r9 = "srsltid"
            boolean r9 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01ac }
            if (r9 != 0) goto L_0x0091
            if (r6 == 0) goto L_0x0081
            java.lang.String r6 = "sfmc_id"
            boolean r6 = r5.contains(r6)     // Catch:{ RuntimeException -> 0x01ac }
            if (r6 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r6 = 1
            goto L_0x0091
        L_0x0081:
            q7.k4 r2 = r2.f13121a     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ RuntimeException -> 0x01ac }
            q7.s2 r2 = r2.E     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3.l(r2)     // Catch:{ RuntimeException -> 0x01ac }
            q7.q2 r2 = r2.I     // Catch:{ RuntimeException -> 0x01ac }
            r2.b(r11)     // Catch:{ RuntimeException -> 0x01ac }
        L_0x008f:
            r2 = 0
            goto L_0x00a6
        L_0x0091:
            java.lang.String r9 = "https://google.com/search?"
            java.lang.String r9 = r9.concat(r5)     // Catch:{ RuntimeException -> 0x01ac }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ RuntimeException -> 0x01ac }
            android.os.Bundle r2 = r2.n0(r6, r9)     // Catch:{ RuntimeException -> 0x01ac }
            if (r2 == 0) goto L_0x00a6
            java.lang.String r6 = "referrer"
            r2.putString(r14, r6)     // Catch:{ RuntimeException -> 0x01ac }
        L_0x00a6:
            q7.e7 r6 = r13.J
            java.lang.String r9 = "_cmp"
            r16 = r11
            boolean r11 = r1.f13442a
            r17 = r12
            java.lang.String r12 = r1.f13444c
            if (r11 == 0) goto L_0x0105
            r11 = r3
            q7.x3 r11 = (q7.x3) r11     // Catch:{ RuntimeException -> 0x01ac }
            q7.a7 r11 = r11.H     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3.j(r11)     // Catch:{ RuntimeException -> 0x01ac }
            com.google.android.gms.internal.measurement.g5 r4 = r4.f5493a     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.Object r4 = r4.zza()     // Catch:{ RuntimeException -> 0x01ac }
            com.google.android.gms.internal.measurement.rc r4 = (com.google.android.gms.internal.measurement.rc) r4     // Catch:{ RuntimeException -> 0x01ac }
            r4.zza()     // Catch:{ RuntimeException -> 0x01ac }
            r4 = r3
            q7.x3 r4 = (q7.x3) r4     // Catch:{ RuntimeException -> 0x01ac }
            q7.f r4 = r4.C     // Catch:{ RuntimeException -> 0x01ac }
            r1 = 0
            boolean r4 = r4.r(r1, r7)     // Catch:{ RuntimeException -> 0x01ac }
            android.os.Bundle r0 = r11.n0(r4, r0)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 == 0) goto L_0x0105
            java.lang.String r1 = "intent"
            r0.putString(r14, r1)     // Catch:{ RuntimeException -> 0x01ac }
            boolean r1 = r0.containsKey(r8)     // Catch:{ RuntimeException -> 0x01ac }
            if (r1 != 0) goto L_0x00ff
            if (r2 == 0) goto L_0x00ff
            boolean r1 = r2.containsKey(r8)     // Catch:{ RuntimeException -> 0x01ac }
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = "_cer"
            java.lang.String r4 = "gclid=%s"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r11 = r2.getString(r8)     // Catch:{ RuntimeException -> 0x01ac }
            r14 = 0
            r7[r14] = r11     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r4 = java.lang.String.format(r4, r7)     // Catch:{ RuntimeException -> 0x01ac }
            r0.putString(r1, r4)     // Catch:{ RuntimeException -> 0x01ac }
        L_0x00ff:
            r13.p(r12, r9, r0)     // Catch:{ RuntimeException -> 0x01ac }
            r6.a(r0, r12)     // Catch:{ RuntimeException -> 0x01ac }
        L_0x0105:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 == 0) goto L_0x010d
            goto L_0x019c
        L_0x010d:
            r0 = r3
            q7.x3 r0 = (q7.x3) r0     // Catch:{ RuntimeException -> 0x01ac }
            q7.s2 r0 = r0.E     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3.l(r0)     // Catch:{ RuntimeException -> 0x01ac }
            q7.q2 r0 = r0.I     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r1 = "Activity created with referrer"
            r0.c(r5, r1)     // Catch:{ RuntimeException -> 0x01ac }
            r0 = r3
            q7.x3 r0 = (q7.x3) r0     // Catch:{ RuntimeException -> 0x01ac }
            q7.f r0 = r0.C     // Catch:{ RuntimeException -> 0x01ac }
            q7.f2 r1 = q7.g2.f13023a0     // Catch:{ RuntimeException -> 0x01ac }
            r4 = 0
            boolean r0 = r0.r(r4, r1)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x0133
            r13.p(r12, r9, r2)     // Catch:{ RuntimeException -> 0x01ac }
            r6.a(r2, r12)     // Catch:{ RuntimeException -> 0x01ac }
            goto L_0x0142
        L_0x0133:
            r0 = r3
            q7.x3 r0 = (q7.x3) r0     // Catch:{ RuntimeException -> 0x01ac }
            q7.s2 r0 = r0.E     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3.l(r0)     // Catch:{ RuntimeException -> 0x01ac }
            q7.q2 r0 = r0.I     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.c(r5, r1)     // Catch:{ RuntimeException -> 0x01ac }
        L_0x0142:
            r9 = 0
            q7.x3 r3 = (q7.x3) r3     // Catch:{ RuntimeException -> 0x01ac }
            ag.m r0 = r3.J     // Catch:{ RuntimeException -> 0x01ac }
            r0.getClass()     // Catch:{ RuntimeException -> 0x01ac }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r7 = "auto"
            java.lang.String r8 = "_ldl"
            r10 = 1
            r6 = r13
            r6.x(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x01ac }
            return
        L_0x0158:
            boolean r0 = r5.contains(r8)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 == 0) goto L_0x019d
            boolean r0 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 != 0) goto L_0x0182
            boolean r0 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 != 0) goto L_0x0182
            r0 = r17
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 == 0) goto L_0x019d
        L_0x0182:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01ac }
            if (r0 != 0) goto L_0x019c
            q7.x3 r3 = (q7.x3) r3     // Catch:{ RuntimeException -> 0x01ac }
            ag.m r0 = r3.J     // Catch:{ RuntimeException -> 0x01ac }
            r0.getClass()     // Catch:{ RuntimeException -> 0x01ac }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x01ac }
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_ldl"
            r6 = 1
            r2 = r13
            r2.x(r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x01ac }
        L_0x019c:
            return
        L_0x019d:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ RuntimeException -> 0x01ac }
            q7.s2 r0 = r3.E     // Catch:{ RuntimeException -> 0x01ac }
            q7.x3.l(r0)     // Catch:{ RuntimeException -> 0x01ac }
            q7.q2 r0 = r0.I     // Catch:{ RuntimeException -> 0x01ac }
            r1 = r16
            r0.b(r1)     // Catch:{ RuntimeException -> 0x01ac }
            return
        L_0x01ac:
            r0 = move-exception
            q7.k4 r1 = r13.f13121a
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            q7.q2 r1 = r1.B
            r1.c(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.y4.run():void");
    }
}

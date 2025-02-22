package com.google.android.recaptcha.internal;

import sf.e;

public final class zzv {
    private zzv() {
    }

    public /* synthetic */ zzv(e eVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7 A[SYNTHETIC, Splitter:B:29:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011c A[Catch:{ all -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0205 A[Catch:{ all -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023f A[SYNTHETIC, Splitter:B:80:0x023f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(android.app.Application r22, java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzq r26, android.webkit.WebView r27, jf.d r28) {
        /*
            r21 = this;
            r0 = r28
            java.lang.String r1 = "Only one site key can be used per runtime. The site key you provided "
            boolean r2 = r0 instanceof com.google.android.recaptcha.internal.zzu
            if (r2 == 0) goto L_0x0019
            r2 = r0
            com.google.android.recaptcha.internal.zzu r2 = (com.google.android.recaptcha.internal.zzu) r2
            int r3 = r2.zzg
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.zzg = r3
            r3 = r21
            goto L_0x0020
        L_0x0019:
            com.google.android.recaptcha.internal.zzu r2 = new com.google.android.recaptcha.internal.zzu
            r3 = r21
            r2.<init>(r3, r0)
        L_0x0020:
            java.lang.Object r0 = r2.zze
            kf.a r4 = kf.a.f10464a
            int r5 = r2.zzg
            r6 = 3
            r7 = 0
            r8 = 1
            r9 = 2
            if (r5 == 0) goto L_0x0089
            if (r5 == r8) goto L_0x0069
            if (r5 == r9) goto L_0x0049
            if (r5 == r6) goto L_0x003a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            java.lang.Object r1 = r2.zzb
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r2.zza
            kotlinx.coroutines.sync.c r2 = (kotlinx.coroutines.sync.c) r2
            cb.b.J(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x029e
        L_0x0047:
            r0 = move-exception
            goto L_0x0066
        L_0x0049:
            com.google.android.recaptcha.internal.zzdi r1 = r2.zzi
            java.lang.Object r5 = r2.zzc
            com.google.android.recaptcha.internal.zzv r5 = (com.google.android.recaptcha.internal.zzv) r5
            kotlinx.coroutines.sync.c r5 = r2.zzj
            com.google.android.recaptcha.internal.zzq r8 = r2.zzh
            java.lang.Object r9 = r2.zzb
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.zza
            android.app.Application r10 = (android.app.Application) r10
            cb.b.J(r0)     // Catch:{ all -> 0x0064 }
            ff.h r0 = (ff.h) r0     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r0.f8708a     // Catch:{ all -> 0x0064 }
            goto L_0x01ff
        L_0x0064:
            r0 = move-exception
            r2 = r5
        L_0x0066:
            r1 = r7
            goto L_0x02b6
        L_0x0069:
            long r10 = r2.zzd
            java.lang.Object r5 = r2.zzc
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5
            kotlinx.coroutines.sync.c r8 = r2.zzj
            android.webkit.WebView r8 = (android.webkit.WebView) r8
            com.google.android.recaptcha.internal.zzq r12 = r2.zzh
            java.lang.Object r13 = r2.zzb
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.zza
            android.app.Application r14 = (android.app.Application) r14
            cb.b.J(r0)
            r15 = r5
            r5 = r13
            r0 = r14
            r20 = r12
            r12 = r8
            r8 = r20
            goto L_0x00b1
        L_0x0089:
            cb.b.J(r0)
            kotlinx.coroutines.sync.c r5 = com.google.android.recaptcha.internal.zzaa.zze
            r0 = r22
            r2.zza = r0
            r10 = r23
            r2.zzb = r10
            r11 = r26
            r2.zzh = r11
            r2.zzj = r7
            r2.zzc = r5
            r12 = r24
            r2.zzd = r12
            r2.zzg = r8
            java.lang.Object r8 = r5.b(r2)
            if (r8 == r4) goto L_0x02ba
            r15 = r5
            r5 = r10
            r8 = r11
            r10 = r12
            r12 = r7
        L_0x00b1:
            r13 = 5000(0x1388, double:2.4703E-320)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x011c
            com.google.android.recaptcha.internal.zzaf r1 = new com.google.android.recaptcha.internal.zzaf     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzln r2 = com.google.android.recaptcha.internal.zzln.INIT_TOTAL     // Catch:{ all -> 0x02b1 }
            java.lang.String r4 = com.google.android.recaptcha.internal.zzaa.zzc     // Catch:{ all -> 0x02b1 }
            java.lang.String r6 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02b1 }
            if (r6 != 0) goto L_0x00c6
            r6 = r7
        L_0x00c6:
            java.lang.String r10 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x00cd
            r10 = r7
        L_0x00cd:
            r11 = 0
            r22 = r1
            r23 = r2
            r24 = r4
            r25 = r6
            r26 = r10
            r27 = r11
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzh r2 = new com.google.android.recaptcha.internal.zzh     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzf r4 = com.google.android.recaptcha.internal.zzf.zzc     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzd r6 = com.google.android.recaptcha.internal.zzd.zzU     // Catch:{ all -> 0x02b1 }
            r2.<init>(r4, r6)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzai r4 = com.google.android.recaptcha.internal.zzai.zza     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzr r4 = new com.google.android.recaptcha.internal.zzr     // Catch:{ all -> 0x02b1 }
            r4.<init>()     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzai.zzb(r1, r5, r4)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzf r4 = r2.zzb()     // Catch:{ all -> 0x02b1 }
            int r4 = r4.zza()     // Catch:{ all -> 0x02b1 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzd r2 = r2.zza()     // Catch:{ all -> 0x02b1 }
            int r2 = r2.zza()     // Catch:{ all -> 0x02b1 }
            r5 = 0
            r22 = r1
            r23 = r4
            r24 = r2
            r25 = r0
            r26 = r8
            r27 = r5
            com.google.android.recaptcha.internal.zzai.zzd(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.RecaptchaErrorCode r1 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT     // Catch:{ all -> 0x02b1 }
            r0.<init>(r1, r7, r9, r7)     // Catch:{ all -> 0x02b1 }
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x011c:
            java.lang.String r10 = "android.permission.INTERNET"
            int r10 = t1.a.a(r0, r10)     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x02a5
            com.google.android.recaptcha.internal.zzaa r10 = com.google.android.recaptcha.internal.zzaa.zzb     // Catch:{ all -> 0x02b1 }
            if (r10 == 0) goto L_0x0157
            java.lang.String r0 = r10.zze()     // Catch:{ all -> 0x02b1 }
            boolean r0 = sf.j.a(r0, r5)     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x0137
            r1 = r7
            goto L_0x023b
        L_0x0137:
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.RecaptchaErrorCode r2 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY     // Catch:{ all -> 0x02b1 }
            java.lang.String r4 = r10.zze()     // Catch:{ all -> 0x02b1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b1 }
            r6.<init>(r1)     // Catch:{ all -> 0x02b1 }
            r6.append(r5)     // Catch:{ all -> 0x02b1 }
            java.lang.String r1 = " is different than "
            r6.append(r1)     // Catch:{ all -> 0x02b1 }
            r6.append(r4)     // Catch:{ all -> 0x02b1 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x02b1 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x02b1 }
            throw r0     // Catch:{ all -> 0x02b1 }
        L_0x0157:
            com.google.android.recaptcha.internal.zzv r1 = com.google.android.recaptcha.internal.zzaa.zza     // Catch:{ all -> 0x02b1 }
            java.util.UUID r10 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x02b1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzaa.zzd = r10     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzai r10 = com.google.android.recaptcha.internal.zzai.zza     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzaf r10 = new com.google.android.recaptcha.internal.zzaf     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzln r11 = com.google.android.recaptcha.internal.zzln.INIT_TOTAL     // Catch:{ all -> 0x02b1 }
            java.lang.String r13 = com.google.android.recaptcha.internal.zzaa.zzc     // Catch:{ all -> 0x02b1 }
            java.lang.String r14 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02b1 }
            if (r14 != 0) goto L_0x0175
            r14 = r7
        L_0x0175:
            java.lang.String r16 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02b1 }
            if (r16 != 0) goto L_0x017d
            r16 = r7
        L_0x017d:
            r17 = 0
            r22 = r10
            r23 = r11
            r24 = r13
            r25 = r14
            r26 = r16
            r27 = r17
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzr r11 = new com.google.android.recaptcha.internal.zzr     // Catch:{ all -> 0x02b1 }
            r11.<init>()     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzai.zzb(r10, r5, r11)     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzdi r14 = new com.google.android.recaptcha.internal.zzdi     // Catch:{ all -> 0x02b1 }
            if (r12 != 0) goto L_0x01a1
            android.webkit.WebView r10 = new android.webkit.WebView     // Catch:{ all -> 0x02b1 }
            r10.<init>(r0)     // Catch:{ all -> 0x02b1 }
            r11 = r10
            goto L_0x01a2
        L_0x01a1:
            r11 = r12
        L_0x01a2:
            java.lang.String r16 = com.google.android.recaptcha.internal.zzaa.zzc     // Catch:{ all -> 0x02b1 }
            java.lang.String r10 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x01af
            r17 = r7
            goto L_0x01b1
        L_0x01af:
            r17 = r10
        L_0x01b1:
            com.google.android.recaptcha.internal.zzao r18 = new com.google.android.recaptcha.internal.zzao     // Catch:{ all -> 0x02b1 }
            com.google.android.recaptcha.internal.zzaq r10 = new com.google.android.recaptcha.internal.zzaq     // Catch:{ all -> 0x02b1 }
            java.lang.String r12 = r8.zzc()     // Catch:{ all -> 0x02b1 }
            r10.<init>(r12)     // Catch:{ all -> 0x02b1 }
            r12 = 0
            r13 = 4
            r19 = 0
            r22 = r18
            r23 = r0
            r24 = r10
            r25 = r12
            r26 = r13
            r27 = r19
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02b1 }
            ag.g0 r19 = com.google.android.recaptcha.internal.zzp.zzb()     // Catch:{ all -> 0x02b1 }
            r10 = r14
            r12 = r5
            r13 = r0
            r6 = r14
            r14 = r8
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02af }
            r2.zza = r0     // Catch:{ all -> 0x02af }
            r2.zzb = r5     // Catch:{ all -> 0x02af }
            r2.zzh = r8     // Catch:{ all -> 0x02af }
            r2.zzj = r7     // Catch:{ all -> 0x02af }
            r2.zzc = r1     // Catch:{ all -> 0x02af }
            r2.zzi = r6     // Catch:{ all -> 0x02af }
            r2.zzg = r9     // Catch:{ all -> 0x02af }
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = r6.zzg(r9, r2)     // Catch:{ all -> 0x02af }
            if (r1 == r4) goto L_0x02a4
            r10 = r0
            r0 = r1
            r9 = r5
            r1 = r6
            r5 = r7
        L_0x01ff:
            java.lang.Throwable r0 = ff.h.a(r0)     // Catch:{ all -> 0x02a1 }
            if (r0 != 0) goto L_0x023f
            com.google.android.recaptcha.internal.zzaa r0 = new com.google.android.recaptcha.internal.zzaa     // Catch:{ all -> 0x02a1 }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x02a1 }
            com.google.android.recaptcha.internal.zzai r1 = com.google.android.recaptcha.internal.zzai.zza     // Catch:{ all -> 0x02a1 }
            com.google.android.recaptcha.internal.zzaf r1 = new com.google.android.recaptcha.internal.zzaf     // Catch:{ all -> 0x02a1 }
            com.google.android.recaptcha.internal.zzln r2 = com.google.android.recaptcha.internal.zzln.INIT_TOTAL     // Catch:{ all -> 0x02a1 }
            java.lang.String r4 = com.google.android.recaptcha.internal.zzaa.zzc     // Catch:{ all -> 0x02a1 }
            java.lang.String r6 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02a1 }
            if (r6 != 0) goto L_0x021b
            r6 = 0
        L_0x021b:
            java.lang.String r7 = com.google.android.recaptcha.internal.zzaa.zzd     // Catch:{ all -> 0x02a1 }
            if (r7 != 0) goto L_0x0222
            r7 = 0
        L_0x0222:
            r9 = 0
            r22 = r1
            r23 = r2
            r24 = r4
            r25 = r6
            r26 = r7
            r27 = r9
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02a1 }
            com.google.android.recaptcha.internal.zzai.zzc(r1, r10, r8)     // Catch:{ all -> 0x02a1 }
            com.google.android.recaptcha.internal.zzaa.zzb = r0     // Catch:{ all -> 0x02a1 }
            r10 = r0
            r15 = r5
            r1 = 0
        L_0x023b:
            r15.a(r1)
            return r10
        L_0x023f:
            ag.g0 r1 = com.google.android.recaptcha.internal.zzp.zzc()     // Catch:{ all -> 0x02a1 }
            jf.f r1 = r1.f0()     // Catch:{ all -> 0x02a1 }
            ag.n1$b r6 = ag.n1.b.f447a     // Catch:{ all -> 0x02a1 }
            jf.f$b r1 = r1.d(r6)     // Catch:{ all -> 0x02a1 }
            ag.n1 r1 = (ag.n1) r1     // Catch:{ all -> 0x02a1 }
            if (r1 == 0) goto L_0x026f
            yf.j r1 = r1.q()     // Catch:{ all -> 0x02a1 }
            if (r1 == 0) goto L_0x026f
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x02a1 }
        L_0x025b:
            r6 = r1
            yf.h r6 = (yf.h) r6     // Catch:{ all -> 0x02a1 }
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x02a1 }
            if (r7 == 0) goto L_0x026f
            java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x02a1 }
            ag.n1 r6 = (ag.n1) r6     // Catch:{ all -> 0x02a1 }
            r7 = 0
            r6.e(r7)     // Catch:{ all -> 0x02a1 }
            goto L_0x025b
        L_0x026f:
            ag.g0 r1 = com.google.android.recaptcha.internal.zzp.zzc()     // Catch:{ all -> 0x02a1 }
            jf.f r1 = r1.f0()     // Catch:{ all -> 0x02a1 }
            ag.n1 r1 = cb.d.G(r1)     // Catch:{ all -> 0x02a1 }
            yf.j r1 = r1.q()     // Catch:{ all -> 0x02a1 }
            java.util.List r1 = yf.o.r0(r1)     // Catch:{ all -> 0x02a1 }
            r2.zza = r5     // Catch:{ all -> 0x02a1 }
            r2.zzb = r0     // Catch:{ all -> 0x02a1 }
            r6 = 0
            r2.zzh = r6     // Catch:{ all -> 0x02a1 }
            r2.zzj = r6     // Catch:{ all -> 0x02a1 }
            r2.zzc = r6     // Catch:{ all -> 0x02a1 }
            r2.zzi = r6     // Catch:{ all -> 0x02a1 }
            r6 = 3
            r2.zzg = r6     // Catch:{ all -> 0x02a1 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x02a1 }
            java.lang.Object r1 = ag.d.h(r1, r2)     // Catch:{ all -> 0x02a1 }
            if (r1 != r4) goto L_0x029c
            return r4
        L_0x029c:
            r1 = r0
            r2 = r5
        L_0x029e:
            throw r1     // Catch:{ all -> 0x029f }
        L_0x029f:
            r0 = move-exception
            goto L_0x02b5
        L_0x02a1:
            r0 = move-exception
            r15 = r5
            goto L_0x02b4
        L_0x02a4:
            return r4
        L_0x02a5:
            r7 = r15
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ all -> 0x02af }
            com.google.android.recaptcha.RecaptchaErrorCode r1 = com.google.android.recaptcha.RecaptchaErrorCode.NETWORK_ERROR     // Catch:{ all -> 0x02af }
            r2 = 0
            r0.<init>(r1, r2, r9, r2)     // Catch:{ all -> 0x02af }
            throw r0     // Catch:{ all -> 0x02af }
        L_0x02af:
            r0 = move-exception
            goto L_0x02b3
        L_0x02b1:
            r0 = move-exception
            r7 = r15
        L_0x02b3:
            r15 = r7
        L_0x02b4:
            r2 = r15
        L_0x02b5:
            r1 = 0
        L_0x02b6:
            r2.a(r1)
            throw r0
        L_0x02ba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzq, android.webkit.WebView, jf.d):java.lang.Object");
    }
}

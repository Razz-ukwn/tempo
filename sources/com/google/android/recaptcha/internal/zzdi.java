package com.google.android.recaptcha.internal;

import ag.g0;
import ag.l2;
import ag.s;
import android.content.Context;
import android.webkit.WebView;
import gc.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.sync.c;
import sf.e;

public final class zzdi {
    public static final zzdb zza = new zzdb((e) null);
    public s zzb;
    private final WebView zzc;
    /* access modifiers changed from: private */
    public final String zzd;
    /* access modifiers changed from: private */
    public final Context zze;
    /* access modifiers changed from: private */
    public final zzq zzf;
    /* access modifiers changed from: private */
    public final String zzg;
    /* access modifiers changed from: private */
    public final String zzh;
    private final zzaj zzi;
    /* access modifiers changed from: private */
    public final Map zzj = zzdj.zza();
    /* access modifiers changed from: private */
    public final Map zzk;
    private final Map zzl;
    private final zzas zzm;
    /* access modifiers changed from: private */
    public final zzdt zzn;
    /* access modifiers changed from: private */
    public final c zzo;
    private final zzdc zzp;

    public zzdi(WebView webView, String str, Context context, zzq zzq, String str2, String str3, zzaj zzaj, g0 g0Var) {
        this.zzc = webView;
        this.zzd = str;
        this.zze = context;
        this.zzf = zzq;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzaj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzk = linkedHashMap;
        this.zzl = linkedHashMap;
        this.zzm = new zzay(new zzbb(webView, g0Var), zzp.zzc(), context, new zzn());
        this.zzn = zzdt.zzc();
        this.zzo = b.b();
        zzdc zzdc = new zzdc(this);
        this.zzp = zzdc;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzdc, "RN");
        webView.setWebViewClient(new zzda(this));
    }

    private final zzh zzp(Exception exc) {
        return exc instanceof l2 ? new zzh(zzf.zzc, zzd.zzj) : exc instanceof zzh ? (zzh) exc : new zzh(zzf.zzc, zzd.zzu);
    }

    private final void zzq(List list, zzh zzh2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzai zzai = zzai.zza;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzd(new zzaf((zzln) it.next(), str, str2, str2, (String) null), String.valueOf(zzh2.zzb().zza()), zzh2.zza().zza(), this.zze, this.zzf, (String) null);
        }
    }

    public final WebView zzb() {
        return this.zzc;
    }

    public final zzas zzd() {
        return this.zzm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r16, long r17, jf.d r19) {
        /*
            r15 = this;
            r1 = r15
            r2 = r17
            r0 = r19
            boolean r4 = r0 instanceof com.google.android.recaptcha.internal.zzdd
            if (r4 == 0) goto L_0x0018
            r4 = r0
            com.google.android.recaptcha.internal.zzdd r4 = (com.google.android.recaptcha.internal.zzdd) r4
            int r5 = r4.zzc
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0018
            int r5 = r5 - r6
            r4.zzc = r5
            goto L_0x001d
        L_0x0018:
            com.google.android.recaptcha.internal.zzdd r4 = new com.google.android.recaptcha.internal.zzdd
            r4.<init>(r15, r0)
        L_0x001d:
            java.lang.Object r0 = r4.zza
            kf.a r5 = kf.a.f10464a
            int r6 = r4.zzc
            r7 = 1
            if (r6 == 0) goto L_0x003d
            if (r6 != r7) goto L_0x0035
            java.lang.String r2 = r4.zze
            com.google.android.recaptcha.internal.zzdi r3 = r4.zzd
            cb.b.J(r0)     // Catch:{ Exception -> 0x0032 }
            r8 = r2
            r9 = r3
            goto L_0x009b
        L_0x0032:
            r0 = move-exception
            goto L_0x00b8
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            cb.b.J(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r6 = r0.toString()
            com.google.android.recaptcha.internal.zzai r0 = com.google.android.recaptcha.internal.zzai.zza
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzln r9 = com.google.android.recaptcha.internal.zzln.EXECUTE_TOTAL
            java.lang.String r10 = r1.zzg
            java.lang.String r11 = r1.zzh
            r14 = 0
            r13 = 0
            r8 = r0
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r8 = r1.zzd
            com.google.android.recaptcha.internal.zzr r9 = new com.google.android.recaptcha.internal.zzr
            r9.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r0, r8, r9)
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzln r9 = com.google.android.recaptcha.internal.zzln.EXECUTE_NATIVE
            java.lang.String r10 = r1.zzg
            java.lang.String r11 = r1.zzh
            r8 = r0
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r8 = r1.zzd
            com.google.android.recaptcha.internal.zzr r9 = new com.google.android.recaptcha.internal.zzr
            r9.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r0, r8, r9)
            com.google.android.recaptcha.internal.zzde r0 = new com.google.android.recaptcha.internal.zzde     // Catch:{ Exception -> 0x00c3 }
            r8 = 0
            r9 = r16
            r0.<init>(r9, r15, r6, r8)     // Catch:{ Exception -> 0x00c3 }
            r4.zzd = r1     // Catch:{ Exception -> 0x00c3 }
            r4.zze = r6     // Catch:{ Exception -> 0x00c3 }
            r4.zzc = r7     // Catch:{ Exception -> 0x00c3 }
            r9 = 0
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x00bb
            ag.m2 r7 = new ag.m2     // Catch:{ Exception -> 0x00c3 }
            r7.<init>(r2, r4)     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r0 = ag.n2.c(r7, r0)     // Catch:{ Exception -> 0x00c3 }
            if (r0 == r5) goto L_0x00ba
            r9 = r1
            r8 = r6
        L_0x009b:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b5 }
            com.google.android.recaptcha.internal.zzai r2 = com.google.android.recaptcha.internal.zzai.zza     // Catch:{ Exception -> 0x00b5 }
            com.google.android.recaptcha.internal.zzaf r10 = new com.google.android.recaptcha.internal.zzaf     // Catch:{ Exception -> 0x00b5 }
            com.google.android.recaptcha.internal.zzln r3 = com.google.android.recaptcha.internal.zzln.EXECUTE_TOTAL     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = r9.zzg     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r5 = r9.zzh     // Catch:{ Exception -> 0x00b5 }
            r7 = 0
            r2 = r10
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00b5 }
            android.content.Context r2 = r9.zze     // Catch:{ Exception -> 0x00b5 }
            com.google.android.recaptcha.internal.zzq r3 = r9.zzf     // Catch:{ Exception -> 0x00b5 }
            com.google.android.recaptcha.internal.zzai.zzc(r10, r2, r3)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00e7
        L_0x00b5:
            r0 = move-exception
            r2 = r8
            r3 = r9
        L_0x00b8:
            r6 = r2
            goto L_0x00c5
        L_0x00ba:
            return r5
        L_0x00bb:
            ag.l2 r0 = new ag.l2     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = "Timed out immediately"
            r0.<init>(r2, r8)     // Catch:{ Exception -> 0x00c3 }
            throw r0     // Catch:{ Exception -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            r3 = r1
        L_0x00c5:
            com.google.android.recaptcha.internal.zzln r2 = com.google.android.recaptcha.internal.zzln.EXECUTE_TOTAL
            java.util.List r2 = cb.d.O(r2)
            com.google.android.recaptcha.internal.zzh r0 = r3.zzp(r0)
            r3.zzq(r2, r0)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            java.util.Map r2 = r3.zzk
            java.lang.Object r2 = r2.remove(r6)
            ag.k r2 = (ag.k) r2
            if (r2 == 0) goto L_0x00e3
            r2.n(r0)
        L_0x00e3:
            ff.h$a r0 = cb.b.u(r0)
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdi.zzf(com.google.android.recaptcha.RecaptchaAction, long, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (r3.longValue() > (r11 - 2000)) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzg(long r11, jf.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzdf
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.recaptcha.internal.zzdf r0 = (com.google.android.recaptcha.internal.zzdf) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdf r0 = new com.google.android.recaptcha.internal.zzdf
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.zzb
            kf.a r1 = kf.a.f10464a
            int r2 = r0.zzd
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r11 = r0.zza
            com.google.android.recaptcha.internal.zzdi r0 = r0.zze
            cb.b.J(r13)     // Catch:{ Exception -> 0x002b }
            goto L_0x0084
        L_0x002b:
            r13 = move-exception
            goto L_0x0094
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            cb.b.J(r13)
            com.google.android.recaptcha.internal.zzai r13 = com.google.android.recaptcha.internal.zzai.zza
            com.google.android.recaptcha.internal.zzaf r13 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzln r5 = com.google.android.recaptcha.internal.zzln.INIT_NATIVE
            java.lang.String r6 = r10.zzg
            java.lang.String r8 = r10.zzh
            r9 = 0
            r4 = r13
            r7 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r2 = r10.zzd
            com.google.android.recaptcha.internal.zzr r4 = new com.google.android.recaptcha.internal.zzr
            r4.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r13, r2, r4)
            ag.t r13 = new ag.t
            r2 = 0
            r13.<init>(r2)
            r10.zzb = r13
            ag.s r13 = r10.zzm()
            int r13 = r13.hashCode()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r13)
            com.google.android.recaptcha.internal.zzdh r13 = new com.google.android.recaptcha.internal.zzdh     // Catch:{ Exception -> 0x0092 }
            r13.<init>(r10, r2)     // Catch:{ Exception -> 0x0092 }
            r0.zze = r10     // Catch:{ Exception -> 0x0092 }
            r0.zza = r11     // Catch:{ Exception -> 0x0092 }
            r0.zzd = r3     // Catch:{ Exception -> 0x0092 }
            r4 = 0
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x008a
            ag.m2 r2 = new ag.m2     // Catch:{ Exception -> 0x0092 }
            r2.<init>(r11, r0)     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r13 = ag.n2.c(r2, r13)     // Catch:{ Exception -> 0x0092 }
            if (r13 == r1) goto L_0x0089
            r0 = r10
        L_0x0084:
            ff.h r13 = (ff.h) r13     // Catch:{ Exception -> 0x002b }
            java.lang.Object r11 = r13.f8708a     // Catch:{ Exception -> 0x002b }
            goto L_0x00e2
        L_0x0089:
            return r1
        L_0x008a:
            ag.l2 r13 = new ag.l2     // Catch:{ Exception -> 0x0092 }
            java.lang.String r0 = "Timed out immediately"
            r13.<init>(r0, r2)     // Catch:{ Exception -> 0x0092 }
            throw r13     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            r13 = move-exception
            r0 = r10
        L_0x0094:
            r13.getMessage()
            boolean r1 = r13 instanceof ag.l2
            if (r1 == 0) goto L_0x00ac
            r2 = 2
            com.google.android.recaptcha.internal.zzln[] r2 = new com.google.android.recaptcha.internal.zzln[r2]
            r4 = 0
            com.google.android.recaptcha.internal.zzln r5 = com.google.android.recaptcha.internal.zzln.INIT_TOTAL
            r2[r4] = r5
            com.google.android.recaptcha.internal.zzln r4 = com.google.android.recaptcha.internal.zzln.INIT_NETWORK
            r2[r3] = r4
            java.util.List r2 = cb.d.P(r2)
            goto L_0x00b2
        L_0x00ac:
            com.google.android.recaptcha.internal.zzln r2 = com.google.android.recaptcha.internal.zzln.INIT_TOTAL
            java.util.List r2 = cb.d.O(r2)
        L_0x00b2:
            com.google.android.recaptcha.internal.zzdc r3 = r0.zzp
            java.lang.Long r3 = r3.zza()
            if (r1 != 0) goto L_0x00bb
            goto L_0x00d3
        L_0x00bb:
            if (r3 != 0) goto L_0x00be
            goto L_0x00c9
        L_0x00be:
            r4 = -2000(0xfffffffffffff830, double:NaN)
            long r11 = r11 + r4
            long r3 = r3.longValue()
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x00d3
        L_0x00c9:
            com.google.android.recaptcha.internal.zzh r11 = new com.google.android.recaptcha.internal.zzh
            com.google.android.recaptcha.internal.zzf r12 = com.google.android.recaptcha.internal.zzf.zze
            com.google.android.recaptcha.internal.zzd r13 = com.google.android.recaptcha.internal.zzd.zzT
            r11.<init>(r12, r13)
            goto L_0x00d7
        L_0x00d3:
            com.google.android.recaptcha.internal.zzh r11 = r0.zzp(r13)
        L_0x00d7:
            r0.zzq(r2, r11)
            com.google.android.recaptcha.RecaptchaException r11 = r11.zzc()
            ff.h$a r11 = cb.b.u(r11)
        L_0x00e2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdi.zzg(long, jf.d):java.lang.Object");
    }

    public final s zzm() {
        s sVar = this.zzb;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    public final void zzo() {
        zzln zzln = zzln.EXECUTE_TOTAL;
        String str = this.zzg;
        String str2 = this.zzh;
        zzaf zzaf = new zzaf(zzln, str, str2, str2, (String) null);
        zzh zzh2 = new zzh(zzf.zzc, zzd.zzU);
        zzai zzai = zzai.zza;
        zzai.zzb(zzaf, this.zzd, new zzr());
        zzai.zzd(zzaf, String.valueOf(zzh2.zzb().zza()), zzh2.zza().zza(), this.zze, this.zzf, (String) null);
    }
}

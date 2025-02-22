package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import gc.b;
import java.util.UUID;
import jf.d;
import kotlinx.coroutines.sync.c;
import sf.e;

public final class zzaa implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzv zza = new zzv((e) null);
    /* access modifiers changed from: private */
    public static zzaa zzb;
    /* access modifiers changed from: private */
    public static final String zzc = UUID.randomUUID().toString();
    /* access modifiers changed from: private */
    public static String zzd;
    /* access modifiers changed from: private */
    public static final c zze = b.b();
    private final zzdi zzf;
    private final String zzg;

    public zzaa(zzdi zzdi, String str) {
        this.zzf = zzdi;
        this.zzg = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m18execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r11, long r12, jf.d<? super ff.h<java.lang.String>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzw
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.recaptcha.internal.zzw r0 = (com.google.android.recaptcha.internal.zzw) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzw r0 = new com.google.android.recaptcha.internal.zzw
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.zza
            kf.a r1 = kf.a.f10464a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            cb.b.J(r14)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            cb.b.J(r14)
            r4 = 5000(0x1388, double:2.4703E-320)
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 < 0) goto L_0x0058
            ag.g0 r14 = com.google.android.recaptcha.internal.zzp.zzb()
            jf.f r14 = r14.f0()
            com.google.android.recaptcha.internal.zzx r2 = new com.google.android.recaptcha.internal.zzx
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.zzc = r3
            java.lang.Object r14 = cb.b.M(r14, r2, r0)
            if (r14 != r1) goto L_0x0053
            return r1
        L_0x0053:
            ff.h r14 = (ff.h) r14
            java.lang.Object r11 = r14.f8708a
            return r11
        L_0x0058:
            com.google.android.recaptcha.internal.zzdi r11 = r10.zzf
            r11.zzo()
            com.google.android.recaptcha.RecaptchaException r11 = new com.google.android.recaptcha.RecaptchaException
            com.google.android.recaptcha.RecaptchaErrorCode r12 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT
            r13 = 2
            r14 = 0
            r11.<init>(r12, r14, r13, r14)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaa.m18execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m19executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, jf.d<? super ff.h<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzy
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzy r0 = (com.google.android.recaptcha.internal.zzy) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzy r0 = new com.google.android.recaptcha.internal.zzy
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            kf.a r1 = kf.a.f10464a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            cb.b.J(r6)
            ff.h r6 = (ff.h) r6
            java.lang.Object r5 = r6.f8708a
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            cb.b.J(r6)
            r0.zzc = r3
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r5 = r4.m18execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaa.m19executegIAlus(com.google.android.recaptcha.RecaptchaAction, jf.d):java.lang.Object");
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzb.zza(cb.b.m(zzp.zzb(), new zzz(this, recaptchaAction, 5000, (d) null)));
    }

    public final zzdi zzb() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzg;
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzb.zza(cb.b.m(zzp.zzb(), new zzz(this, recaptchaAction, j10, (d) null)));
    }
}

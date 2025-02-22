package com.google.android.recaptcha;

import android.app.Application;
import cb.b;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzb;
import com.google.android.recaptcha.internal.zzp;
import jf.d;

public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default  reason: not valid java name */
    public static /* synthetic */ Object m14getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, d dVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j10 = RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT;
        }
        return recaptcha.m15getClientBWLJW6A(application, str, j10, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzb.zza(b.m(zzp.zzb(), new Recaptcha$getTasksClient$1(application, str, (d) null)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getClient-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m15getClientBWLJW6A(android.app.Application r11, java.lang.String r12, long r13, jf.d<? super ff.h<? extends com.google.android.recaptcha.RecaptchaClient>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.zza
            kf.a r1 = kf.a.f10464a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            cb.b.J(r15)     // Catch:{ all -> 0x0050 }
            goto L_0x004d
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            cb.b.J(r15)
            ag.g0 r15 = com.google.android.recaptcha.internal.zzp.zzb()     // Catch:{ all -> 0x0050 }
            jf.f r15 = r15.f0()     // Catch:{ all -> 0x0050 }
            com.google.android.recaptcha.Recaptcha$getClient$2$1 r2 = new com.google.android.recaptcha.Recaptcha$getClient$2$1     // Catch:{ all -> 0x0050 }
            r9 = 0
            r4 = r2
            r5 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r9)     // Catch:{ all -> 0x0050 }
            r0.zzc = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r15 = cb.b.M(r15, r2, r0)     // Catch:{ all -> 0x0050 }
            if (r15 != r1) goto L_0x004d
            return r1
        L_0x004d:
            com.google.android.recaptcha.internal.zzaa r15 = (com.google.android.recaptcha.internal.zzaa) r15     // Catch:{ all -> 0x0050 }
            goto L_0x0055
        L_0x0050:
            r11 = move-exception
            ff.h$a r15 = cb.b.u(r11)
        L_0x0055:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m15getClientBWLJW6A(android.app.Application, java.lang.String, long, jf.d):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzb.zza(b.m(zzp.zzb(), new Recaptcha$getTasksClient$2(application, str, j10, (d) null)));
    }
}

package com.google.android.recaptcha.internal;

import ag.g0;
import ff.m;
import jf.d;
import lf.i;
import rf.p;

final class zzdg extends i implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzdi zze;
    final /* synthetic */ String zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdg(zzdi zzdi, String str, d dVar) {
        super(2, dVar);
        this.zze = zzdi;
        this.zzf = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzdg(this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.recaptcha.internal.zzdi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.recaptcha.internal.zzdi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.recaptcha.internal.zzdi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r12.zzd
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            if (r1 == r2) goto L_0x0012
            java.lang.Object r0 = r12.zza
            cb.b.J(r13)     // Catch:{ all -> 0x0010 }
            goto L_0x006c
        L_0x0010:
            r13 = move-exception
            goto L_0x0074
        L_0x0012:
            java.lang.Object r1 = r12.zzc
            java.lang.Object r2 = r12.zzb
            java.lang.Object r4 = r12.zza
            cb.b.J(r13)
            goto L_0x0036
        L_0x001c:
            cb.b.J(r13)
            com.google.android.recaptcha.internal.zzdi r13 = r12.zze
            kotlinx.coroutines.sync.c r4 = r13.zzo
            java.lang.String r1 = r12.zzf
            r12.zza = r4
            r12.zzb = r13
            r12.zzc = r1
            r12.zzd = r2
            java.lang.Object r2 = r4.b(r12)
            if (r2 == r0) goto L_0x007c
            r2 = r13
        L_0x0036:
            r13 = r2
            com.google.android.recaptcha.internal.zzdi r13 = (com.google.android.recaptcha.internal.zzdi) r13     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = r13.zzd     // Catch:{ all -> 0x0077 }
            r13 = r2
            com.google.android.recaptcha.internal.zzdi r13 = (com.google.android.recaptcha.internal.zzdi) r13     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = r13.zzh     // Catch:{ all -> 0x0077 }
            r13 = r2
            com.google.android.recaptcha.internal.zzdi r13 = (com.google.android.recaptcha.internal.zzdi) r13     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = r13.zzg     // Catch:{ all -> 0x0077 }
            r13 = r2
            com.google.android.recaptcha.internal.zzdi r13 = (com.google.android.recaptcha.internal.zzdi) r13     // Catch:{ all -> 0x0077 }
            android.content.Context r9 = r13.zze     // Catch:{ all -> 0x0077 }
            com.google.android.recaptcha.internal.zzdi r2 = (com.google.android.recaptcha.internal.zzdi) r2     // Catch:{ all -> 0x0077 }
            com.google.android.recaptcha.internal.zzq r10 = r2.zzf     // Catch:{ all -> 0x0077 }
            r12.zza = r4     // Catch:{ all -> 0x0077 }
            r12.zzb = r3     // Catch:{ all -> 0x0077 }
            r12.zzc = r3     // Catch:{ all -> 0x0077 }
            r13 = 2
            r12.zzd = r13     // Catch:{ all -> 0x0077 }
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0077 }
            r11 = r12
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaz.zzb(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0077 }
            if (r13 == r0) goto L_0x0076
            r0 = r4
        L_0x006c:
            ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x0010 }
            r0.a(r3)
            ff.m r13 = ff.m.f8717a
            return r13
        L_0x0074:
            r4 = r0
            goto L_0x0078
        L_0x0076:
            return r0
        L_0x0077:
            r13 = move-exception
        L_0x0078:
            r4.a(r3)
            throw r13
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import jf.d;
import lf.c;

final class zzu extends c {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzv zzf;
    int zzg;
    zzq zzh;
    zzdi zzi;
    kotlinx.coroutines.sync.c zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu(zzv zzv, d dVar) {
        super(dVar);
        this.zzf = zzv;
    }

    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zza((Application) null, (String) null, 0, (zzq) null, (WebView) null, this);
    }
}

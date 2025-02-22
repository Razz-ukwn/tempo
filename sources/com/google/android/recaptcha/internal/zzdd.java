package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ff.h;
import jf.d;
import kf.a;
import lf.c;

final class zzdd extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdi zzb;
    int zzc;
    zzdi zzd;
    String zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdd(zzdi zzdi, d dVar) {
        super(dVar);
        this.zzb = zzdi;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf((RecaptchaAction) null, 0, this);
        return zzf == a.f10464a ? zzf : new h(zzf);
    }
}

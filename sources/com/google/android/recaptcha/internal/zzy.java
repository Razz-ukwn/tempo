package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ff.h;
import jf.d;
import kf.a;
import lf.c;

final class zzy extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaa zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzy(zzaa zzaa, d dVar) {
        super(dVar);
        this.zzb = zzaa;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r22 = this.zzb.m19executegIAlus((RecaptchaAction) null, this);
        return r22 == a.f10464a ? r22 : new h(r22);
    }
}

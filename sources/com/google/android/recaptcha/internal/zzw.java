package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ff.h;
import jf.d;
import kf.a;
import lf.c;

final class zzw extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzaa zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzw(zzaa zzaa, d dVar) {
        super(dVar);
        this.zzb = zzaa;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r42 = this.zzb.m18execute0E7RQCE((RecaptchaAction) null, 0, this);
        return r42 == a.f10464a ? r42 : new h(r42);
    }
}

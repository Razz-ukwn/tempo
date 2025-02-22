package com.google.android.recaptcha;

import android.app.Application;
import ff.h;
import jf.d;
import kf.a;
import lf.c;

public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object r72 = this.zzb.m15getClientBWLJW6A((Application) null, (String) null, 0, this);
        return r72 == a.f10464a ? r72 : new h(r72);
    }
}

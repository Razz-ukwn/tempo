package com.google.android.recaptcha.internal;

import ff.h;
import jf.d;
import kf.a;
import lf.c;

final class zzdf extends c {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdi zzc;
    int zzd;
    zzdi zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdf(zzdi zzdi, d dVar) {
        super(dVar);
        this.zzc = zzdi;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zzg = this.zzc.zzg(0, this);
        return zzg == a.f10464a ? zzg : new h(zzg);
    }
}

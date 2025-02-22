package com.google.android.recaptcha.internal;

import ag.g0;
import cb.b;
import com.google.android.recaptcha.RecaptchaAction;
import ff.h;
import ff.m;
import jf.d;
import kf.a;
import lf.i;
import rf.p;

final class zzx extends i implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaa, RecaptchaAction recaptchaAction, long j10, d dVar) {
        super(2, dVar);
        this.zzb = zzaa;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    public final d create(Object obj, d dVar) {
        return new zzx(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzx) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.zza;
        b.J(obj);
        if (i8 != 0) {
            obj2 = ((h) obj).f8708a;
        } else {
            zzdi zzb2 = this.zzb.zzb();
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj2 = zzb2.zzf(recaptchaAction, j10, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return new h(obj2);
    }
}

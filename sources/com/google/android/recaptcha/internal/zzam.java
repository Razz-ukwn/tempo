package com.google.android.recaptcha.internal;

import ag.g0;
import cb.b;
import ff.m;
import java.util.Timer;
import jf.d;
import lf.i;
import rf.p;

final class zzam extends i implements p {
    final /* synthetic */ zzao zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzam(zzao zzao, d dVar) {
        super(2, dVar);
        this.zza = zzao;
    }

    public final d create(Object obj, d dVar) {
        return new zzam(this.zza, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        zzao zzao = this.zza;
        synchronized (zzaj.class) {
            if (zzao.zze.zzb() == 0) {
                Timer zzb = zzao.zzb;
                if (zzb != null) {
                    zzb.cancel();
                }
                zzao.zzb = null;
            }
            zzao.zzg();
        }
        return m.f8717a;
    }
}

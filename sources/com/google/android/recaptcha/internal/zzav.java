package com.google.android.recaptcha.internal;

import ag.g0;
import ag.n1;
import cb.b;
import ff.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jf.d;
import kf.a;
import lf.i;
import rf.p;

final class zzav extends i implements p {
    int zza;
    final /* synthetic */ zzbh zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzay zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzav(zzbh zzbh, List list, zzay zzay, d dVar) {
        super(2, dVar);
        this.zzb = zzbh;
        this.zzc = list;
        this.zzd = zzay;
    }

    public final d create(Object obj, d dVar) {
        zzav zzav = new zzav(this.zzb, this.zzc, this.zzd, dVar);
        zzav.zze = obj;
        return zzav;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.zza;
        b.J(obj);
        if (i8 == 0) {
            g0 g0Var = (g0) this.zze;
            zzdt zzb2 = zzdt.zzb();
            while (true) {
                zzbh zzbh = this.zzb;
                if (zzbh.zzb() < 0 || zzbh.zzb() >= this.zzc.size()) {
                    break;
                }
                n1 n1Var = (n1) g0Var.f0().d(n1.b.f447a);
                if (!(n1Var != null ? n1Var.c() : true)) {
                    break;
                }
                try {
                    this.zzd.zzj((zznm) this.zzc.get(this.zzb.zzb()), this.zzb);
                } catch (Exception e10) {
                    zzay zzay = this.zzd;
                    zzbh zzbh2 = this.zzb;
                    this.zza = 1;
                    if (zzay.zzi(e10, zzbh2, this) == aVar) {
                        return aVar;
                    }
                }
            }
            zzb2.zzf();
            new Long(zzb2.zza(TimeUnit.MICROSECONDS));
            return m.f8717a;
        }
        return m.f8717a;
    }
}

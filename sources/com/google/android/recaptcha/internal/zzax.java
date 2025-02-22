package com.google.android.recaptcha.internal;

import ag.g0;
import cb.b;
import ff.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jf.d;
import kf.a;
import lf.i;
import rf.p;

final class zzax extends i implements p {
    int zza;
    final /* synthetic */ zzbh zzb;
    final /* synthetic */ zzay zzc;
    final /* synthetic */ String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzax(zzbh zzbh, zzay zzay, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzbh;
        this.zzc = zzay;
        this.zzd = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzax(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.zza;
        if (i8 == 0) {
            b.J(obj);
            this.zzb.zza = new zzm();
            zzni zzg = zzni.zzg(zzek.zzh().zzj(this.zzd));
            zzdt zzb2 = zzdt.zzb();
            zzna zzb3 = this.zzc.zzg(zzg.zzi(), zzg.zzj());
            zzb2.zzf();
            long zza2 = zzb2.zza(TimeUnit.MICROSECONDS);
            zzj zzj = zzj.zza;
            zzj.zza(zzl.zzm.zza(), zza2);
            zzay zzay = this.zzc;
            List zzi = zzb3.zzi();
            zzbh zzbh = this.zzb;
            this.zza = 1;
            if (zzay.zzh(zzi, zzbh, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            b.J(obj);
        } else {
            try {
                b.J(obj);
            } catch (Exception e10) {
                zzay zzay2 = this.zzc;
                zzbh zzbh2 = this.zzb;
                this.zza = 2;
                if (zzay2.zzi(e10, zzbh2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return m.f8717a;
    }
}

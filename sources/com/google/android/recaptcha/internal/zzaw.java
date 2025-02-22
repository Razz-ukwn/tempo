package com.google.android.recaptcha.internal;

import ag.g0;
import ag.n1;
import cb.b;
import ff.m;
import java.util.Arrays;
import jf.d;
import lf.i;
import rf.p;
import sf.w;

final class zzaw extends i implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzbh zzb;
    final /* synthetic */ zzay zzc;
    private /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaw(Exception exc, zzbh zzbh, zzay zzay, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzbh;
        this.zzc = zzay;
    }

    public final d create(Object obj, d dVar) {
        zzaw zzaw = new zzaw(this.zza, this.zzb, this.zzc, dVar);
        zzaw.zzd = obj;
        return zzaw;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        zznb zznb;
        b.J(obj);
        g0 g0Var = (g0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzs) {
            zznb = ((zzs) exc).zza();
            zznb.zzd(this.zzb.zzb());
        } else {
            zznb = zznc.zzf();
            zznb.zzd(this.zzb.zzb());
            zznb.zzp(2);
            zznb.zze(2);
        }
        zznc zznc = (zznc) zznb.zzj();
        zznc.zzk();
        zznc.zzj();
        w.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzbh zzbh = this.zzb;
        zzm zzc2 = zzbh.zzc();
        zzm zzm = zzbh.zza;
        if (zzm == null) {
            zzm = null;
        }
        zzlx zza2 = zzar.zza(zzc2, zzm);
        String zzf = this.zzb.zzf();
        if (zzf.length() == 0) {
            zzf = "recaptcha.m.Main.rge";
        }
        n1 n1Var = (n1) g0Var.f0().d(n1.b.f447a);
        if (n1Var != null ? n1Var.c() : true) {
            zzay zzay = this.zzc;
            zzek zzh = zzek.zzh();
            byte[] zzd2 = zznc.zzd();
            zzek zzh2 = zzek.zzh();
            byte[] zzd3 = zza2.zzd();
            zzay.zzb.zzb(zzf, (String[]) Arrays.copyOf(new String[]{zzh.zzi(zzd2, 0, zzd2.length), zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return m.f8717a;
    }
}

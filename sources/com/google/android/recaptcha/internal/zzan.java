package com.google.android.recaptcha.internal;

import ag.g0;
import android.content.ContentValues;
import cb.b;
import ff.m;
import gf.q;
import jf.d;
import lf.i;
import rf.p;

final class zzan extends i implements p {
    final /* synthetic */ zzmy zza;
    final /* synthetic */ zzao zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzan(zzmy zzmy, zzao zzao, d dVar) {
        super(2, dVar);
        this.zza = zzmy;
        this.zzb = zzao;
    }

    public final d create(Object obj, d dVar) {
        return new zzan(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        zzmy zzmy = this.zza;
        zzao zzao = this.zzb;
        synchronized (zzaj.class) {
            byte[] zzd = zzmy.zzd();
            zzae zzae = new zzae(zzek.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
            zzad zza2 = zzao.zze;
            ContentValues contentValues = new ContentValues();
            contentValues.put("ss", zzae.zzc());
            contentValues.put("ts", Long.valueOf(zzae.zzb()));
            zza2.getWritableDatabase().insert("ce", (String) null, contentValues);
            int zzb2 = zzao.zze.zzb() - 500;
            if (zzb2 > 0) {
                zzao.zze.zza(q.K0(zzao.zze.zzd(), zzb2));
            }
            if (zzao.zze.zzb() >= 20) {
                zzao.zzg();
            }
        }
        return m.f8717a;
    }
}

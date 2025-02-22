package com.google.android.recaptcha.internal;

import ff.m;
import rf.p;
import sf.k;

final class zzbu extends k implements p {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbu(zzbh zzbh, String str, int i8) {
        super(2);
        this.zza = zzbh;
        this.zzb = str;
        this.zzc = i8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzd().zzb(this.zzb, (String) obj2);
        int i8 = this.zzc;
        if (i8 != -1) {
            this.zza.zze().zzf(i8, objArr);
        }
        return m.f8717a;
    }
}

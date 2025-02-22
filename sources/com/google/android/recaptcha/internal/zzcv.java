package com.google.android.recaptcha.internal;

public final class zzcv implements zzca {
    public static final zzcv zza = new zzcv();

    private zzcv() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        int length = zznlArr.length;
        if (length == 2) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object zza3 = zzbh.zze().zza(zznlArr[1]);
                if (true != (zza3 instanceof zzm)) {
                    zza3 = null;
                }
                zzm zzm = (zzm) zza3;
                if (zzm != null) {
                    byte[] zzd = zzar.zza(zzbh.zzc(), zzm).zzd();
                    zzbh.zzd().zzb(str, zzek.zzh().zzi(zzd, 0, zzd.length));
                    return;
                }
                throw new zzs(4, 5, (Throwable) null);
            }
            throw new zzs(4, 5, (Throwable) null);
        } else if (length == 0) {
            zzbh.zze().zzf(i8, new zzm());
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

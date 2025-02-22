package com.google.android.recaptcha.internal;

public final class zzcp implements zzca {
    public static final zzcp zza = new zzcp();

    private zzcp() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 1) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                zzbh.zzh(str);
                return;
            }
            throw new zzs(4, 5, (Throwable) null);
        }
        throw new zzs(4, 3, (Throwable) null);
    }
}

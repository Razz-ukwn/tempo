package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzcq implements zzca {
    public static final zzcq zza = new zzcq();

    private zzcq() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 3) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    field.set(zzbh.zze().zza(zznlArr[1]), zzbh.zze().zza(zznlArr[2]));
                } catch (Exception e10) {
                    throw new zzs(6, 11, e10);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

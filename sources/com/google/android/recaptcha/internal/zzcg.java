package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzcg implements zzca {
    public static final zzcg zza = new zzcg();

    private zzcg() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 2) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Field)) {
                zza2 = null;
            }
            Field field = (Field) zza2;
            if (field != null) {
                try {
                    zzbh.zze().zzf(i8, field.get(zzbh.zze().zza(zznlArr[1])));
                } catch (Exception e10) {
                    throw new zzs(6, 16, e10);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

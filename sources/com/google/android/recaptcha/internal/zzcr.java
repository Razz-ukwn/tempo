package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzcr implements zzca {
    public static final zzcr zza = new zzcr();

    private zzcr() {
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
                    field.set((Object) null, zzbh.zze().zza(zznlArr[1]));
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

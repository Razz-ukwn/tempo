package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

public final class zzbm implements zzca {
    public static final zzbm zza = new zzbm();

    private zzbm() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 3) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzbh.zze().zza(zznlArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    Object zza4 = zzbh.zze().zza(zznlArr[2]);
                    if (true != (zza4 instanceof Object)) {
                        zza4 = null;
                    }
                    if (zza4 != null) {
                        try {
                            Array.set(zza2, intValue, zza4);
                        } catch (Exception e10) {
                            if (e10 instanceof ArrayIndexOutOfBoundsException) {
                                throw new zzs(4, 22, e10);
                            }
                            throw new zzs(4, 25, e10);
                        }
                    } else {
                        throw new zzs(4, 5, (Throwable) null);
                    }
                } else {
                    throw new zzs(4, 5, (Throwable) null);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

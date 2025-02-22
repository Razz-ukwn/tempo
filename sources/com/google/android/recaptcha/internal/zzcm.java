package com.google.android.recaptcha.internal;

import gf.l;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public final class zzcm implements zzca {
    public static final zzcm zza = new zzcm();

    private zzcm() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        int length = zznlArr.length;
        if (length != 0) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Constructor<?> constructor = zza2 instanceof Constructor ? (Constructor) zza2 : zza2.getClass().getConstructor(new Class[0]);
                Object[] zzh = zzbh.zze().zzh(l.f0(zznlArr).subList(1, length));
                try {
                    zzbh.zze().zzf(i8, constructor.newInstance(Arrays.copyOf(zzh, zzh.length)));
                } catch (Exception e10) {
                    throw new zzs(6, 14, e10);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

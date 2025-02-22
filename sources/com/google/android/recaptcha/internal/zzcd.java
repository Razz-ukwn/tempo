package com.google.android.recaptcha.internal;

import gf.l;
import java.util.Arrays;

public final class zzcd implements zzca {
    public static final zzcd zza = new zzcd();

    private zzcd() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        int length = zznlArr.length;
        if (length != 0) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Class)) {
                zza2 = null;
            }
            Class cls = (Class) zza2;
            if (cls != null) {
                Class[] zzg = zzbh.zze().zzg(l.f0(zznlArr).subList(1, length));
                try {
                    zzbh.zze().zzf(i8, cls.getConstructor((Class[]) Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e10) {
                    throw new zzs(6, 9, e10);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

package com.google.android.recaptcha.internal;

import gf.l;
import java.util.Arrays;
import sf.j;

public final class zzcf implements zzca {
    public static final zzcf zza = new zzcf();

    private zzcf() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        int length = zznlArr.length;
        if (length >= 2) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Class<?> cls = zza2 instanceof Class ? (Class) zza2 : zza2.getClass();
                Object zza3 = zzbh.zze().zza(zznlArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    String zza4 = zzbz.zza(this, str, zzbh.zza());
                    if (!j.a(zza4, "forName")) {
                        Class[] zzg = zzbh.zze().zzg(l.f0(zznlArr).subList(2, length));
                        try {
                            zzbh.zze().zzf(i8, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzg, zzg.length)));
                        } catch (Exception e10) {
                            throw new zzs(6, 13, e10);
                        }
                    } else {
                        throw new zzs(6, 48, (Throwable) null);
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

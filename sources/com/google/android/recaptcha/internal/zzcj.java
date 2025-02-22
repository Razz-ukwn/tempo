package com.google.android.recaptcha.internal;

import gf.l;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class zzcj implements zzca {
    public static final zzcj zza = new zzcj();

    private zzcj() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        int length = zznlArr.length;
        if (length != 0) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object[] zzh = zzbh.zze().zzh(l.f0(zznlArr).subList(1, length));
                try {
                    zzbh.zze().zzf(i8, method.invoke((Object) null, Arrays.copyOf(zzh, zzh.length)));
                } catch (Exception e10) {
                    throw new zzs(6, 15, e10);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}

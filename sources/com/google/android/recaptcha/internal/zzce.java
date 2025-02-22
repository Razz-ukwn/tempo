package com.google.android.recaptcha.internal;

public final class zzce implements zzca {
    public static final zzce zza = new zzce();

    private zzce() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 2) {
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
                    try {
                        zzbh.zze().zzf(i8, cls.getField(zzbz.zza(this, str, zzbh.zza())));
                    } catch (Exception e10) {
                        throw new zzs(6, 10, e10);
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

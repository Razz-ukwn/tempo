package com.google.android.recaptcha.internal;

public final class zzcs implements zzca {
    public static final zzcs zza = new zzcs();

    private zzcs() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 1) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Byte)) {
                zza2 = null;
            }
            Byte b10 = (Byte) zza2;
            if (b10 != null) {
                zzbh.zzj(b10.byteValue());
                return;
            }
            throw new zzs(4, 5, (Throwable) null);
        }
        throw new zzs(4, 3, (Throwable) null);
    }
}

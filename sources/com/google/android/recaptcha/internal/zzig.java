package com.google.android.recaptcha.internal;

final class zzig implements zzin {
    private final zzin[] zza;

    public zzig(zzin... zzinArr) {
        this.zza = zzinArr;
    }

    public final zzim zzb(Class cls) {
        zzin[] zzinArr = this.zza;
        for (int i8 = 0; i8 < 2; i8++) {
            zzin zzin = zzinArr[i8];
            if (zzin.zzc(cls)) {
                return zzin.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzin[] zzinArr = this.zza;
        for (int i8 = 0; i8 < 2; i8++) {
            if (zzinArr[i8].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

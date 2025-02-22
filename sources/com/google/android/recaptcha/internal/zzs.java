package com.google.android.recaptcha.internal;

public final class zzs extends Exception {
    private final Throwable zza;
    private final zznb zzb;
    private final int zzc;
    private final int zzd;

    public zzs(int i8, int i10, Throwable th) {
        this.zzc = i8;
        this.zzd = i10;
        this.zza = th;
        zznb zzf = zznc.zzf();
        zzf.zze(i10);
        zzf.zzp(i8);
        this.zzb = zzf;
    }

    public final Throwable getCause() {
        return this.zza;
    }

    public final zznb zza() {
        return this.zzb;
    }
}

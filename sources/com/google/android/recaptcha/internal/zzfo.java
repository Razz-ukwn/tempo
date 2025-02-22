package com.google.android.recaptcha.internal;

public abstract class zzfo {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzfp zzc;

    public /* synthetic */ zzfo(zzfn zzfn) {
    }

    public static int zzF(int i8) {
        return (i8 >>> 1) ^ (-(i8 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzfo zzH(byte[] bArr, int i8, int i10, boolean z10) {
        zzfk zzfk = new zzfk(bArr, 0, 0, false, (zzfj) null);
        try {
            zzfk.zze(0);
            return zzfk;
        } catch (zzhp e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i8);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i8);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i8);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzfi zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i8);
}

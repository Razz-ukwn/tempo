package com.google.android.recaptcha.internal;

public final class zzkp {
    public static final zzgn zza;
    public static final zzgn zzb;
    public static final zzgn zzc;

    static {
        zzgm zzi = zzgn.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zza = (zzgn) zzi.zzj();
        zzgm zzi2 = zzgn.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzb = (zzgn) zzi2.zzj();
        zzgm zzi3 = zzgn.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzc = (zzgn) zzi3.zzj();
    }

    public static zzgn zza(long j10) {
        return zzc(j10 / 1000, (int) ((j10 % 1000) * 1000000));
    }

    public static zzgn zzb(long j10) {
        return zzc(j10 / 1000000000, (int) (j10 % 1000000000));
    }

    public static zzgn zzc(long j10, int i8) {
        int i10;
        if (i8 <= -1000000000 || i8 >= 1000000000) {
            j10 = zzen.zza(j10, (long) (i8 / 1000000000));
            i8 %= 1000000000;
        }
        if (j10 > 0 && i8 < 0) {
            i8 += 1000000000;
            j10--;
        }
        if (j10 < 0 && i8 > 0) {
            i8 -= 1000000000;
            j10++;
        }
        zzgm zzi = zzgn.zzi();
        zzi.zze(j10);
        zzi.zzd(i8);
        zzgn zzgn = (zzgn) zzi.zzj();
        long zzg = zzgn.zzg();
        int zzf = zzgn.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && ((long) zzf) >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (i10 <= 0 && zzf <= 0))) {
            return zzgn;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
    }
}

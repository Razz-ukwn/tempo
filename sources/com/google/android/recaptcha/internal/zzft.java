package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzft extends zzey {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzft.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzd = zzkg.zzx();
    zzfu zza;

    private zzft() {
    }

    public /* synthetic */ zzft(zzfs zzfs) {
    }

    public static zzft zzA(byte[] bArr, int i8, int i10) {
        return new zzfq(bArr, 0, i10);
    }

    @Deprecated
    public static int zzt(int i8, zzip zzip, zzjc zzjc) {
        int zza2 = ((zzer) zzip).zza(zzjc);
        int zzy = zzy(i8 << 3);
        return zzy + zzy + zza2;
    }

    public static int zzu(int i8) {
        if (i8 >= 0) {
            return zzy(i8);
        }
        return 10;
    }

    public static int zzv(zzip zzip) {
        int zzn = zzip.zzn();
        return zzy(zzn) + zzn;
    }

    public static int zzw(zzip zzip, zzjc zzjc) {
        int zza2 = ((zzer) zzip).zza(zzjc);
        return zzy(zza2) + zza2;
    }

    public static int zzx(String str) {
        int i8;
        try {
            i8 = zzkl.zzc(str);
        } catch (zzkk unused) {
            i8 = str.getBytes(zzhn.zzb).length;
        }
        return zzy(i8) + i8;
    }

    public static int zzy(int i8) {
        if ((i8 & -128) == 0) {
            return 1;
        }
        if ((i8 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i8) == 0) {
            return 3;
        }
        return (i8 & -268435456) == 0 ? 4 : 5;
    }

    public static int zzz(long j10) {
        int i8;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if ((-2097152 & j10) != 0) {
            j10 >>>= 14;
            i8 += 2;
        }
        return (j10 & -16384) != 0 ? i8 + 1 : i8;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzkk zzkk) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzkk);
        byte[] bytes = str.getBytes(zzhn.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfr(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i8, boolean z10);

    public abstract void zze(int i8, zzfi zzfi);

    public abstract void zzf(int i8, int i10);

    public abstract void zzg(int i8);

    public abstract void zzh(int i8, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i8, int i10);

    public abstract void zzk(int i8);

    public abstract void zzl(byte[] bArr, int i8, int i10);

    public abstract void zzm(int i8, String str);

    public abstract void zzo(int i8, int i10);

    public abstract void zzp(int i8, int i10);

    public abstract void zzq(int i8);

    public abstract void zzr(int i8, long j10);

    public abstract void zzs(long j10);
}

package com.google.android.recaptcha.internal;

final class zzkh {
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i8) {
        if (!zze(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
                byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i8] = (char) ((b14 >>> 10) + 55232);
                cArr[i8 + 1] = (char) ((b14 & 1023) + 56320);
                return;
            }
        }
        throw zzhp.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i8) {
        if (!zze(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!zze(b12)) {
                cArr[i8] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzhp.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i8) {
        if (b10 < -62 || zze(b11)) {
            throw zzhp.zzd();
        }
        cArr[i8] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}

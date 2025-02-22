package com.google.android.recaptcha.internal;

public final class zzdr {
    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z10, String str, char c3) {
        if (!z10) {
            throw new IllegalArgumentException(zzdu.zza(str, Character.valueOf(c3)));
        }
    }

    public static void zzd(int i8, int i10, int i11) {
        String str;
        if (i8 < 0 || i10 < i8 || i10 > i11) {
            if (i8 < 0 || i8 > i11) {
                str = zzf(i8, i11, "start index");
            } else if (i10 < 0 || i10 > i11) {
                str = zzf(i10, i11, "end index");
            } else {
                str = zzdu.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i8, int i10, String str) {
        if (i8 < 0) {
            return zzdu.zza("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        return zzdu.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i10));
    }
}

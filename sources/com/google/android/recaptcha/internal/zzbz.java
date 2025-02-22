package com.google.android.recaptcha.internal;

public final /* synthetic */ class zzbz {
    public static String zza(zzca zzca, String str, byte b10) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            sb2.append((char) (str.charAt(i8) ^ b10));
        }
        return sb2.toString();
    }

    public static void zzb(zzca zzca, int i8, int i10) {
        if (i8 != i10) {
            throw new zzs(4, 24, (Throwable) null);
        }
    }
}

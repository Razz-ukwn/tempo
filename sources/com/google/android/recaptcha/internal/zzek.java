package com.google.android.recaptcha.internal;

import java.io.IOException;

public abstract class zzek {
    private static final zzek zza = new zzeh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzek zzb = new zzeh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzek zzc = new zzej("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzek zzd = new zzej("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzek zze = new zzeg("base16()", "0123456789ABCDEF");

    public static zzek zzg() {
        return zza;
    }

    public static zzek zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i8, int i10);

    public abstract int zzc(int i8);

    public abstract int zzd(int i8);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i8, int i10) {
        zzdr.zzd(0, i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i10));
        try {
            zzb(sb2, bArr, 0, i10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze2 = zze(charSequence);
            int zzc2 = zzc(zze2.length());
            byte[] bArr = new byte[zzc2];
            int zza2 = zza(bArr, zze2);
            if (zza2 == zzc2) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzei e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

package com.google.android.recaptcha.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzhn {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzfo zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzfo.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(int i8, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            i8 = (i8 * 31) + bArr[i12];
        }
        return i8;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}

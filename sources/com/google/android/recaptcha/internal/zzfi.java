package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import d.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzfi implements Iterable, Serializable {
    private static final Comparator zza = new zzfa();
    public static final zzfi zzb = new zzff(zzhn.zzd);
    private static final zzfh zzd = new zzfh((zzfg) null);
    private int zzc = 0;

    static {
        int i8 = zzeu.zza;
    }

    public static int zzk(int i8, int i10, int i11) {
        int i12 = i10 - i8;
        if ((i8 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException(a.a("Beginning index: ", i8, " < 0"));
        } else if (i10 < i8) {
            throw new IndexOutOfBoundsException(d.a("Beginning index larger than ending index: ", i8, ", ", i10));
        } else {
            throw new IndexOutOfBoundsException(d.a("End index: ", i10, " >= ", i11));
        }
    }

    public static zzfi zzm(byte[] bArr, int i8, int i10) {
        zzk(i8, i8 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        return new zzff(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.zzc;
        if (i8 == 0) {
            int zzd2 = zzd();
            i8 = zzf(zzd2, 0, zzd2);
            if (i8 == 0) {
                i8 = 1;
            }
            this.zzc = i8;
        }
        return i8;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzez(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzjr.zza(this) : zzjr.zza(zzg(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i8);

    public abstract byte zzb(int i8);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i8, int i10, int i11);

    public abstract int zzf(int i8, int i10, int i11);

    public abstract zzfi zzg(int i8, int i10);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzey zzey);

    public abstract boolean zzj();

    public final int zzl() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }

    public final byte[] zzo() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzhn.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}

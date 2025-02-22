package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import java.nio.charset.Charset;

class zzff extends zzfe {
    protected final byte[] zza;

    public zzff(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfi) || zzd() != ((zzfi) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzff)) {
            return obj.equals(this);
        }
        zzff zzff = (zzff) obj;
        int zzl = zzl();
        int zzl2 = zzff.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzff.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzff.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzff.zza;
            zzff.zzc();
            int i8 = 0;
            int i10 = 0;
            while (i8 < zzd) {
                if (bArr[i8] != bArr2[i10]) {
                    return false;
                }
                i8++;
                i10++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(d.a("Ran off end of other: 0, ", zzd, ", ", zzff.zzd()));
        }
    }

    public byte zza(int i8) {
        return this.zza[i8];
    }

    public byte zzb(int i8) {
        return this.zza[i8];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public void zze(byte[] bArr, int i8, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }

    public final int zzf(int i8, int i10, int i11) {
        return zzhn.zzb(i8, this.zza, 0, i11);
    }

    public final zzfi zzg(int i8, int i10) {
        int zzk = zzfi.zzk(0, i10, zzd());
        return zzk == 0 ? zzfi.zzb : new zzfc(this.zza, 0, zzk);
    }

    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final void zzi(zzey zzey) {
        ((zzfq) zzey).zzc(this.zza, 0, zzd());
    }

    public final boolean zzj() {
        return zzkl.zzf(this.zza, 0, zzd());
    }
}

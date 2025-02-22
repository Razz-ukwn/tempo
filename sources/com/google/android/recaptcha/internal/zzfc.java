package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import androidx.fragment.app.q;

final class zzfc extends zzff {
    private final int zzc;

    public zzfc(byte[] bArr, int i8, int i10) {
        super(bArr);
        zzfi.zzk(0, i10, bArr.length);
        this.zzc = i10;
    }

    public final byte zza(int i8) {
        int i10 = this.zzc;
        if (((i10 - (i8 + 1)) | i8) >= 0) {
            return this.zza[i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException(q.a("Index < 0: ", i8));
        }
        throw new ArrayIndexOutOfBoundsException(d.a("Index > length: ", i8, ", ", i10));
    }

    public final byte zzb(int i8) {
        return this.zza[i8];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final void zze(byte[] bArr, int i8, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }
}

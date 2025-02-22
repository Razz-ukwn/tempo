package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

final class zzez extends zzfb {
    final /* synthetic */ zzfi zza;
    private int zzb = 0;
    private final int zzc;

    public zzez(zzfi zzfi) {
        this.zza = zzfi;
        this.zzc = zzfi.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i8 = this.zzb;
        if (i8 < this.zzc) {
            this.zzb = i8 + 1;
            return this.zza.zzb(i8);
        }
        throw new NoSuchElementException();
    }
}

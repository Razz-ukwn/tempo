package com.google.android.recaptcha.internal;

import sf.e;

public final class zzcy {
    public static final zzcx zza = new zzcx((e) null);
    private int zzb;

    public zzcy(short s10, short s11) {
        this.zzb = Math.abs(s10);
    }

    public final short zza() {
        int i8 = ((this.zzb * 4391) + 277) % 32779;
        this.zzb = i8;
        return (short) (i8 % 255);
    }
}

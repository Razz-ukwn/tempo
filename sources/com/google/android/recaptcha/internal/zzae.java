package com.google.android.recaptcha.internal;

import sf.j;

public final class zzae {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzae(String str, long j10, int i8) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        return j.a(zzae.zza, this.zza) && zzae.zzb == this.zzb && zzae.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}

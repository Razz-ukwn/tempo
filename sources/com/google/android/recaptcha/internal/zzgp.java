package com.google.android.recaptcha.internal;

final class zzgp {
    private final Object zza;
    private final int zzb;

    public zzgp(Object obj, int i8) {
        this.zza = obj;
        this.zzb = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgp)) {
            return false;
        }
        zzgp zzgp = (zzgp) obj;
        return this.zza == zzgp.zza && this.zzb == zzgp.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}

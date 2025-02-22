package com.google.android.recaptcha.internal;

import java.util.Arrays;
import sf.j;

public final class zzaf {
    private final zzln zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze = null;

    public zzaf(zzln zzln, String str, String str2, String str3, String str4) {
        this.zza = zzln;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzaf = (zzaf) obj;
        return zzaf.zza == this.zza && j.a(zzaf.zzb, this.zzb) && j.a(zzaf.zzc, this.zzc) && j.a(zzaf.zzd, this.zzd) && j.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, null});
    }

    public final zzln zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}

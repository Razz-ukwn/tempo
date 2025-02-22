package com.google.android.recaptcha.internal;

final class zzja implements zzim {
    private final zzip zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzja(zzip zzip, String str, Object[] objArr) {
        this.zza = zzip;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i8 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i8 = i11;
            } else {
                this.zzd = c3 | (charAt2 << i10);
                return;
            }
        }
    }

    public final zzip zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        return (this.zzd & 1) != 0 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

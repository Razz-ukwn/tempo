package com.google.android.recaptcha.internal;

import d2.f1;
import zf.n;

public final class zzi implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String L0 = n.L0(String.valueOf(this.zzb / ((long) this.zza)), 10);
        String L02 = n.L0(String.valueOf(this.zzc), 10);
        String L03 = n.L0(String.valueOf(this.zzb), 10);
        String L04 = n.L0(String.valueOf(this.zza), 5);
        return "avgExecutionTime: " + L0 + " us| maxExecutionTime: " + L02 + " us| totalTime: " + L03 + " us| #Usages: " + L04;
    }

    /* renamed from: zza */
    public final int compareTo(zzi zzi) {
        return f1.t(Long.valueOf(this.zzb), Long.valueOf(zzi.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i8) {
        this.zza = i8;
    }
}

package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

public final class zzj {
    public static final zzj zza = new zzj();
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    private zzj() {
    }

    public static final void zza(int i8, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i8);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzi();
        }
        zzi zzi = (zzi) obj;
        zzi.zzg(zzi.zzb() + 1);
        zzi.zzf(zzi.zzd() + j10);
        zzi.zze(Math.max(j10, zzi.zzc()));
        concurrentHashMap.put(valueOf, zzi);
    }
}

package com.google.android.recaptcha.internal;

import java.util.List;

final class zzib extends zzid {
    private zzib() {
        super((zzic) null);
    }

    public /* synthetic */ zzib(zzia zzia) {
        super((zzic) null);
    }

    public final List zza(Object obj, long j10) {
        zzhm zzhm = (zzhm) zzkg.zzf(obj, j10);
        if (zzhm.zzc()) {
            return zzhm;
        }
        int size = zzhm.size();
        zzhm zzd = zzhm.zzd(size == 0 ? 10 : size + size);
        zzkg.zzs(obj, j10, zzd);
        return zzd;
    }

    public final void zzb(Object obj, long j10) {
        ((zzhm) zzkg.zzf(obj, j10)).zzb();
    }

    public final void zzc(Object obj, Object obj2, long j10) {
        zzhm zzhm = (zzhm) zzkg.zzf(obj, j10);
        zzhm zzhm2 = (zzhm) zzkg.zzf(obj2, j10);
        int size = zzhm.size();
        int size2 = zzhm2.size();
        if (size > 0 && size2 > 0) {
            if (!zzhm.zzc()) {
                zzhm = zzhm.zzd(size2 + size);
            }
            zzhm.addAll(zzhm2);
        }
        if (size > 0) {
            zzhm2 = zzhm;
        }
        zzkg.zzs(obj, j10, zzhm2);
    }
}

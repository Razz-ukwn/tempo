package com.google.android.recaptcha.internal;

import gf.l;
import gf.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbq implements zzca {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(m.n0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zznl) it.next()).zzM()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zzb(l.f0(zznlArr))) {
            for (zznl zzi : zznlArr) {
                zzbh.zze().zzb(zzi.zzi());
            }
            return;
        }
        throw new zzs(4, 5, (Throwable) null);
    }
}

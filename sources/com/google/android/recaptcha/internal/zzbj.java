package com.google.android.recaptcha.internal;

import cb.b;
import java.util.HashMap;
import java.util.NoSuchElementException;
import sf.j;
import uf.c;
import wf.f;

public final class zzbj {
    private final zzbb zza;
    private final zzn zzb;
    private final zzbi zzc;
    private byte zzd;
    private final HashMap zze;

    public zzbj(zzbb zzbb, zzn zzn) {
        this.zza = zzbb;
        this.zzb = zzn;
        zzbi zzbi = new zzbi();
        this.zzc = zzbi;
        f fVar = new f(1, 127);
        c.a aVar = c.f16031a;
        j.f(aVar, "random");
        try {
            this.zzd = (byte) b.F(aVar, fVar);
            HashMap hashMap = new HashMap();
            this.zze = hashMap;
            zzbi.zze(173, hashMap);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final byte zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzb;
    }

    public final zzbb zzc() {
        return this.zza;
    }

    public final zzbi zzd() {
        return this.zzc;
    }

    public final void zze() {
        this.zzc.zzd();
        this.zzc.zze(173, this.zze);
    }

    public final void zzf(byte b10) {
        this.zzd = b10;
    }

    public final void zzg(int i8, Object obj) {
        this.zze.put(Integer.valueOf(i8 - 2), obj);
    }
}

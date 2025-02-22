package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zzjl implements Iterator {
    final /* synthetic */ zzjp zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzjl(zzjp zzjp, zzjk zzjk) {
        this.zza = zzjp;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        if (this.zzb + 1 < this.zza.zzb.size()) {
            return true;
        }
        if (!this.zza.zzc.isEmpty()) {
            return zza().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i8 = this.zzb + 1;
        this.zzb = i8;
        return i8 < this.zza.zzb.size() ? (Map.Entry) this.zza.zzb.get(this.zzb) : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            if (this.zzb < this.zza.zzb.size()) {
                zzjp zzjp = this.zza;
                int i8 = this.zzb;
                this.zzb = i8 - 1;
                Object unused = zzjp.zzl(i8);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

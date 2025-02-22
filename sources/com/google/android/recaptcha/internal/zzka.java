package com.google.android.recaptcha.internal;

import java.util.Iterator;

final class zzka implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzkb zzb;

    public zzka(zzkb zzkb) {
        this.zzb = zzkb;
        this.zza = zzkb.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

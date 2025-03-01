package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zzht implements Iterator {
    private final Iterator zza;

    public zzht(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzhu ? new zzhs(entry, (zzhr) null) : entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}

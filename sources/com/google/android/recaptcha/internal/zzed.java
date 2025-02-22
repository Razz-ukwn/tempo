package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

final class zzed extends zzdy {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzed(Iterable iterable, int i8) {
        this.zza = iterable;
        this.zzb = i8;
    }

    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i8 = this.zzb;
        it.getClass();
        zzdr.zzb(i8 >= 0, "numberToAdvance must be nonnegative");
        for (int i10 = 0; i10 < i8 && it.hasNext(); i10++) {
            it.next();
        }
        return new zzec(this, it);
    }
}

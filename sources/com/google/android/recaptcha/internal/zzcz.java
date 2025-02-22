package com.google.android.recaptcha.internal;

import gf.l;
import gf.q;
import gf.s;
import java.util.Iterator;
import java.util.List;

public final class zzcz {
    private List zza = s.f8978a;

    public final void sss(int[] iArr) {
        zzb(iArr);
    }

    public final int zza(int[] iArr) {
        Iterator it = q.G0(l.e0(iArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() ^ ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(int[] iArr) {
        this.zza = l.e0(iArr);
    }
}

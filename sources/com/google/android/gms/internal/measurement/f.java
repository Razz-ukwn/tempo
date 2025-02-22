package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class f implements o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5269a;

    public f(Boolean bool) {
        this.f5269a = bool == null ? false : bool.booleanValue();
    }

    public final o c(String str, c cVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z10 = this.f5269a;
        if (equals) {
            return new s(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(z10), str}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f5269a == ((f) obj).f5269a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f5269a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f5269a);
    }

    public final o zzd() {
        return new f(Boolean.valueOf(this.f5269a));
    }

    public final Boolean zzg() {
        return Boolean.valueOf(this.f5269a);
    }

    public final Double zzh() {
        return Double.valueOf(true != this.f5269a ? 0.0d : 1.0d);
    }

    public final String zzi() {
        return Boolean.toString(this.f5269a);
    }

    public final Iterator zzl() {
        return null;
    }
}

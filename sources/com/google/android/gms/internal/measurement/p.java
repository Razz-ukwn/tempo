package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final String f5457a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5458b;

    public p(String str, ArrayList arrayList) {
        this.f5457a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f5458b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final o c(String str, c cVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f5457a;
        if (str == null ? pVar.f5457a == null : str.equals(pVar.f5457a)) {
            return this.f5458b.equals(pVar.f5458b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5457a;
        return this.f5458b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final o zzd() {
        return this;
    }

    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final Iterator zzl() {
        return null;
    }
}

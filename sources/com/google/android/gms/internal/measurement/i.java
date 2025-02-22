package com.google.android.gms.internal.measurement;

import ag.b1;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class i implements o, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f5319a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5320b = new HashMap();

    public i(String str) {
        this.f5319a = str;
    }

    public final boolean a(String str) {
        return this.f5320b.containsKey(str);
    }

    public final void b(String str, o oVar) {
        HashMap hashMap = this.f5320b;
        if (oVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, oVar);
        }
    }

    public final o c(String str, c cVar, ArrayList arrayList) {
        return "toString".equals(str) ? new s(this.f5319a) : b1.h(this, new s(str), cVar, arrayList);
    }

    public final o d(String str) {
        HashMap hashMap = this.f5320b;
        return hashMap.containsKey(str) ? (o) hashMap.get(str) : o.f5428j;
    }

    public abstract o e(c cVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f5319a;
        if (str != null) {
            return str.equals(iVar.f5319a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5319a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public o zzd() {
        return this;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return this.f5319a;
    }

    public final Iterator zzl() {
        return new j(this.f5320b.keySet().iterator());
    }
}

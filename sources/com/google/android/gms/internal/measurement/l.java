package com.google.android.gms.internal.measurement;

import ag.b1;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class l implements o, k {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5379a = new HashMap();

    public final boolean a(String str) {
        return this.f5379a.containsKey(str);
    }

    public final void b(String str, o oVar) {
        HashMap hashMap = this.f5379a;
        if (oVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, oVar);
        }
    }

    public o c(String str, c cVar, ArrayList arrayList) {
        return "toString".equals(str) ? new s(toString()) : b1.h(this, new s(str), cVar, arrayList);
    }

    public final o d(String str) {
        HashMap hashMap = this.f5379a;
        return hashMap.containsKey(str) ? (o) hashMap.get(str) : o.f5428j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f5379a.equals(((l) obj).f5379a);
    }

    public final int hashCode() {
        return this.f5379a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.f5379a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", new Object[]{str, hashMap.get(str)}));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public final o zzd() {
        l lVar = new l();
        for (Map.Entry entry : this.f5379a.entrySet()) {
            boolean z10 = entry.getValue() instanceof k;
            HashMap hashMap = lVar.f5379a;
            if (z10) {
                hashMap.put((String) entry.getKey(), (o) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((o) entry.getValue()).zzd());
            }
        }
        return lVar;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return "[object Object]";
    }

    public final Iterator zzl() {
        return new j(this.f5379a.keySet().iterator());
    }
}

package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public final o f5280a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5281b;

    public g() {
        throw null;
    }

    public g(String str) {
        this.f5280a = o.f5428j;
        this.f5281b = str;
    }

    public g(String str, o oVar) {
        this.f5280a = oVar;
        this.f5281b = str;
    }

    public final o c(String str, c cVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5281b.equals(gVar.f5281b) && this.f5280a.equals(gVar.f5280a);
    }

    public final int hashCode() {
        return this.f5280a.hashCode() + (this.f5281b.hashCode() * 31);
    }

    public final o zzd() {
        return new g(this.f5281b, this.f5280a.zzd());
    }

    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    public final Iterator zzl() {
        return null;
    }
}

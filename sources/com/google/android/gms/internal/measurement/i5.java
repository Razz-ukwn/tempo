package com.google.android.gms.internal.measurement;

import b2.c;
import cb.e;

public final class i5 implements g5 {

    /* renamed from: a  reason: collision with root package name */
    public volatile g5 f5324a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5325b;

    public i5(g5 g5Var) {
        this.f5324a = g5Var;
    }

    public final String toString() {
        Object obj = this.f5324a;
        if (obj == e.f3893a) {
            obj = c.a("<supplier that returned ", String.valueOf(this.f5325b), ">");
        }
        return c.a("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    public final Object zza() {
        g5 g5Var = this.f5324a;
        e eVar = e.f3893a;
        if (g5Var != eVar) {
            synchronized (this) {
                if (this.f5324a != eVar) {
                    Object zza = this.f5324a.zza();
                    this.f5325b = zza;
                    this.f5324a = eVar;
                    return zza;
                }
            }
        }
        return this.f5325b;
    }
}

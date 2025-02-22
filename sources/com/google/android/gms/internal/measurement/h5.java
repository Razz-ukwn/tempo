package com.google.android.gms.internal.measurement;

import b2.c;
import java.io.Serializable;

public final class h5 implements Serializable, g5 {

    /* renamed from: a  reason: collision with root package name */
    public final g5 f5305a;

    /* renamed from: b  reason: collision with root package name */
    public volatile transient boolean f5306b;

    /* renamed from: c  reason: collision with root package name */
    public transient Object f5307c;

    public h5(g5 g5Var) {
        this.f5305a = g5Var;
    }

    public final String toString() {
        return c.a("Suppliers.memoize(", (this.f5306b ? c.a("<supplier that returned ", String.valueOf(this.f5307c), ">") : this.f5305a).toString(), ")");
    }

    public final Object zza() {
        if (!this.f5306b) {
            synchronized (this) {
                if (!this.f5306b) {
                    Object zza = this.f5305a.zza();
                    this.f5307c = zza;
                    this.f5306b = true;
                    return zza;
                }
            }
        }
        return this.f5307c;
    }
}

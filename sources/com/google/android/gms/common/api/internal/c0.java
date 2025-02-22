package com.google.android.gms.common.api.internal;

import java.util.Arrays;
import t6.d;
import u6.o;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f4231a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4232b;

    public /* synthetic */ c0(a aVar, d dVar) {
        this.f4231a = aVar;
        this.f4232b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof c0)) {
            c0 c0Var = (c0) obj;
            return o.a(this.f4231a, c0Var.f4231a) && o.a(this.f4232b, c0Var.f4232b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4231a, this.f4232b});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f4231a, "key");
        aVar.a(this.f4232b, "feature");
        return aVar.toString();
    }
}

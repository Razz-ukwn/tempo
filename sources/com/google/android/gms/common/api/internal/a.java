package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import java.util.Arrays;
import u6.o;

public final class a<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final int f4207a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.common.api.a f4208b;

    /* renamed from: c  reason: collision with root package name */
    public final a.c f4209c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4210d;

    public a(com.google.android.gms.common.api.a aVar, a.c cVar, String str) {
        this.f4208b = aVar;
        this.f4209c = cVar;
        this.f4210d = str;
        this.f4207a = Arrays.hashCode(new Object[]{aVar, cVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o.a(this.f4208b, aVar.f4208b) && o.a(this.f4209c, aVar.f4209c) && o.a(this.f4210d, aVar.f4210d);
    }

    public final int hashCode() {
        return this.f4207a;
    }
}

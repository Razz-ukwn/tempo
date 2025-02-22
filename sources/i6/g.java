package i6;

import android.content.Context;
import ef.a;
import f6.b;
import j6.e;
import j6.r;
import k6.d;
import m6.c;

public final class g implements b<r> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f9613a;

    /* renamed from: b  reason: collision with root package name */
    public final a<d> f9614b;

    /* renamed from: c  reason: collision with root package name */
    public final a<e> f9615c;

    /* renamed from: d  reason: collision with root package name */
    public final a<m6.a> f9616d;

    public g(a aVar, a aVar2, f fVar) {
        c cVar = c.a.f11220a;
        this.f9613a = aVar;
        this.f9614b = aVar2;
        this.f9615c = fVar;
        this.f9616d = cVar;
    }

    public final Object get() {
        m6.a aVar = this.f9616d.get();
        return new j6.d(this.f9613a.get(), this.f9614b.get(), this.f9615c.get());
    }
}

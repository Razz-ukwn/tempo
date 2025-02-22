package k6;

import android.content.Context;
import ef.a;
import f6.b;
import k6.f;
import k6.g;

public final class a0 implements b<z> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f10300a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String> f10301b;

    /* renamed from: c  reason: collision with root package name */
    public final a<Integer> f10302c;

    public a0(a aVar) {
        f fVar = f.a.f10307a;
        g gVar = g.a.f10308a;
        this.f10300a = aVar;
        this.f10301b = fVar;
        this.f10302c = gVar;
    }

    public final Object get() {
        return new z(this.f10302c.get().intValue(), this.f10300a.get(), this.f10301b.get());
    }
}

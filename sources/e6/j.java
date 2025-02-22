package e6;

import android.content.Context;
import ef.a;
import f6.b;
import f6.c;
import m6.b;
import m6.c;

public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f7857a;

    /* renamed from: b  reason: collision with root package name */
    public final a<m6.a> f7858b;

    /* renamed from: c  reason: collision with root package name */
    public final a<m6.a> f7859c;

    public j(c cVar) {
        m6.b bVar = b.a.f11219a;
        m6.c cVar2 = c.a.f11220a;
        this.f7857a = cVar;
        this.f7858b = bVar;
        this.f7859c = cVar2;
    }

    public final Object get() {
        return new i(this.f7857a.get(), this.f7858b.get(), this.f7859c.get());
    }
}

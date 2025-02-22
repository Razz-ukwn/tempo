package cg;

import ag.i0;
import ag.k;
import ag.l;
import cb.b;
import ff.m;
import kotlinx.coroutines.internal.v;

public class x<E> extends v {

    /* renamed from: d  reason: collision with root package name */
    public final E f4038d;

    /* renamed from: e  reason: collision with root package name */
    public final k<m> f4039e;

    public x(Object obj, l lVar) {
        this.f4038d = obj;
        this.f4039e = lVar;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + i0.d(this) + '(' + this.f4038d + ')';
    }

    public final void w() {
        this.f4039e.g();
    }

    public final E x() {
        return this.f4038d;
    }

    public final void y(j<?> jVar) {
        Throwable th = jVar.f4030d;
        if (th == null) {
            th = new l();
        }
        this.f4039e.resumeWith(b.u(th));
    }

    public final v z() {
        if (this.f4039e.b(m.f8717a, (Object) null) == null) {
            return null;
        }
        return ag.m.f438a;
    }
}

package cg;

import ag.a;
import ag.o1;
import cg.o;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import jf.f;

public class g<E> extends a<m> implements f<E> {

    /* renamed from: c  reason: collision with root package name */
    public final f<E> f4026c;

    public g(f fVar, a aVar) {
        super(fVar, true);
        this.f4026c = aVar;
    }

    public final void e(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new o1(B(), (Throwable) null, this);
            }
            y(cancellationException);
        }
    }

    public final void f(o.b bVar) {
        this.f4026c.f(bVar);
    }

    public final Object h() {
        return this.f4026c.h();
    }

    public final h<E> iterator() {
        return this.f4026c.iterator();
    }

    public final boolean k(Throwable th) {
        return this.f4026c.k(th);
    }

    public final Object m(d<? super i<? extends E>> dVar) {
        return this.f4026c.m(dVar);
    }

    public final Object o(E e10) {
        return this.f4026c.o(e10);
    }

    public final boolean r() {
        return this.f4026c.r();
    }

    public final Object t(E e10, d<? super m> dVar) {
        return this.f4026c.t(e10, dVar);
    }

    public final void y(CancellationException cancellationException) {
        this.f4026c.e(cancellationException);
        x(cancellationException);
    }
}

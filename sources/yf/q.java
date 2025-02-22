package yf;

import java.util.Iterator;
import rf.l;
import sf.j;

public final class q<T, R> implements g<R> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f17399a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f17400b;

    public static final class a implements Iterator<R>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f17401a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q<T, R> f17402b;

        public a(q<T, R> qVar) {
            this.f17402b = qVar;
            this.f17401a = qVar.f17399a.iterator();
        }

        public final boolean hasNext() {
            return this.f17401a.hasNext();
        }

        public final R next() {
            return this.f17402b.f17400b.invoke(this.f17401a.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(g<? extends T> gVar, l<? super T, ? extends R> lVar) {
        j.f(lVar, "transformer");
        this.f17399a = gVar;
        this.f17400b = lVar;
    }

    public final Iterator<R> iterator() {
        return new a(this);
    }
}

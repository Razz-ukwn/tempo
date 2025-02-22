package x;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import sf.j;
import tf.a;
import w.d;

public final class c<E> implements Iterator<E>, a {

    /* renamed from: a  reason: collision with root package name */
    public Object f16816a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<E, a> f16817b;

    /* renamed from: c  reason: collision with root package name */
    public int f16818c;

    public c(Object obj, d dVar) {
        j.f(dVar, "map");
        this.f16816a = obj;
        this.f16817b = dVar;
    }

    public final boolean hasNext() {
        return this.f16818c < this.f16817b.size();
    }

    public final E next() {
        if (hasNext()) {
            E e10 = this.f16816a;
            this.f16818c++;
            a aVar = this.f16817b.get(e10);
            if (aVar != null) {
                this.f16816a = aVar.f16811b;
                return e10;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

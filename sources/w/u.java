package w;

import java.util.Iterator;
import tf.a;

public abstract class u<K, V, T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f16464a = t.f16457e.f16461d;

    /* renamed from: b  reason: collision with root package name */
    public int f16465b;

    /* renamed from: c  reason: collision with root package name */
    public int f16466c;

    public u() {
        t tVar = t.f16457e;
    }

    public final boolean hasNext() {
        return this.f16466c < this.f16465b;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

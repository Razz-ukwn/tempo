package yf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import yf.k;

public final class a<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<g<T>> f17367a;

    public a(k.a aVar) {
        this.f17367a = new AtomicReference<>(aVar);
    }

    public final Iterator<T> iterator() {
        g andSet = this.f17367a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

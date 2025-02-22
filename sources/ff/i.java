package ff;

import cb.c;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rf.a;
import sf.j;

public final class i<T> implements d<T>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<i<?>, Object> f8710c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "b");

    /* renamed from: a  reason: collision with root package name */
    public volatile a<? extends T> f8711a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8712b = c.f3885a;

    public i(a<? extends T> aVar) {
        j.f(aVar, "initializer");
        this.f8711a = aVar;
    }

    public final T getValue() {
        boolean z10;
        T t2 = this.f8712b;
        T t10 = c.f3885a;
        if (t2 != t10) {
            return t2;
        }
        a<? extends T> aVar = this.f8711a;
        if (aVar != null) {
            T d10 = aVar.d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8710c;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, t10, d10)) {
                    if (atomicReferenceFieldUpdater.get(this) != t10) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.f8711a = null;
                return d10;
            }
        }
        return this.f8712b;
    }

    public final String toString() {
        return this.f8712b != c.f3885a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

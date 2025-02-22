package ff;

import cb.c;
import java.io.Serializable;
import rf.a;

public final class j<T> implements d<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f8713a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8714b = c.f3885a;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8715c = this;

    public j(a aVar) {
        sf.j.f(aVar, "initializer");
        this.f8713a = aVar;
    }

    public final T getValue() {
        T t2;
        T t10 = this.f8714b;
        T t11 = c.f3885a;
        if (t10 != t11) {
            return t10;
        }
        synchronized (this.f8715c) {
            t2 = this.f8714b;
            if (t2 == t11) {
                a aVar = this.f8713a;
                sf.j.c(aVar);
                t2 = aVar.d();
                this.f8714b = t2;
                this.f8713a = null;
            }
        }
        return t2;
    }

    public final String toString() {
        return this.f8714b != c.f3885a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

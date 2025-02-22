package ff;

import cb.c;
import java.io.Serializable;
import rf.a;
import sf.j;

public final class n<T> implements d<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f8718a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8719b = c.f3885a;

    public n(a<? extends T> aVar) {
        j.f(aVar, "initializer");
        this.f8718a = aVar;
    }

    public final T getValue() {
        if (this.f8719b == c.f3885a) {
            a<? extends T> aVar = this.f8718a;
            j.c(aVar);
            this.f8719b = aVar.d();
            this.f8718a = null;
        }
        return this.f8719b;
    }

    public final String toString() {
        return this.f8719b != c.f3885a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

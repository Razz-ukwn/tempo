package w;

import gf.e;
import java.util.Iterator;
import sf.j;

public final class l<K, V> extends e<V> {

    /* renamed from: a  reason: collision with root package name */
    public final f<K, V> f16453a;

    public l(f<K, V> fVar) {
        j.f(fVar, "builder");
        this.f16453a = fVar;
    }

    public final int a() {
        f<K, V> fVar = this.f16453a;
        fVar.getClass();
        return fVar.B;
    }

    public final boolean add(V v3) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f16453a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f16453a.containsValue(obj);
    }

    public final Iterator<V> iterator() {
        return new m(this.f16453a);
    }
}

package w;

import gf.a;
import java.util.Iterator;
import sf.j;

public final class r<K, V> extends a<V> {

    /* renamed from: a  reason: collision with root package name */
    public final d<K, V> f16456a;

    public r(d<K, V> dVar) {
        j.f(dVar, "map");
        this.f16456a = dVar;
    }

    public final int a() {
        d<K, V> dVar = this.f16456a;
        dVar.getClass();
        return dVar.f16439b;
    }

    public final boolean contains(Object obj) {
        return this.f16456a.containsValue(obj);
    }

    public final Iterator<V> iterator() {
        return new s(this.f16456a.f16438a);
    }
}

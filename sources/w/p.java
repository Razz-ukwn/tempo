package w;

import gf.i;
import java.util.Iterator;
import sf.j;
import v.a;

public final class p<K, V> extends i<K> implements a<K> {

    /* renamed from: a  reason: collision with root package name */
    public final d<K, V> f16455a;

    public p(d<K, V> dVar) {
        j.f(dVar, "map");
        this.f16455a = dVar;
    }

    public final int a() {
        d<K, V> dVar = this.f16455a;
        dVar.getClass();
        return dVar.f16439b;
    }

    public final boolean contains(Object obj) {
        return this.f16455a.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return new q(this.f16455a.f16438a);
    }
}

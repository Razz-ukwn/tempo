package w;

import gf.i;
import java.util.Iterator;
import java.util.Map;
import sf.j;
import v.a;

public final class n<K, V> extends i<Map.Entry<? extends K, ? extends V>> implements a<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: a  reason: collision with root package name */
    public final d<K, V> f16454a;

    public n(d<K, V> dVar) {
        j.f(dVar, "map");
        this.f16454a = dVar;
    }

    public final int a() {
        d<K, V> dVar = this.f16454a;
        dVar.getClass();
        return dVar.f16439b;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        Object key = entry.getKey();
        d<K, V> dVar = this.f16454a;
        V v3 = dVar.get(key);
        return v3 != null ? j.a(v3, entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.f16454a.f16438a);
    }
}

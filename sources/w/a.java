package w;

import gf.h;
import java.util.Map;
import java.util.Map.Entry;
import sf.j;

public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends h<E> {
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        Object key = entry.getKey();
        f<K, V> fVar = ((h) this).f16450a;
        V v3 = fVar.get(key);
        return v3 != null ? j.a(v3, entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        return ((h) this).f16450a.remove(entry.getKey(), entry.getValue());
    }
}

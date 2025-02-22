package gf;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import tf.c;
import w.f;
import w.h;
import w.j;
import w.l;

public abstract class g<K, V> extends AbstractMap<K, V> implements Map<K, V>, c {
    public final Set<Map.Entry<K, V>> entrySet() {
        return new h((f) this);
    }

    public final Set<K> keySet() {
        return new j((f) this);
    }

    public final int size() {
        return ((f) this).B;
    }

    public final Collection<V> values() {
        return new l((f) this);
    }
}

package b0;

import java.util.Iterator;
import java.util.Map;
import sf.j;
import tf.a;

public final class f0<K, V> extends d0<K, V> implements Iterator<V>, a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(uVar, it);
        j.f(uVar, "map");
        j.f(it, "iterator");
    }

    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.f2906e;
        if (entry != null) {
            a();
            return entry.getValue();
        }
        throw new IllegalStateException();
    }
}

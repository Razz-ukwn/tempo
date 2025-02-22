package b0;

import java.util.Iterator;
import java.util.Map;
import sf.j;
import tf.a;

public final class c0<K, V> extends d0<K, V> implements Iterator<Map.Entry<K, V>>, a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(uVar, it);
        j.f(uVar, "map");
        j.f(it, "iterator");
    }

    public final Object next() {
        a();
        if (this.f2905d != null) {
            return new b0(this);
        }
        throw new IllegalStateException();
    }
}

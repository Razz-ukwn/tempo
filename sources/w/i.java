package w;

import java.util.Iterator;
import java.util.Map;
import sf.j;
import tf.a;

public final class i<K, V> implements Iterator<Map.Entry<K, V>>, a {

    /* renamed from: a  reason: collision with root package name */
    public final g<K, V, Map.Entry<K, V>> f16451a;

    public i(f<K, V> fVar) {
        j.f(fVar, "builder");
        u[] uVarArr = new u[8];
        for (int i8 = 0; i8 < 8; i8++) {
            uVarArr[i8] = new x(this);
        }
        this.f16451a = new g<>(fVar, uVarArr);
    }

    public final boolean hasNext() {
        return this.f16451a.f16442c;
    }

    public final Object next() {
        return this.f16451a.next();
    }

    public final void remove() {
        this.f16451a.remove();
    }
}

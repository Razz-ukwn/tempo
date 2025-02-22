package w;

import java.util.Iterator;
import java.util.Map;
import sf.j;

public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final f<K, V> f16450a;

    public h(f<K, V> fVar) {
        j.f(fVar, "builder");
        this.f16450a = fVar;
    }

    public final int a() {
        f<K, V> fVar = this.f16450a;
        fVar.getClass();
        return fVar.B;
    }

    public final boolean add(Object obj) {
        j.f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f16450a.clear();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f16450a);
    }
}

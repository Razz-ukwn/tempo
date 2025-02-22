package w;

import gf.h;
import java.util.Iterator;

public final class j<K, V> extends h<K> {

    /* renamed from: a  reason: collision with root package name */
    public final f<K, V> f16452a;

    public j(f<K, V> fVar) {
        sf.j.f(fVar, "builder");
        this.f16452a = fVar;
    }

    public final int a() {
        f<K, V> fVar = this.f16452a;
        fVar.getClass();
        return fVar.B;
    }

    public final boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f16452a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f16452a.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return new k(this.f16452a);
    }

    public final boolean remove(Object obj) {
        f<K, V> fVar = this.f16452a;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}

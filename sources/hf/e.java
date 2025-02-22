package hf;

import hf.b;
import java.util.Collection;
import java.util.Iterator;
import sf.j;

public final class e<V> extends gf.e<V> {

    /* renamed from: a  reason: collision with root package name */
    public final b<?, V> f9326a;

    public e(b<?, V> bVar) {
        j.f(bVar, "backing");
        this.f9326a = bVar;
    }

    public final int a() {
        return this.f9326a.D;
    }

    public final boolean add(V v3) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends V> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f9326a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f9326a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f9326a.isEmpty();
    }

    public final Iterator<V> iterator() {
        b<?, V> bVar = this.f9326a;
        bVar.getClass();
        return new b.f(bVar);
    }

    public final boolean remove(Object obj) {
        int i8;
        b<?, V> bVar = this.f9326a;
        bVar.b();
        int i10 = bVar.B;
        while (true) {
            i8 = -1;
            i10--;
            if (i10 < 0) {
                break;
            } else if (bVar.f9316c[i10] >= 0) {
                V[] vArr = bVar.f9315b;
                j.c(vArr);
                if (j.a(vArr[i10], obj)) {
                    i8 = i10;
                    break;
                }
            }
        }
        if (i8 < 0) {
            return false;
        }
        bVar.j(i8);
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9326a.b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9326a.b();
        return super.retainAll(collection);
    }
}

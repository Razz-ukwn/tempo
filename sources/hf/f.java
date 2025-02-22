package hf;

import gf.h;
import hf.b;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import sf.j;

public final class f<E> extends h<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final b<E, ?> f9327a = new b<>();

    public final int a() {
        return this.f9327a.D;
    }

    public final boolean add(E e10) {
        return this.f9327a.a(e10) >= 0;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        this.f9327a.b();
        return super.addAll(collection);
    }

    public final void clear() {
        this.f9327a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f9327a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f9327a.isEmpty();
    }

    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f9327a;
        bVar.getClass();
        return new b.e(bVar);
    }

    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f9327a;
        bVar.b();
        int g10 = bVar.g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            bVar.j(g10);
        }
        return g10 >= 0;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9327a.b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9327a.b();
        return super.retainAll(collection);
    }
}

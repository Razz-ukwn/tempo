package hf;

import gf.h;
import hf.b;
import java.util.Collection;
import java.util.Iterator;
import sf.j;

public final class d<E> extends h<E> {

    /* renamed from: a  reason: collision with root package name */
    public final b<E, ?> f9325a;

    public d(b<E, ?> bVar) {
        j.f(bVar, "backing");
        this.f9325a = bVar;
    }

    public final int a() {
        return this.f9325a.D;
    }

    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f9325a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f9325a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f9325a.isEmpty();
    }

    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f9325a;
        bVar.getClass();
        return new b.e(bVar);
    }

    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f9325a;
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
        this.f9325a.b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9325a.b();
        return super.retainAll(collection);
    }
}

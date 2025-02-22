package hf;

import gf.h;
import hf.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import sf.j;

public final class c<K, V> extends h<Map.Entry<Object, Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final b<K, V> f9324a;

    public c(b<K, V> bVar) {
        j.f(bVar, "backing");
        this.f9324a = bVar;
    }

    public final int a() {
        return this.f9324a.D;
    }

    public final boolean add(Object obj) {
        j.f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        j.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        return this.f9324a.d(entry);
    }

    /* renamed from: c */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        b<K, V> bVar = this.f9324a;
        bVar.getClass();
        bVar.b();
        int g10 = bVar.g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        V[] vArr = bVar.f9315b;
        j.c(vArr);
        if (!j.a(vArr[g10], entry.getValue())) {
            return false;
        }
        bVar.j(g10);
        return true;
    }

    public final void clear() {
        this.f9324a.clear();
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        return this.f9324a.c(collection);
    }

    public final boolean isEmpty() {
        return this.f9324a.isEmpty();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        b<K, V> bVar = this.f9324a;
        bVar.getClass();
        return new b.C0167b(bVar);
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9324a.b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        this.f9324a.b();
        return super.retainAll(collection);
    }
}

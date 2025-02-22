package b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import sf.j;
import tf.a;

public final class d implements Collection<c>, a {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f2998a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2999b;

    public d(List<c> list) {
        this.f2998a = list;
        this.f2999b = list.size();
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        j.f(cVar, "element");
        return this.f2998a.contains(cVar);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        return this.f2998a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return j.a(this.f2998a, ((d) obj).f2998a);
    }

    public final int hashCode() {
        return this.f2998a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f2998a.isEmpty();
    }

    public final Iterator<c> iterator() {
        return this.f2998a.iterator();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeIf(Predicate<? super c> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f2999b;
    }

    public final Object[] toArray() {
        return ag.d.j(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return ag.d.k(this, tArr);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f2998a + ')';
    }
}

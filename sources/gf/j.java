package gf;

import ag.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import tf.a;

public final class j<T> implements Collection<T>, a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f8970a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8971b;

    public j(T[] tArr, boolean z10) {
        sf.j.f(tArr, "values");
        this.f8970a = tArr;
        this.f8971b = z10;
    }

    public final boolean add(T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return l.S(this.f8970a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        sf.j.f(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f8970a.length == 0;
    }

    public final Iterator<T> iterator() {
        T[] tArr = this.f8970a;
        sf.j.f(tArr, "array");
        return new sf.a(tArr);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f8970a.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f8970a;
        sf.j.f(tArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (this.f8971b && sf.j.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        sf.j.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        sf.j.f(tArr, "array");
        return d.k(this, tArr);
    }
}

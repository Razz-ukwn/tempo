package gf;

import androidx.activity.result.d;
import androidx.fragment.app.q;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import sf.j;
import tf.a;

public final class s implements List, Serializable, RandomAccess, a {

    /* renamed from: a  reason: collision with root package name */
    public static final s f8978a = new s();

    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        j.f((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        j.f(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final Object get(int i8) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i8 + '.');
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        j.f((Void) obj, "element");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return r.f8977a;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        j.f((Void) obj, "element");
        return -1;
    }

    public final ListIterator listIterator() {
        return r.f8977a;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final List subList(int i8, int i10) {
        if (i8 == 0 && i10 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(d.a("fromIndex: ", i8, ", toIndex: ", i10));
    }

    public final Object[] toArray() {
        return ag.d.j(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return ag.d.k(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    public final ListIterator listIterator(int i8) {
        if (i8 == 0) {
            return r.f8977a;
        }
        throw new IndexOutOfBoundsException(q.a("Index: ", i8));
    }
}

package z0;

import ag.d;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import sf.j;
import tf.a;

public final class l extends d implements List<e>, a {
    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i8, Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        j.f((e) obj, "element");
        throw null;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        ((l) obj).getClass();
        return j.a((Object) null, (Object) null);
    }

    public final Object get(int i8) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof e)) {
            return -1;
        }
        j.f((e) obj, "element");
        throw null;
    }

    public final boolean isEmpty() {
        throw null;
    }

    public final Iterator<e> iterator() {
        throw null;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof e)) {
            return -1;
        }
        j.f((e) obj, "element");
        throw null;
    }

    public final ListIterator<e> listIterator() {
        throw null;
    }

    public final ListIterator<e> listIterator(int i8) {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator<e> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        throw null;
    }

    public final void sort(Comparator<? super e> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<e> subList(int i8, int i10) {
        throw null;
    }

    public final Object[] toArray() {
        return d.j(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return d.k(this, tArr);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=null)";
    }
}

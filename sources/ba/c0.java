package ba;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class c0<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final List<E> f3459a;

    public c0(List<E> list) {
        this.f3459a = Collections.unmodifiableList(list);
    }

    public final boolean add(E e10) {
        return this.f3459a.add(e10);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f3459a.addAll(collection);
    }

    public final void clear() {
        this.f3459a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f3459a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f3459a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f3459a.equals(obj);
    }

    public final E get(int i8) {
        return this.f3459a.get(i8);
    }

    public final int hashCode() {
        return this.f3459a.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f3459a.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f3459a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f3459a.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f3459a.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.f3459a.listIterator();
    }

    public final boolean remove(Object obj) {
        return this.f3459a.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f3459a.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f3459a.retainAll(collection);
    }

    public final E set(int i8, E e10) {
        return this.f3459a.set(i8, e10);
    }

    public final int size() {
        return this.f3459a.size();
    }

    public final List<E> subList(int i8, int i10) {
        return this.f3459a.subList(i8, i10);
    }

    public final Object[] toArray() {
        return this.f3459a.toArray();
    }

    public final void add(int i8, E e10) {
        this.f3459a.add(i8, e10);
    }

    public final boolean addAll(int i8, Collection<? extends E> collection) {
        return this.f3459a.addAll(i8, collection);
    }

    public final ListIterator<E> listIterator(int i8) {
        return this.f3459a.listIterator(i8);
    }

    public final E remove(int i8) {
        return this.f3459a.remove(i8);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f3459a.toArray(tArr);
    }
}

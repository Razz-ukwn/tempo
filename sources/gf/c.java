package gf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import sf.j;

public abstract class c<E> extends a<E> implements List<E> {

    public static final class a {
        public static void a(int i8, int i10, int i11) {
            if (i8 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i10 + ", size: " + i11);
            } else if (i8 > i10) {
                throw new IllegalArgumentException(androidx.activity.result.d.a("fromIndex: ", i8, " > toIndex: ", i10));
            }
        }
    }

    public class b implements Iterator<E>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public int f8963a;

        public b() {
        }

        public final boolean hasNext() {
            return this.f8963a < c.this.a();
        }

        public final E next() {
            if (hasNext()) {
                int i8 = this.f8963a;
                this.f8963a = i8 + 1;
                return c.this.get(i8);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: gf.c$c  reason: collision with other inner class name */
    public class C0160c extends c<E>.b implements ListIterator<E> {
        public C0160c(int i8) {
            super();
            int a10 = c.this.a();
            if (i8 < 0 || i8 > a10) {
                throw new IndexOutOfBoundsException(androidx.activity.result.d.a("index: ", i8, ", size: ", a10));
            }
            this.f8963a = i8;
        }

        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return this.f8963a > 0;
        }

        public final int nextIndex() {
            return this.f8963a;
        }

        public final E previous() {
            if (hasPrevious()) {
                int i8 = this.f8963a - 1;
                this.f8963a = i8;
                return c.this.get(i8);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f8963a - 1;
        }

        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: a  reason: collision with root package name */
        public final c<E> f8966a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8967b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8968c;

        public d(c<? extends E> cVar, int i8, int i10) {
            j.f(cVar, "list");
            this.f8966a = cVar;
            this.f8967b = i8;
            a.a(i8, i10, cVar.a());
            this.f8968c = i10 - i8;
        }

        public final int a() {
            return this.f8968c;
        }

        public final E get(int i8) {
            int i10 = this.f8968c;
            if (i8 < 0 || i8 >= i10) {
                throw new IndexOutOfBoundsException(androidx.activity.result.d.a("index: ", i8, ", size: ", i10));
            }
            return this.f8966a.get(this.f8967b + i8);
        }
    }

    public final void add(int i8, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i8, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        j.f(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object a10 : this) {
                if (!j.a(a10, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i8);

    public final int hashCode() {
        Iterator it = iterator();
        int i8 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i8 = (i8 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i8;
    }

    public int indexOf(E e10) {
        int i8 = 0;
        for (Object a10 : this) {
            if (j.a(a10, e10)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (j.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C0160c(0);
    }

    public final E remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i8, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<E> subList(int i8, int i10) {
        return new d(this, i8, i10);
    }

    public final ListIterator<E> listIterator(int i8) {
        return new C0160c(i8);
    }
}

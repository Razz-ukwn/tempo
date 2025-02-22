package u;

import gf.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import sf.j;

public final class d<T> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public T[] f15638a;

    /* renamed from: b  reason: collision with root package name */
    public a f15639b;

    /* renamed from: c  reason: collision with root package name */
    public int f15640c = 0;

    public static final class a<T> implements List<T>, tf.b {

        /* renamed from: a  reason: collision with root package name */
        public final d<T> f15641a;

        public a(d<T> dVar) {
            j.f(dVar, "vector");
            this.f15641a = dVar;
        }

        public final boolean add(T t2) {
            this.f15641a.b(t2);
            return true;
        }

        public final boolean addAll(int i8, Collection<? extends T> collection) {
            j.f(collection, "elements");
            return this.f15641a.d(i8, collection);
        }

        public final void clear() {
            this.f15641a.f();
        }

        public final boolean contains(Object obj) {
            return this.f15641a.g(obj);
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            d<T> dVar = this.f15641a;
            dVar.getClass();
            for (Object g10 : collection) {
                if (!dVar.g(g10)) {
                    return false;
                }
            }
            return true;
        }

        public final T get(int i8) {
            cb.d.i(i8, this);
            return this.f15641a.f15638a[i8];
        }

        public final int indexOf(Object obj) {
            d<T> dVar = this.f15641a;
            int i8 = dVar.f15640c;
            if (i8 > 0) {
                T[] tArr = dVar.f15638a;
                int i10 = 0;
                while (!j.a(obj, tArr[i10])) {
                    i10++;
                    if (i10 >= i8) {
                    }
                }
                return i10;
            }
            return -1;
        }

        public final boolean isEmpty() {
            return this.f15641a.f15640c == 0;
        }

        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        public final int lastIndexOf(Object obj) {
            d<T> dVar = this.f15641a;
            int i8 = dVar.f15640c;
            if (i8 <= 0) {
                return -1;
            }
            int i10 = i8 - 1;
            T[] tArr = dVar.f15638a;
            while (!j.a(obj, tArr[i10])) {
                i10--;
                if (i10 < 0) {
                    return -1;
                }
            }
            return i10;
        }

        public final ListIterator<T> listIterator() {
            return new c(0, this);
        }

        public final boolean remove(Object obj) {
            return this.f15641a.j(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            d<T> dVar = this.f15641a;
            dVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i8 = dVar.f15640c;
            for (Object j10 : collection) {
                dVar.j(j10);
            }
            return i8 != dVar.f15640c;
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            d<T> dVar = this.f15641a;
            dVar.getClass();
            int i8 = dVar.f15640c;
            for (int i10 = i8 - 1; -1 < i10; i10--) {
                if (!collection.contains(dVar.f15638a[i10])) {
                    dVar.k(i10);
                }
            }
            return i8 != dVar.f15640c;
        }

        public final T set(int i8, T t2) {
            cb.d.i(i8, this);
            T[] tArr = this.f15641a.f15638a;
            T t10 = tArr[i8];
            tArr[i8] = t2;
            return t10;
        }

        public final int size() {
            return this.f15641a.f15640c;
        }

        public final List<T> subList(int i8, int i10) {
            cb.d.j(i8, i10, this);
            return new b(i8, i10, this);
        }

        public final Object[] toArray() {
            return ag.d.j(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            j.f(tArr, "array");
            return ag.d.k(this, tArr);
        }

        public final void add(int i8, T t2) {
            this.f15641a.a(i8, t2);
        }

        public final boolean addAll(Collection<? extends T> collection) {
            j.f(collection, "elements");
            d<T> dVar = this.f15641a;
            dVar.getClass();
            return dVar.d(dVar.f15640c, collection);
        }

        public final ListIterator<T> listIterator(int i8) {
            return new c(i8, this);
        }

        public final T remove(int i8) {
            cb.d.i(i8, this);
            return this.f15641a.k(i8);
        }
    }

    public static final class b<T> implements List<T>, tf.b {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f15642a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15643b;

        /* renamed from: c  reason: collision with root package name */
        public int f15644c;

        public b(int i8, int i10, List list) {
            j.f(list, "list");
            this.f15642a = list;
            this.f15643b = i8;
            this.f15644c = i10;
        }

        public final boolean add(T t2) {
            int i8 = this.f15644c;
            this.f15644c = i8 + 1;
            this.f15642a.add(i8, t2);
            return true;
        }

        public final boolean addAll(int i8, Collection<? extends T> collection) {
            j.f(collection, "elements");
            this.f15642a.addAll(i8 + this.f15643b, collection);
            this.f15644c = collection.size() + this.f15644c;
            return collection.size() > 0;
        }

        public final void clear() {
            int i8 = this.f15644c - 1;
            int i10 = this.f15643b;
            if (i10 <= i8) {
                while (true) {
                    this.f15642a.remove(i8);
                    if (i8 == i10) {
                        break;
                    }
                    i8--;
                }
            }
            this.f15644c = i10;
        }

        public final boolean contains(Object obj) {
            int i8 = this.f15644c;
            for (int i10 = this.f15643b; i10 < i8; i10++) {
                if (j.a(this.f15642a.get(i10), obj)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final T get(int i8) {
            cb.d.i(i8, this);
            return this.f15642a.get(i8 + this.f15643b);
        }

        public final int indexOf(Object obj) {
            int i8 = this.f15644c;
            int i10 = this.f15643b;
            for (int i11 = i10; i11 < i8; i11++) {
                if (j.a(this.f15642a.get(i11), obj)) {
                    return i11 - i10;
                }
            }
            return -1;
        }

        public final boolean isEmpty() {
            return this.f15644c == this.f15643b;
        }

        public final Iterator<T> iterator() {
            return new c(0, this);
        }

        public final int lastIndexOf(Object obj) {
            int i8 = this.f15644c - 1;
            int i10 = this.f15643b;
            if (i10 > i8) {
                return -1;
            }
            while (!j.a(this.f15642a.get(i8), obj)) {
                if (i8 == i10) {
                    return -1;
                }
                i8--;
            }
            return i8 - i10;
        }

        public final ListIterator<T> listIterator() {
            return new c(0, this);
        }

        public final boolean remove(Object obj) {
            int i8 = this.f15644c;
            for (int i10 = this.f15643b; i10 < i8; i10++) {
                List<T> list = this.f15642a;
                if (j.a(list.get(i10), obj)) {
                    list.remove(i10);
                    this.f15644c--;
                    return true;
                }
            }
            return false;
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            int i8 = this.f15644c;
            for (Object remove : collection) {
                remove(remove);
            }
            return i8 != this.f15644c;
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            j.f(collection, "elements");
            int i8 = this.f15644c;
            int i10 = i8 - 1;
            int i11 = this.f15643b;
            if (i11 <= i10) {
                while (true) {
                    List<T> list = this.f15642a;
                    if (!collection.contains(list.get(i10))) {
                        list.remove(i10);
                        this.f15644c--;
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            return i8 != this.f15644c;
        }

        public final T set(int i8, T t2) {
            cb.d.i(i8, this);
            return this.f15642a.set(i8 + this.f15643b, t2);
        }

        public final int size() {
            return this.f15644c - this.f15643b;
        }

        public final List<T> subList(int i8, int i10) {
            cb.d.j(i8, i10, this);
            return new b(i8, i10, this);
        }

        public final Object[] toArray() {
            return ag.d.j(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            j.f(tArr, "array");
            return ag.d.k(this, tArr);
        }

        public final void add(int i8, T t2) {
            this.f15642a.add(i8 + this.f15643b, t2);
            this.f15644c++;
        }

        public final ListIterator<T> listIterator(int i8) {
            return new c(i8, this);
        }

        public final boolean addAll(Collection<? extends T> collection) {
            j.f(collection, "elements");
            this.f15642a.addAll(this.f15644c, collection);
            this.f15644c = collection.size() + this.f15644c;
            return collection.size() > 0;
        }

        public final T remove(int i8) {
            cb.d.i(i8, this);
            this.f15644c--;
            return this.f15642a.remove(i8 + this.f15643b);
        }
    }

    public static final class c<T> implements ListIterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f15645a;

        /* renamed from: b  reason: collision with root package name */
        public int f15646b;

        public c(int i8, List list) {
            j.f(list, "list");
            this.f15645a = list;
            this.f15646b = i8;
        }

        public final void add(T t2) {
            this.f15645a.add(this.f15646b, t2);
            this.f15646b++;
        }

        public final boolean hasNext() {
            return this.f15646b < this.f15645a.size();
        }

        public final boolean hasPrevious() {
            return this.f15646b > 0;
        }

        public final T next() {
            int i8 = this.f15646b;
            this.f15646b = i8 + 1;
            return this.f15645a.get(i8);
        }

        public final int nextIndex() {
            return this.f15646b;
        }

        public final T previous() {
            int i8 = this.f15646b - 1;
            this.f15646b = i8;
            return this.f15645a.get(i8);
        }

        public final int previousIndex() {
            return this.f15646b - 1;
        }

        public final void remove() {
            int i8 = this.f15646b - 1;
            this.f15646b = i8;
            this.f15645a.remove(i8);
        }

        public final void set(T t2) {
            this.f15645a.set(this.f15646b, t2);
        }
    }

    public d(Object[] objArr) {
        this.f15638a = objArr;
    }

    public final void a(int i8, T t2) {
        h(this.f15640c + 1);
        T[] tArr = this.f15638a;
        int i10 = this.f15640c;
        if (i8 != i10) {
            l.V(i8 + 1, i8, i10, tArr, tArr);
        }
        tArr[i8] = t2;
        this.f15640c++;
    }

    public final void b(Object obj) {
        h(this.f15640c + 1);
        T[] tArr = this.f15638a;
        int i8 = this.f15640c;
        tArr[i8] = obj;
        this.f15640c = i8 + 1;
    }

    public final void c(int i8, d dVar) {
        j.f(dVar, "elements");
        int i10 = dVar.f15640c;
        if (!(i10 == 0)) {
            h(this.f15640c + i10);
            T[] tArr = this.f15638a;
            int i11 = this.f15640c;
            if (i8 != i11) {
                l.V(dVar.f15640c + i8, i8, i11, tArr, tArr);
            }
            l.V(i8, 0, dVar.f15640c, dVar.f15638a, tArr);
            this.f15640c += dVar.f15640c;
        }
    }

    public final boolean d(int i8, Collection<? extends T> collection) {
        j.f(collection, "elements");
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        h(collection.size() + this.f15640c);
        T[] tArr = this.f15638a;
        if (i8 != this.f15640c) {
            l.V(collection.size() + i8, i8, this.f15640c, tArr, tArr);
        }
        for (T next : collection) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                tArr[i10 + i8] = next;
                i10 = i11;
            } else {
                cb.d.i0();
                throw null;
            }
        }
        this.f15640c = collection.size() + this.f15640c;
        return true;
    }

    public final List<T> e() {
        a aVar = this.f15639b;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f15639b = aVar2;
        return aVar2;
    }

    public final void f() {
        T[] tArr = this.f15638a;
        int i8 = this.f15640c;
        while (true) {
            i8--;
            if (-1 < i8) {
                tArr[i8] = null;
            } else {
                this.f15640c = 0;
                return;
            }
        }
    }

    public final boolean g(T t2) {
        int i8 = this.f15640c - 1;
        if (i8 >= 0) {
            int i10 = 0;
            while (!j.a(this.f15638a[i10], t2)) {
                if (i10 != i8) {
                    i10++;
                }
            }
            return true;
        }
        return false;
    }

    public final void h(int i8) {
        T[] tArr = this.f15638a;
        if (tArr.length < i8) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i8, tArr.length * 2));
            j.e(copyOf, "copyOf(this, newSize)");
            this.f15638a = copyOf;
        }
    }

    public final boolean i() {
        return this.f15640c != 0;
    }

    public final boolean j(T t2) {
        int i8;
        int i10 = this.f15640c;
        if (i10 > 0) {
            T[] tArr = this.f15638a;
            i8 = 0;
            while (true) {
                if (j.a(t2, tArr[i8])) {
                    break;
                }
                i8++;
                if (i8 >= i10) {
                    break;
                }
            }
        } else {
            i8 = -1;
        }
        if (i8 < 0) {
            return false;
        }
        k(i8);
        return true;
    }

    public final T k(int i8) {
        T[] tArr = this.f15638a;
        T t2 = tArr[i8];
        int i10 = this.f15640c;
        if (i8 != i10 - 1) {
            l.V(i8, i8 + 1, i10, tArr, tArr);
        }
        int i11 = this.f15640c - 1;
        this.f15640c = i11;
        tArr[i11] = null;
        return t2;
    }

    public final void l(int i8, int i10) {
        if (i10 > i8) {
            int i11 = this.f15640c;
            if (i10 < i11) {
                T[] tArr = this.f15638a;
                l.V(i8, i10, i11, tArr, tArr);
            }
            int i12 = this.f15640c;
            int i13 = i12 - (i10 - i8);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f15638a[i15] = null;
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
            this.f15640c = i13;
        }
    }
}

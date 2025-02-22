package s0;

import ag.d;
import ff.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import sf.j;

public final class q<T> implements List<T>, tf.a {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f14413a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public long[] f14414b = new long[16];

    /* renamed from: c  reason: collision with root package name */
    public int f14415c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f14416d;

    public final class b implements List<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f14421a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14422b;

        public b(int i8, int i10) {
            this.f14421a = i8;
            this.f14422b = i10;
        }

        public final void add(int i8, T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean addAll(int i8, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
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
            return q.this.f14413a[i8 + this.f14421a];
        }

        public final int indexOf(Object obj) {
            int i8 = this.f14421a;
            int i10 = this.f14422b;
            if (i8 > i10) {
                return -1;
            }
            int i11 = i8;
            while (!j.a(q.this.f14413a[i11], obj)) {
                if (i11 == i10) {
                    return -1;
                }
                i11++;
            }
            return i11 - i8;
        }

        public final boolean isEmpty() {
            return this.f14422b - this.f14421a == 0;
        }

        public final Iterator<T> iterator() {
            int i8 = this.f14421a;
            return new a(i8, i8, this.f14422b);
        }

        public final int lastIndexOf(Object obj) {
            int i8 = this.f14422b;
            int i10 = this.f14421a;
            if (i10 > i8) {
                return -1;
            }
            while (!j.a(q.this.f14413a[i8], obj)) {
                if (i8 == i10) {
                    return -1;
                }
                i8--;
            }
            return i8 - i10;
        }

        public final ListIterator<T> listIterator() {
            int i8 = this.f14421a;
            return new a(i8, i8, this.f14422b);
        }

        public final T remove(int i8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final T set(int i8, T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int size() {
            return this.f14422b - this.f14421a;
        }

        public final void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final List<T> subList(int i8, int i10) {
            int i11 = this.f14421a;
            return new b(i8 + i11, i11 + i10);
        }

        public final Object[] toArray() {
            return d.j(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            j.f(tArr, "array");
            return d.k(this, tArr);
        }

        public final ListIterator<T> listIterator(int i8) {
            int i10 = this.f14421a;
            int i11 = this.f14422b;
            return new a(i8 + i10, i10, i11);
        }
    }

    public final long a() {
        long c3 = b7.a.c(Float.POSITIVE_INFINITY, false);
        int i8 = this.f14415c + 1;
        int H = cb.d.H(this);
        if (i8 <= H) {
            while (true) {
                long j10 = this.f14414b[i8];
                if (gc.b.e(j10, c3) < 0) {
                    c3 = j10;
                }
                if (Float.intBitsToFloat((int) (c3 >> 32)) >= 0.0f || !gc.b.p(c3)) {
                    if (i8 == H) {
                        break;
                    }
                    i8++;
                } else {
                    return c3;
                }
            }
        }
        return c3;
    }

    public final void add(int i8, T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i8, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(T t2, float f10, boolean z10, rf.a<m> aVar) {
        int i8 = this.f14415c;
        int i10 = i8 + 1;
        this.f14415c = i10;
        Object[] objArr = this.f14413a;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            j.e(copyOf, "copyOf(this, newSize)");
            this.f14413a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f14414b, length);
            j.e(copyOf2, "copyOf(this, newSize)");
            this.f14414b = copyOf2;
        }
        Object[] objArr2 = this.f14413a;
        int i11 = this.f14415c;
        objArr2[i11] = t2;
        this.f14414b[i11] = b7.a.c(f10, z10);
        c();
        aVar.d();
        this.f14415c = i8;
    }

    public final void c() {
        int i8 = this.f14415c + 1;
        int H = cb.d.H(this);
        if (i8 <= H) {
            while (true) {
                this.f14413a[i8] = null;
                if (i8 == H) {
                    break;
                }
                i8++;
            }
        }
        this.f14416d = this.f14415c + 1;
    }

    public final void clear() {
        this.f14415c = -1;
        c();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
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
        return this.f14413a[i8];
    }

    public final int indexOf(Object obj) {
        int H = cb.d.H(this);
        if (H < 0) {
            return -1;
        }
        int i8 = 0;
        while (!j.a(this.f14413a[i8], obj)) {
            if (i8 == H) {
                return -1;
            }
            i8++;
        }
        return i8;
    }

    public final boolean isEmpty() {
        return this.f14416d == 0;
    }

    public final Iterator<T> iterator() {
        return new a(this, 0, 7);
    }

    public final int lastIndexOf(Object obj) {
        for (int H = cb.d.H(this); -1 < H; H--) {
            if (j.a(this.f14413a[H], obj)) {
                return H;
            }
        }
        return -1;
    }

    public final ListIterator<T> listIterator() {
        return new a(this, 0, 7);
    }

    public final T remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final T set(int i8, T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f14416d;
    }

    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<T> subList(int i8, int i10) {
        return new b(i8, i10);
    }

    public final Object[] toArray() {
        return d.j(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return d.k(this, tArr);
    }

    public final class a implements ListIterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public int f14417a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14418b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14419c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(q qVar, int i8, int i10) {
            this((i10 & 1) != 0 ? 0 : i8, 0, (i10 & 4) != 0 ? qVar.f14416d : 0);
        }

        public final void add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f14417a < this.f14419c;
        }

        public final boolean hasPrevious() {
            return this.f14417a > this.f14418b;
        }

        public final T next() {
            T[] tArr = q.this.f14413a;
            int i8 = this.f14417a;
            this.f14417a = i8 + 1;
            return tArr[i8];
        }

        public final int nextIndex() {
            return this.f14417a - this.f14418b;
        }

        public final T previous() {
            T[] tArr = q.this.f14413a;
            int i8 = this.f14417a - 1;
            this.f14417a = i8;
            return tArr[i8];
        }

        public final int previousIndex() {
            return (this.f14417a - this.f14418b) - 1;
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void set(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i8, int i10, int i11) {
            this.f14417a = i8;
            this.f14418b = i10;
            this.f14419c = i11;
        }
    }

    public final ListIterator<T> listIterator(int i8) {
        return new a(this, i8, 6);
    }
}

package hf;

import androidx.activity.result.d;
import d2.f1;
import gf.c;
import gf.f;
import gf.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import sf.j;

public final class a<E> extends f<E> implements RandomAccess, Serializable {
    public final a<E> B;

    /* renamed from: a  reason: collision with root package name */
    public E[] f9306a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9307b;

    /* renamed from: c  reason: collision with root package name */
    public int f9308c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9309d;

    /* renamed from: e  reason: collision with root package name */
    public final a<E> f9310e;

    /* renamed from: hf.a$a  reason: collision with other inner class name */
    public static final class C0166a<E> implements ListIterator<E>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f9311a;

        /* renamed from: b  reason: collision with root package name */
        public int f9312b;

        /* renamed from: c  reason: collision with root package name */
        public int f9313c = -1;

        public C0166a(a<E> aVar, int i8) {
            j.f(aVar, "list");
            this.f9311a = aVar;
            this.f9312b = i8;
        }

        public final void add(E e10) {
            int i8 = this.f9312b;
            this.f9312b = i8 + 1;
            this.f9311a.add(i8, e10);
            this.f9313c = -1;
        }

        public final boolean hasNext() {
            return this.f9312b < this.f9311a.f9308c;
        }

        public final boolean hasPrevious() {
            return this.f9312b > 0;
        }

        public final E next() {
            int i8 = this.f9312b;
            a<E> aVar = this.f9311a;
            if (i8 < aVar.f9308c) {
                this.f9312b = i8 + 1;
                this.f9313c = i8;
                return aVar.f9306a[aVar.f9307b + i8];
            }
            throw new NoSuchElementException();
        }

        public final int nextIndex() {
            return this.f9312b;
        }

        public final E previous() {
            int i8 = this.f9312b;
            if (i8 > 0) {
                int i10 = i8 - 1;
                this.f9312b = i10;
                this.f9313c = i10;
                a<E> aVar = this.f9311a;
                return aVar.f9306a[aVar.f9307b + i10];
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f9312b - 1;
        }

        public final void remove() {
            int i8 = this.f9313c;
            if (i8 != -1) {
                this.f9311a.b(i8);
                this.f9312b = this.f9313c;
                this.f9313c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public final void set(E e10) {
            int i8 = this.f9313c;
            if (i8 != -1) {
                this.f9311a.set(i8, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public a(E[] eArr, int i8, int i10, boolean z10, a<E> aVar, a<E> aVar2) {
        this.f9306a = eArr;
        this.f9307b = i8;
        this.f9308c = i10;
        this.f9309d = z10;
        this.f9310e = aVar;
        this.B = aVar2;
    }

    public final int a() {
        return this.f9308c;
    }

    public final boolean add(E e10) {
        e();
        d(this.f9307b + this.f9308c, e10);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        e();
        int size = collection.size();
        c(this.f9307b + this.f9308c, collection, size);
        return size > 0;
    }

    public final E b(int i8) {
        e();
        int i10 = this.f9308c;
        if (i8 >= 0 && i8 < i10) {
            return h(this.f9307b + i8);
        }
        throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
    }

    public final void c(int i8, Collection<? extends E> collection, int i10) {
        a<E> aVar = this.f9310e;
        if (aVar != null) {
            aVar.c(i8, collection, i10);
            this.f9306a = aVar.f9306a;
            this.f9308c += i10;
            return;
        }
        g(i8, i10);
        Iterator<? extends E> it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f9306a[i8 + i11] = it.next();
        }
    }

    public final void clear() {
        e();
        i(this.f9307b, this.f9308c);
    }

    public final void d(int i8, E e10) {
        a<E> aVar = this.f9310e;
        if (aVar != null) {
            aVar.d(i8, e10);
            this.f9306a = aVar.f9306a;
            this.f9308c++;
            return;
        }
        g(i8, 1);
        this.f9306a[i8] = e10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r1 = this;
            boolean r0 = r1.f9309d
            if (r0 != 0) goto L_0x000f
            hf.a<E> r0 = r1.B
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.f9309d
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.a.e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x0031
            boolean r1 = r8 instanceof java.util.List
            r2 = 0
            if (r1 == 0) goto L_0x0030
            java.util.List r8 = (java.util.List) r8
            E[] r1 = r7.f9306a
            int r3 = r7.f9308c
            int r4 = r8.size()
            if (r3 == r4) goto L_0x0015
            goto L_0x0027
        L_0x0015:
            r4 = r2
        L_0x0016:
            if (r4 >= r3) goto L_0x002c
            int r5 = r7.f9307b
            int r5 = r5 + r4
            r5 = r1[r5]
            java.lang.Object r6 = r8.get(r4)
            boolean r5 = sf.j.a(r5, r6)
            if (r5 != 0) goto L_0x0029
        L_0x0027:
            r8 = r2
            goto L_0x002d
        L_0x0029:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x002c:
            r8 = r0
        L_0x002d:
            if (r8 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.a.equals(java.lang.Object):boolean");
    }

    public final void g(int i8, int i10) {
        int i11 = this.f9308c + i10;
        if (this.f9310e != null) {
            throw new IllegalStateException();
        } else if (i11 >= 0) {
            E[] eArr = this.f9306a;
            if (i11 > eArr.length) {
                int length = eArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                if (i12 - 2147483639 > 0) {
                    i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                E[] copyOf = Arrays.copyOf(eArr, i12);
                j.e(copyOf, "copyOf(this, newSize)");
                this.f9306a = copyOf;
            }
            E[] eArr2 = this.f9306a;
            l.V(i8 + i10, i8, this.f9307b + this.f9308c, eArr2, eArr2);
            this.f9308c += i10;
        } else {
            throw new OutOfMemoryError();
        }
    }

    public final E get(int i8) {
        int i10 = this.f9308c;
        if (i8 >= 0 && i8 < i10) {
            return this.f9306a[this.f9307b + i8];
        }
        throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
    }

    public final E h(int i8) {
        a<E> aVar = this.f9310e;
        if (aVar != null) {
            this.f9308c--;
            return aVar.h(i8);
        }
        E[] eArr = this.f9306a;
        E e10 = eArr[i8];
        int i10 = this.f9308c;
        int i11 = this.f9307b;
        l.V(i8, i8 + 1, i10 + i11, eArr, eArr);
        E[] eArr2 = this.f9306a;
        j.f(eArr2, "<this>");
        eArr2[(i11 + this.f9308c) - 1] = null;
        this.f9308c--;
        return e10;
    }

    public final int hashCode() {
        E[] eArr = this.f9306a;
        int i8 = this.f9308c;
        int i10 = 1;
        for (int i11 = 0; i11 < i8; i11++) {
            E e10 = eArr[this.f9307b + i11];
            i10 = (i10 * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return i10;
    }

    public final void i(int i8, int i10) {
        a<E> aVar = this.f9310e;
        if (aVar != null) {
            aVar.i(i8, i10);
        } else {
            E[] eArr = this.f9306a;
            l.V(i8, i8 + i10, this.f9308c, eArr, eArr);
            E[] eArr2 = this.f9306a;
            int i11 = this.f9308c;
            cb.d.e0(i11 - i10, i11, eArr2);
        }
        this.f9308c -= i10;
    }

    public final int indexOf(Object obj) {
        for (int i8 = 0; i8 < this.f9308c; i8++) {
            if (j.a(this.f9306a[this.f9307b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f9308c == 0;
    }

    public final Iterator<E> iterator() {
        return new C0166a(this, 0);
    }

    public final int j(int i8, int i10, Collection<? extends E> collection, boolean z10) {
        a<E> aVar = this.f9310e;
        if (aVar != null) {
            int j10 = aVar.j(i8, i10, collection, z10);
            this.f9308c -= j10;
            return j10;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i8 + i11;
            if (collection.contains(this.f9306a[i13]) == z10) {
                E[] eArr = this.f9306a;
                i11++;
                eArr[i12 + i8] = eArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        E[] eArr2 = this.f9306a;
        l.V(i8 + i12, i10 + i8, this.f9308c, eArr2, eArr2);
        E[] eArr3 = this.f9306a;
        int i15 = this.f9308c;
        cb.d.e0(i15 - i14, i15, eArr3);
        this.f9308c -= i14;
        return i14;
    }

    public final int lastIndexOf(Object obj) {
        for (int i8 = this.f9308c - 1; i8 >= 0; i8--) {
            if (j.a(this.f9306a[this.f9307b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C0166a(this, 0);
    }

    public final boolean remove(Object obj) {
        e();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        e();
        return j(this.f9307b, this.f9308c, collection, false) > 0;
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        e();
        return j(this.f9307b, this.f9308c, collection, true) > 0;
    }

    public final E set(int i8, E e10) {
        e();
        int i10 = this.f9308c;
        if (i8 < 0 || i8 >= i10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
        }
        E[] eArr = this.f9306a;
        int i11 = this.f9307b;
        E e11 = eArr[i11 + i8];
        eArr[i11 + i8] = e10;
        return e11;
    }

    public final List<E> subList(int i8, int i10) {
        c.a.a(i8, i10, this.f9308c);
        E[] eArr = this.f9306a;
        int i11 = this.f9307b + i8;
        int i12 = i10 - i8;
        boolean z10 = this.f9309d;
        a<E> aVar = this.B;
        return new a(eArr, i11, i12, z10, this, aVar == null ? this : aVar);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "destination");
        int length = tArr.length;
        int i8 = this.f9308c;
        int i10 = this.f9307b;
        if (length < i8) {
            T[] copyOfRange = Arrays.copyOfRange(this.f9306a, i10, i8 + i10, tArr.getClass());
            j.e(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        l.V(0, i10, i8 + i10, this.f9306a, tArr);
        int length2 = tArr.length;
        int i11 = this.f9308c;
        if (length2 > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    public final String toString() {
        E[] eArr = this.f9306a;
        int i8 = this.f9308c;
        StringBuilder sb2 = new StringBuilder((i8 * 3) + 2);
        sb2.append("[");
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(eArr[this.f9307b + i10]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }

    public final ListIterator<E> listIterator(int i8) {
        int i10 = this.f9308c;
        if (i8 >= 0 && i8 <= i10) {
            return new C0166a(this, i8);
        }
        throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
    }

    public final void add(int i8, E e10) {
        e();
        int i10 = this.f9308c;
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
        }
        d(this.f9307b + i8, e10);
    }

    public final boolean addAll(int i8, Collection<? extends E> collection) {
        j.f(collection, "elements");
        e();
        int i10 = this.f9308c;
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
        }
        int size = collection.size();
        c(this.f9307b + i8, collection, size);
        return size > 0;
    }

    public final Object[] toArray() {
        E[] eArr = this.f9306a;
        int i8 = this.f9308c;
        int i10 = this.f9307b;
        int i11 = i8 + i10;
        j.f(eArr, "<this>");
        f1.u(i11, eArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(eArr, i10, i11);
        j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public a() {
        this(10);
    }

    public a(int i8) {
        this(cb.d.n(i8), 0, 0, false, (a) null, (a) null);
    }
}

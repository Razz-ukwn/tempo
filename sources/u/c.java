package u;

import ag.d;
import androidx.appcompat.widget.a1;
import gf.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlinx.coroutines.internal.v;
import sf.j;

public final class c<T> implements Set<T>, tf.a {

    /* renamed from: a  reason: collision with root package name */
    public int f15634a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15635b = new Object[16];

    public static final class a implements Iterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public int f15636a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c<T> f15637b;

        public a(c<T> cVar) {
            this.f15637b = cVar;
        }

        public final boolean hasNext() {
            return this.f15636a < this.f15637b.f15634a;
        }

        public final T next() {
            T[] tArr = this.f15637b.f15635b;
            int i8 = this.f15636a;
            this.f15636a = i8 + 1;
            T t2 = tArr[i8];
            j.d(t2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t2;
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int a(Object obj) {
        int i8 = this.f15634a - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i10 = 0;
        while (i10 <= i8) {
            int i11 = (i10 + i8) >>> 1;
            Object obj2 = get(i11);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i10 = i11 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i8 = i11 - 1;
            } else if (obj2 == obj) {
                return i11;
            } else {
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    Object obj3 = this.f15635b[i12];
                    if (obj3 == obj) {
                        return i12;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i13 = i11 + 1;
                int i14 = this.f15634a;
                while (i13 < i14) {
                    Object obj4 = this.f15635b[i13];
                    if (obj4 == obj) {
                        return i13;
                    }
                    i13++;
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        return -i13;
                    }
                }
                return -(this.f15634a + 1);
            }
        }
        return -(i10 + 1);
    }

    public final boolean add(T t2) {
        int i8;
        j.f(t2, "value");
        if (this.f15634a > 0) {
            i8 = a(t2);
            if (i8 >= 0) {
                return false;
            }
        } else {
            i8 = -1;
        }
        int i10 = -(i8 + 1);
        int i11 = this.f15634a;
        Object[] objArr = this.f15635b;
        if (i11 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            l.V(i10 + 1, i10, i11, objArr, objArr2);
            l.X(this.f15635b, objArr2, 0, 0, i10, 6);
            this.f15635b = objArr2;
        } else {
            l.V(i10 + 1, i10, i11, objArr, objArr);
        }
        this.f15635b[i10] = t2;
        this.f15634a++;
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        l.a0(this.f15635b, (v) null);
        this.f15634a = 0;
    }

    public final boolean contains(Object obj) {
        return obj != null && a(obj) >= 0;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
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

    public final T get(int i8) {
        if (i8 >= 0 && i8 < this.f15634a) {
            T t2 = this.f15635b[i8];
            j.d(t2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t2;
        }
        StringBuilder b10 = a1.b("Index ", i8, ", size ");
        b10.append(this.f15634a);
        throw new IndexOutOfBoundsException(b10.toString());
    }

    public final boolean isEmpty() {
        return this.f15634a == 0;
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean remove(T t2) {
        int a10;
        if (t2 == null || (a10 = a(t2)) < 0) {
            return false;
        }
        int i8 = this.f15634a;
        if (a10 < i8 - 1) {
            Object[] objArr = this.f15635b;
            l.V(a10, a10 + 1, i8, objArr, objArr);
        }
        int i10 = this.f15634a - 1;
        this.f15634a = i10;
        this.f15635b[i10] = null;
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f15634a;
    }

    public final Object[] toArray() {
        return d.j(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return d.k(this, tArr);
    }
}

package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {
    public static Object[] B;
    public static int C;
    public static final Object D = new Object();
    public static final Object E = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f12009d;

    /* renamed from: e  reason: collision with root package name */
    public static int f12010e;

    /* renamed from: a  reason: collision with root package name */
    public int[] f12011a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f12012b;

    /* renamed from: c  reason: collision with root package name */
    public int f12013c;

    public class a extends c<E> {
        public a() {
            super(b.this.f12013c);
        }

        public final E a(int i8) {
            return b.this.f12012b[i8];
        }

        public final void b(int i8) {
            b.this.e(i8);
        }
    }

    public b() {
        this(0);
    }

    public static void b(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (E) {
                if (C < 10) {
                    objArr[0] = B;
                    objArr[1] = iArr;
                    for (int i10 = i8 - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    B = objArr;
                    C++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (D) {
                if (f12010e < 10) {
                    objArr[0] = f12009d;
                    objArr[1] = iArr;
                    for (int i11 = i8 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f12009d = objArr;
                    f12010e++;
                }
            }
        }
    }

    public final void a(int i8) {
        if (i8 == 8) {
            synchronized (E) {
                Object[] objArr = B;
                if (objArr != null) {
                    try {
                        this.f12012b = objArr;
                        B = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f12011a = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            C--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    B = null;
                    C = 0;
                }
            }
        } else if (i8 == 4) {
            synchronized (D) {
                Object[] objArr2 = f12009d;
                if (objArr2 != null) {
                    try {
                        this.f12012b = objArr2;
                        f12009d = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f12011a = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f12010e--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f12009d = null;
                    f12010e = 0;
                }
            }
        }
        this.f12011a = new int[i8];
        this.f12012b = new Object[i8];
    }

    public final boolean add(E e10) {
        int i8;
        int i10;
        int i11 = this.f12013c;
        if (e10 == null) {
            i10 = d();
            i8 = 0;
        } else {
            int hashCode = e10.hashCode();
            i8 = hashCode;
            i10 = c(hashCode, e10);
        }
        if (i10 >= 0) {
            return false;
        }
        int i12 = ~i10;
        int[] iArr = this.f12011a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f12012b;
            a(i13);
            if (i11 == this.f12013c) {
                int[] iArr2 = this.f12011a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f12012b, 0, objArr.length);
                }
                b(iArr, objArr, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f12011a;
            int i14 = i12 + 1;
            int i15 = i11 - i12;
            System.arraycopy(iArr3, i12, iArr3, i14, i15);
            Object[] objArr2 = this.f12012b;
            System.arraycopy(objArr2, i12, objArr2, i14, i15);
        }
        int i16 = this.f12013c;
        if (i11 == i16) {
            int[] iArr4 = this.f12011a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i8;
                this.f12012b[i12] = e10;
                this.f12013c = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f12013c;
        int i8 = this.f12013c;
        int[] iArr = this.f12011a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12012b;
            a(size);
            int i10 = this.f12013c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f12011a, 0, i10);
                System.arraycopy(objArr, 0, this.f12012b, 0, this.f12013c);
            }
            b(iArr, objArr, this.f12013c);
        }
        if (this.f12013c == i8) {
            for (Object add : collection) {
                z10 |= add(add);
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    public final int c(int i8, Object obj) {
        int i10 = this.f12013c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int n2 = cb.b.n(i10, i8, this.f12011a);
            if (n2 < 0 || obj.equals(this.f12012b[n2])) {
                return n2;
            }
            int i11 = n2 + 1;
            while (i11 < i10 && this.f12011a[i11] == i8) {
                if (obj.equals(this.f12012b[i11])) {
                    return i11;
                }
                i11++;
            }
            int i12 = n2 - 1;
            while (i12 >= 0 && this.f12011a[i12] == i8) {
                if (obj.equals(this.f12012b[i12])) {
                    return i12;
                }
                i12--;
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i8 = this.f12013c;
        if (i8 != 0) {
            int[] iArr = this.f12011a;
            Object[] objArr = this.f12012b;
            this.f12011a = cb.b.f3884e;
            this.f12012b = cb.b.B;
            this.f12013c = 0;
            b(iArr, objArr, i8);
        }
        if (this.f12013c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return (obj == null ? d() : c(obj.hashCode(), obj)) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i8 = this.f12013c;
        if (i8 == 0) {
            return -1;
        }
        try {
            int n2 = cb.b.n(i8, 0, this.f12011a);
            if (n2 < 0 || this.f12012b[n2] == null) {
                return n2;
            }
            int i10 = n2 + 1;
            while (i10 < i8 && this.f12011a[i10] == 0) {
                if (this.f12012b[i10] == null) {
                    return i10;
                }
                i10++;
            }
            int i11 = n2 - 1;
            while (i11 >= 0 && this.f12011a[i11] == 0) {
                if (this.f12012b[i11] == null) {
                    return i11;
                }
                i11--;
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void e(int i8) {
        int i10 = this.f12013c;
        Object[] objArr = this.f12012b;
        Object obj = objArr[i8];
        if (i10 <= 1) {
            clear();
            return;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f12011a;
        int i12 = 8;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i8 < i11) {
                int i13 = i8 + 1;
                int i14 = i11 - i8;
                System.arraycopy(iArr, i13, iArr, i8, i14);
                Object[] objArr2 = this.f12012b;
                System.arraycopy(objArr2, i13, objArr2, i8, i14);
            }
            this.f12012b[i11] = null;
        } else {
            if (i10 > 8) {
                i12 = i10 + (i10 >> 1);
            }
            a(i12);
            if (i8 > 0) {
                System.arraycopy(iArr, 0, this.f12011a, 0, i8);
                System.arraycopy(objArr, 0, this.f12012b, 0, i8);
            }
            if (i8 < i11) {
                int i15 = i8 + 1;
                int i16 = i11 - i8;
                System.arraycopy(iArr, i15, this.f12011a, i8, i16);
                System.arraycopy(objArr, i15, this.f12012b, i8, i16);
            }
        }
        if (i10 == this.f12013c) {
            this.f12013c = i11;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f12013c != set.size()) {
                return false;
            }
            int i8 = 0;
            while (i8 < this.f12013c) {
                try {
                    if (!set.contains(this.f12012b[i8])) {
                        return false;
                    }
                    i8++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f12011a;
        int i8 = this.f12013c;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    public final boolean isEmpty() {
        return this.f12013c <= 0;
    }

    public final Iterator<E> iterator() {
        return new a();
    }

    public final boolean remove(Object obj) {
        int d10 = obj == null ? d() : c(obj.hashCode(), obj);
        if (d10 < 0) {
            return false;
        }
        e(d10);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i8 = this.f12013c - 1; i8 >= 0; i8--) {
            if (!collection.contains(this.f12012b[i8])) {
                e(i8);
                z10 = true;
            }
        }
        return z10;
    }

    public final int size() {
        return this.f12013c;
    }

    public final Object[] toArray() {
        int i8 = this.f12013c;
        Object[] objArr = new Object[i8];
        System.arraycopy(this.f12012b, 0, objArr, 0, i8);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12013c * 14);
        sb2.append('{');
        for (int i8 = 0; i8 < this.f12013c; i8++) {
            if (i8 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f12012b[i8];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i8) {
        if (i8 == 0) {
            this.f12011a = cb.b.f3884e;
            this.f12012b = cb.b.B;
        } else {
            a(i8);
        }
        this.f12013c = 0;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f12013c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f12013c);
        }
        System.arraycopy(this.f12012b, 0, tArr, 0, this.f12013c);
        int length = tArr.length;
        int i8 = this.f12013c;
        if (length > i8) {
            tArr[i8] = null;
        }
        return tArr;
    }
}

package gf;

import androidx.activity.result.d;
import androidx.fragment.app.q;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import sf.j;

public final class k<E> extends f<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f8972d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f8973a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f8974b;

    /* renamed from: c  reason: collision with root package name */
    public int f8975c;

    public k(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = f8972d;
        } else if (i8 > 0) {
            objArr = new Object[i8];
        } else {
            throw new IllegalArgumentException(q.a("Illegal Capacity: ", i8));
        }
        this.f8974b = objArr;
    }

    public final int a() {
        return this.f8975c;
    }

    public final void add(int i8, E e10) {
        int i10 = this.f8975c;
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
        } else if (i8 == i10) {
            addLast(e10);
        } else if (i8 == 0) {
            addFirst(e10);
        } else {
            d(i10 + 1);
            int h3 = h(this.f8973a + i8);
            int i11 = this.f8975c;
            if (i8 < ((i11 + 1) >> 1)) {
                if (h3 == 0) {
                    Object[] objArr = this.f8974b;
                    j.f(objArr, "<this>");
                    h3 = objArr.length;
                }
                int i12 = h3 - 1;
                int i13 = this.f8973a;
                if (i13 == 0) {
                    Object[] objArr2 = this.f8974b;
                    j.f(objArr2, "<this>");
                    i13 = objArr2.length;
                }
                int i14 = i13 - 1;
                int i15 = this.f8973a;
                if (i12 >= i15) {
                    Object[] objArr3 = this.f8974b;
                    objArr3[i14] = objArr3[i15];
                    l.V(i15, i15 + 1, i12 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f8974b;
                    l.V(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f8974b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    l.V(0, 1, i12 + 1, objArr5, objArr5);
                }
                this.f8974b[i12] = e10;
                this.f8973a = i14;
            } else {
                int h10 = h(i11 + this.f8973a);
                if (h3 < h10) {
                    Object[] objArr6 = this.f8974b;
                    l.V(h3 + 1, h3, h10, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f8974b;
                    l.V(1, 0, h10, objArr7, objArr7);
                    Object[] objArr8 = this.f8974b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    l.V(h3 + 1, h3, objArr8.length - 1, objArr8, objArr8);
                }
                this.f8974b[h3] = e10;
            }
            this.f8975c++;
        }
    }

    public final boolean addAll(int i8, Collection<? extends E> collection) {
        j.f(collection, "elements");
        int i10 = this.f8975c;
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i11 = this.f8975c;
            if (i8 == i11) {
                return addAll(collection);
            }
            d(collection.size() + i11);
            int h3 = h(this.f8975c + this.f8973a);
            int h10 = h(this.f8973a + i8);
            int size = collection.size();
            if (i8 < ((this.f8975c + 1) >> 1)) {
                int i12 = this.f8973a;
                int i13 = i12 - size;
                if (h10 < i12) {
                    Object[] objArr = this.f8974b;
                    l.V(i13, i12, objArr.length, objArr, objArr);
                    if (size >= h10) {
                        Object[] objArr2 = this.f8974b;
                        l.V(objArr2.length - size, 0, h10, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f8974b;
                        l.V(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f8974b;
                        l.V(0, size, h10, objArr4, objArr4);
                    }
                } else if (i13 >= 0) {
                    Object[] objArr5 = this.f8974b;
                    l.V(i13, i12, h10, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f8974b;
                    i13 += objArr6.length;
                    int i14 = h10 - i12;
                    int length = objArr6.length - i13;
                    if (length >= i14) {
                        l.V(i13, i12, h10, objArr6, objArr6);
                    } else {
                        l.V(i13, i12, i12 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f8974b;
                        l.V(0, this.f8973a + length, h10, objArr7, objArr7);
                    }
                }
                this.f8973a = i13;
                int i15 = h10 - size;
                if (i15 < 0) {
                    i15 += this.f8974b.length;
                }
                c(i15, collection);
            } else {
                int i16 = h10 + size;
                if (h10 < h3) {
                    int i17 = size + h3;
                    Object[] objArr8 = this.f8974b;
                    if (i17 <= objArr8.length) {
                        l.V(i16, h10, h3, objArr8, objArr8);
                    } else if (i16 >= objArr8.length) {
                        l.V(i16 - objArr8.length, h10, h3, objArr8, objArr8);
                    } else {
                        int length2 = h3 - (i17 - objArr8.length);
                        l.V(0, length2, h3, objArr8, objArr8);
                        Object[] objArr9 = this.f8974b;
                        l.V(i16, h10, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f8974b;
                    l.V(size, 0, h3, objArr10, objArr10);
                    Object[] objArr11 = this.f8974b;
                    if (i16 >= objArr11.length) {
                        l.V(i16 - objArr11.length, h10, objArr11.length, objArr11, objArr11);
                    } else {
                        l.V(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f8974b;
                        l.V(i16, h10, objArr12.length - size, objArr12, objArr12);
                    }
                }
                c(h10, collection);
            }
            return true;
        }
    }

    public final void addFirst(E e10) {
        d(this.f8975c + 1);
        int i8 = this.f8973a;
        if (i8 == 0) {
            Object[] objArr = this.f8974b;
            j.f(objArr, "<this>");
            i8 = objArr.length;
        }
        int i10 = i8 - 1;
        this.f8973a = i10;
        this.f8974b[i10] = e10;
        this.f8975c++;
    }

    public final void addLast(E e10) {
        d(a() + 1);
        this.f8974b[h(a() + this.f8973a)] = e10;
        this.f8975c = a() + 1;
    }

    public final E b(int i8) {
        int i10 = this.f8975c;
        if (i8 < 0 || i8 >= i10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", i10));
        } else if (i8 == cb.d.H(this)) {
            return removeLast();
        } else {
            if (i8 == 0) {
                return removeFirst();
            }
            int h3 = h(this.f8973a + i8);
            E[] eArr = this.f8974b;
            E e10 = eArr[h3];
            if (i8 < (this.f8975c >> 1)) {
                int i11 = this.f8973a;
                if (h3 >= i11) {
                    l.V(i11 + 1, i11, h3, eArr, eArr);
                } else {
                    l.V(1, 0, h3, eArr, eArr);
                    Object[] objArr = this.f8974b;
                    objArr[0] = objArr[objArr.length - 1];
                    int i12 = this.f8973a;
                    l.V(i12 + 1, i12, objArr.length - 1, objArr, objArr);
                }
                Object[] objArr2 = this.f8974b;
                int i13 = this.f8973a;
                objArr2[i13] = null;
                this.f8973a = e(i13);
            } else {
                int h10 = h(cb.d.H(this) + this.f8973a);
                if (h3 <= h10) {
                    Object[] objArr3 = this.f8974b;
                    l.V(h3, h3 + 1, h10 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f8974b;
                    l.V(h3, h3 + 1, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f8974b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    l.V(0, 1, h10 + 1, objArr5, objArr5);
                }
                this.f8974b[h10] = null;
            }
            this.f8975c--;
            return e10;
        }
    }

    public final void c(int i8, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f8974b.length;
        while (i8 < length && it.hasNext()) {
            this.f8974b[i8] = it.next();
            i8++;
        }
        int i10 = this.f8973a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f8974b[i11] = it.next();
        }
        this.f8975c = collection.size() + a();
    }

    public final void clear() {
        int h3 = h(this.f8975c + this.f8973a);
        int i8 = this.f8973a;
        if (i8 < h3) {
            l.Z(this.f8974b, i8, h3);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8974b;
            l.Z(objArr, this.f8973a, objArr.length);
            l.Z(this.f8974b, 0, h3);
        }
        this.f8973a = 0;
        this.f8975c = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f8974b;
            if (i8 > objArr.length) {
                if (objArr == f8972d) {
                    if (i8 < 10) {
                        i8 = 10;
                    }
                    this.f8974b = new Object[i8];
                    return;
                }
                int length = objArr.length;
                int i10 = length + (length >> 1);
                if (i10 - i8 < 0) {
                    i10 = i8;
                }
                if (i10 - 2147483639 > 0) {
                    i10 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i10];
                l.V(0, this.f8973a, objArr.length, objArr, objArr2);
                Object[] objArr3 = this.f8974b;
                int length2 = objArr3.length;
                int i11 = this.f8973a;
                l.V(length2 - i11, 0, i11, objArr3, objArr2);
                this.f8973a = 0;
                this.f8974b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int e(int i8) {
        Object[] objArr = this.f8974b;
        j.f(objArr, "<this>");
        if (i8 == objArr.length - 1) {
            return 0;
        }
        return i8 + 1;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f8974b[this.f8973a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E g() {
        if (isEmpty()) {
            return null;
        }
        return this.f8974b[h(cb.d.H(this) + this.f8973a)];
    }

    public final E get(int i8) {
        int a10 = a();
        if (i8 >= 0 && i8 < a10) {
            return this.f8974b[h(this.f8973a + i8)];
        }
        throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", a10));
    }

    public final int h(int i8) {
        Object[] objArr = this.f8974b;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    public final int indexOf(Object obj) {
        int i8;
        int h3 = h(a() + this.f8973a);
        int i10 = this.f8973a;
        if (i10 < h3) {
            while (i10 < h3) {
                if (j.a(obj, this.f8974b[i10])) {
                    i8 = this.f8973a;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < h3) {
            return -1;
        } else {
            int length = this.f8974b.length;
            while (true) {
                if (i10 >= length) {
                    int i11 = 0;
                    while (i11 < h3) {
                        if (j.a(obj, this.f8974b[i11])) {
                            i10 = i11 + this.f8974b.length;
                            i8 = this.f8973a;
                        } else {
                            i11++;
                        }
                    }
                    return -1;
                } else if (j.a(obj, this.f8974b[i10])) {
                    i8 = this.f8973a;
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - i8;
    }

    public final boolean isEmpty() {
        return a() == 0;
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f8974b[h(cb.d.H(this) + this.f8973a)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final int lastIndexOf(Object obj) {
        int i8;
        int i10;
        int h3 = h(this.f8975c + this.f8973a);
        int i11 = this.f8973a;
        if (i11 < h3) {
            i10 = h3 - 1;
            if (i11 <= i10) {
                while (!j.a(obj, this.f8974b[i10])) {
                    if (i10 != i11) {
                        i10--;
                    }
                }
                i8 = this.f8973a;
            }
            return -1;
        }
        if (i11 > h3) {
            int i12 = h3 - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f8974b;
                    j.f(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i13 = this.f8973a;
                    if (i13 <= length) {
                        while (!j.a(obj, this.f8974b[i10])) {
                            if (i10 != i13) {
                                length = i10 - 1;
                            }
                        }
                        i8 = this.f8973a;
                    }
                } else if (j.a(obj, this.f8974b[i12])) {
                    i10 = i12 + this.f8974b.length;
                    i8 = this.f8973a;
                    break;
                } else {
                    i12--;
                }
            }
        }
        return -1;
        return i10 - i8;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            sf.j.f(r11, r0)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r10.f8974b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r10.f8973a
            int r3 = r10.f8975c
            int r3 = r3 + r0
            int r0 = r10.h(r3)
            int r3 = r10.f8973a
            if (r3 >= r0) goto L_0x0046
            r4 = r3
        L_0x0027:
            if (r3 >= r0) goto L_0x0040
            java.lang.Object[] r5 = r10.f8974b
            r5 = r5[r3]
            boolean r6 = r11.contains(r5)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x003c
            java.lang.Object[] r6 = r10.f8974b
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x0040:
            java.lang.Object[] r11 = r10.f8974b
            gf.l.Z(r11, r4, r0)
            goto L_0x0089
        L_0x0046:
            java.lang.Object[] r4 = r10.f8974b
            int r4 = r4.length
            r6 = r1
            r5 = r3
        L_0x004b:
            r7 = 0
            if (r3 >= r4) goto L_0x0067
            java.lang.Object[] r8 = r10.f8974b
            r9 = r8[r3]
            r8[r3] = r7
            boolean r7 = r11.contains(r9)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0063
            java.lang.Object[] r7 = r10.f8974b
            int r8 = r5 + 1
            r7[r5] = r9
            r5 = r8
            goto L_0x0064
        L_0x0063:
            r6 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0067:
            int r3 = r10.h(r5)
            r4 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0088
            java.lang.Object[] r3 = r10.f8974b
            r5 = r3[r1]
            r3[r1] = r7
            boolean r3 = r11.contains(r5)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0084
            java.lang.Object[] r3 = r10.f8974b
            r3[r4] = r5
            int r4 = r10.e(r4)
            goto L_0x0085
        L_0x0084:
            r6 = r2
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0088:
            r1 = r6
        L_0x0089:
            if (r1 == 0) goto L_0x0096
            int r11 = r10.f8973a
            int r4 = r4 - r11
            if (r4 >= 0) goto L_0x0094
            java.lang.Object[] r11 = r10.f8974b
            int r11 = r11.length
            int r4 = r4 + r11
        L_0x0094:
            r10.f8975c = r4
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.k.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f8974b;
            int i8 = this.f8973a;
            E e10 = eArr[i8];
            eArr[i8] = null;
            this.f8973a = e(i8);
            this.f8975c = a() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int h3 = h(cb.d.H(this) + this.f8973a);
            E[] eArr = this.f8974b;
            E e10 = eArr[h3];
            eArr[h3] = null;
            this.f8975c = a() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            sf.j.f(r11, r0)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r10.f8974b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r10.f8973a
            int r3 = r10.f8975c
            int r3 = r3 + r0
            int r0 = r10.h(r3)
            int r3 = r10.f8973a
            if (r3 >= r0) goto L_0x0045
            r4 = r3
        L_0x0027:
            if (r3 >= r0) goto L_0x003f
            java.lang.Object[] r5 = r10.f8974b
            r5 = r5[r3]
            boolean r6 = r11.contains(r5)
            if (r6 == 0) goto L_0x003b
            java.lang.Object[] r6 = r10.f8974b
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x003f:
            java.lang.Object[] r11 = r10.f8974b
            gf.l.Z(r11, r4, r0)
            goto L_0x0086
        L_0x0045:
            java.lang.Object[] r4 = r10.f8974b
            int r4 = r4.length
            r6 = r1
            r5 = r3
        L_0x004a:
            r7 = 0
            if (r3 >= r4) goto L_0x0065
            java.lang.Object[] r8 = r10.f8974b
            r9 = r8[r3]
            r8[r3] = r7
            boolean r7 = r11.contains(r9)
            if (r7 == 0) goto L_0x0061
            java.lang.Object[] r7 = r10.f8974b
            int r8 = r5 + 1
            r7[r5] = r9
            r5 = r8
            goto L_0x0062
        L_0x0061:
            r6 = r2
        L_0x0062:
            int r3 = r3 + 1
            goto L_0x004a
        L_0x0065:
            int r3 = r10.h(r5)
            r4 = r3
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r3 = r10.f8974b
            r5 = r3[r1]
            r3[r1] = r7
            boolean r3 = r11.contains(r5)
            if (r3 == 0) goto L_0x0081
            java.lang.Object[] r3 = r10.f8974b
            r3[r4] = r5
            int r4 = r10.e(r4)
            goto L_0x0082
        L_0x0081:
            r6 = r2
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r6
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r11 = r10.f8973a
            int r4 = r4 - r11
            if (r4 >= 0) goto L_0x0091
            java.lang.Object[] r11 = r10.f8974b
            int r11 = r11.length
            int r4 = r4 + r11
        L_0x0091:
            r10.f8975c = r4
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.k.retainAll(java.util.Collection):boolean");
    }

    public final E set(int i8, E e10) {
        int a10 = a();
        if (i8 < 0 || i8 >= a10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", a10));
        }
        int h3 = h(this.f8973a + i8);
        E[] eArr = this.f8974b;
        E e11 = eArr[h3];
        eArr[h3] = e10;
        return e11;
    }

    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        int length = tArr.length;
        int i8 = this.f8975c;
        if (length < i8) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i8);
            j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (Object[]) newInstance;
        }
        int h3 = h(this.f8975c + this.f8973a);
        int i10 = this.f8973a;
        if (i10 < h3) {
            l.X(this.f8974b, tArr, 0, i10, h3, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8974b;
            l.V(0, this.f8973a, objArr.length, objArr, tArr);
            Object[] objArr2 = this.f8974b;
            l.V(objArr2.length - this.f8973a, 0, h3, objArr2, tArr);
        }
        int length2 = tArr.length;
        int i11 = this.f8975c;
        if (length2 > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    public k() {
        this.f8974b = f8972d;
    }

    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        d(collection.size() + a());
        c(h(a() + this.f8973a), collection);
        return true;
    }
}

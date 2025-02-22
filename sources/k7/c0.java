package k7;

import ag.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class c0 extends z implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final a0 f10356b = new a0(d0.f10358e, 0);

    public void a(Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
    }

    @Deprecated
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Deprecated
    public final c0 d() {
        return this;
    }

    public final a0 e() {
        return listIterator(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r6 != r5) goto L_0x0003
            goto L_0x0059
        L_0x0003:
            boolean r0 = r6 instanceof java.util.List
            r1 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x005a
        L_0x0009:
            java.util.List r6 = (java.util.List) r6
            int r0 = r5.size()
            int r2 = r6.size()
            if (r0 == r2) goto L_0x0016
            goto L_0x005a
        L_0x0016:
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L_0x002f
            r2 = r1
        L_0x001b:
            if (r2 >= r0) goto L_0x0059
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = androidx.fragment.app.z0.j(r3, r4)
            if (r3 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x002f:
            k7.a0 r0 = r5.listIterator(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0037:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0053
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x0044
            goto L_0x005a
        L_0x0044:
            java.lang.Object r2 = r0.next()
            java.lang.Object r3 = r6.next()
            boolean r2 = androidx.fragment.app.z0.j(r2, r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0053:
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c0.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public c0 subList(int i8, int i10) {
        m.G(i8, i10, size());
        int i11 = i10 - i8;
        return i11 == size() ? this : i11 == 0 ? d0.f10358e : new b0(this, i8, i11);
    }

    public final int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i8 = (i8 * 31) + get(i10).hashCode();
        }
        return i8;
    }

    /* renamed from: i */
    public final a0 listIterator(int i8) {
        m.C(i8, size());
        return isEmpty() ? f10356b : new a0(this, i8);
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (obj.equals(get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }
}

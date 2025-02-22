package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e5  reason: invalid package */
public abstract class e5 extends b5 implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public static final c5 f4509b = new c5(g5.f4568e, 0);

    public int a(Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
        return size;
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

    /* renamed from: e */
    public e5 subList(int i8, int i10) {
        wh.c(i8, i10, size());
        int i11 = i10 - i8;
        return i11 == size() ? this : i11 == 0 ? g5.f4568e : new d5(this, i8, i11);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj2 = get(i8);
                        Object obj3 = list.get(i8);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i8++;
                        }
                    }
                    return true;
                }
                c5 f10 = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (f10.hasNext()) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object d10 = f10.next();
                        Object next = it.next();
                        if (d10 == next || (d10 != null && d10.equals(next))) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final c5 listIterator(int i8) {
        wh.b(i8, size());
        return isEmpty() ? f4509b : new c5(this, i8);
    }

    public final int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i8 = (i8 * 31) + get(i10).hashCode();
        }
        return i8;
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

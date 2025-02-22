package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b5  reason: invalid package */
public abstract class b5 extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f4418a = new Object[0];

    /* access modifiers changed from: package-private */
    public abstract int a(Object[] objArr);

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract int b();

    /* access modifiers changed from: package-private */
    public abstract int c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract Object[] d();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f4418a);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] d10 = d();
            if (d10 != null) {
                return Arrays.copyOfRange(d10, c(), b(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr);
        return objArr;
    }
}

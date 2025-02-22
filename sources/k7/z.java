package k7;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class z extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f10395a = new Object[0];

    /* access modifiers changed from: package-private */
    public void a(Object[] objArr) {
        throw null;
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public c0 d() {
        throw null;
    }

    /* renamed from: e */
    public abstract a0 iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean f();

    public Object[] g() {
        throw null;
    }

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
        return toArray(f10395a);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] g10 = g();
            if (g10 != null) {
                return Arrays.copyOfRange(g10, c(), b(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr);
        return objArr;
    }
}

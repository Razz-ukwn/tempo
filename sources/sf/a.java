package sf;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, tf.a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f14941a;

    /* renamed from: b  reason: collision with root package name */
    public int f14942b;

    public a(T[] tArr) {
        j.f(tArr, "array");
        this.f14941a = tArr;
    }

    public final boolean hasNext() {
        return this.f14942b < this.f14941a.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f14941a;
            int i8 = this.f14942b;
            this.f14942b = i8 + 1;
            return tArr[i8];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f14942b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

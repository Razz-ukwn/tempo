package gf;

import gf.z;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q.g;
import tf.a;

public abstract class b<T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    public int f8961a = 2;

    /* renamed from: b  reason: collision with root package name */
    public T f8962b;

    public final boolean hasNext() {
        int i8 = this.f8961a;
        if (i8 != 4) {
            int c3 = g.c(i8);
            if (c3 == 0) {
                return true;
            }
            if (c3 != 2) {
                this.f8961a = 4;
                z.a aVar = (z.a) this;
                int i10 = aVar.f8987c;
                if (i10 == 0) {
                    aVar.f8961a = 3;
                } else {
                    z<T> zVar = aVar.f8989e;
                    T[] tArr = zVar.f8983a;
                    int i11 = aVar.f8988d;
                    aVar.f8962b = tArr[i11];
                    aVar.f8961a = 1;
                    aVar.f8988d = (i11 + 1) % zVar.f8984b;
                    aVar.f8987c = i10 - 1;
                }
                if (this.f8961a == 1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final T next() {
        if (hasNext()) {
            this.f8961a = 2;
            return this.f8962b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

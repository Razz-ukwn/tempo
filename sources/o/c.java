package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f12015a;

    /* renamed from: b  reason: collision with root package name */
    public int f12016b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12017c;

    public c(int i8) {
        this.f12015a = i8;
    }

    public abstract T a(int i8);

    public abstract void b(int i8);

    public final boolean hasNext() {
        return this.f12016b < this.f12015a;
    }

    public final T next() {
        if (hasNext()) {
            T a10 = a(this.f12016b);
            this.f12016b++;
            this.f12017c = true;
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f12017c) {
            int i8 = this.f12016b - 1;
            this.f12016b = i8;
            b(i8);
            this.f12015a--;
            this.f12017c = false;
            return;
        }
        throw new IllegalStateException();
    }
}

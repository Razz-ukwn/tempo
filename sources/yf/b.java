package yf;

import java.util.Iterator;
import sf.j;

public final class b<T> implements g<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f17368a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17369b;

    public static final class a implements Iterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f17370a;

        /* renamed from: b  reason: collision with root package name */
        public int f17371b;

        public a(b<T> bVar) {
            this.f17370a = bVar.f17368a.iterator();
            this.f17371b = bVar.f17369b;
        }

        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i8 = this.f17371b;
                it = this.f17370a;
                if (i8 > 0 && it.hasNext()) {
                    it.next();
                    this.f17371b--;
                }
            }
            return it.hasNext();
        }

        public final T next() {
            Iterator<T> it;
            while (true) {
                int i8 = this.f17371b;
                it = this.f17370a;
                if (i8 > 0 && it.hasNext()) {
                    it.next();
                    this.f17371b--;
                }
            }
            return it.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(g<? extends T> gVar, int i8) {
        j.f(gVar, "sequence");
        this.f17368a = gVar;
        this.f17369b = i8;
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + '.').toString());
        }
    }

    public final g<T> a(int i8) {
        int i10 = this.f17369b + i8;
        return i10 < 0 ? new b(this, i8) : new b(this.f17368a, i10);
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}

package yf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rf.l;
import sf.j;
import yf.k;

public final class f<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final rf.a<T> f17380a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, T> f17381b;

    public static final class a implements Iterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public T f17382a;

        /* renamed from: b  reason: collision with root package name */
        public int f17383b = -2;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f<T> f17384c;

        public a(f<T> fVar) {
            this.f17384c = fVar;
        }

        public final void a() {
            T t2;
            int i8 = this.f17383b;
            f<T> fVar = this.f17384c;
            if (i8 == -2) {
                t2 = fVar.f17380a.d();
            } else {
                l<T, T> lVar = fVar.f17381b;
                T t10 = this.f17382a;
                j.c(t10);
                t2 = lVar.invoke(t10);
            }
            this.f17382a = t2;
            this.f17383b = t2 == null ? 0 : 1;
        }

        public final boolean hasNext() {
            if (this.f17383b < 0) {
                a();
            }
            return this.f17383b == 1;
        }

        public final T next() {
            if (this.f17383b < 0) {
                a();
            }
            if (this.f17383b != 0) {
                T t2 = this.f17382a;
                j.d(t2, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f17383b = -1;
                return t2;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(k.b bVar, l lVar) {
        j.f(lVar, "getNextValue");
        this.f17380a = bVar;
        this.f17381b = lVar;
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}

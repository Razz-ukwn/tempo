package yf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rf.l;

public final class p<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f17393a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Boolean> f17394b;

    public static final class a implements Iterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f17395a;

        /* renamed from: b  reason: collision with root package name */
        public int f17396b = -1;

        /* renamed from: c  reason: collision with root package name */
        public T f17397c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p<T> f17398d;

        public a(p<T> pVar) {
            this.f17398d = pVar;
            this.f17395a = pVar.f17393a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.f17395a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.f17398d.f17394b.invoke(next).booleanValue()) {
                    this.f17396b = 1;
                    this.f17397c = next;
                    return;
                }
            }
            this.f17396b = 0;
        }

        public final boolean hasNext() {
            if (this.f17396b == -1) {
                a();
            }
            return this.f17396b == 1;
        }

        public final T next() {
            if (this.f17396b == -1) {
                a();
            }
            if (this.f17396b != 0) {
                T t2 = this.f17397c;
                this.f17397c = null;
                this.f17396b = -1;
                return t2;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(g<? extends T> gVar, l<? super T, Boolean> lVar) {
        this.f17393a = gVar;
        this.f17394b = lVar;
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}

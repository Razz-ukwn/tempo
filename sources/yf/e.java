package yf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rf.l;

public final class e<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f17373a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17374b = false;

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f17375c;

    public static final class a implements Iterator<T>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f17376a;

        /* renamed from: b  reason: collision with root package name */
        public int f17377b = -1;

        /* renamed from: c  reason: collision with root package name */
        public T f17378c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e<T> f17379d;

        public a(e<T> eVar) {
            this.f17379d = eVar;
            this.f17376a = eVar.f17373a.iterator();
        }

        public final void a() {
            T next;
            e<T> eVar;
            do {
                Iterator<T> it = this.f17376a;
                if (it.hasNext()) {
                    next = it.next();
                    eVar = this.f17379d;
                } else {
                    this.f17377b = 0;
                    return;
                }
            } while (eVar.f17375c.invoke(next).booleanValue() != eVar.f17374b);
            this.f17378c = next;
            this.f17377b = 1;
        }

        public final boolean hasNext() {
            if (this.f17377b == -1) {
                a();
            }
            return this.f17377b == 1;
        }

        public final T next() {
            if (this.f17377b == -1) {
                a();
            }
            if (this.f17377b != 0) {
                T t2 = this.f17378c;
                this.f17378c = null;
                this.f17377b = -1;
                return t2;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(q qVar, n nVar) {
        this.f17373a = qVar;
        this.f17375c = nVar;
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }
}

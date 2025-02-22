package yf;

import cb.b;
import ff.m;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jf.d;
import jf.f;
import jf.g;
import sf.j;
import tf.a;

public final class h<T> extends i<T> implements Iterator<T>, d<m>, a {

    /* renamed from: a  reason: collision with root package name */
    public int f17385a;

    /* renamed from: b  reason: collision with root package name */
    public T f17386b;

    /* renamed from: c  reason: collision with root package name */
    public d<? super m> f17387c;

    public final void c(Object obj, d dVar) {
        this.f17386b = obj;
        this.f17385a = 3;
        this.f17387c = dVar;
        j.f(dVar, "frame");
    }

    public final RuntimeException d() {
        int i8 = this.f17385a;
        if (i8 == 4) {
            return new NoSuchElementException();
        }
        if (i8 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f17385a);
    }

    public final f getContext() {
        return g.f10014a;
    }

    public final boolean hasNext() {
        int i8;
        while (true) {
            i8 = this.f17385a;
            if (i8 != 0) {
                break;
            }
            this.f17385a = 5;
            d<? super m> dVar = this.f17387c;
            j.c(dVar);
            this.f17387c = null;
            dVar.resumeWith(m.f8717a);
        }
        if (i8 == 1) {
            j.c((Object) null);
            throw null;
        } else if (i8 == 2 || i8 == 3) {
            return true;
        } else {
            if (i8 == 4) {
                return false;
            }
            throw d();
        }
    }

    public final T next() {
        int i8 = this.f17385a;
        if (i8 == 0 || i8 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i8 == 2) {
            this.f17385a = 1;
            j.c((Object) null);
            throw null;
        } else if (i8 == 3) {
            this.f17385a = 0;
            T t2 = this.f17386b;
            this.f17386b = null;
            return t2;
        } else {
            throw d();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        b.J(obj);
        this.f17385a = 4;
    }
}

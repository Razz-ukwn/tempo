package gf;

import ag.d;
import java.util.Collection;
import rf.l;
import sf.j;
import sf.k;

public abstract class a<E> implements Collection<E>, tf.a {

    /* renamed from: gf.a$a  reason: collision with other inner class name */
    public static final class C0159a extends k implements l<E, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a<E> f8956a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0159a(a<? extends E> aVar) {
            super(1);
            this.f8956a = aVar;
        }

        public final Object invoke(Object obj) {
            return obj == this.f8956a ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public abstract int a();

    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object a10 : this) {
            if (j.a(a10, e10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return a() == 0;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return d.j(this);
    }

    public final String toString() {
        return q.A0(this, ", ", "[", "]", new C0159a(this), 24);
    }

    public <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return d.k(this, tArr);
    }
}

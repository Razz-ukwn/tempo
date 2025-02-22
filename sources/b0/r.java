package b0;

import java.util.Set;
import sf.j;
import tf.d;

public abstract class r<K, V, E> implements Set<E>, d {

    /* renamed from: a  reason: collision with root package name */
    public final u<K, V> f2956a;

    public r(u<K, V> uVar) {
        j.f(uVar, "map");
        this.f2956a = uVar;
    }

    public final void clear() {
        this.f2956a.clear();
    }

    public final boolean isEmpty() {
        return this.f2956a.isEmpty();
    }

    public final int size() {
        return this.f2956a.size();
    }

    public final Object[] toArray() {
        return ag.d.j(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        return ag.d.k(this, tArr);
    }
}

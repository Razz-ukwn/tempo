package gf;

import java.util.AbstractSet;
import java.util.Set;
import tf.d;

public abstract class h<E> extends AbstractSet<E> implements Set<E>, d {
    public abstract int a();

    public final /* bridge */ int size() {
        return a();
    }
}

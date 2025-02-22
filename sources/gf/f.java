package gf;

import java.util.AbstractList;
import java.util.List;
import tf.b;

public abstract class f<E> extends AbstractList<E> implements List<E>, b {
    public abstract int a();

    public abstract E b(int i8);

    public final /* bridge */ E remove(int i8) {
        return b(i8);
    }

    public final /* bridge */ int size() {
        return a();
    }
}

package gf;

import java.util.AbstractCollection;
import java.util.Collection;
import tf.b;

public abstract class e<E> extends AbstractCollection<E> implements Collection<E>, b {
    public abstract int a();

    public final /* bridge */ int size() {
        return a();
    }
}

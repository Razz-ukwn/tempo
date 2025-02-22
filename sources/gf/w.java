package gf;

import java.util.Iterator;
import tf.a;

public abstract class w implements Iterator<Integer>, a {
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

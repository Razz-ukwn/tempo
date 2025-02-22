package o;

import java.util.Iterator;
import tf.a;

public final class h implements Iterator<Object>, a {

    /* renamed from: a  reason: collision with root package name */
    public int f12038a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f12039b;

    public h(g<Object> gVar) {
        this.f12039b = gVar;
    }

    public final boolean hasNext() {
        return this.f12038a < this.f12039b.j();
    }

    public final Object next() {
        int i8 = this.f12038a;
        this.f12038a = i8 + 1;
        return this.f12039b.k(i8);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

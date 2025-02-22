package dg;

import jf.d;
import jf.f;
import kotlinx.coroutines.internal.s;

public final class n<T> extends s<T> {
    public n(d dVar, f fVar) {
        super(dVar, fVar);
    }

    public final boolean C(Throwable th) {
        if (th instanceof k) {
            return true;
        }
        return x(th);
    }
}

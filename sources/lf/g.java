package lf;

import jf.d;
import jf.f;

public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == jf.g.f10014a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public final f getContext() {
        return jf.g.f10014a;
    }
}

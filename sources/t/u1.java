package t;

import rf.a;
import sf.j;

public abstract class u1<T> extends k0<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(a<? extends T> aVar) {
        super(aVar);
        j.f(aVar, "defaultFactory");
    }

    public final v1<T> b(T t2) {
        return new v1<>(this, t2, true);
    }
}

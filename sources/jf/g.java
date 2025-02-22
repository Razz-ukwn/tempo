package jf;

import java.io.Serializable;
import jf.f;
import rf.p;
import sf.j;

public final class g implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final g f10014a = new g();

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return fVar;
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return r10;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        return this;
    }
}

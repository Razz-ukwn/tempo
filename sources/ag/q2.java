package ag;

import jf.f;
import rf.p;
import sf.j;

public final class q2 implements f.b, f.c<q2> {

    /* renamed from: a  reason: collision with root package name */
    public static final q2 f476a = new q2();

    public final <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<?> getKey() {
        return this;
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final f w0(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}

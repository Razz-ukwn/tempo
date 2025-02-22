package i3;

import jf.f;
import rf.p;
import sf.j;

public final class w implements f.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9561a = new a();

    public static final class a implements f.c<w> {
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<w> getKey() {
        return f9561a;
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

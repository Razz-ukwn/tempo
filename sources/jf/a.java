package jf;

import jf.f;
import rf.p;
import sf.j;

public abstract class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    public final f.c<?> f10005a;

    public a(f.c<?> cVar) {
        this.f10005a = cVar;
    }

    public <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<?> getKey() {
        return this.f10005a;
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public f w0(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}

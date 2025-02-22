package yg;

import ag.k;
import ag.l;
import cb.b;
import sf.j;

public final class r implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17496a;

    public r(l lVar) {
        this.f17496a = lVar;
    }

    public final void a(b<Object> bVar, b0<Object> b0Var) {
        j.g(bVar, "call");
        j.g(b0Var, "response");
        this.f17496a.resumeWith(b0Var);
    }

    public final void b(b<Object> bVar, Throwable th) {
        j.g(bVar, "call");
        j.g(th, "t");
        this.f17496a.resumeWith(b.u(th));
    }
}

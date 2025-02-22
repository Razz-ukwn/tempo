package yg;

import ag.k;
import ag.l;
import cb.b;
import sf.j;

public final class p implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17494a;

    public p(l lVar) {
        this.f17494a = lVar;
    }

    public final void a(b<Object> bVar, b0<Object> b0Var) {
        j.g(bVar, "call");
        j.g(b0Var, "response");
        boolean a10 = b0Var.a();
        k kVar = this.f17494a;
        if (a10) {
            kVar.resumeWith(b0Var.f17446b);
        } else {
            kVar.resumeWith(b.u(new j(b0Var)));
        }
    }

    public final void b(b<Object> bVar, Throwable th) {
        j.g(bVar, "call");
        j.g(th, "t");
        this.f17494a.resumeWith(b.u(th));
    }
}

package z0;

import cb.c;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class y extends k implements l<a0, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f17618a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f17619b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(z zVar, x xVar) {
        super(1);
        this.f17618a = zVar;
        this.f17619b = xVar;
    }

    public final Object invoke(Object obj) {
        a0 a0Var = (a0) obj;
        j.f(a0Var, "finalResult");
        z zVar = this.f17618a;
        c cVar = zVar.f17620a;
        x xVar = this.f17619b;
        synchronized (cVar) {
            if (a0Var.d()) {
                zVar.f17621b.b(xVar, a0Var);
            } else {
                zVar.f17621b.c(xVar);
            }
        }
        return m.f8717a;
    }
}

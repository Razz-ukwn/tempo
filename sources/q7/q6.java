package q7;

import java.util.concurrent.Callable;
import u6.q;

public final class q6 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c7 f13293a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t6 f13294b;

    public q6(t6 t6Var, c7 c7Var) {
        this.f13294b = t6Var;
        this.f13293a = c7Var;
    }

    public final Object call() {
        c7 c7Var = this.f13293a;
        String str = c7Var.f12948a;
        q.i(str);
        t6 t6Var = this.f13294b;
        h K = t6Var.K(str);
        g gVar = g.f13016c;
        if (K.f(gVar) && h.b(c7Var.R).f(gVar)) {
            return t6Var.I(c7Var).F();
        }
        t6Var.e().J.b("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

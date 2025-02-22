package v0;

import gc.b;
import s0.a0;
import s0.i;
import s0.p1;
import sf.j;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f16078a;

    public q(a0 a0Var) {
        j.f(a0Var, "rootNode");
        this.f16078a = a0Var;
    }

    public final p a() {
        p1 n2 = b.n(this.f16078a);
        j.c(n2);
        return new p(n2, false, i.e(n2));
    }
}

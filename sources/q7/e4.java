package q7;

import java.util.concurrent.Callable;

public final class e4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f12977a;

    public e4(h4 h4Var, s sVar, String str) {
        this.f12977a = h4Var;
    }

    public final Object call() {
        h4 h4Var = this.f12977a;
        h4Var.f13101a.b();
        y2 y2Var = h4Var.f13101a.D;
        t6.H(y2Var);
        y2Var.i();
        throw new IllegalStateException("Unexpected call on client side");
    }
}

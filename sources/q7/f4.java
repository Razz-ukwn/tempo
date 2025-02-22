package q7;

import java.util.concurrent.Callable;

public final class f4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12998a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h4 f12999b;

    public f4(h4 h4Var, String str) {
        this.f12999b = h4Var;
        this.f12998a = str;
    }

    public final Object call() {
        h4 h4Var = this.f12999b;
        h4Var.f13101a.b();
        k kVar = h4Var.f13101a.f13350c;
        t6.H(kVar);
        return kVar.M(this.f12998a);
    }
}

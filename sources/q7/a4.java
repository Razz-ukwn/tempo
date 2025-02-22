package q7;

import java.util.concurrent.Callable;

public final class a4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12895b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12896c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h4 f12897d;

    public a4(h4 h4Var, String str, String str2, String str3) {
        this.f12897d = h4Var;
        this.f12894a = str;
        this.f12895b = str2;
        this.f12896c = str3;
    }

    public final Object call() {
        h4 h4Var = this.f12897d;
        h4Var.f13101a.b();
        k kVar = h4Var.f13101a.f13350c;
        t6.H(kVar);
        return kVar.N(this.f12894a, this.f12895b, this.f12896c);
    }
}

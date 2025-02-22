package q7;

import java.util.concurrent.Callable;

public final class b4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12922c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h4 f12923d;

    public b4(h4 h4Var, String str, String str2, String str3) {
        this.f12923d = h4Var;
        this.f12920a = str;
        this.f12921b = str2;
        this.f12922c = str3;
    }

    public final Object call() {
        h4 h4Var = this.f12923d;
        h4Var.f13101a.b();
        k kVar = h4Var.f13101a.f13350c;
        t6.H(kVar);
        return kVar.N(this.f12920a, this.f12921b, this.f12922c);
    }
}

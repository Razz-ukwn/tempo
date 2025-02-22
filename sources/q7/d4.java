package q7;

import java.util.concurrent.Callable;

public final class d4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12961a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12962b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12963c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h4 f12964d;

    public d4(h4 h4Var, String str, String str2, String str3) {
        this.f12964d = h4Var;
        this.f12961a = str;
        this.f12962b = str2;
        this.f12963c = str3;
    }

    public final Object call() {
        h4 h4Var = this.f12964d;
        h4Var.f13101a.b();
        k kVar = h4Var.f13101a.f13350c;
        t6.H(kVar);
        return kVar.K(this.f12961a, this.f12962b, this.f12963c);
    }
}

package q7;

import java.util.concurrent.Callable;

public final class c4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12939b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12940c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h4 f12941d;

    public c4(h4 h4Var, String str, String str2, String str3) {
        this.f12941d = h4Var;
        this.f12938a = str;
        this.f12939b = str2;
        this.f12940c = str3;
    }

    public final Object call() {
        h4 h4Var = this.f12941d;
        h4Var.f13101a.b();
        k kVar = h4Var.f13101a.f13350c;
        t6.H(kVar);
        return kVar.K(this.f12938a, this.f12939b, this.f12940c);
    }
}

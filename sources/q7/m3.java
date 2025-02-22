package q7;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class m3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r3 f13202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13203b;

    public /* synthetic */ m3(r3 r3Var, String str) {
        this.f13202a = r3Var;
        this.f13203b = str;
    }

    public final Object call() {
        r3 r3Var = this.f13202a;
        k kVar = r3Var.f13208b.f13350c;
        t6.H(kVar);
        String str = this.f13203b;
        l4 C = kVar.C(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        ((x3) r3Var.f13121a).C.n();
        hashMap.put("gmp_version", 77000L);
        if (C != null) {
            String G = C.G();
            if (G != null) {
                hashMap.put("app_version", G);
            }
            hashMap.put("app_version_int", Long.valueOf(C.A()));
            hashMap.put("dynamite_version", Long.valueOf(C.B()));
        }
        return hashMap;
    }
}

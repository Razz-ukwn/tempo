package q7;

import android.os.Bundle;
import android.text.TextUtils;

public final /* synthetic */ class o4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13244a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f13245b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13246c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13247d;

    public /* synthetic */ o4(a5 a5Var, Bundle bundle, long j10) {
        this.f13246c = a5Var;
        this.f13247d = bundle;
        this.f13245b = j10;
    }

    public final void run() {
        int i8 = this.f13244a;
        long j10 = this.f13245b;
        Object obj = this.f13247d;
        Object obj2 = this.f13246c;
        switch (i8) {
            case 0:
                a5 a5Var = (a5) obj2;
                Bundle bundle = (Bundle) obj;
                if (TextUtils.isEmpty(((x3) a5Var.f13121a).q().o())) {
                    a5Var.u(bundle, 0, j10);
                    return;
                }
                s2 s2Var = ((x3) a5Var.f13121a).E;
                x3.l(s2Var);
                s2Var.G.b("Using developer consent only; google app id found");
                return;
            default:
                j5 j5Var = (j5) obj;
                j5Var.n((f5) obj2, false, j10);
                j5Var.f13140e = null;
                x5 u7 = ((x3) j5Var.f13121a).u();
                u7.i();
                u7.j();
                u7.u(new z3(4, u7, (Object) null));
                return;
        }
    }

    public o4(j5 j5Var, f5 f5Var, long j10) {
        this.f13247d = j5Var;
        this.f13246c = f5Var;
        this.f13245b = j10;
    }
}

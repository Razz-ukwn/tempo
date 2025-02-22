package q7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.j0;
import u6.q;

public final class h3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13098b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13099c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13100d;

    public /* synthetic */ h3(int i8, Object obj, Object obj2, Object obj3) {
        this.f13097a = i8;
        this.f13100d = obj;
        this.f13098b = obj2;
        this.f13099c = obj3;
    }

    public final void run() {
        int i8 = this.f13097a;
        Object obj = this.f13099c;
        Object obj2 = this.f13098b;
        Object obj3 = this.f13100d;
        switch (i8) {
            case 0:
                i3 i3Var = (i3) obj3;
                j0 j0Var = (j0) obj2;
                x3 x3Var = i3Var.f13120b.f13136a;
                w3 w3Var = x3Var.F;
                s2 s2Var = x3Var.E;
                x3.l(w3Var);
                w3Var.i();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", i3Var.f13119a);
                try {
                    if (j0Var.u(bundle) == null) {
                        x3.l(s2Var);
                        s2Var.B.b("Install Referrer Service returned a null response");
                    }
                } catch (Exception e10) {
                    x3.l(s2Var);
                    s2Var.B.c(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                w3 w3Var2 = x3Var.F;
                x3.l(w3Var2);
                w3Var2.i();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                h4 h4Var = (h4) obj3;
                h4Var.f13101a.b();
                w6 w6Var = (w6) obj2;
                Object w10 = w6Var.w();
                t6 t6Var = h4Var.f13101a;
                if (w10 == null) {
                    t6Var.o(w6Var.f13410b, (c7) obj);
                    return;
                } else {
                    t6Var.s(w6Var, (c7) obj);
                    return;
                }
            default:
                x5 x5Var = (x5) obj3;
                j2 j2Var = x5Var.f13433d;
                k4 k4Var = x5Var.f13121a;
                if (j2Var == null) {
                    s2 s2Var2 = ((x3) k4Var).E;
                    x3.l(s2Var2);
                    s2Var2.B.b("Failed to send default event parameters to service");
                    return;
                }
                try {
                    q.i((c7) obj2);
                    j2Var.D((Bundle) obj, (c7) obj2);
                    return;
                } catch (RemoteException e11) {
                    s2 s2Var3 = ((x3) k4Var).E;
                    x3.l(s2Var3);
                    s2Var3.B.c(e11, "Failed to send default event parameters to service");
                    return;
                }
        }
    }
}

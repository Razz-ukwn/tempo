package q7;

import android.os.RemoteException;
import u6.q;

public final class n5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c7 f13231b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x5 f13232c;

    public /* synthetic */ n5(x5 x5Var, c7 c7Var, int i8) {
        this.f13230a = i8;
        this.f13232c = x5Var;
        this.f13231b = c7Var;
    }

    public final void run() {
        int i8 = this.f13230a;
        x5 x5Var = this.f13232c;
        c7 c7Var = this.f13231b;
        switch (i8) {
            case 0:
                j2 j2Var = x5Var.f13433d;
                k4 k4Var = x5Var.f13121a;
                if (j2Var == null) {
                    s2 s2Var = ((x3) k4Var).E;
                    x3.l(s2Var);
                    s2Var.B.b("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    q.i(c7Var);
                    j2Var.H(c7Var);
                } catch (RemoteException e10) {
                    s2 s2Var2 = ((x3) k4Var).E;
                    x3.l(s2Var2);
                    s2Var2.B.c(e10, "Failed to reset data on the service: remote exception");
                }
                x5Var.t();
                return;
            default:
                j2 j2Var2 = x5Var.f13433d;
                k4 k4Var2 = x5Var.f13121a;
                if (j2Var2 == null) {
                    s2 s2Var3 = ((x3) k4Var2).E;
                    x3.l(s2Var3);
                    s2Var3.B.b("Failed to send consent settings to service");
                    return;
                }
                try {
                    q.i(c7Var);
                    j2Var2.g(c7Var);
                    x5Var.t();
                    return;
                } catch (RemoteException e11) {
                    s2 s2Var4 = ((x3) k4Var2).E;
                    x3.l(s2Var4);
                    s2Var4.B.c(e11, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}

package q7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;

public final class i3 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f13119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j3 f13120b;

    public i3(j3 j3Var, String str) {
        this.f13120b = j3Var;
        this.f13119a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j3 j3Var = this.f13120b;
        if (iBinder != null) {
            try {
                int i8 = i0.f5321a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                Object h0Var = queryLocalInterface instanceof j0 ? (j0) queryLocalInterface : new h0(iBinder);
                if (h0Var == null) {
                    s2 s2Var = j3Var.f13136a.E;
                    x3.l(s2Var);
                    s2Var.E.b("Install Referrer Service implementation was not found");
                    return;
                }
                s2 s2Var2 = j3Var.f13136a.E;
                x3.l(s2Var2);
                s2Var2.J.b("Install Referrer Service connected");
                w3 w3Var = j3Var.f13136a.F;
                x3.l(w3Var);
                w3Var.q(new h3(0, this, h0Var, this));
            } catch (RuntimeException e10) {
                s2 s2Var3 = j3Var.f13136a.E;
                x3.l(s2Var3);
                s2Var3.E.c(e10, "Exception occurred while calling Install Referrer API");
            }
        } else {
            s2 s2Var4 = j3Var.f13136a.E;
            x3.l(s2Var4);
            s2Var4.E.b("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        s2 s2Var = this.f13120b.f13136a.E;
        x3.l(s2Var);
        s2Var.J.b("Install Referrer Service disconnected");
    }
}

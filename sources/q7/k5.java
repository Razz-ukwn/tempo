package q7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.u0;
import java.util.List;
import u6.q;

public final class k5 implements Runnable {
    public final /* synthetic */ x5 B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13152a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13153b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c7 f13154c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f13155d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u0 f13156e;

    public k5(x5 x5Var, String str, String str2, c7 c7Var, boolean z10, u0 u0Var) {
        this.B = x5Var;
        this.f13152a = str;
        this.f13153b = str2;
        this.f13154c = c7Var;
        this.f13155d = z10;
        this.f13156e = u0Var;
    }

    public final void run() {
        c7 c7Var = this.f13154c;
        String str = this.f13152a;
        u0 u0Var = this.f13156e;
        x5 x5Var = this.B;
        Bundle bundle = new Bundle();
        try {
            j2 j2Var = x5Var.f13433d;
            k4 k4Var = x5Var.f13121a;
            String str2 = this.f13153b;
            if (j2Var == null) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.d(str, str2, "Failed to get user properties; not connected to service");
                a7 a7Var = ((x3) k4Var).H;
                x3.j(a7Var);
                a7Var.D(u0Var, bundle);
                return;
            }
            q.i(c7Var);
            List<w6> m = j2Var.m(str, str2, this.f13155d, c7Var);
            Bundle bundle2 = new Bundle();
            if (m != null) {
                for (w6 w6Var : m) {
                    String str3 = w6Var.f13413e;
                    String str4 = w6Var.f13410b;
                    if (str3 != null) {
                        bundle2.putString(str4, str3);
                    } else {
                        Long l10 = w6Var.f13412d;
                        if (l10 != null) {
                            bundle2.putLong(str4, l10.longValue());
                        } else {
                            Double d10 = w6Var.C;
                            if (d10 != null) {
                                bundle2.putDouble(str4, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                x5Var.t();
                a7 a7Var2 = ((x3) k4Var).H;
                x3.j(a7Var2);
                a7Var2.D(u0Var, bundle2);
            } catch (RemoteException e10) {
                e = e10;
                bundle = bundle2;
                try {
                    s2 s2Var2 = ((x3) x5Var.f13121a).E;
                    x3.l(s2Var2);
                    s2Var2.B.d(str, e, "Failed to get user properties; remote exception");
                    a7 a7Var3 = ((x3) x5Var.f13121a).H;
                    x3.j(a7Var3);
                    a7Var3.D(u0Var, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    a7 a7Var4 = ((x3) x5Var.f13121a).H;
                    x3.j(a7Var4);
                    a7Var4.D(u0Var, bundle2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                a7 a7Var42 = ((x3) x5Var.f13121a).H;
                x3.j(a7Var42);
                a7Var42.D(u0Var, bundle2);
                throw th;
            }
        } catch (RemoteException e11) {
            e = e11;
            s2 s2Var22 = ((x3) x5Var.f13121a).E;
            x3.l(s2Var22);
            s2Var22.B.d(str, e, "Failed to get user properties; remote exception");
            a7 a7Var32 = ((x3) x5Var.f13121a).H;
            x3.j(a7Var32);
            a7Var32.D(u0Var, bundle);
        }
    }
}

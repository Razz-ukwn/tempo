package q7;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.u0;
import java.util.ArrayList;
import u6.q;

public final class t5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13342b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c7 f13343c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u0 f13344d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x5 f13345e;

    public t5(x5 x5Var, String str, String str2, c7 c7Var, u0 u0Var) {
        this.f13345e = x5Var;
        this.f13341a = str;
        this.f13342b = str2;
        this.f13343c = c7Var;
        this.f13344d = u0Var;
    }

    public final void run() {
        a7 a7Var;
        x3 x3Var;
        c7 c7Var = this.f13343c;
        String str = this.f13342b;
        String str2 = this.f13341a;
        u0 u0Var = this.f13344d;
        x5 x5Var = this.f13345e;
        ArrayList arrayList = new ArrayList();
        try {
            j2 j2Var = x5Var.f13433d;
            k4 k4Var = x5Var.f13121a;
            if (j2Var == null) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.d(str2, str, "Failed to get conditional properties; not connected to service");
                x3Var = (x3) k4Var;
            } else {
                q.i(c7Var);
                arrayList = a7.s(j2Var.t(str2, str, c7Var));
                x5Var.t();
                x3Var = (x3) k4Var;
            }
            a7Var = x3Var.H;
        } catch (RemoteException e10) {
            s2 s2Var2 = ((x3) x5Var.f13121a).E;
            x3.l(s2Var2);
            s2Var2.B.e("Failed to get conditional properties; remote exception", str2, str, e10);
            a7Var = ((x3) x5Var.f13121a).H;
        } catch (Throwable th) {
            a7 a7Var2 = ((x3) x5Var.f13121a).H;
            x3.j(a7Var2);
            a7Var2.C(u0Var, arrayList);
            throw th;
        }
        x3.j(a7Var);
        a7Var.C(u0Var, arrayList);
    }
}

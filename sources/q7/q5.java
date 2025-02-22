package q7;

import ag.m;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.u0;
import e.s;
import u6.q;

public final class q5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13288a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13289b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13290c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13291d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z6 f13292e;

    public q5(s sVar, String str, Bundle bundle) {
        this.f13292e = sVar;
        this.f13289b = str;
        this.f13290c = "_err";
        this.f13291d = bundle;
    }

    public final void run() {
        x3 x3Var;
        int i8 = this.f13288a;
        String str = this.f13289b;
        Object obj = this.f13290c;
        z6 z6Var = this.f13292e;
        Object obj2 = this.f13291d;
        switch (i8) {
            case 0:
                byte[] bArr = null;
                try {
                    x5 x5Var = (x5) z6Var;
                    j2 j2Var = x5Var.f13433d;
                    if (j2Var == null) {
                        s2 s2Var = ((x3) x5Var.f13121a).E;
                        x3.l(s2Var);
                        s2Var.B.b("Discarding data. Failed to send event to service to bundle");
                        x3Var = (x3) ((x5) z6Var).f13121a;
                    } else {
                        bArr = j2Var.s((s) obj, str);
                        ((x5) z6Var).t();
                        x3Var = (x3) ((x5) z6Var).f13121a;
                    }
                } catch (RemoteException e10) {
                    s2 s2Var2 = ((x3) ((x5) z6Var).f13121a).E;
                    x3.l(s2Var2);
                    s2Var2.B.c(e10, "Failed to send event to the service to bundle");
                    x3Var = (x3) ((x5) z6Var).f13121a;
                } catch (Throwable th) {
                    a7 a7Var = ((x3) ((x5) z6Var).f13121a).H;
                    x3.j(a7Var);
                    a7Var.E((u0) obj2, bArr);
                    throw th;
                }
                a7 a7Var2 = x3Var.H;
                x3.j(a7Var2);
                a7Var2.E((u0) obj2, bArr);
                return;
            default:
                s sVar = (s) z6Var;
                Object obj3 = sVar.f7705a;
                ((m) ((t6) obj3).a()).getClass();
                s q02 = ((t6) sVar.f7705a).P().q0((String) obj, (Bundle) obj2, "auto", System.currentTimeMillis(), false);
                q.i(q02);
                ((t6) obj3).j(q02, str);
                return;
        }
    }

    public q5(x5 x5Var, s sVar, String str, u0 u0Var) {
        this.f13292e = x5Var;
        this.f13290c = sVar;
        this.f13289b = str;
        this.f13291d = u0Var;
    }
}

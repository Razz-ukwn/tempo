package q7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.p000firebaseauthapi.a;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.yh;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import e.s;
import java.util.concurrent.atomic.AtomicReference;
import m9.f;
import r9.k0;
import r9.m;
import s9.k;
import u6.q;

public final class z3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13463a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13464b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13465c;

    public /* synthetic */ z3(int i8, Object obj, Object obj2) {
        this.f13463a = i8;
        this.f13464b = obj;
        this.f13465c = obj2;
    }

    public final void run() {
        boolean z10 = false;
        switch (this.f13463a) {
            case 0:
                h4 h4Var = (h4) this.f13464b;
                h4Var.f13101a.b();
                c cVar = (c) this.f13465c;
                if (cVar.f12928c.w() == null) {
                    t6 t6Var = h4Var.f13101a;
                    t6Var.getClass();
                    String str = cVar.f12926a;
                    q.i(str);
                    c7 y10 = t6Var.y(str);
                    if (y10 != null) {
                        t6Var.n(cVar, y10);
                        return;
                    }
                    return;
                }
                t6 t6Var2 = h4Var.f13101a;
                t6Var2.getClass();
                String str2 = cVar.f12926a;
                q.i(str2);
                c7 y11 = t6Var2.y(str2);
                if (y11 != null) {
                    t6Var2.q(cVar, y11);
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f13464b;
                h4Var2.f13101a.b();
                h4Var2.f13101a.p((c7) this.f13465c);
                return;
            case 2:
                a5 a5Var = (a5) this.f13464b;
                Bundle bundle = (Bundle) this.f13465c;
                a5Var.i();
                a5Var.j();
                q.i(bundle);
                String string = bundle.getString("name");
                q.f(string);
                k4 k4Var = a5Var.f13121a;
                x3 x3Var = (x3) k4Var;
                if (!x3Var.g()) {
                    s2 s2Var = x3Var.E;
                    x3.l(s2Var);
                    s2Var.J.b("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                w6 w6Var = new w6(0, (Object) null, string, "");
                try {
                    a7 a7Var = ((x3) k4Var).H;
                    x3.j(a7Var);
                    bundle.getString("app_id");
                    x3Var.u().n(new c(bundle.getString("app_id"), "", w6Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (s) null, bundle.getLong("trigger_timeout"), (s) null, bundle.getLong("time_to_live"), a7Var.q0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 3:
                synchronized (((AtomicReference) this.f13465c)) {
                    try {
                        Object obj = this.f13464b;
                        ((AtomicReference) this.f13465c).set(Double.valueOf(((x3) ((a5) obj).f13121a).C.k(((x3) ((a5) obj).f13121a).q().n(), g2.P)));
                        ((AtomicReference) this.f13465c).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f13465c).notify();
                        throw th;
                    }
                }
                return;
            case 4:
                Object obj2 = this.f13464b;
                x5 x5Var = (x5) obj2;
                j2 j2Var = x5Var.f13433d;
                k4 k4Var2 = x5Var.f13121a;
                if (j2Var == null) {
                    s2 s2Var2 = ((x3) k4Var2).E;
                    x3.l(s2Var2);
                    s2Var2.B.b("Failed to send current screen to service");
                    return;
                }
                try {
                    f5 f5Var = (f5) this.f13465c;
                    if (f5Var == null) {
                        j2Var.z(0, (String) null, (String) null, ((x3) k4Var2).f13419a.getPackageName());
                    } else {
                        j2Var.z(f5Var.f13002c, f5Var.f13000a, f5Var.f13001b, ((x3) k4Var2).f13419a.getPackageName());
                    }
                    ((x5) obj2).t();
                    return;
                } catch (RemoteException e10) {
                    s2 s2Var3 = ((x3) x5Var.f13121a).E;
                    x3.l(s2Var3);
                    s2Var3.B.c(e10, "Failed to send current screen to the service");
                    return;
                }
            case 5:
                Object obj3 = this.f13465c;
                Object obj4 = this.f13464b;
                x5 x5Var2 = (x5) obj4;
                j2 j2Var2 = x5Var2.f13433d;
                if (j2Var2 == null) {
                    s2 s2Var4 = ((x3) x5Var2.f13121a).E;
                    x3.l(s2Var4);
                    s2Var4.B.b("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    q.i((c7) obj3);
                    j2Var2.x((c7) obj3);
                    ((x5) obj4).t();
                    return;
                } catch (RemoteException e11) {
                    s2 s2Var5 = ((x3) x5Var2.f13121a).E;
                    x3.l(s2Var5);
                    s2Var5.B.c(e11, "Failed to send measurementEnabled to the service");
                    return;
                }
            case 6:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.f13464b;
                a7 a7Var2 = appMeasurementDynamiteService.f5666a.H;
                x3.j(a7Var2);
                u0 u0Var = (u0) this.f13465c;
                x3 x3Var2 = appMeasurementDynamiteService.f5666a;
                if (x3Var2.W != null && x3Var2.W.booleanValue()) {
                    z10 = true;
                }
                a7Var2.B(u0Var, z10);
                return;
            default:
                FirebaseAuth instance = FirebaseAuth.getInstance(f.e((String) this.f13465c));
                m mVar = instance.f6310f;
                if (mVar != null) {
                    m0 D = mVar.D();
                    D.y();
                    String str3 = D.f4723a;
                    k0 k0Var = new k0(instance);
                    a aVar = instance.f6309e;
                    aVar.getClass();
                    yh yhVar = new yh(str3);
                    yhVar.d(instance.f6305a);
                    yhVar.f4929d = mVar;
                    yhVar.f4930e = k0Var;
                    yhVar.f4931f = k0Var;
                    Task a10 = aVar.a(yhVar);
                    k.f14839e.e("Token refreshing started", new Object[0]);
                    a10.addOnFailureListener(new s((Object) this));
                    return;
                }
                return;
        }
    }

    public z3(k kVar, String str) {
        this.f13463a = 7;
        this.f13464b = kVar;
        q.f(str);
        this.f13465c = str;
    }
}

package q7;

import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;
import u6.q;

public final class v4 implements Runnable {
    public final /* synthetic */ Object B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13384a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f13385b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13386c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13387d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f13388e;

    public v4(AppMeasurementDynamiteService appMeasurementDynamiteService, u0 u0Var, String str, String str2, boolean z10) {
        this.B = appMeasurementDynamiteService;
        this.f13386c = u0Var;
        this.f13387d = str;
        this.f13388e = str2;
        this.f13385b = z10;
    }

    public final void run() {
        int i8 = this.f13384a;
        Object obj = this.f13388e;
        Object obj2 = this.f13387d;
        Object obj3 = this.f13386c;
        Object obj4 = this.B;
        switch (i8) {
            case 0:
                x5 u7 = ((x3) ((a5) obj4).f13121a).u();
                boolean z10 = this.f13385b;
                u7.i();
                u7.j();
                u7.u(new u5(u7, (AtomicReference) obj3, (String) obj2, (String) obj, u7.r(false), z10));
                return;
            case 1:
                x5 x5Var = (x5) obj4;
                j2 j2Var = x5Var.f13433d;
                if (j2Var == null) {
                    s2 s2Var = ((x3) x5Var.f13121a).E;
                    x3.l(s2Var);
                    s2Var.B.b("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                c7 c7Var = (c7) obj3;
                q.i(c7Var);
                x5Var.m(j2Var, this.f13385b ? null : (c) obj2, c7Var);
                x5Var.t();
                return;
            default:
                x5 u10 = ((AppMeasurementDynamiteService) obj4).f5666a.u();
                boolean z11 = this.f13385b;
                u10.i();
                u10.j();
                u10.u(new k5(u10, (String) obj2, (String) obj, u10.r(false), z11, (u0) obj3));
                return;
        }
    }

    public v4(a5 a5Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.B = a5Var;
        this.f13386c = atomicReference;
        this.f13387d = str;
        this.f13388e = str2;
        this.f13385b = z10;
    }

    public v4(x5 x5Var, c7 c7Var, boolean z10, c cVar, c cVar2) {
        this.B = x5Var;
        this.f13386c = c7Var;
        this.f13385b = z10;
        this.f13387d = cVar;
        this.f13388e = cVar2;
    }
}

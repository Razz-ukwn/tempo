package q7;

import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import t6.f;

public final class l5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13187a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u0 f13188b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13189c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13190d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f13191e;

    public l5(AppMeasurementDynamiteService appMeasurementDynamiteService, u0 u0Var, String str, String str2) {
        this.f13190d = appMeasurementDynamiteService;
        this.f13188b = u0Var;
        this.f13189c = str;
        this.f13191e = str2;
    }

    public final void run() {
        int i8 = this.f13187a;
        Object obj = this.f13191e;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f13190d;
        switch (i8) {
            case 0:
                x5 u7 = appMeasurementDynamiteService.f5666a.u();
                s sVar = (s) obj;
                u7.i();
                u7.j();
                x3 x3Var = (x3) u7.f13121a;
                a7 a7Var = x3Var.H;
                x3.j(a7Var);
                a7Var.getClass();
                int c3 = f.f15396b.c(((x3) a7Var.f13121a).f13419a, 12451000);
                u0 u0Var = this.f13188b;
                if (c3 != 0) {
                    s2 s2Var = x3Var.E;
                    x3.l(s2Var);
                    s2Var.E.b("Not bundling data. Service unavailable or out of date");
                    a7 a7Var2 = x3Var.H;
                    x3.j(a7Var2);
                    a7Var2.E(u0Var, new byte[0]);
                    return;
                }
                u7.u(new q5(u7, sVar, this.f13189c, u0Var));
                return;
            default:
                x5 u10 = appMeasurementDynamiteService.f5666a.u();
                u0 u0Var2 = this.f13188b;
                u10.i();
                u10.j();
                u10.u(new t5(u10, this.f13189c, (String) obj, u10.r(false), u0Var2));
                return;
        }
    }

    public l5(AppMeasurementDynamiteService appMeasurementDynamiteService, u0 u0Var, s sVar, String str) {
        this.f13190d = appMeasurementDynamiteService;
        this.f13188b = u0Var;
        this.f13191e = sVar;
        this.f13189c = str;
    }
}

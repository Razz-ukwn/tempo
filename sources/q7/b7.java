package q7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class b7 implements m4 {

    /* renamed from: a  reason: collision with root package name */
    public final x0 f12924a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f12925b;

    public b7(AppMeasurementDynamiteService appMeasurementDynamiteService, x0 x0Var) {
        this.f12925b = appMeasurementDynamiteService;
        this.f12924a = x0Var;
    }

    public final void a(long j10, Bundle bundle, String str, String str2) {
        try {
            this.f12924a.k(j10, bundle, str, str2);
        } catch (RemoteException e10) {
            x3 x3Var = this.f12925b.f5666a;
            if (x3Var != null) {
                s2 s2Var = x3Var.E;
                x3.l(s2Var);
                s2Var.E.c(e10, "Event listener threw exception");
            }
        }
    }
}

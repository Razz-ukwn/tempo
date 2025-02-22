package q7;

import android.content.ComponentName;
import android.content.Context;

public final class v5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w5 f13389a;

    public v5(w5 w5Var) {
        this.f13389a = w5Var;
    }

    public final void run() {
        w5 w5Var = this.f13389a;
        x5 x5Var = w5Var.f13408c;
        Context context = ((x3) x5Var.f13121a).f13419a;
        ((x3) w5Var.f13408c.f13121a).getClass();
        x5.v(x5Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

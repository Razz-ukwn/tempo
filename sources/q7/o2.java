package q7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import t6.f;
import u6.b;
import u6.h;

public final class o2 extends b {
    public o2(Context context, Looper looper, w5 w5Var, w5 w5Var2) {
        super(context, looper, h.a(context), f.f15396b, 93, w5Var, w5Var2, (String) null);
    }

    public final int j() {
        return 12451000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof j2 ? (j2) queryLocalInterface : new h2(iBinder);
    }

    public final String y() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String z() {
        return "com.google.android.gms.measurement.START";
    }
}

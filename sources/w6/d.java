package w6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.k;
import h7.f;
import u6.g;
import u6.u;

public final class d extends g {
    public final u B;

    public d(Context context, Looper looper, u6.d dVar, u uVar, com.google.android.gms.common.api.internal.d dVar2, k kVar) {
        super(context, looper, 270, dVar, dVar2, kVar);
        this.B = uVar;
    }

    public final boolean A() {
        return true;
    }

    public final int j() {
        return 203400000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final t6.d[] t() {
        return f.f9275b;
    }

    public final Bundle v() {
        u uVar = this.B;
        uVar.getClass();
        Bundle bundle = new Bundle();
        String str = uVar.f15866a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String y() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String z() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
}

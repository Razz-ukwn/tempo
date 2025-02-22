package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class s0 extends e0 implements u0 {
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void q(Bundle bundle) {
        Parcel a10 = a();
        g0.c(a10, bundle);
        c(a10, 1);
    }
}

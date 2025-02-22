package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class t0 extends f0 implements u0 {
    public t0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean a(int i8, Parcel parcel, Parcel parcel2) {
        if (i8 != 1) {
            return false;
        }
        g0.b(parcel);
        ((n0) this).q((Bundle) g0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

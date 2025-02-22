package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class h0 extends e0 implements j0 {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle u(Bundle bundle) {
        Parcel a10 = a();
        g0.c(a10, bundle);
        Parcel b10 = b(a10, 1);
        Bundle bundle2 = (Bundle) g0.a(b10, Bundle.CREATOR);
        b10.recycle();
        return bundle2;
    }
}

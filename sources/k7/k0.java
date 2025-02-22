package k7;

import android.os.Parcel;
import g7.b;

public abstract class k0 extends b implements l0 {
    public k0() {
        super(1, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean b(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 == 1) {
            e.b(parcel);
            E((h0) e.a(parcel, h0.CREATOR));
        } else if (i8 != 2) {
            return false;
        } else {
            zze();
        }
        return true;
    }
}

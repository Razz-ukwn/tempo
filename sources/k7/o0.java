package k7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import e9.c;
import g7.b;

public abstract class o0 extends b {
    public o0() {
        super(1, "com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    public final boolean b(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 != 1) {
            return false;
        }
        e.b(parcel);
        c.k((Status) e.a(parcel, Status.CREATOR), (Location) e.a(parcel, Location.CREATOR), ((i) this).f10370b);
        return true;
    }
}

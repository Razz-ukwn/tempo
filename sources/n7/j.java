package n7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import g7.b;
import k7.e;
import k7.m;
import k7.n;
import k7.p;

public abstract class j extends b implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11612b = 0;

    public j() {
        super(1, "com.google.android.gms.location.ILocationCallback");
    }

    public final boolean b(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 == 1) {
            e.b(parcel);
            ((p) this).f10377c.zza().a(new m((LocationResult) e.a(parcel, LocationResult.CREATOR)));
        } else if (i8 == 2) {
            e.b(parcel);
            ((p) this).f10377c.zza().a(new n((LocationAvailability) e.a(parcel, LocationAvailability.CREATOR)));
        } else if (i8 != 3) {
            return false;
        } else {
            ((p) this).zzf();
        }
        return true;
    }
}

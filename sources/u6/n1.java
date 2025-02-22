package u6;

import android.os.Parcel;
import c7.a;
import h7.b;
import t6.t;

public abstract class n1 extends b implements m0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f15847b = 0;

    public n1() {
        super(1, "com.google.android.gms.common.internal.ICertData");
    }

    public final boolean M(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 == 1) {
            a zzd = ((t) this).zzd();
            parcel2.writeNoException();
            j7.a.c(parcel2, zzd);
        } else if (i8 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(((t) this).f15414c);
        }
        return true;
    }
}

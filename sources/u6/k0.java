package u6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class k0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        t6.b bVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                iBinder = b.i(parcel, readInt);
            } else if (c3 == 3) {
                bVar = (t6.b) b.b(parcel, readInt, t6.b.CREATOR);
            } else if (c3 == 4) {
                z10 = b.h(parcel, readInt);
            } else if (c3 != 5) {
                b.n(parcel, readInt);
            } else {
                z11 = b.h(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new j0(i8, iBinder, bVar, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new j0[i8];
    }
}

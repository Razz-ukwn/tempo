package t6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class d0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 == 2) {
                iBinder = b.i(parcel, readInt);
            } else if (c3 == 3) {
                z10 = b.h(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                z11 = b.h(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new c0(str, iBinder, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new c0[i8];
    }
}

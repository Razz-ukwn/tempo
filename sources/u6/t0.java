package u6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class t0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                z10 = b.h(parcel, readInt);
            } else if (c3 == 3) {
                z11 = b.h(parcel, readInt);
            } else if (c3 == 4) {
                i10 = b.j(parcel, readInt);
            } else if (c3 != 5) {
                b.n(parcel, readInt);
            } else {
                i11 = b.j(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new s(i8, i10, i11, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new s[i8];
    }
}

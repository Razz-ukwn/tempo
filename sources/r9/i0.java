package r9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class i0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 == 2) {
                str2 = b.c(parcel, readInt);
            } else if (c3 == 3) {
                str3 = b.c(parcel, readInt);
            } else if (c3 == 4) {
                str4 = b.c(parcel, readInt);
            } else if (c3 != 5) {
                b.n(parcel, readInt);
            } else {
                z10 = b.h(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new c(str, str2, str3, str4, z10);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new c[i8];
    }
}

package r9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class z implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                str2 = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new o(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new o[i8];
    }
}

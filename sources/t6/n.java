package t6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class n implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        long j10 = -1;
        int i8 = 0;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 == 2) {
                i8 = b.j(parcel, readInt);
            } else if (c3 != 3) {
                b.n(parcel, readInt);
            } else {
                j10 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new d(str, j10, i8);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new d[i8];
    }
}

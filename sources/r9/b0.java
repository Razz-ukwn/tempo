package r9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class b0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 == 2) {
                str2 = b.c(parcel, readInt);
            } else if (c3 == 3) {
                j10 = b.k(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                str3 = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new s(j10, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new s[i8];
    }
}

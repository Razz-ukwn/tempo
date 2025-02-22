package r9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class c0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(parcel, readInt);
            } else {
                str = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new t(str);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new t[i8];
    }
}

package s7;

import android.os.Parcel;
import android.os.Parcelable;
import u6.h0;
import v6.b;

public final class k implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        h0 h0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                h0Var = (h0) b.b(parcel, readInt, h0.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new j(i8, h0Var);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new j[i8];
    }
}

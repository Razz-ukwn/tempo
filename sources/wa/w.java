package wa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class w implements Parcelable.Creator<v> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.n(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new v(bundle);
    }

    public final Object[] newArray(int i8) {
        return new v[i8];
    }
}

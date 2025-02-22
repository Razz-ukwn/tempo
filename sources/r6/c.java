package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        Bundle bundle = null;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                i10 = b.j(parcel, readInt);
            } else if (c3 != 3) {
                b.n(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new a(i8, i10, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}

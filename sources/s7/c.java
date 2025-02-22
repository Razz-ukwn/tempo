package s7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        Intent intent = null;
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
                intent = (Intent) b.b(parcel, readInt, Intent.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new b(i8, i10, intent);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}

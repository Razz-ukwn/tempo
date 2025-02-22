package u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v6.b;

public final class w implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        ArrayList<n> arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                arrayList = b.f(parcel, readInt, n.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new t(i8, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new t[i8];
    }
}

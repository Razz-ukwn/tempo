package s9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import r9.d0;
import r9.s;
import v6.b;

public final class q implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        ArrayList<s> arrayList = null;
        ArrayList<d0> arrayList2 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                arrayList = b.f(parcel, readInt, s.CREATOR);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                arrayList2 = b.f(parcel, readInt, d0.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new p(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new p[i8];
    }
}

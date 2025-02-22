package s9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import r9.s;
import v6.b;

public final class i implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        ArrayList<s> arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 == 2) {
                str2 = b.c(parcel, readInt);
            } else if (c3 != 3) {
                b.n(parcel, readInt);
            } else {
                arrayList = b.f(parcel, readInt, s.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new h(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}

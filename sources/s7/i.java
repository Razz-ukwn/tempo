package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v6.b;

public final class i implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                arrayList = b.d(parcel, readInt);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                str = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}

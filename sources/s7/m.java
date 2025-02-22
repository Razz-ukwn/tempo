package s7;

import android.os.Parcel;
import android.os.Parcelable;
import u6.j0;
import v6.b;

public final class m implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        t6.b bVar = null;
        j0 j0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                bVar = (t6.b) b.b(parcel, readInt, t6.b.CREATOR);
            } else if (c3 != 3) {
                b.n(parcel, readInt);
            } else {
                j0Var = (j0) b.b(parcel, readInt, j0.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new l(i8, bVar, j0Var);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}

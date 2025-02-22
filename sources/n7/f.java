package n7;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class f implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 1;
        int i10 = 1;
        long j10 = -1;
        long j11 = -1;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                i10 = b.j(parcel, readInt);
            } else if (c3 == 3) {
                j10 = b.k(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                j11 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new e(i8, i10, j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new e[i8];
    }
}

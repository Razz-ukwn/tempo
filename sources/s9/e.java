package s9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class e implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                j10 = b.k(parcel, readInt);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                j11 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new d(j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new d[i8];
    }
}

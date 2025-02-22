package t6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class b0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z10 = false;
        int i8 = 0;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                z10 = b.h(parcel, readInt);
            } else if (c3 == 2) {
                str = b.c(parcel, readInt);
            } else if (c3 == 3) {
                i10 = b.j(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                i8 = b.j(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new a0(i10, i8, str, z10);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new a0[i8];
    }
}

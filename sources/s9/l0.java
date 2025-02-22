package s9;

import android.os.Parcel;
import android.os.Parcelable;
import r9.g0;
import v6.b;

public final class l0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        p0 p0Var = null;
        i0 i0Var = null;
        g0 g0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                p0Var = (p0) b.b(parcel, readInt, p0.CREATOR);
            } else if (c3 == 2) {
                i0Var = (i0) b.b(parcel, readInt, i0.CREATOR);
            } else if (c3 != 3) {
                b.n(parcel, readInt);
            } else {
                g0Var = (g0) b.b(parcel, readInt, g0.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new k0(p0Var, i0Var, g0Var);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new k0[i8];
    }
}

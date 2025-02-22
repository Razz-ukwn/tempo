package q7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class r implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.n(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new q(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new q[i8];
    }
}

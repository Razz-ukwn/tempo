package k7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import v6.b;

public final class i0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Status status = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(parcel, readInt);
            } else {
                status = (Status) b.b(parcel, readInt, Status.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new h0(status);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new h0[i8];
    }
}

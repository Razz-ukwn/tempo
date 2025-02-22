package t6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class z implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.c(parcel, readInt);
                    break;
                case 2:
                    z10 = b.h(parcel, readInt);
                    break;
                case 3:
                    z11 = b.h(parcel, readInt);
                    break;
                case 4:
                    iBinder = b.i(parcel, readInt);
                    break;
                case 5:
                    z12 = b.h(parcel, readInt);
                    break;
                case 6:
                    z13 = b.h(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new y(str, z10, z11, iBinder, z12, z13);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new y[i8];
    }
}

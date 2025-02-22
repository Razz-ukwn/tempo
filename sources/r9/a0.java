package r9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class a0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.c(parcel, readInt);
                    break;
                case 2:
                    str2 = b.c(parcel, readInt);
                    break;
                case 3:
                    z10 = b.h(parcel, readInt);
                    break;
                case 4:
                    str3 = b.c(parcel, readInt);
                    break;
                case 5:
                    z11 = b.h(parcel, readInt);
                    break;
                case 6:
                    str4 = b.c(parcel, readInt);
                    break;
                case 7:
                    str5 = b.c(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new r(str, str2, z10, str3, z11, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new r[i8];
    }
}

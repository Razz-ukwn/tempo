package s9;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class n0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
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
                    str5 = b.c(parcel, readInt);
                    break;
                case 4:
                    str4 = b.c(parcel, readInt);
                    break;
                case 5:
                    str3 = b.c(parcel, readInt);
                    break;
                case 6:
                    str6 = b.c(parcel, readInt);
                    break;
                case 7:
                    z10 = b.h(parcel, readInt);
                    break;
                case 8:
                    str7 = b.c(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new m0(str, str2, str3, str4, str5, str6, z10, str7);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new m0[i8];
    }
}

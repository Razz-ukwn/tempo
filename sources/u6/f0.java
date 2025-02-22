package u6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class f0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        int i8 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i13 = -1;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i8 = b.j(parcel2, readInt);
                    break;
                case 2:
                    i10 = b.j(parcel2, readInt);
                    break;
                case 3:
                    i11 = b.j(parcel2, readInt);
                    break;
                case 4:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 5:
                    j11 = b.k(parcel2, readInt);
                    break;
                case 6:
                    str = b.c(parcel2, readInt);
                    break;
                case 7:
                    str2 = b.c(parcel2, readInt);
                    break;
                case 8:
                    i12 = b.j(parcel2, readInt);
                    break;
                case 9:
                    i13 = b.j(parcel2, readInt);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new n(i8, i10, i11, j10, j11, str, str2, i12, i13);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new n[i8];
    }
}

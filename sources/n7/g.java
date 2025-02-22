package n7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import k7.q;
import v6.b;

public final class g implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        WorkSource workSource = new WorkSource();
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i8 = 0;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 102;
        String str = null;
        q qVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 2:
                    i8 = b.j(parcel2, readInt);
                    break;
                case 3:
                    i11 = b.j(parcel2, readInt);
                    break;
                case 4:
                    j11 = b.k(parcel2, readInt);
                    break;
                case 5:
                    z10 = b.h(parcel2, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) b.b(parcel2, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i10 = b.j(parcel2, readInt);
                    break;
                case 8:
                    str = b.c(parcel2, readInt);
                    break;
                case 9:
                    qVar = (q) b.b(parcel2, readInt, q.CREATOR);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new a(j10, i8, i11, j11, z10, i10, str, workSource, qVar);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}

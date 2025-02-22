package n7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.location.LocationRequest;
import k7.q;
import v6.b;

public final class p implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        WorkSource workSource = new WorkSource();
        int i8 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        long j15 = -1;
        String str = null;
        q qVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i8 = b.j(parcel2, readInt);
                    break;
                case 2:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 3:
                    j11 = b.k(parcel2, readInt);
                    break;
                case 5:
                    j13 = b.k(parcel2, readInt);
                    break;
                case 6:
                    i10 = b.j(parcel2, readInt);
                    break;
                case 7:
                    b.q(parcel2, readInt, 4);
                    f10 = parcel.readFloat();
                    break;
                case 8:
                    j12 = b.k(parcel2, readInt);
                    break;
                case 9:
                    z10 = b.h(parcel2, readInt);
                    break;
                case 10:
                    j14 = b.k(parcel2, readInt);
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    j15 = b.k(parcel2, readInt);
                    break;
                case 12:
                    i11 = b.j(parcel2, readInt);
                    break;
                case 13:
                    i12 = b.j(parcel2, readInt);
                    break;
                case 14:
                    str = b.c(parcel2, readInt);
                    break;
                case 15:
                    z11 = b.h(parcel2, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) b.b(parcel2, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    qVar = (q) b.b(parcel2, readInt, q.CREATOR);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new LocationRequest(i8, j10, j11, j12, j13, j14, i10, f10, z10, j15, i11, i12, str, z11, workSource, qVar);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new LocationRequest[i8];
    }
}

package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import v6.b;

public final class d implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        w6 w6Var = null;
        String str3 = null;
        s sVar = null;
        s sVar2 = null;
        s sVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.c(parcel2, readInt);
                    break;
                case 3:
                    str2 = b.c(parcel2, readInt);
                    break;
                case 4:
                    w6Var = (w6) b.b(parcel2, readInt, w6.CREATOR);
                    break;
                case 5:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 6:
                    z10 = b.h(parcel2, readInt);
                    break;
                case 7:
                    str3 = b.c(parcel2, readInt);
                    break;
                case 8:
                    sVar = (s) b.b(parcel2, readInt, s.CREATOR);
                    break;
                case 9:
                    j11 = b.k(parcel2, readInt);
                    break;
                case 10:
                    sVar2 = (s) b.b(parcel2, readInt, s.CREATOR);
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    j12 = b.k(parcel2, readInt);
                    break;
                case 12:
                    sVar3 = (s) b.b(parcel2, readInt, s.CREATOR);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new c(str, str2, w6Var, j10, z10, str3, sVar, j11, sVar2, j12, sVar3);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new c[i8];
    }
}

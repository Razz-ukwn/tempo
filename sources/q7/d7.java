package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import v6.b;

public final class d7 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        boolean z10 = false;
        int i8 = 0;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = "";
        String str11 = str10;
        boolean z13 = true;
        boolean z14 = true;
        long j16 = -2147483648L;
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
                    str3 = b.c(parcel2, readInt);
                    break;
                case 5:
                    str4 = b.c(parcel2, readInt);
                    break;
                case 6:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 7:
                    j11 = b.k(parcel2, readInt);
                    break;
                case 8:
                    str5 = b.c(parcel2, readInt);
                    break;
                case 9:
                    z13 = b.h(parcel2, readInt);
                    break;
                case 10:
                    z10 = b.h(parcel2, readInt);
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    j16 = b.k(parcel2, readInt);
                    break;
                case 12:
                    str6 = b.c(parcel2, readInt);
                    break;
                case 13:
                    j12 = b.k(parcel2, readInt);
                    break;
                case 14:
                    j13 = b.k(parcel2, readInt);
                    break;
                case 15:
                    i8 = b.j(parcel2, readInt);
                    break;
                case 16:
                    z14 = b.h(parcel2, readInt);
                    break;
                case 18:
                    z11 = b.h(parcel2, readInt);
                    break;
                case 19:
                    str7 = b.c(parcel2, readInt);
                    break;
                case 21:
                    int m = b.m(parcel2, readInt);
                    if (m != 0) {
                        b.p(parcel2, m, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j14 = b.k(parcel2, readInt);
                    break;
                case 23:
                    arrayList = b.d(parcel2, readInt);
                    break;
                case 24:
                    str8 = b.c(parcel2, readInt);
                    break;
                case 25:
                    str10 = b.c(parcel2, readInt);
                    break;
                case 26:
                    str11 = b.c(parcel2, readInt);
                    break;
                case 27:
                    str9 = b.c(parcel2, readInt);
                    break;
                case 28:
                    z12 = b.h(parcel2, readInt);
                    break;
                case 29:
                    j15 = b.k(parcel2, readInt);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new c7(str, str2, str3, str4, j10, j11, str5, z13, z10, j16, str6, j12, j13, i8, z14, z11, str7, bool, j14, arrayList, str8, str10, str11, str9, z12, j15);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new c7[i8];
    }
}

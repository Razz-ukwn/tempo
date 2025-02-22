package q7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class t implements Parcelable.Creator {
    public static void a(s sVar, Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 2, sVar.f13311a);
        m.m(parcel, 3, sVar.f13312b, i8);
        m.n(parcel, 4, sVar.f13313c);
        m.k(parcel, 5, sVar.f13314d);
        m.E(parcel, s10);
    }

    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        long j10 = 0;
        String str = null;
        q qVar = null;
        String str2 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                str = b.c(parcel, readInt);
            } else if (c3 == 3) {
                qVar = (q) b.b(parcel, readInt, q.CREATOR);
            } else if (c3 == 4) {
                str2 = b.c(parcel, readInt);
            } else if (c3 != 5) {
                b.n(parcel, readInt);
            } else {
                j10 = b.k(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new s(str, qVar, str2, j10);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new s[i8];
    }
}

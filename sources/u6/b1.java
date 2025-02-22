package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t6.d;
import v6.b;

public final class b1 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        e eVar = null;
        int i8 = 0;
        d[] dVarArr = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                bundle = b.a(parcel, readInt);
            } else if (c3 == 2) {
                dVarArr = (d[]) b.e(parcel, readInt, d.CREATOR);
            } else if (c3 == 3) {
                i8 = b.j(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                eVar = (e) b.b(parcel, readInt, e.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new a1(bundle, dVarArr, i8, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new a1[i8];
    }
}

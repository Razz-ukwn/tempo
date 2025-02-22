package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.t0;
import v6.b;

public final class e0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        t0 t0Var = null;
        long j10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                str = b.c(parcel, readInt);
            } else if (c3 == 2) {
                str2 = b.c(parcel, readInt);
            } else if (c3 == 3) {
                j10 = b.k(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                t0Var = (t0) b.b(parcel, readInt, t0.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new d0(str, str2, j10, t0Var);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new d0[i8];
    }
}

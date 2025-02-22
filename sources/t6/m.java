package t6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class m implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        PendingIntent pendingIntent = null;
        int i8 = 0;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                i10 = b.j(parcel, readInt);
            } else if (c3 == 3) {
                pendingIntent = (PendingIntent) b.b(parcel, readInt, PendingIntent.CREATOR);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                str = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new b(i8, i10, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}

package s6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class d implements Parcelable.Creator<a> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(parcel, readInt);
            } else {
                intent = (Intent) b.b(parcel, readInt, Intent.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new a(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}

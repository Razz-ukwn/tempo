package i9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new c((PendingIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() != 0);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}

package s6;

import android.os.Parcel;
import android.os.Parcelable;

public final class f implements Parcelable.Creator<h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new h(parcel.readStrongBinder());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}

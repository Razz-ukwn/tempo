package i9;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new d();

    public abstract PendingIntent a();

    public abstract boolean c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(c() ? 1 : 0);
    }
}

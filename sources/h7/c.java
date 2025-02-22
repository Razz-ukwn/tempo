package h7;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9273a = 0;

    static {
        c.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(q.a("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}

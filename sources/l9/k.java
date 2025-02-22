package l9;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;

public abstract class k extends d implements l {
    public k() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    public final boolean a(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = e.f11015a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            b(bundle);
            return true;
        }
        throw new BadParcelableException(q.a("Parcel data not fully consumed, unread size: ", dataAvail));
    }
}

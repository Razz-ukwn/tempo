package n7;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import v6.b;

public final class q implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        List list = LocationResult.f5659b;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(parcel, readInt);
            } else {
                list = b.f(parcel, readInt, Location.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new LocationResult[i8];
    }
}

package k7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class t implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i8 = b.j(parcel, readInt);
                    break;
                case 2:
                    iBinder = b.i(parcel, readInt);
                    break;
                case 3:
                    iBinder2 = b.i(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.b(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = b.c(parcel, readInt);
                    break;
                case 6:
                    str2 = b.c(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new s(i8, iBinder, iBinder2, pendingIntent, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new s[i8];
    }
}

package k7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class x implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 1;
        u uVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i8 = b.j(parcel, readInt);
                    break;
                case 2:
                    uVar = (u) b.b(parcel, readInt, u.CREATOR);
                    break;
                case 3:
                    iBinder = b.i(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.b(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.i(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = b.i(parcel, readInt);
                    break;
                case 8:
                    str = b.c(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new w(i8, uVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new w[i8];
    }
}

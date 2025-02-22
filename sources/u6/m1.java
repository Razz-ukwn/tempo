package u6;

import android.os.IBinder;
import android.os.Parcel;
import c7.a;
import h7.a;

public final class m1 extends a implements m0 {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData", 1);
    }

    public final int zzc() {
        Parcel a10 = a(b(), 2);
        int readInt = a10.readInt();
        a10.recycle();
        return readInt;
    }

    public final c7.a zzd() {
        Parcel a10 = a(b(), 1);
        c7.a O = a.C0059a.O(a10.readStrongBinder());
        a10.recycle();
        return O;
    }
}

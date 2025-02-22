package u6;

import android.os.IBinder;
import android.os.Parcel;
import h7.a;

public final class l1 extends a implements k {
    public l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken", 1);
    }

    public final void cancel() {
        Parcel b10 = b();
        try {
            this.f9270b.transact(2, b10, (Parcel) null, 1);
        } finally {
            b10.recycle();
        }
    }
}

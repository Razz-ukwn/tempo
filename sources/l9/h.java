package l9;

import android.os.IBinder;
import android.os.IInterface;

public final class h implements j, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f11017a;

    public h(IBinder iBinder) {
        this.f11017a = iBinder;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [l9.l, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(android.os.Bundle r4, l9.l r5) {
        /*
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = "com.google.android.play.core.integrity.protocol.IIntegrityService"
            r0.writeInterfaceToken(r1)
            int r1 = l9.e.f11015a
            r1 = 1
            r0.writeInt(r1)
            r2 = 0
            r4.writeToParcel(r0, r2)
            r0.writeStrongBinder(r5)
            android.os.IBinder r4 = r3.f11017a     // Catch:{ all -> 0x0021 }
            r5 = 2
            r2 = 0
            r4.transact(r5, r0, r2, r1)     // Catch:{ all -> 0x0021 }
            r0.recycle()
            return
        L_0x0021:
            r4 = move-exception
            r0.recycle()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.h.A(android.os.Bundle, l9.l):void");
    }

    public final IBinder asBinder() {
        return this.f11017a;
    }
}

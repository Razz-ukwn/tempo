package u6;

import android.os.IBinder;
import android.os.Parcel;

public final class o0 implements l {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f15850a;

    public o0(IBinder iBinder) {
        this.f15850a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f15850a;
    }

    public final void p(w0 w0Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(w0Var);
            obtain.writeInt(1);
            d1.a(fVar, obtain, 0);
            this.f15850a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

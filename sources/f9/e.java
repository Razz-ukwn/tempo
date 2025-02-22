package f9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e9.g;

public final class e implements g, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f8614a;

    public e(IBinder iBinder) {
        this.f8614a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f8614a;
    }

    public final void f(String str, Bundle bundle, g gVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i8 = d.f8613a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(gVar);
        try {
            this.f8614a.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}

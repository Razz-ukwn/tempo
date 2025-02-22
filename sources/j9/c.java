package j9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i9.h;

public final class c implements e, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f9869a;

    public c(IBinder iBinder) {
        this.f9869a = iBinder;
    }

    public final void K(String str, Bundle bundle, h hVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i8 = b.f9868a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(hVar);
        try {
            this.f9869a.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f9869a;
    }
}

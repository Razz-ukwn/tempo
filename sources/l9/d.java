package l9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class d extends Binder implements IInterface {
    public d(String str) {
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    public boolean a(int i8, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i10)) {
            return true;
        }
        return a(i8, parcel, parcel2, i10);
    }
}

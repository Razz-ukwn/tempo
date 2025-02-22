package g7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8896a;

    public b(int i8, String str) {
        this.f8896a = i8;
        if (i8 != 1) {
            attachInterface(this, str);
        } else {
            attachInterface(this, str);
        }
    }

    public boolean a(int i8, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public boolean b(int i8, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f8896a) {
            case 0:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i10)) {
                    return true;
                }
                return a(i8, parcel, parcel2);
            default:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i10)) {
                    return true;
                }
                return b(i8, parcel, parcel2, i10);
        }
    }
}

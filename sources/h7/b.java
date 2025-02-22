package h7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9272a;

    public b(int i8, String str) {
        this.f9272a = i8;
        if (i8 == 1) {
            attachInterface(this, str);
        } else if (i8 != 2) {
            attachInterface(this, str);
        } else {
            attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        }
    }

    private void N(int i8, Parcel parcel, Parcel parcel2, int i10) {
        throw null;
    }

    public boolean L(int i8, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public boolean M(int i8, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f9272a) {
            case 1:
                return false;
            default:
                N(i8, parcel, parcel2, i10);
                throw null;
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f9272a) {
            case 0:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i10)) {
                    return true;
                }
                return L(i8, parcel, parcel2);
            case 1:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i10)) {
                    return true;
                }
                return M(i8, parcel, parcel2, i10);
            default:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i10)) {
                    return true;
                }
                return M(i8, parcel, parcel2, i10);
        }
    }
}

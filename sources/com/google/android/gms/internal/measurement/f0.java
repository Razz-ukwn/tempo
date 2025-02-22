package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class f0 extends Binder implements IInterface {
    public f0(String str) {
        attachInterface(this, str);
    }

    public boolean a(int i8, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i10)) {
            return true;
        }
        return a(i8, parcel, parcel2);
    }
}

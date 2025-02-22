package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class w0 extends f0 implements x0 {
    public w0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean a(int i8, Parcel parcel, Parcel parcel2) {
        if (i8 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            g0.b(parcel);
            ((t1) this).k(readLong, (Bundle) g0.a(parcel, Bundle.CREATOR), readString, readString2);
            parcel2.writeNoException();
        } else if (i8 != 2) {
            return false;
        } else {
            int zzd = ((t1) this).zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        }
        return true;
    }
}

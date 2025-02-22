package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class l implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        int i8 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 != 2) {
                b.n(parcel, readInt);
            } else {
                str = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new Scope(i8, str);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new Scope[i8];
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class b1 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 2:
                    j11 = b.k(parcel2, readInt);
                    break;
                case 3:
                    z10 = b.h(parcel2, readInt);
                    break;
                case 4:
                    str = b.c(parcel2, readInt);
                    break;
                case 5:
                    str2 = b.c(parcel2, readInt);
                    break;
                case 6:
                    str3 = b.c(parcel2, readInt);
                    break;
                case 7:
                    bundle = b.a(parcel2, readInt);
                    break;
                case 8:
                    str4 = b.c(parcel2, readInt);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new a1(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new a1[i8];
    }
}

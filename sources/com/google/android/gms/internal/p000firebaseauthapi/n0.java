package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n0  reason: invalid package */
public final class n0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                str = b.c(parcel, readInt);
            } else if (c3 == 3) {
                str2 = b.c(parcel, readInt);
            } else if (c3 == 4) {
                l10 = b.l(parcel, readInt);
            } else if (c3 == 5) {
                str3 = b.c(parcel, readInt);
            } else if (c3 != 6) {
                b.n(parcel, readInt);
            } else {
                l11 = b.l(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new m0(str, str2, l10, str3, l11);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new m0[i8];
    }
}

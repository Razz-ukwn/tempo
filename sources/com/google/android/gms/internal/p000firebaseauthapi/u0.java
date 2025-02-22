package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u0  reason: invalid package */
public final class u0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        while (parcel.dataPosition() < o10) {
            b.n(parcel, parcel.readInt());
        }
        b.g(parcel, o10);
        return new t0();
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new t0[i8];
    }
}

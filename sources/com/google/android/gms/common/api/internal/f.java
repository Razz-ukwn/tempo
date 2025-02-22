package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import h7.b;
import h7.c;
import k7.h;

public abstract class f extends b {
    public f() {
        super(0, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public final boolean L(int i8, Parcel parcel, Parcel parcel2) {
        if (i8 != 1) {
            return false;
        }
        c.b(parcel);
        h hVar = (h) this;
        e9.c.k((Status) c.a(parcel, Status.CREATOR), hVar.f10367b, hVar.f10368c);
        return true;
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class v0 extends e0 implements x0 {
    public v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void k(long j10, Bundle bundle, String str, String str2) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        g0.c(a10, bundle);
        a10.writeLong(j10);
        c(a10, 1);
    }

    public final int zzd() {
        Parcel b10 = b(a(), 2);
        int readInt = b10.readInt();
        b10.recycle();
        return readInt;
    }
}

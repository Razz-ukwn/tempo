package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class e0 implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f5251a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5252b;

    public e0(IBinder iBinder, String str) {
        this.f5251a = iBinder;
        this.f5252b = str;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5252b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f5251a;
    }

    public final Parcel b(Parcel parcel, int i8) {
        parcel = Parcel.obtain();
        try {
            this.f5251a.transact(i8, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void c(Parcel parcel, int i8) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5251a.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

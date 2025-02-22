package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9269a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f9270b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9271c;

    public /* synthetic */ a(IBinder iBinder, String str, int i8) {
        this.f9269a = i8;
        this.f9270b = iBinder;
        this.f9271c = str;
    }

    public final Parcel a(Parcel parcel, int i8) {
        parcel = Parcel.obtain();
        try {
            this.f9270b.transact(i8, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f9270b;
    }

    public final Parcel b() {
        int i8 = this.f9269a;
        String str = this.f9271c;
        switch (i8) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
        }
    }

    public final void c(Parcel parcel, int i8) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9270b.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

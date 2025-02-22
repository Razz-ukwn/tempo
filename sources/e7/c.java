package e7;

import android.os.IBinder;
import android.os.Parcel;

public final class c extends a implements e {
    public c(IBinder iBinder) {
        super(iBinder);
    }

    public final String zzc() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        obtain = Parcel.obtain();
        try {
            this.f7867a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return obtain.readString();
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }

    public final boolean zze() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i8 = b.f7868a;
        boolean z10 = true;
        obtain.writeInt(1);
        obtain = Parcel.obtain();
        try {
            this.f7867a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            if (obtain.readInt() == 0) {
                z10 = false;
            }
            return z10;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }
}

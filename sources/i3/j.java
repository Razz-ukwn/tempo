package i3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import i3.i;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f9463a = 0;

        /* renamed from: i3.j$a$a  reason: collision with other inner class name */
        public static class C0175a implements j {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f9464a;

            public C0175a(IBinder iBinder) {
                this.f9464a = iBinder;
            }

            public final void I(int i8, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i8);
                    obtain.writeStringArray(strArr);
                    this.f9464a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f9464a;
            }

            public final int i(i iVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(iVar);
                    obtain.writeString(str);
                    this.f9464a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i8 != 1598968902) {
                i iVar = null;
                if (i8 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        iVar = (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new i.a.C0174a(readStrongBinder) : (i) queryLocalInterface;
                    }
                    int i11 = ((MultiInstanceInvalidationService.a) this).i(iVar, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i11);
                } else if (i8 == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        iVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof i)) ? new i.a.C0174a(readStrongBinder2) : (i) queryLocalInterface2;
                    }
                    int readInt = parcel.readInt();
                    sf.j.f(iVar, "callback");
                    MultiInstanceInvalidationService multiInstanceInvalidationService = ((MultiInstanceInvalidationService.a) this).f2765b;
                    synchronized (multiInstanceInvalidationService.f2763c) {
                        multiInstanceInvalidationService.f2763c.unregister(iVar);
                        String str = (String) multiInstanceInvalidationService.f2762b.remove(Integer.valueOf(readInt));
                    }
                    parcel2.writeNoException();
                } else if (i8 != 3) {
                    return super.onTransact(i8, parcel, parcel2, i10);
                } else {
                    ((MultiInstanceInvalidationService.a) this).I(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    void I(int i8, String[] strArr);

    int i(i iVar, String str);
}

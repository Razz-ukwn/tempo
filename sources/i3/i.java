package i3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.m;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* renamed from: i3.i$a$a  reason: collision with other inner class name */
        public static class C0174a implements i {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f9462a;

            public C0174a(IBinder iBinder) {
                this.f9462a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f9462a;
            }

            public final void h(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f9462a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i8 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i10);
            } else {
                ((m.b) this).h(parcel.createStringArray());
                return true;
            }
        }
    }

    void h(String[] strArr);
}

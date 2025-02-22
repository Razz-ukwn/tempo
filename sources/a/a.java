package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: d  reason: collision with root package name */
    public static final String f1d = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: a.a$a  reason: collision with other inner class name */
    public static abstract class C0000a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f2a = 0;

        /* renamed from: a.a$a$a  reason: collision with other inner class name */
        public static class C0001a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f3a;

            public C0001a(IBinder iBinder) {
                this.f3a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f3a;
            }
        }

        public C0000a() {
            attachInterface(this, a.f1d);
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i10) {
            String str = a.f1d;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i10);
            } else {
                int readInt = parcel.readInt();
                Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
                b bVar = b.this;
                bVar.getClass();
                bVar.a(readInt, (Bundle) createFromParcel);
                return true;
            }
        }
    }
}

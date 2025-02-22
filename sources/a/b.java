package a;

import a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public a f4a;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* renamed from: a.b$b  reason: collision with other inner class name */
    public class C0002b extends a.C0000a {
        public C0002b() {
        }
    }

    public b(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i8 = a.C0000a.f2a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(a.f1d);
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new a.C0000a.C0001a(readStrongBinder) : (a) queryLocalInterface;
        }
        this.f4a = aVar;
    }

    public void a(int i8, Bundle bundle) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        synchronized (this) {
            if (this.f4a == null) {
                this.f4a = new C0002b();
            }
            parcel.writeStrongBinder(this.f4a.asBinder());
        }
    }
}

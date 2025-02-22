package s5;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

public class f extends c implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f14739c = 0.0f;

    public static class a implements Parcelable.Creator<f> {
        public final Object createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        public final Object[] newArray(int i8) {
            return new f[i8];
        }
    }

    public f() {
    }

    public float c() {
        return this.f14739c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f14739c + " y: " + a();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f14739c);
        parcel.writeFloat(a());
        Object obj = this.f14720b;
        if (obj == null) {
            parcel.writeInt(0);
        } else if (obj instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.f14720b, i8);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    public f(float f10, float f11) {
        super(f11);
        this.f14739c = f10;
    }

    public f(Parcel parcel) {
        this.f14739c = parcel.readFloat();
        this.f14719a = parcel.readFloat();
        if (parcel.readInt() == 1) {
            this.f14720b = parcel.readParcelable(Object.class.getClassLoader());
        }
    }
}

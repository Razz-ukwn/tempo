package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;
import t3.c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final c f2775a;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final Object[] newArray(int i8) {
            return new ParcelImpl[i8];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f2775a = new b(parcel).m();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        new b(parcel).v(this.f2775a);
    }
}

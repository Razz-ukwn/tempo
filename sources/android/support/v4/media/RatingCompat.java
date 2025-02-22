package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f528a;

    /* renamed from: b  reason: collision with root package name */
    public final float f529b;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final Object[] newArray(int i8) {
            return new RatingCompat[i8];
        }
    }

    public RatingCompat(int i8, float f10) {
        this.f528a = i8;
        this.f529b = f10;
    }

    public final int describeContents() {
        return this.f528a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f528a);
        sb2.append(" rating=");
        float f10 = this.f529b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f528a);
        parcel.writeFloat(this.f529b);
    }
}

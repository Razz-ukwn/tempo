package me;

import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

public final class c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f11468a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f11469b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11470c;

    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "in");
            return new c(parcel.readString(), parcel.createStringArray(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String str, String[] strArr, int i8) {
        j.f(str, "title");
        j.f(strArr, "extensions");
        this.f11468a = str;
        this.f11469b = strArr;
        this.f11470c = i8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "parcel");
        parcel.writeString(this.f11468a);
        parcel.writeStringArray(this.f11469b);
        parcel.writeInt(this.f11470c);
    }
}

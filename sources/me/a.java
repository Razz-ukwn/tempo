package me;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

public class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0219a();

    /* renamed from: a  reason: collision with root package name */
    public final long f11463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11464b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f11465c;

    /* renamed from: me.a$a  reason: collision with other inner class name */
    public static class C0219a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "in");
            return new a(parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(long j10, String str, Uri uri) {
        j.f(str, "name");
        j.f(uri, "path");
        this.f11463a = j10;
        this.f11464b = str;
        this.f11465c = uri;
    }

    public Uri a() {
        return this.f11465c;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "parcel");
        parcel.writeLong(this.f11463a);
        parcel.writeString(this.f11464b);
        parcel.writeParcelable(this.f11465c, i8);
    }
}

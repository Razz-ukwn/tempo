package me;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

public final class d extends a {
    public static final Parcelable.Creator CREATOR = new a();
    public final Uri B;
    public final int C;

    /* renamed from: d  reason: collision with root package name */
    public final long f11471d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11472e;

    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "in");
            return new d(parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(long j10, String str, Uri uri, int i8) {
        super(j10, str, uri);
        j.f(str, "name");
        j.f(uri, "path");
        this.f11471d = j10;
        this.f11472e = str;
        this.B = uri;
        this.C = i8;
    }

    public final Uri a() {
        return this.B;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "parcel");
        parcel.writeLong(this.f11471d);
        parcel.writeString(this.f11472e);
        parcel.writeParcelable(this.B, i8);
        parcel.writeInt(this.C);
    }
}

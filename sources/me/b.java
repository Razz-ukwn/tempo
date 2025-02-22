package me;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

public final class b extends a {
    public static final Parcelable.Creator CREATOR = new a();
    public final Uri B;
    public String C;
    public String D;
    public c E;

    /* renamed from: d  reason: collision with root package name */
    public final long f11466d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11467e;

    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "in");
            return new b(parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (c) c.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(long j10, String str, Uri uri, String str2, String str3, c cVar) {
        super(j10, str, uri);
        j.f(str, "name");
        j.f(uri, "path");
        this.f11466d = j10;
        this.f11467e = str;
        this.B = uri;
        this.C = str2;
        this.D = str3;
        this.E = cVar;
    }

    public final Uri a() {
        return this.B;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "parcel");
        parcel.writeLong(this.f11466d);
        parcel.writeString(this.f11467e);
        parcel.writeParcelable(this.B, i8);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        c cVar = this.E;
        if (cVar != null) {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}

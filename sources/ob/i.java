package ob;

import android.os.Parcel;
import android.os.Parcelable;
import b3.x;
import h0.e;
import rb.b;
import sf.j;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final long B;
    public final int C;

    /* renamed from: a  reason: collision with root package name */
    public final long f12284a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12285b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12286c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12287d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12288e;

    public static final class a implements Parcelable.Creator<i> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new i(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new i[i8];
        }
    }

    public i(long j10, String str, String str2, String str3, long j11, long j12, int i8) {
        j.f(str, "mediaName");
        j.f(str2, "mediaPath");
        j.f(str3, "mediaBucket");
        this.f12284a = j10;
        this.f12285b = str;
        this.f12286c = str2;
        this.f12287d = str3;
        this.f12288e = j11;
        this.B = j12;
        this.C = i8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f12284a == iVar.f12284a && j.a(this.f12285b, iVar.f12285b) && j.a(this.f12286c, iVar.f12286c) && j.a(this.f12287d, iVar.f12287d) && this.f12288e == iVar.f12288e && this.B == iVar.B && this.C == iVar.C;
    }

    public final int hashCode() {
        return Integer.hashCode(this.C) + e.a(this.B, e.a(this.f12288e, x.a(this.f12287d, x.a(this.f12286c, x.a(this.f12285b, Long.hashCode(this.f12284a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaFileEntity(mediaId=");
        sb2.append(this.f12284a);
        sb2.append(", mediaName=");
        sb2.append(this.f12285b);
        sb2.append(", mediaPath=");
        sb2.append(this.f12286c);
        sb2.append(", mediaBucket=");
        sb2.append(this.f12287d);
        sb2.append(", mediaSize=");
        sb2.append(this.f12288e);
        sb2.append(", mediaDateAdded=");
        sb2.append(this.B);
        sb2.append(", mediaType=");
        return b.a(sb2, this.C, ')');
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeLong(this.f12284a);
        parcel.writeString(this.f12285b);
        parcel.writeString(this.f12286c);
        parcel.writeString(this.f12287d);
        parcel.writeLong(this.f12288e);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C);
    }
}

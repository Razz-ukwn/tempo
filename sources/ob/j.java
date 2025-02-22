package ob;

import android.os.Parcel;
import android.os.Parcelable;
import b3.x;
import bb.b;
import h0.e;
import s0.b0;

public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();
    @b("mediaAlbumCoverPath")
    public final String B;
    @b("mediaId")

    /* renamed from: a  reason: collision with root package name */
    public final long f12289a;
    @b("mediaName")

    /* renamed from: b  reason: collision with root package name */
    public final String f12290b;
    @b("mediaPath")

    /* renamed from: c  reason: collision with root package name */
    public final String f12291c;
    @b("mediaSize")

    /* renamed from: d  reason: collision with root package name */
    public final long f12292d;
    @b("mediaDuration")

    /* renamed from: e  reason: collision with root package name */
    public final long f12293e;

    public static final class a implements Parcelable.Creator<j> {
        public final Object createFromParcel(Parcel parcel) {
            sf.j.f(parcel, "parcel");
            return new j(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        public final Object[] newArray(int i8) {
            return new j[i8];
        }
    }

    public j(long j10, String str, String str2, long j11, long j12, String str3) {
        sf.j.f(str, "mediaName");
        sf.j.f(str2, "mediaPath");
        sf.j.f(str3, "mediaAlbumCoverPath");
        this.f12289a = j10;
        this.f12290b = str;
        this.f12291c = str2;
        this.f12292d = j11;
        this.f12293e = j12;
        this.B = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12289a == jVar.f12289a && sf.j.a(this.f12290b, jVar.f12290b) && sf.j.a(this.f12291c, jVar.f12291c) && this.f12292d == jVar.f12292d && this.f12293e == jVar.f12293e && sf.j.a(this.B, jVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + e.a(this.f12293e, e.a(this.f12292d, x.a(this.f12291c, x.a(this.f12290b, Long.hashCode(this.f12289a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedMediaModel(mediaId=");
        sb2.append(this.f12289a);
        sb2.append(", mediaName=");
        sb2.append(this.f12290b);
        sb2.append(", mediaPath=");
        sb2.append(this.f12291c);
        sb2.append(", mediaSize=");
        sb2.append(this.f12292d);
        sb2.append(", mediaDuration=");
        sb2.append(this.f12293e);
        sb2.append(", mediaAlbumCoverPath=");
        return b0.a(sb2, this.B, ')');
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        sf.j.f(parcel, "out");
        parcel.writeLong(this.f12289a);
        parcel.writeString(this.f12290b);
        parcel.writeString(this.f12291c);
        parcel.writeLong(this.f12292d);
        parcel.writeLong(this.f12293e);
        parcel.writeString(this.B);
    }
}

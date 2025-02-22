package ob;

import android.os.Parcel;
import android.os.Parcelable;
import s0.b0;
import sf.j;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0235a();

    /* renamed from: a  reason: collision with root package name */
    public final long f12260a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12261b;

    /* renamed from: ob.a$a  reason: collision with other inner class name */
    public static final class C0235a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new a(parcel.readString(), parcel.readLong());
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String str, long j10) {
        j.f(str, "mediaAlbumCoverPath");
        this.f12260a = j10;
        this.f12261b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12260a == aVar.f12260a && j.a(this.f12261b, aVar.f12261b);
    }

    public final int hashCode() {
        return this.f12261b.hashCode() + (Long.hashCode(this.f12260a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AlbumCoverPathEntity(mediaId=");
        sb2.append(this.f12260a);
        sb2.append(", mediaAlbumCoverPath=");
        return b0.a(sb2, this.f12261b, ')');
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeLong(this.f12260a);
        parcel.writeString(this.f12261b);
    }
}

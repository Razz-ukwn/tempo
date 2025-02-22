package ob;

import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f12262a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12263b;

    public static final class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new b(parcel.readLong(), parcel.readLong());
        }

        public final Object[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(long j10, long j11) {
        this.f12262a = j10;
        this.f12263b = j11;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12262a == bVar.f12262a && this.f12263b == bVar.f12263b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12263b) + (Long.hashCode(this.f12262a) * 31);
    }

    public final String toString() {
        return "DurationEntity(mediaId=" + this.f12262a + ", mediaDuration=" + this.f12263b + ')';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeLong(this.f12262a);
        parcel.writeLong(this.f12263b);
    }
}

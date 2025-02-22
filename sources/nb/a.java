package nb;

import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0224a();

    /* renamed from: a  reason: collision with root package name */
    public final String f11615a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11616b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11617c;

    /* renamed from: nb.a$a  reason: collision with other inner class name */
    public static final class C0224a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new a(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(long j10, String str, String str2) {
        this.f11615a = str;
        this.f11616b = str2;
        this.f11617c = j10;
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
        return j.a(this.f11615a, aVar.f11615a) && j.a(this.f11616b, aVar.f11616b) && this.f11617c == aVar.f11617c;
    }

    public final int hashCode() {
        int i8 = 0;
        String str = this.f11615a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11616b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return Long.hashCode(this.f11617c) + ((hashCode + i8) * 31);
    }

    public final String toString() {
        return "MiItemMedia(bucketName=" + this.f11615a + ", latestItemPathForBucket=" + this.f11616b + ", totalItemSizeForBucket=" + this.f11617c + ')';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.f11615a);
        parcel.writeString(this.f11616b);
        parcel.writeLong(this.f11617c);
    }

    public a() {
        this(0, (String) null, (String) null);
    }
}

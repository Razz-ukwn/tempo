package q7;

import android.os.Parcel;
import android.os.Parcelable;
import u6.q;
import v6.a;

public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f13311a;

    /* renamed from: b  reason: collision with root package name */
    public final q f13312b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13313c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13314d;

    public s(s sVar, long j10) {
        q.i(sVar);
        this.f13311a = sVar.f13311a;
        this.f13312b = sVar.f13312b;
        this.f13313c = sVar.f13313c;
        this.f13314d = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13312b);
        return "origin=" + this.f13313c + ",name=" + this.f13311a + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        t.a(this, parcel, i8);
    }

    public s(String str, q qVar, String str2, long j10) {
        this.f13311a = str;
        this.f13312b = qVar;
        this.f13313c = str2;
        this.f13314d = j10;
    }
}

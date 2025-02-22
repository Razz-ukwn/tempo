package t6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.o;
import v6.a;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    public final String f15389a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final int f15390b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15391c;

    public d(String str, long j10) {
        this.f15389a = str;
        this.f15391c = j10;
        this.f15390b = -1;
    }

    public d(String str, long j10, int i8) {
        this.f15389a = str;
        this.f15390b = i8;
        this.f15391c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f15389a;
            return ((str != null && str.equals(dVar.f15389a)) || (str == null && dVar.f15389a == null)) && w() == dVar.w();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15389a, Long.valueOf(w())});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f15389a, "name");
        aVar.a(Long.valueOf(w()), "version");
        return aVar.toString();
    }

    public final long w() {
        long j10 = this.f15391c;
        return j10 == -1 ? (long) this.f15390b : j10;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f15389a);
        m.j(parcel, 2, this.f15390b);
        m.k(parcel, 3, w());
        m.E(parcel, s10);
    }
}

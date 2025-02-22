package u6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    public final int f15766a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15767b;

    public c(int i8, String str) {
        this.f15766a = i8;
        this.f15767b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f15766a == this.f15766a && o.a(cVar.f15767b, this.f15767b);
    }

    public final int hashCode() {
        return this.f15766a;
    }

    public final String toString() {
        return this.f15766a + ":" + this.f15767b;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15766a);
        m.n(parcel, 2, this.f15767b);
        m.E(parcel, s10);
    }
}

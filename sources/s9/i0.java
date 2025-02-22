package s9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.q;
import v6.c;

public final class i0 implements c {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14836a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14837b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14838c;

    public i0(String str, String str2, boolean z10) {
        q.f(str);
        q.f(str2);
        this.f14836a = str;
        this.f14837b = str2;
        o.c(str2);
        this.f14838c = z10;
    }

    public i0(boolean z10) {
        this.f14838c = z10;
        this.f14837b = null;
        this.f14836a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14836a);
        m.n(parcel, 2, this.f14837b);
        m.g(parcel, 3, this.f14838c);
        m.E(parcel, s10);
    }
}

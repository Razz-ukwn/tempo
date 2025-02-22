package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.q;

public final class t extends b {
    public static final Parcelable.Creator<t> CREATOR = new c0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14152a;

    public t(String str) {
        q.f(str);
        this.f14152a = str;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14152a);
        m.E(parcel, s10);
    }
}

package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.q;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new j0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14118a;

    public d(String str) {
        q.f(str);
        this.f14118a = str;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14118a);
        m.E(parcel, s10);
    }
}

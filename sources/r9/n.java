package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.q;

public final class n extends b {
    public static final Parcelable.Creator<n> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    public final String f14140a;

    public n(String str) {
        q.f(str);
        this.f14140a = str;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14140a);
        m.E(parcel, s10);
    }
}

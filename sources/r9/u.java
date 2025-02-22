package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.q;

public final class u extends b {
    public static final Parcelable.Creator<u> CREATOR = new f0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14154b;

    public u(String str, String str2) {
        q.f(str);
        this.f14153a = str;
        q.f(str2);
        this.f14154b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14153a);
        m.n(parcel, 2, this.f14154b);
        m.E(parcel, s10);
    }
}

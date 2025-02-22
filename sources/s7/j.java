package s7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.h0;
import v6.a;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public final int f14804a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f14805b;

    public j(int i8, h0 h0Var) {
        this.f14804a = i8;
        this.f14805b = h0Var;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f14804a);
        m.m(parcel, 2, this.f14805b, i8);
        m.E(parcel, s10);
    }
}

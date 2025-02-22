package s7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import t6.b;
import u6.j0;
import v6.a;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    public final int f14806a;

    /* renamed from: b  reason: collision with root package name */
    public final b f14807b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f14808c;

    public l(int i8, b bVar, j0 j0Var) {
        this.f14806a = i8;
        this.f14807b = bVar;
        this.f14808c = j0Var;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f14806a);
        m.m(parcel, 2, this.f14807b, i8);
        m.m(parcel, 3, this.f14808c, i8);
        m.E(parcel, s10);
    }
}

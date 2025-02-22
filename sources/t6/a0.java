package t6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import cb.b;
import v6.a;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15373a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15374b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15375c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15376d;

    public a0(int i8, int i10, String str, boolean z10) {
        this.f15373a = z10;
        this.f15374b = str;
        this.f15375c = b.O(i8) - 1;
        this.f15376d = b.N(i10) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.g(parcel, 1, this.f15373a);
        m.n(parcel, 2, this.f15374b);
        m.j(parcel, 3, this.f15375c);
        m.j(parcel, 4, this.f15376d);
        m.E(parcel, s10);
    }
}

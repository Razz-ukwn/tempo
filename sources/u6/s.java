package u6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.a;

public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new t0();

    /* renamed from: a  reason: collision with root package name */
    public final int f15855a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15856b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15857c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15858d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15859e;

    public s(int i8, int i10, int i11, boolean z10, boolean z11) {
        this.f15855a = i8;
        this.f15856b = z10;
        this.f15857c = z11;
        this.f15858d = i10;
        this.f15859e = i11;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15855a);
        m.g(parcel, 2, this.f15856b);
        m.g(parcel, 3, this.f15857c);
        m.j(parcel, 4, this.f15858d);
        m.j(parcel, 5, this.f15859e);
        m.E(parcel, s10);
    }
}

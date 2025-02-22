package t6;

import ag.m;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import c7.b;
import v6.a;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();
    public final boolean B;

    /* renamed from: a  reason: collision with root package name */
    public final String f15424a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15425b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15426c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f15427d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15428e;

    public y(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f15424a = str;
        this.f15425b = z10;
        this.f15426c = z11;
        this.f15427d = (Context) b.P(a.C0059a.O(iBinder));
        this.f15428e = z12;
        this.B = z13;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f15424a);
        m.g(parcel, 2, this.f15425b);
        m.g(parcel, 3, this.f15426c);
        m.i(parcel, 4, new b(this.f15427d));
        m.g(parcel, 5, this.f15428e);
        m.g(parcel, 6, this.B);
        m.E(parcel, s10);
    }
}

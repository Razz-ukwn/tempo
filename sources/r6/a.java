package r6;

import ag.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends v6.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f14067a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14068b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f14069c;

    public a(int i8, int i10, Bundle bundle) {
        this.f14067a = i8;
        this.f14068b = i10;
        this.f14069c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f14067a);
        m.j(parcel, 2, this.f14068b);
        m.h(parcel, 3, this.f14069c);
        m.E(parcel, s10);
    }
}

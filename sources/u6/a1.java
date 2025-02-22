package u6;

import ag.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t6.d;
import v6.a;

public final class a1 extends a {
    public static final Parcelable.Creator<a1> CREATOR = new b1();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f15738a;

    /* renamed from: b  reason: collision with root package name */
    public final d[] f15739b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15740c;

    /* renamed from: d  reason: collision with root package name */
    public final e f15741d;

    public a1() {
    }

    public a1(Bundle bundle, d[] dVarArr, int i8, e eVar) {
        this.f15738a = bundle;
        this.f15739b = dVarArr;
        this.f15740c = i8;
        this.f15741d = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.h(parcel, 1, this.f15738a);
        m.p(parcel, 2, this.f15739b, i8);
        m.j(parcel, 3, this.f15740c);
        m.m(parcel, 4, this.f15741d, i8);
        m.E(parcel, s10);
    }
}

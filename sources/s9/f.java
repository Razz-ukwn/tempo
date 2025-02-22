package s9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import r9.b;
import r9.g0;
import u6.q;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new g();
    public final List B;

    /* renamed from: a  reason: collision with root package name */
    public final List f14824a;

    /* renamed from: b  reason: collision with root package name */
    public final h f14825b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14826c;

    /* renamed from: d  reason: collision with root package name */
    public final g0 f14827d;

    /* renamed from: e  reason: collision with root package name */
    public final p0 f14828e;

    public f(ArrayList arrayList, h hVar, String str, g0 g0Var, p0 p0Var, ArrayList arrayList2) {
        q.i(arrayList);
        this.f14824a = arrayList;
        q.i(hVar);
        this.f14825b = hVar;
        q.f(str);
        this.f14826c = str;
        this.f14827d = g0Var;
        this.f14828e = p0Var;
        q.i(arrayList2);
        this.B = arrayList2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.q(parcel, 1, this.f14824a);
        m.m(parcel, 2, this.f14825b, i8);
        m.n(parcel, 3, this.f14826c);
        m.m(parcel, 4, this.f14827d, i8);
        m.m(parcel, 5, this.f14828e, i8);
        m.q(parcel, 6, this.B);
        m.E(parcel, s10);
    }
}

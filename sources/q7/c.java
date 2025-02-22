package q7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import u6.q;
import v6.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();
    public String B;
    public final s C;
    public long D;
    public s E;
    public final long F;
    public final s G;

    /* renamed from: a  reason: collision with root package name */
    public String f12926a;

    /* renamed from: b  reason: collision with root package name */
    public String f12927b;

    /* renamed from: c  reason: collision with root package name */
    public w6 f12928c;

    /* renamed from: d  reason: collision with root package name */
    public long f12929d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12930e;

    public c(c cVar) {
        q.i(cVar);
        this.f12926a = cVar.f12926a;
        this.f12927b = cVar.f12927b;
        this.f12928c = cVar.f12928c;
        this.f12929d = cVar.f12929d;
        this.f12930e = cVar.f12930e;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.E = cVar.E;
        this.F = cVar.F;
        this.G = cVar.G;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 2, this.f12926a);
        m.n(parcel, 3, this.f12927b);
        m.m(parcel, 4, this.f12928c, i8);
        m.k(parcel, 5, this.f12929d);
        m.g(parcel, 6, this.f12930e);
        m.n(parcel, 7, this.B);
        m.m(parcel, 8, this.C, i8);
        m.k(parcel, 9, this.D);
        m.m(parcel, 10, this.E, i8);
        m.k(parcel, 11, this.F);
        m.m(parcel, 12, this.G, i8);
        m.E(parcel, s10);
    }

    public c(String str, String str2, w6 w6Var, long j10, boolean z10, String str3, s sVar, long j11, s sVar2, long j12, s sVar3) {
        this.f12926a = str;
        this.f12927b = str2;
        this.f12928c = w6Var;
        this.f12929d = j10;
        this.f12930e = z10;
        this.B = str3;
        this.C = sVar;
        this.D = j11;
        this.E = sVar2;
        this.F = j12;
        this.G = sVar3;
    }
}

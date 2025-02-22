package q7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import u6.q;
import v6.a;

public final class c7 extends a {
    public static final Parcelable.Creator<c7> CREATOR = new d7();
    public final long B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final long F;
    public final String G;
    @Deprecated
    public final long H;
    public final long I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final String M;
    public final Boolean N;
    public final long O;
    public final List P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final boolean U;
    public final long V;

    /* renamed from: a  reason: collision with root package name */
    public final String f12948a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12949b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12950c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12951d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12952e;

    public c7(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i8, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z14, long j15) {
        q.f(str);
        this.f12948a = str;
        this.f12949b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f12950c = str3;
        this.F = j10;
        this.f12951d = str4;
        this.f12952e = j11;
        this.B = j12;
        this.C = str5;
        this.D = z10;
        this.E = z11;
        this.G = str6;
        this.H = 0;
        this.I = j13;
        this.J = i8;
        this.K = z12;
        this.L = z13;
        this.M = str7;
        this.N = bool;
        this.O = j14;
        this.P = list;
        this.Q = null;
        this.R = str8;
        this.S = str9;
        this.T = str10;
        this.U = z14;
        this.V = j15;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 2, this.f12948a);
        m.n(parcel, 3, this.f12949b);
        m.n(parcel, 4, this.f12950c);
        m.n(parcel, 5, this.f12951d);
        m.k(parcel, 6, this.f12952e);
        m.k(parcel, 7, this.B);
        m.n(parcel, 8, this.C);
        m.g(parcel, 9, this.D);
        m.g(parcel, 10, this.E);
        m.k(parcel, 11, this.F);
        m.n(parcel, 12, this.G);
        m.k(parcel, 13, this.H);
        m.k(parcel, 14, this.I);
        m.j(parcel, 15, this.J);
        m.g(parcel, 16, this.K);
        m.g(parcel, 18, this.L);
        m.n(parcel, 19, this.M);
        Boolean bool = this.N;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        m.k(parcel, 22, this.O);
        m.o(parcel, 23, this.P);
        m.n(parcel, 24, this.Q);
        m.n(parcel, 25, this.R);
        m.n(parcel, 26, this.S);
        m.n(parcel, 27, this.T);
        m.g(parcel, 28, this.U);
        m.k(parcel, 29, this.V);
        m.E(parcel, s10);
    }

    public c7(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i8, boolean z12, boolean z13, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z14, long j16) {
        this.f12948a = str;
        this.f12949b = str2;
        this.f12950c = str3;
        this.F = j12;
        this.f12951d = str4;
        this.f12952e = j10;
        this.B = j11;
        this.C = str5;
        this.D = z10;
        this.E = z11;
        this.G = str6;
        this.H = j13;
        this.I = j14;
        this.J = i8;
        this.K = z12;
        this.L = z13;
        this.M = str7;
        this.N = bool;
        this.O = j15;
        this.P = arrayList;
        this.Q = str8;
        this.R = str9;
        this.S = str10;
        this.T = str11;
        this.U = z14;
        this.V = j16;
    }
}

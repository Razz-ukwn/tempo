package u6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.a;

public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new f0();
    public final String B;
    public final String C;
    public final int D;
    public final int E;

    /* renamed from: a  reason: collision with root package name */
    public final int f15842a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15843b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15844c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15845d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15846e;

    public n(int i8, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.f15842a = i8;
        this.f15843b = i10;
        this.f15844c = i11;
        this.f15845d = j10;
        this.f15846e = j11;
        this.B = str;
        this.C = str2;
        this.D = i12;
        this.E = i13;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15842a);
        m.j(parcel, 2, this.f15843b);
        m.j(parcel, 3, this.f15844c);
        m.k(parcel, 4, this.f15845d);
        m.k(parcel, 5, this.f15846e);
        m.n(parcel, 6, this.B);
        m.n(parcel, 7, this.C);
        m.j(parcel, 8, this.D);
        m.j(parcel, 9, this.E);
        m.E(parcel, s10);
    }
}

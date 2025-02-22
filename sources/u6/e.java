package u6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.a;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new c1();
    public final int[] B;

    /* renamed from: a  reason: collision with root package name */
    public final s f15782a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15783b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15784c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f15785d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15786e;

    public e(s sVar, boolean z10, boolean z11, int[] iArr, int i8, int[] iArr2) {
        this.f15782a = sVar;
        this.f15783b = z10;
        this.f15784c = z11;
        this.f15785d = iArr;
        this.f15786e = i8;
        this.B = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.m(parcel, 1, this.f15782a, i8);
        m.g(parcel, 2, this.f15783b);
        m.g(parcel, 3, this.f15784c);
        int[] iArr = this.f15785d;
        if (iArr != null) {
            int s11 = m.s(parcel, 4);
            parcel.writeIntArray(iArr);
            m.E(parcel, s11);
        }
        m.j(parcel, 5, this.f15786e);
        int[] iArr2 = this.B;
        if (iArr2 != null) {
            int s12 = m.s(parcel, 6);
            parcel.writeIntArray(iArr2);
            m.E(parcel, s12);
        }
        m.E(parcel, s10);
    }
}

package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import u6.q;

public final class r extends b implements Cloneable {
    public static final Parcelable.Creator<r> CREATOR = new a0();
    public final String B;
    public final String C;

    /* renamed from: a  reason: collision with root package name */
    public final String f14143a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14144b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14145c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14146d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14147e;

    public r(String str, String str2, boolean z10, String str3, boolean z11, String str4, String str5) {
        q.b((z10 && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z10 && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f14143a = str;
        this.f14144b = str2;
        this.f14145c = z10;
        this.f14146d = str3;
        this.f14147e = z11;
        this.B = str4;
        this.C = str5;
    }

    public final Object clone() {
        return new r(this.f14143a, this.f14144b, this.f14145c, this.f14146d, this.f14147e, this.B, this.C);
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14143a);
        m.n(parcel, 2, this.f14144b);
        m.g(parcel, 3, this.f14145c);
        m.n(parcel, 4, this.f14146d);
        m.g(parcel, 5, this.f14147e);
        m.n(parcel, 6, this.B);
        m.n(parcel, 7, this.C);
        m.E(parcel, s10);
    }
}

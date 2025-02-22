package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.uh;
import com.google.android.gms.internal.p000firebaseauthapi.v0;

public final class g0 extends q {
    public static final Parcelable.Creator<g0> CREATOR = new h0();
    public final String B;
    public final String C;

    /* renamed from: a  reason: collision with root package name */
    public final String f14124a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14125b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14126c;

    /* renamed from: d  reason: collision with root package name */
    public final v0 f14127d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14128e;

    public g0(String str, String str2, String str3, v0 v0Var, String str4, String str5, String str6) {
        int i8 = uh.f4998a;
        this.f14124a = str == null ? "" : str;
        this.f14125b = str2;
        this.f14126c = str3;
        this.f14127d = v0Var;
        this.f14128e = str4;
        this.B = str5;
        this.C = str6;
    }

    public static g0 x(v0 v0Var) {
        if (v0Var != null) {
            return new g0((String) null, (String) null, (String) null, v0Var, (String) null, (String) null, (String) null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    public final b w() {
        return new g0(this.f14124a, this.f14125b, this.f14126c, this.f14127d, this.f14128e, this.B, this.C);
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14124a);
        m.n(parcel, 2, this.f14125b);
        m.n(parcel, 3, this.f14126c);
        m.m(parcel, 4, this.f14127d, i8);
        m.n(parcel, 5, this.f14128e);
        m.n(parcel, 6, this.B);
        m.n(parcel, 7, this.C);
        m.E(parcel, s10);
    }
}

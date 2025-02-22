package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import u6.q;

public final class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new i0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14113a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14114b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14115c;

    /* renamed from: d  reason: collision with root package name */
    public String f14116d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14117e;

    public c(String str, String str2, String str3, String str4, boolean z10) {
        q.f(str);
        this.f14113a = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f14114b = str2;
            this.f14115c = str3;
            this.f14116d = str4;
            this.f14117e = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14113a);
        m.n(parcel, 2, this.f14114b);
        m.n(parcel, 3, this.f14115c);
        m.n(parcel, 4, this.f14116d);
        m.g(parcel, 5, this.f14117e);
        m.E(parcel, s10);
    }
}

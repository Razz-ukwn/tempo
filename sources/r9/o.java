package r9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;

public final class o extends b {
    public static final Parcelable.Creator<o> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public final String f14141a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14142b;

    public o(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f14141a = str;
            this.f14142b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14141a);
        m.n(parcel, 2, this.f14142b);
        m.E(parcel, s10);
    }
}

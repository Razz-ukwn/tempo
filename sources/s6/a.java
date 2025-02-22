package s6;

import ag.m;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends v6.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public final Intent f14747a;

    public a(Intent intent) {
        this.f14747a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.m(parcel, 1, this.f14747a, i8);
        m.E(parcel, s10);
    }
}

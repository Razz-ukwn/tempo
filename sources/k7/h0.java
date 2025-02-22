package k7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import v6.a;

public final class h0 extends a implements h {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a  reason: collision with root package name */
    public final Status f10369a;

    static {
        new h0(Status.B);
    }

    public h0(Status status) {
        this.f10369a = status;
    }

    public final Status p() {
        return this.f10369a;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.m(parcel, 1, this.f10369a, i8);
        m.E(parcel, s10);
    }
}

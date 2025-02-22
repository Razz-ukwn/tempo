package s9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import r9.g0;
import v6.c;

public final class k0 implements c {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: a  reason: collision with root package name */
    public final p0 f14844a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f14845b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f14846c;

    public k0(p0 p0Var) {
        this.f14844a = p0Var;
        List list = p0Var.f14861e;
        this.f14845b = null;
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!TextUtils.isEmpty(((m0) list.get(i8)).D)) {
                this.f14845b = new i0(((m0) list.get(i8)).f14849b, ((m0) list.get(i8)).D, p0Var.F);
            }
        }
        if (this.f14845b == null) {
            this.f14845b = new i0(p0Var.F);
        }
        this.f14846c = p0Var.G;
    }

    public k0(p0 p0Var, i0 i0Var, g0 g0Var) {
        this.f14844a = p0Var;
        this.f14845b = i0Var;
        this.f14846c = g0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.m(parcel, 1, this.f14844a, i8);
        m.m(parcel, 2, this.f14845b, i8);
        m.m(parcel, 3, this.f14846c, i8);
        m.E(parcel, s10);
    }
}

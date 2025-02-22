package s7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import v6.a;

public final class h extends a implements com.google.android.gms.common.api.h {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final List f14802a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14803b;

    public h(ArrayList arrayList, String str) {
        this.f14802a = arrayList;
        this.f14803b = str;
    }

    public final Status p() {
        return this.f14803b != null ? Status.B : Status.F;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.o(parcel, 1, this.f14802a);
        m.n(parcel, 2, this.f14803b);
        m.E(parcel, s10);
    }
}

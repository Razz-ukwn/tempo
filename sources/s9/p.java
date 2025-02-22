package s9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import v6.a;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public final List f14855a;

    /* renamed from: b  reason: collision with root package name */
    public final List f14856b;

    public p(ArrayList arrayList, ArrayList arrayList2) {
        this.f14855a = arrayList == null ? new ArrayList() : arrayList;
        this.f14856b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.q(parcel, 1, this.f14855a);
        m.q(parcel, 2, this.f14856b);
        m.E(parcel, s10);
    }
}

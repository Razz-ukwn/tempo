package u6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import v6.a;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    public final int f15863a;

    /* renamed from: b  reason: collision with root package name */
    public List f15864b;

    public t(int i8, List list) {
        this.f15863a = i8;
        this.f15864b = list;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15863a);
        m.q(parcel, 2, this.f15864b);
        m.E(parcel, s10);
    }
}

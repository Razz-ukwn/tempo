package s9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import r9.b;

public final class h extends b {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final String f14830a;

    /* renamed from: b  reason: collision with root package name */
    public String f14831b;

    /* renamed from: c  reason: collision with root package name */
    public List f14832c;

    public h() {
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14830a);
        m.n(parcel, 2, this.f14831b);
        m.q(parcel, 3, this.f14832c);
        m.E(parcel, s10);
    }

    public h(String str, String str2, ArrayList arrayList) {
        this.f14830a = str;
        this.f14831b = str2;
        this.f14832c = arrayList;
    }
}

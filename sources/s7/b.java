package s7;

import ag.m;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import v6.a;

public final class b extends a implements h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f14799a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14800b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f14801c;

    public b() {
        this(2, 0, (Intent) null);
    }

    public final Status p() {
        return this.f14800b == 0 ? Status.B : Status.F;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f14799a);
        m.j(parcel, 2, this.f14800b);
        m.m(parcel, 3, this.f14801c, i8);
        m.E(parcel, s10);
    }

    public b(int i8, int i10, Intent intent) {
        this.f14799a = i8;
        this.f14800b = i10;
        this.f14801c = intent;
    }
}

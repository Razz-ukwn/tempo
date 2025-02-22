package s9;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.c;

public final class d implements c {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    public final long f14819a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14820b;

    public d(long j10, long j11) {
        this.f14819a = j10;
        this.f14820b = j11;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.k(parcel, 1, this.f14819a);
        m.k(parcel, 2, this.f14820b);
        m.E(parcel, s10);
    }
}

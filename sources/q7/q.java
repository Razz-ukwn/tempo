package q7;

import ag.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.h9;
import java.util.Iterator;
import v6.a;

public final class q extends a implements Iterable<String> {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f13275a;

    public q(Bundle bundle) {
        this.f13275a = bundle;
    }

    public final Iterator iterator() {
        return new h9(this);
    }

    public final String toString() {
        return this.f13275a.toString();
    }

    public final Bundle w() {
        return new Bundle(this.f13275a);
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.h(parcel, 2, w());
        m.E(parcel, s10);
    }

    public final Double x() {
        return Double.valueOf(this.f13275a.getDouble("value"));
    }
}

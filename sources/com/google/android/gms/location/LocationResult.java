package com.google.android.gms.location;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n7.q;
import v6.a;

public final class LocationResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new q();

    /* renamed from: b  reason: collision with root package name */
    public static final List f5659b = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final List f5660a;

    public LocationResult(List list) {
        this.f5660a = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.google.android.gms.location.LocationResult r9 = (com.google.android.gms.location.LocationResult) r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            java.util.List r3 = r8.f5660a
            if (r0 < r2) goto L_0x0016
            java.util.List r9 = r9.f5660a
            boolean r9 = r3.equals(r9)
            return r9
        L_0x0016:
            int r0 = r3.size()
            java.util.List r2 = r9.f5660a
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0023
            return r1
        L_0x0023:
            java.util.Iterator r0 = r3.iterator()
            java.util.List r9 = r9.f5660a
            java.util.Iterator r9 = r9.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0086
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r9.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x004e
            return r1
        L_0x004e:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x005d
            return r1
        L_0x005d:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x006a
            return r1
        L_0x006a:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = u6.o.a(r2, r3)
            if (r2 != 0) goto L_0x002d
            return r1
        L_0x0086:
            r9 = 1
            return r9
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5660a});
    }

    public final String toString() {
        return "LocationResult".concat(String.valueOf(this.f5660a));
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.q(parcel, 1, this.f5660a);
        m.E(parcel, s10);
    }
}

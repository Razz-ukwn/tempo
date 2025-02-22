package com.google.android.gms.location;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import n7.e;
import n7.o;
import v6.a;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final int f5635a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5636b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5637c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5638d;

    /* renamed from: e  reason: collision with root package name */
    public final e[] f5639e;

    static {
        new LocationAvailability(0, 1, 1, 0, (e[]) null);
        new LocationAvailability(1000, 1, 1, 0, (e[]) null);
    }

    public LocationAvailability(int i8, int i10, int i11, long j10, e[] eVarArr) {
        this.f5638d = i8 < 1000 ? 0 : 1000;
        this.f5635a = i10;
        this.f5636b = i11;
        this.f5637c = j10;
        this.f5639e = eVarArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (com.google.android.gms.location.LocationAvailability) r7;
        r0 = r7.f5635a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.location.LocationAvailability
            r1 = 0
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.location.LocationAvailability r7 = (com.google.android.gms.location.LocationAvailability) r7
            int r0 = r7.f5635a
            int r2 = r6.f5635a
            if (r2 != r0) goto L_0x002d
            int r0 = r6.f5636b
            int r2 = r7.f5636b
            if (r0 != r2) goto L_0x002d
            long r2 = r6.f5637c
            long r4 = r7.f5637c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            int r0 = r6.f5638d
            int r2 = r7.f5638d
            if (r0 != r2) goto L_0x002d
            n7.e[] r0 = r6.f5639e
            n7.e[] r7 = r7.f5639e
            boolean r7 = java.util.Arrays.equals(r0, r7)
            if (r7 == 0) goto L_0x002d
            r7 = 1
            return r7
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationAvailability.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5638d)});
    }

    public final String toString() {
        boolean z10 = this.f5638d < 1000;
        return "LocationAvailability[" + z10 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        boolean z10 = true;
        m.j(parcel, 1, this.f5635a);
        m.j(parcel, 2, this.f5636b);
        m.k(parcel, 3, this.f5637c);
        int i10 = this.f5638d;
        m.j(parcel, 4, i10);
        m.p(parcel, 5, this.f5639e, i8);
        if (i10 >= 1000) {
            z10 = false;
        }
        m.g(parcel, 6, z10);
        m.E(parcel, s10);
    }
}

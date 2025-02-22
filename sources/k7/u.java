package k7;

import ag.m;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import u6.c;
import u6.o;
import u6.q;
import v6.a;
import z6.h;

@Deprecated
public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    public final LocationRequest f10388a;

    public u(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    h.a(workSource, cVar.f15766a, cVar.f15767b);
                }
            }
            aVar.f5657n = workSource;
        }
        boolean z14 = true;
        if (z10) {
            aVar.b(1);
        }
        if (z11) {
            aVar.d(2);
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT < 30) {
                aVar.f5656l = str;
            }
        } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
            aVar.f5656l = str2;
        }
        if (z12) {
            aVar.m = true;
        }
        if (z13) {
            aVar.f5652h = true;
        }
        if (j10 != Long.MAX_VALUE) {
            if (j10 != -1 && j10 < 0) {
                z14 = false;
            }
            q.b(z14, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            aVar.f5653i = j10;
        }
        this.f10388a = aVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return o.a(this.f10388a, ((u) obj).f10388a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10388a.hashCode();
    }

    public final String toString() {
        return this.f10388a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.m(parcel, 1, this.f10388a, i8);
        m.E(parcel, s10);
    }
}

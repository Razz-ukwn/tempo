package n7;

import ag.m;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import h0.e;
import java.util.Arrays;
import k7.q;
import k7.y;
import u6.o;
import z6.h;

public final class a extends v6.a {
    public static final Parcelable.Creator<a> CREATOR = new g();
    public final int B;
    public final String C;
    public final WorkSource D;
    public final q E;

    /* renamed from: a  reason: collision with root package name */
    public final long f11599a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11600b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11601c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11602d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11603e;

    public a(long j10, int i8, int i10, long j11, boolean z10, int i11, String str, WorkSource workSource, q qVar) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        u6.q.a(z11);
        this.f11599a = j10;
        this.f11600b = i8;
        this.f11601c = i10;
        this.f11602d = j11;
        this.f11603e = z10;
        this.B = i11;
        this.C = str;
        this.D = workSource;
        this.E = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11599a == aVar.f11599a && this.f11600b == aVar.f11600b && this.f11601c == aVar.f11601c && this.f11602d == aVar.f11602d && this.f11603e == aVar.f11603e && this.B == aVar.B && o.a(this.C, aVar.C) && o.a(this.D, aVar.D) && o.a(this.E, aVar.E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11599a), Integer.valueOf(this.f11600b), Integer.valueOf(this.f11601c), Long.valueOf(this.f11602d)});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder c3 = e.c("CurrentLocationRequest[");
        c3.append(m.A(this.f11601c));
        long j10 = this.f11599a;
        if (j10 != Long.MAX_VALUE) {
            c3.append(", maxAge=");
            y.a(j10, c3);
        }
        long j11 = this.f11602d;
        if (j11 != Long.MAX_VALUE) {
            c3.append(", duration=");
            c3.append(j11);
            c3.append("ms");
        }
        int i8 = this.f11600b;
        if (i8 != 0) {
            c3.append(", ");
            if (i8 == 0) {
                str2 = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i8 == 1) {
                str2 = "GRANULARITY_COARSE";
            } else if (i8 == 2) {
                str2 = "GRANULARITY_FINE";
            } else {
                throw new IllegalArgumentException();
            }
            c3.append(str2);
        }
        if (this.f11603e) {
            c3.append(", bypass");
        }
        int i10 = this.B;
        if (i10 != 0) {
            c3.append(", ");
            if (i10 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i10 == 1) {
                str = "THROTTLE_ALWAYS";
            } else if (i10 == 2) {
                str = "THROTTLE_NEVER";
            } else {
                throw new IllegalArgumentException();
            }
            c3.append(str);
        }
        String str3 = this.C;
        if (str3 != null) {
            c3.append(", moduleId=");
            c3.append(str3);
        }
        WorkSource workSource = this.D;
        if (!h.b(workSource)) {
            c3.append(", workSource=");
            c3.append(workSource);
        }
        q qVar = this.E;
        if (qVar != null) {
            c3.append(", impersonation=");
            c3.append(qVar);
        }
        c3.append(']');
        return c3.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.k(parcel, 1, this.f11599a);
        m.j(parcel, 2, this.f11600b);
        m.j(parcel, 3, this.f11601c);
        m.k(parcel, 4, this.f11602d);
        m.g(parcel, 5, this.f11603e);
        m.m(parcel, 6, this.D, i8);
        m.j(parcel, 7, this.B);
        m.n(parcel, 8, this.C);
        m.m(parcel, 9, this.E, i8);
        m.E(parcel, s10);
    }
}

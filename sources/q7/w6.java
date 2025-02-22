package q7;

import android.os.Parcel;
import android.os.Parcelable;
import u6.q;
import v6.a;

public final class w6 extends a {
    public static final Parcelable.Creator<w6> CREATOR = new x6();
    public final String B;
    public final Double C;

    /* renamed from: a  reason: collision with root package name */
    public final int f13409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13410b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13411c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f13412d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13413e;

    public w6(int i8, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f13409a = i8;
        this.f13410b = str;
        this.f13411c = j10;
        this.f13412d = l10;
        if (i8 == 1) {
            this.C = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.C = d10;
        }
        this.f13413e = str2;
        this.B = str3;
    }

    public final Object w() {
        Long l10 = this.f13412d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.C;
        if (d10 != null) {
            return d10;
        }
        String str = this.f13413e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        x6.a(this, parcel);
    }

    public w6(y6 y6Var) {
        this(y6Var.f13453d, y6Var.f13454e, y6Var.f13452c, y6Var.f13451b);
    }

    public w6(long j10, Object obj, String str, String str2) {
        q.f(str);
        this.f13409a = 2;
        this.f13410b = str;
        this.f13411c = j10;
        this.B = str2;
        if (obj == null) {
            this.f13412d = null;
            this.C = null;
            this.f13413e = null;
        } else if (obj instanceof Long) {
            this.f13412d = (Long) obj;
            this.C = null;
            this.f13413e = null;
        } else if (obj instanceof String) {
            this.f13412d = null;
            this.C = null;
            this.f13413e = (String) obj;
        } else if (obj instanceof Double) {
            this.f13412d = null;
            this.C = (Double) obj;
            this.f13413e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

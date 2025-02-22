package u6;

import ag.m;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import t6.b;
import u6.j;
import v6.a;

public final class j0 extends a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: a  reason: collision with root package name */
    public final int f15828a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f15829b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15830c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15831d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15832e;

    public j0(int i8, IBinder iBinder, b bVar, boolean z10, boolean z11) {
        this.f15828a = i8;
        this.f15829b = iBinder;
        this.f15830c = bVar;
        this.f15831d = z10;
        this.f15832e = z11;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f15830c.equals(j0Var.f15830c)) {
            Object obj3 = null;
            IBinder iBinder = this.f15829b;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i8 = j.a.f15827b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface instanceof j ? (j) queryLocalInterface : new k1(iBinder);
            }
            IBinder iBinder2 = j0Var.f15829b;
            if (iBinder2 != null) {
                int i10 = j.a.f15827b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj3 = queryLocalInterface2 instanceof j ? (j) queryLocalInterface2 : new k1(iBinder2);
            }
            if (o.a(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15828a);
        m.i(parcel, 2, this.f15829b);
        m.m(parcel, 3, this.f15830c, i8);
        m.g(parcel, 4, this.f15831d);
        m.g(parcel, 5, this.f15832e);
        m.E(parcel, s10);
    }
}

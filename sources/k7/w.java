package k7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import n7.i;
import n7.j;
import n7.k;
import n7.l;
import n7.m;
import n7.n;
import v6.a;

@Deprecated
public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();
    public final l0 B;
    public final String C;

    /* renamed from: a  reason: collision with root package name */
    public final int f10389a;

    /* renamed from: b  reason: collision with root package name */
    public final u f10390b;

    /* renamed from: c  reason: collision with root package name */
    public final n f10391c;

    /* renamed from: d  reason: collision with root package name */
    public final k f10392d;

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f10393e;

    public w(int i8, u uVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        n nVar;
        k kVar;
        this.f10389a = i8;
        this.f10390b = uVar;
        l0 l0Var = null;
        if (iBinder != null) {
            int i10 = m.f11613b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
        } else {
            nVar = null;
        }
        this.f10391c = nVar;
        this.f10393e = pendingIntent;
        if (iBinder2 != null) {
            int i11 = j.f11612b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            kVar = queryLocalInterface2 instanceof k ? (k) queryLocalInterface2 : new i(iBinder2);
        } else {
            kVar = null;
        }
        this.f10392d = kVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            l0Var = queryLocalInterface3 instanceof l0 ? (l0) queryLocalInterface3 : new j0(iBinder3);
        }
        this.B = l0Var;
        this.C = str;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = ag.m.s(parcel, 20293);
        ag.m.j(parcel, 1, this.f10389a);
        ag.m.m(parcel, 2, this.f10390b, i8);
        IBinder iBinder = null;
        n nVar = this.f10391c;
        ag.m.i(parcel, 3, nVar == null ? null : nVar.asBinder());
        ag.m.m(parcel, 4, this.f10393e, i8);
        k kVar = this.f10392d;
        ag.m.i(parcel, 5, kVar == null ? null : kVar.asBinder());
        l0 l0Var = this.B;
        if (l0Var != null) {
            iBinder = l0Var.asBinder();
        }
        ag.m.i(parcel, 6, iBinder);
        ag.m.n(parcel, 8, this.C);
        ag.m.E(parcel, s10);
    }
}

package k7;

import ag.m;
import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v6.a;

public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new t();
    public final String B;

    /* renamed from: a  reason: collision with root package name */
    public final int f10383a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f10384b;

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f10385c;

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f10386d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10387e;

    public s(int i8, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f10383a = i8;
        this.f10384b = iBinder;
        this.f10385c = iBinder2;
        this.f10386d = pendingIntent;
        this.f10387e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.B = str2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f10383a);
        m.i(parcel, 2, this.f10384b);
        m.i(parcel, 3, this.f10385c);
        m.m(parcel, 4, this.f10386d, i8);
        m.n(parcel, 5, this.f10387e);
        m.n(parcel, 6, this.B);
        m.E(parcel, s10);
    }
}

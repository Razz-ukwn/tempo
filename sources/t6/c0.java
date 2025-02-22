package t6;

import ag.m;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c7.b;
import u6.m0;
import u6.m1;
import u6.n1;
import v6.a;

public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: a  reason: collision with root package name */
    public final String f15385a;

    /* renamed from: b  reason: collision with root package name */
    public final t f15386b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15387c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15388d;

    public c0(String str, IBinder iBinder, boolean z10, boolean z11) {
        byte[] bArr;
        this.f15385a = str;
        u uVar = null;
        if (iBinder != null) {
            try {
                int i8 = n1.f15847b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                c7.a zzd = (queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m1(iBinder)).zzd();
                if (zzd == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) b.P(zzd);
                }
                if (bArr != null) {
                    uVar = new u(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f15386b = uVar;
        this.f15387c = z10;
        this.f15388d = z11;
    }

    public c0(String str, t tVar, boolean z10, boolean z11) {
        this.f15385a = str;
        this.f15386b = tVar;
        this.f15387c = z10;
        this.f15388d = z11;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f15385a);
        t tVar = this.f15386b;
        if (tVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            tVar = null;
        }
        m.i(parcel, 2, tVar);
        m.g(parcel, 3, this.f15387c);
        m.g(parcel, 4, this.f15388d);
        m.E(parcel, s10);
    }
}

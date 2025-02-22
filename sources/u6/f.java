package u6;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import t6.d;
import u6.j;
import v6.a;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new d1();
    public static final Scope[] K = new Scope[0];
    public static final d[] L = new d[0];
    public Scope[] B;
    public Bundle C;
    public Account D;
    public d[] E;
    public d[] F;
    public final boolean G;
    public final int H;
    public boolean I;
    public final String J;

    /* renamed from: a  reason: collision with root package name */
    public final int f15793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15794b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15795c;

    /* renamed from: d  reason: collision with root package name */
    public String f15796d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f15797e;

    public f(int i8, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z10, int i12, boolean z11, String str2) {
        scopeArr = scopeArr == null ? K : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        d[] dVarArr3 = L;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f15793a = i8;
        this.f15794b = i10;
        this.f15795c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f15796d = "com.google.android.gms";
        } else {
            this.f15796d = str;
        }
        if (i8 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = j.a.f15827b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j k1Var = queryLocalInterface instanceof j ? (j) queryLocalInterface : new k1(iBinder);
                int i14 = a.f15735c;
                if (k1Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = k1Var.zzb();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.D = account2;
        } else {
            this.f15797e = iBinder;
            this.D = account;
        }
        this.B = scopeArr;
        this.C = bundle;
        this.E = dVarArr;
        this.F = dVarArr2;
        this.G = z10;
        this.H = i12;
        this.I = z11;
        this.J = str2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        d1.a(this, parcel, i8);
    }
}

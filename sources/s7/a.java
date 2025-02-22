package s7;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.r0;
import h7.c;
import r6.b;
import r7.f;
import s6.n;
import u6.b;
import u6.d;
import u6.g;
import u6.h0;
import u6.j0;
import u6.q;

public final class a extends g<g> implements f {
    public final boolean B = true;
    public final d C;
    public final Bundle D;
    public final Integer E;

    public a(Context context, Looper looper, d dVar, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.C = dVar;
        this.D = bundle;
        this.E = dVar.f15776h;
    }

    public final void c(f fVar) {
        Parcel obtain;
        Parcel obtain2;
        if (fVar != null) {
            try {
                Account account = this.C.f15769a;
                if (account == null) {
                    account = new Account("<<default account>>", "com.google");
                }
                GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? b.a(this.f15745c).b() : null;
                Integer num = this.E;
                q.i(num);
                h0 h0Var = new h0(2, account, num.intValue(), b10);
                g gVar = (g) x();
                j jVar = new j(1, h0Var);
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(gVar.f9271c);
                int i8 = c.f9273a;
                obtain.writeInt(1);
                jVar.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(fVar.asBinder());
                obtain2 = Parcel.obtain();
                gVar.f9270b.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
            } catch (RemoteException e10) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    r0 r0Var = (r0) fVar;
                    r0Var.f4324c.post(new n((Object) r0Var, (Object) new l(1, new t6.b(8, (PendingIntent) null), (j0) null), 1));
                } catch (RemoteException unused) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
                }
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                throw th;
            }
        } else {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
    }

    public final int j() {
        return 12451000;
    }

    public final boolean m() {
        return this.B;
    }

    public final void o() {
        p(new b.d());
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    public final Bundle v() {
        u6.d dVar = this.C;
        boolean equals = this.f15745c.getPackageName().equals(dVar.f15773e);
        Bundle bundle = this.D;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", dVar.f15773e);
        }
        return bundle;
    }

    public final String y() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String z() {
        return "com.google.android.gms.signin.service.START";
    }
}

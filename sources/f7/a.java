package f7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.k;
import p6.b;
import p6.c;
import u6.d;
import u6.g;
import u6.x;

public final class a extends g {
    public final Bundle B;

    public a(Context context, Looper looper, d dVar, c cVar, com.google.android.gms.common.api.internal.d dVar2, k kVar) {
        super(context, looper, 16, dVar, dVar2, kVar);
        this.B = cVar == null ? new Bundle() : new Bundle((Bundle) null);
    }

    public final int j() {
        return 12451000;
    }

    public final boolean m() {
        d dVar = this.f15805y;
        Account account = dVar.f15769a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((x) dVar.f15772d.get(b.f12473a)) == null) {
            return !dVar.f15770b.isEmpty();
        }
        throw null;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(iBinder);
    }

    public final Bundle v() {
        return this.B;
    }

    public final String y() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String z() {
        return "com.google.android.gms.auth.service.START";
    }
}

package g7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.api.d;
import p6.a;
import u6.d;
import u6.g;

public final class e extends g {
    public final a.C0242a B;

    public e(Context context, Looper looper, d dVar, a.C0242a aVar, d.a aVar2, d.b bVar) {
        super(context, looper, 68, dVar, aVar2, bVar);
        a.C0242a.C0243a aVar3 = new a.C0242a.C0243a(aVar == null ? a.C0242a.f12468c : aVar);
        byte[] bArr = new byte[16];
        c.f8897a.nextBytes(bArr);
        aVar3.f12472b = Base64.encodeToString(bArr, 11);
        this.B = new a.C0242a(aVar3);
    }

    public final int j() {
        return 12800000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    public final Bundle v() {
        a.C0242a aVar = this.B;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", aVar.f12469a);
        bundle.putString("log_session_id", aVar.f12470b);
        return bundle;
    }

    public final String y() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String z() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}

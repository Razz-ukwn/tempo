package r6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import g7.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import u6.d;

public final class g extends u6.g {
    public final GoogleSignInOptions B;

    public g(Context context, Looper looper, d dVar, GoogleSignInOptions googleSignInOptions, d.a aVar, d.b bVar) {
        super(context, looper, 91, dVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        byte[] bArr = new byte[16];
        c.f8897a.nextBytes(bArr);
        aVar2.f4165i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = dVar.f15771c;
        if (!set.isEmpty()) {
            for (Scope add : set) {
                HashSet hashSet = aVar2.f4157a;
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.B = aVar2.a();
    }

    public final int j() {
        return 12451000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(iBinder);
    }

    public final String y() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String z() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}

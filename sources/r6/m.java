package r6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.e;
import h7.i;
import java.util.Iterator;
import java.util.Set;
import x6.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14081a = new a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f14081a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        n.a(context).b();
        Set set = d.f4196a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            synchronized (e.f4238q) {
                e eVar = e.f4239r;
                if (eVar != null) {
                    eVar.f4248i.incrementAndGet();
                    i iVar = eVar.m;
                    iVar.sendMessageAtFrontOfQueue(iVar.obtainMessage(10));
                }
            }
            return;
        }
        ((d) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}

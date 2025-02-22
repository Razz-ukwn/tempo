package r3;

import ag.m;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.ec;
import com.google.android.gms.internal.p000firebaseauthapi.hc;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.GeneralSecurityException;
import org.json.JSONException;
import org.json.JSONObject;
import s9.t;
import u6.q;
import x9.b;
import y9.a;

public final class u implements ec, w, Continuation, b, y9.b {

    /* renamed from: a  reason: collision with root package name */
    public Object f13864a;

    public /* synthetic */ u() {
    }

    public /* synthetic */ u(Object obj) {
        this.f13864a = obj;
    }

    public static String c(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public final void a(a aVar) {
        this.f13864a = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", (Throwable) null);
        }
    }

    public final void b(Bundle bundle, String str) {
        a aVar = (a) this.f13864a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", (Throwable) null);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void d(n nVar) {
        ((w) this.f13864a).d((m0) nVar);
    }

    public final Object then(Task task) {
        t tVar = (t) this.f13864a;
        if (task.isSuccessful()) {
            return tVar.a((String) task.getResult());
        }
        Exception exception = task.getException();
        q.i(exception);
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - ".concat(String.valueOf(exception.getMessage())));
        return Tasks.forException(exception);
    }

    public final void zza(String str) {
        ((w) this.f13864a).zza(str);
    }

    public /* synthetic */ u(Object obj, int i8) {
        this.f13864a = obj;
    }

    public /* synthetic */ u(hc hcVar) {
        if (m.y(2)) {
            this.f13864a = hcVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}

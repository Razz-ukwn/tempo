package s9;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.p000firebaseauthapi.d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import r9.g;
import u6.q;

public final class s implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f14865b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f14866c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Continuation f14867d;

    public s(Continuation continuation, RecaptchaAction recaptchaAction, x xVar, String str) {
        this.f14864a = str;
        this.f14865b = xVar;
        this.f14866c = recaptchaAction;
        this.f14867d = continuation;
    }

    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        q.i(exception);
        SparseArray sparseArray = d.f4476a;
        if (!(exception instanceof g) || !((g) exception).f14123a.endsWith("INVALID_RECAPTCHA_TOKEN")) {
            return task;
        }
        boolean isLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = this.f14864a;
        if (isLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant ".concat(String.valueOf(str)));
        }
        return this.f14865b.a(str, Boolean.TRUE, this.f14866c).continueWithTask(this.f14867d);
    }
}

package s9;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import j1.c;
import r3.u;

public abstract class t {
    public abstract Task a(String str);

    public final Task b(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        x xVar;
        u uVar = new u((Object) this);
        synchronized (firebaseAuth) {
            xVar = firebaseAuth.f6314j;
        }
        if (xVar != null) {
            if (xVar.f14872b != null) {
                return xVar.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(uVar).continueWithTask(new s(uVar, recaptchaAction, xVar, str));
            }
        }
        return a((String) null).continueWithTask(new c((Object) recaptchaAction, (Object) firebaseAuth, (Object) str, (Object) uVar));
    }
}

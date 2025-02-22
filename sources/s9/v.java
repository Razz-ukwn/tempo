package s9;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.l0;
import com.google.android.gms.internal.p000firebaseauthapi.la;
import com.google.android.gms.internal.p000firebaseauthapi.s0;
import com.google.android.gms.internal.p000firebaseauthapi.uh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;
import m9.f;
import t.w2;
import t.x2;
import u6.q;

public final class v implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14868a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f14869b;

    public v(x xVar, String str) {
        this.f14869b = xVar;
        this.f14868a = str;
    }

    public final Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            q.i(exception);
            String message = exception.getMessage();
            q.i(message);
            return Tasks.forException(new u(message));
        }
        l0 l0Var = (l0) task.getResult();
        String str = l0Var.f4697a;
        int i8 = uh.f4998a;
        boolean z10 = str == null || str.isEmpty();
        String str2 = this.f14868a;
        if (z10) {
            return Tasks.forException(new u("No Recaptcha Enterprise siteKey configured for tenant/project ".concat(String.valueOf(str2))));
        }
        List k10 = new w2((s0) new x2(new la('/'), 2)).k(str);
        String str3 = k10.size() != 4 ? null : (String) k10.get(3);
        if (TextUtils.isEmpty(str3)) {
            return Tasks.forException(new Exception("Invalid siteKey format ".concat(str)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant ".concat(String.valueOf(str2)));
        }
        x xVar = this.f14869b;
        xVar.f14872b = l0Var;
        f fVar = xVar.f14873c;
        fVar.a();
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient((Application) fVar.f11331a, str3);
        xVar.f14871a.put(str2, tasksClient);
        return tasksClient;
    }
}

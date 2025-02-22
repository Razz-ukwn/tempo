package s9;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import u6.q;

public final class w implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f14870a;

    public w(RecaptchaAction recaptchaAction) {
        this.f14870a = recaptchaAction;
    }

    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f14870a);
        }
        Exception exception = task.getException();
        q.i(exception);
        if (!(exception instanceof u)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - ".concat(String.valueOf(exception.getMessage())));
        }
        return Tasks.forResult("");
    }
}

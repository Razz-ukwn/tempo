package wa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<d0> f16571b;

    /* renamed from: a  reason: collision with root package name */
    public a0 f16572a;

    public d0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
    }

    public final synchronized c0 a() {
        String peek;
        c0 c0Var;
        a0 a0Var = this.f16572a;
        synchronized (a0Var.f16555d) {
            peek = a0Var.f16555d.peek();
        }
        Pattern pattern = c0.f16565d;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                c0Var = new c0(split[0], split[1]);
            }
        }
        c0Var = null;
        return c0Var;
    }
}

package s1;

import android.util.Log;
import java.lang.reflect.Method;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f14480a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14481b;

    public e(Object obj, Object obj2) {
        this.f14480a = obj;
        this.f14481b = obj2;
    }

    public final void run() {
        try {
            Method method = f.f14485d;
            Object obj = this.f14481b;
            Object obj2 = this.f14480a;
            if (method != null) {
                method.invoke(obj2, new Object[]{obj, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            f.f14486e.invoke(obj2, new Object[]{obj, Boolean.FALSE});
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}

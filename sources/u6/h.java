package u6;

import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15811a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static h1 f15812b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f15813c;

    public static h1 a(Context context) {
        synchronized (f15811a) {
            if (f15812b == null) {
                f15812b = new h1(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f15812b;
    }

    public final void b(String str, String str2, x0 x0Var, boolean z10) {
        e1 e1Var = new e1(str, str2, z10);
        h1 h1Var = (h1) this;
        synchronized (h1Var.f15818d) {
            f1 f1Var = (f1) h1Var.f15818d.get(e1Var);
            if (f1Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: ".concat(e1Var.toString()));
            } else if (f1Var.f15798a.containsKey(x0Var)) {
                f1Var.f15798a.remove(x0Var);
                if (f1Var.f15798a.isEmpty()) {
                    h1Var.f15820f.sendMessageDelayed(h1Var.f15820f.obtainMessage(0, e1Var), h1Var.f15822h);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(e1Var.toString()));
            }
        }
    }

    public abstract boolean c(e1 e1Var, x0 x0Var, String str, Executor executor);
}

package u6;

import android.content.Context;
import android.os.Looper;
import j7.b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import y6.a;

public final class h1 extends h {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f15818d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f15819e;

    /* renamed from: f  reason: collision with root package name */
    public volatile b f15820f;

    /* renamed from: g  reason: collision with root package name */
    public final a f15821g;

    /* renamed from: h  reason: collision with root package name */
    public final long f15822h;

    /* renamed from: i  reason: collision with root package name */
    public final long f15823i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Executor f15824j;

    public h1(Context context, Looper looper) {
        g1 g1Var = new g1(this);
        this.f15819e = context.getApplicationContext();
        this.f15820f = new b(looper, g1Var);
        this.f15821g = a.b();
        this.f15822h = 5000;
        this.f15823i = 300000;
        this.f15824j = null;
    }

    public final boolean c(e1 e1Var, x0 x0Var, String str, Executor executor) {
        boolean z10;
        synchronized (this.f15818d) {
            try {
                f1 f1Var = (f1) this.f15818d.get(e1Var);
                if (executor == null) {
                    executor = this.f15824j;
                }
                if (f1Var == null) {
                    f1Var = new f1(this, e1Var);
                    f1Var.f15798a.put(x0Var, x0Var);
                    f1Var.a(str, executor);
                    this.f15818d.put(e1Var, f1Var);
                } else {
                    this.f15820f.removeMessages(0, e1Var);
                    if (!f1Var.f15798a.containsKey(x0Var)) {
                        f1Var.f15798a.put(x0Var, x0Var);
                        int i8 = f1Var.f15799b;
                        if (i8 == 1) {
                            x0Var.onServiceConnected(f1Var.f15803f, f1Var.f15801d);
                        } else if (i8 == 2) {
                            f1Var.a(str, executor);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(e1Var.toString()));
                    }
                }
                z10 = f1Var.f15800c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}

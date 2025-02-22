package u6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public final class g1 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h1 f15810a;

    public /* synthetic */ g1(h1 h1Var) {
        this.f15810a = h1Var;
    }

    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            synchronized (this.f15810a.f15818d) {
                try {
                    e1 e1Var = (e1) message.obj;
                    f1 f1Var = (f1) this.f15810a.f15818d.get(e1Var);
                    if (f1Var != null && f1Var.f15798a.isEmpty()) {
                        if (f1Var.f15800c) {
                            f1Var.f15804g.f15820f.removeMessages(1, f1Var.f15802e);
                            h1 h1Var = f1Var.f15804g;
                            h1Var.f15821g.c(h1Var.f15819e, f1Var);
                            f1Var.f15800c = false;
                            f1Var.f15799b = 2;
                        }
                        this.f15810a.f15818d.remove(e1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (i8 != 1) {
            return false;
        } else {
            synchronized (this.f15810a.f15818d) {
                e1 e1Var2 = (e1) message.obj;
                f1 f1Var2 = (f1) this.f15810a.f15818d.get(e1Var2);
                if (f1Var2 != null && f1Var2.f15799b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(e1Var2)), new Exception());
                    ComponentName componentName = f1Var2.f15803f;
                    if (componentName == null) {
                        e1Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = e1Var2.f15791b;
                        q.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    f1Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}

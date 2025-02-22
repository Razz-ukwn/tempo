package s6;

import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14796a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14797b;

    public /* synthetic */ w(Object obj, int i8) {
        this.f14796a = i8;
        this.f14797b = obj;
    }

    public final void run() {
        int i8 = this.f14796a;
        Object obj = this.f14797b;
        switch (i8) {
            case 0:
                if (((TaskCompletionSource) obj).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 1:
                ((b0) obj).i();
                return;
            default:
                Process.setThreadPriority(0);
                ((Runnable) obj).run();
                return;
        }
    }

    public w(Runnable runnable) {
        this.f14796a = 3;
        this.f14797b = runnable;
    }
}

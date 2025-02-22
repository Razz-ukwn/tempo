package ee;

import ae.a;
import android.os.Looper;
import d2.f1;
import java.util.HashSet;
import java.util.Iterator;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f7984a = new HashSet();

    public final void a() {
        if (f1.f7212a == null) {
            f1.f7212a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f1.f7212a) {
            Iterator it = this.f7984a.iterator();
            while (it.hasNext()) {
                ((ge.a) it.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}

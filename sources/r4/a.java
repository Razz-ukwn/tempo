package r4;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: r4.a$a  reason: collision with other inner class name */
    public class C0261a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f13867a;

        public C0261a(Runnable runnable) {
            this.f13867a = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f13867a.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0261a(runnable), "glide-active-resources");
    }
}

package z1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class m implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f17657a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f17658b = 10;

    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f17659a;

        public a(Runnable runnable, String str, int i8) {
            super(runnable, str);
            this.f17659a = i8;
        }

        public final void run() {
            Process.setThreadPriority(this.f17659a);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f17657a, this.f17658b);
    }
}

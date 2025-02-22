package af;

import androidx.activity.g;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class e extends AtomicLong implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f354a;

    /* renamed from: b  reason: collision with root package name */
    public final int f355b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f356c;

    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public e(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f354a + '-' + incrementAndGet();
        Thread aVar = this.f356c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f355b);
        aVar.setDaemon(true);
        return aVar;
    }

    public final String toString() {
        return g.a(new StringBuilder("RxThreadFactory["), this.f354a, "]");
    }

    public e(String str, int i8, boolean z10) {
        this.f354a = str;
        this.f355b = i8;
        this.f356c = z10;
    }
}

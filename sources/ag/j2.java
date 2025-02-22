package ag;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class j2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f425a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f426b = "reCaptcha";

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f427c;

    public /* synthetic */ j2(AtomicInteger atomicInteger) {
        this.f427c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        int i8 = this.f425a;
        String str = this.f426b;
        if (i8 != 1) {
            str = str + '-' + this.f427c.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}

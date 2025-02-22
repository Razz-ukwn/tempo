package z9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class d0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f17814b;

    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f17815a;

        public a(Runnable runnable) {
            this.f17815a = runnable;
        }

        public final void a() {
            this.f17815a.run();
        }
    }

    public d0(String str, AtomicLong atomicLong) {
        this.f17813a = str;
        this.f17814b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f17813a + this.f17814b.getAndIncrement());
        return newThread;
    }
}

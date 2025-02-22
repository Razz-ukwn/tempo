package a7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import s6.w;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f123a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f124b = Executors.defaultThreadFactory();

    public b(String str) {
        this.f123a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f124b.newThread(new w(runnable));
        newThread.setName(this.f123a);
        return newThread;
    }
}

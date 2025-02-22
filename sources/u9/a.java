package u9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f15895e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f15896a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f15897b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15898c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f15899d;

    public a(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        this.f15897b = str;
        this.f15898c = i8;
        this.f15899d = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = f15895e.newThread(new a2.a(5, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f15897b, Long.valueOf(this.f15896a.getAndIncrement())}));
        return newThread;
    }
}

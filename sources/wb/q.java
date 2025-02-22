package wb;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16679c = new a(q.class.getSimpleName());

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<q>> f16680d = new ConcurrentHashMap<>(4);

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f16681a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f16682b;

    public q(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f16681a = handlerThread;
        handlerThread.setDaemon(true);
        handlerThread.start();
        this.f16682b = new Handler(handlerThread.getLooper());
    }

    public static q a(String str) {
        ConcurrentHashMap<String, WeakReference<q>> concurrentHashMap = f16680d;
        boolean containsKey = concurrentHashMap.containsKey(str);
        a aVar = f16679c;
        if (containsKey) {
            q qVar = (q) concurrentHashMap.get(str).get();
            if (qVar != null) {
                HandlerThread handlerThread = qVar.f16681a;
                if (handlerThread.isAlive() && !handlerThread.isInterrupted()) {
                    aVar.a(2, "get:", "Reusing cached worker handler.", str);
                    return qVar;
                }
            }
            aVar.a(2, "get:", "Thread reference died, removing.", str);
            concurrentHashMap.remove(str);
        }
        aVar.a(1, "get:", "Creating new handler.", str);
        q qVar2 = new q(str);
        concurrentHashMap.put(str, new WeakReference(qVar2));
        return qVar2;
    }

    public final void b(Runnable runnable) {
        this.f16682b.post(runnable);
    }
}

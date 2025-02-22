package r6;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static n f14082b;

    /* renamed from: a  reason: collision with root package name */
    public final b f14083a;

    public n(Context context) {
        b a10 = b.a(context);
        this.f14083a = a10;
        a10.b();
        a10.c();
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (n.class) {
                nVar = f14082b;
                if (nVar == null) {
                    nVar = new n(applicationContext);
                    f14082b = nVar;
                }
            }
        }
        return nVar;
    }

    public final synchronized void b() {
        b bVar = this.f14083a;
        ReentrantLock reentrantLock = bVar.f14072a;
        reentrantLock.lock();
        try {
            bVar.f14073b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}

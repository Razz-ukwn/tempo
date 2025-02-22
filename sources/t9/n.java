package t9;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import na.b;
import na.c;
import na.d;
import wa.o;

public final class n implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15483a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f15484b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f15485c;

    public n(Executor executor) {
        this.f15485c = executor;
    }

    public final synchronized void a(Executor executor, b bVar) {
        Class<m9.b> cls = m9.b.class;
        synchronized (this) {
            executor.getClass();
            if (!this.f15483a.containsKey(cls)) {
                this.f15483a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f15483a.get(cls)).put(bVar, executor);
        }
    }

    public final void b(o oVar) {
        a(this.f15485c, oVar);
    }
}

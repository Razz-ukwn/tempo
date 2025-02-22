package t4;

import ag.b1;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15341a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0285b f15342b = new C0285b();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f15343a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f15344b;
    }

    /* renamed from: t4.b$b  reason: collision with other inner class name */
    public static class C0285b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f15345a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f15341a.get(str);
            b1.b(obj);
            aVar = (a) obj;
            int i8 = aVar.f15344b;
            if (i8 >= 1) {
                int i10 = i8 - 1;
                aVar.f15344b = i10;
                if (i10 == 0) {
                    a aVar2 = (a) this.f15341a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0285b bVar = this.f15342b;
                        synchronized (bVar.f15345a) {
                            if (bVar.f15345a.size() < 10) {
                                bVar.f15345a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f15344b);
            }
        }
        aVar.f15343a.unlock();
    }
}

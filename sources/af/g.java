package af;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import te.a;
import te.b;

public final class g extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, b {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f361b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f362c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final Object f363d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final Object f364e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f365a;

    public g(Runnable runnable, a aVar) {
        super(3);
        this.f365a = runnable;
        lazySet(0, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r8.get(r0)
            java.lang.Object r2 = f364e
            r3 = 0
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = f362c
            if (r1 == r4) goto L_0x0031
            java.lang.Object r5 = f363d
            if (r1 != r5) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            r6 = 2
            java.lang.Object r6 = r8.get(r6)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r6 == r7) goto L_0x0020
            r6 = r0
            goto L_0x0021
        L_0x0020:
            r6 = r3
        L_0x0021:
            if (r6 == 0) goto L_0x0024
            r4 = r5
        L_0x0024:
            boolean r0 = r8.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r6)
        L_0x0031:
            java.lang.Object r0 = r8.get(r3)
            if (r0 == r2) goto L_0x0049
            java.lang.Object r1 = f361b
            if (r0 == r1) goto L_0x0049
            if (r0 != 0) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            boolean r1 = r8.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            we.a r0 = (we.a) r0
            r0.b(r8)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: af.g.a():void");
    }

    public final void b(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f364e) {
                if (obj == f362c) {
                    future.cancel(false);
                    return;
                } else if (obj == f363d) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f363d;
        Object obj4 = f362c;
        Object obj5 = f361b;
        Object obj6 = f364e;
        lazySet(2, Thread.currentThread());
        try {
            this.f365a.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj7 = get(0);
            if (!(obj7 == obj5 || !compareAndSet(0, obj7, obj6) || obj7 == null)) {
                ((we.a) obj7).b(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3 || compareAndSet(1, obj2, obj6)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, obj6));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj8 = get(0);
        if (!(obj8 == obj5 || !compareAndSet(0, obj8, obj6) || obj8 == null)) {
            ((we.a) obj8).b(this);
        }
        do {
            obj = get(1);
            if (obj == obj4 || obj == obj3 || compareAndSet(1, obj, obj6)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, obj6));
    }
}

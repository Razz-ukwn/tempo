package ag;

import ff.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rf.l;

public final class k2 implements l<Throwable, m> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f430d = AtomicIntegerFieldUpdater.newUpdater(k2.class, "_state");
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final n1 f431a;

    /* renamed from: b  reason: collision with root package name */
    public final Thread f432b = Thread.currentThread();

    /* renamed from: c  reason: collision with root package name */
    public u0 f433c;

    public k2(n1 n1Var) {
        this.f431a = n1Var;
    }

    public static void b(int i8) {
        throw new IllegalStateException(("Illegal state " + i8).toString());
    }

    public final void a() {
        while (true) {
            int i8 = this._state;
            if (i8 != 0) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i8);
                        throw null;
                    }
                }
            } else if (f430d.compareAndSet(this, i8, 1)) {
                u0 u0Var = this.f433c;
                if (u0Var != null) {
                    u0Var.a();
                    return;
                }
                return;
            }
        }
    }

    public final void c() {
        int i8;
        this.f433c = this.f431a.Q(true, true, this);
        do {
            i8 = this._state;
            if (i8 != 0) {
                if (i8 != 2 && i8 != 3) {
                    b(i8);
                    throw null;
                }
                return;
            }
        } while (!f430d.compareAndSet(this, i8, 0));
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        while (true) {
            int i8 = this._state;
            if (i8 == 0) {
                if (f430d.compareAndSet(this, i8, 2)) {
                    this.f432b.interrupt();
                    this._state = 3;
                    break;
                }
            } else if (i8 != 1 && i8 != 2 && i8 != 3) {
                b(i8);
                throw null;
            }
        }
        return m.f8717a;
    }
}

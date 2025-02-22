package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.t;

public abstract class t<S extends t<S>> extends d<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10735d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f10736c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public t(long j10, S s10, int i8) {
        super(s10);
        this.f10736c = j10;
        this.cleanedAndPointers = i8 << 16;
    }

    public final boolean b() {
        return this.cleanedAndPointers == f() && !c();
    }

    public final boolean e() {
        return f10735d.addAndGet(this, -65536) == f() && !c();
    }

    public abstract int f();

    public final boolean g() {
        int i8;
        do {
            i8 = this.cleanedAndPointers;
            if (!(i8 != f() || c())) {
                return false;
            }
        } while (!f10735d.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}

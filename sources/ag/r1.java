package ag;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sf.j;

public abstract class r1 extends y implements u0, h1 {

    /* renamed from: d  reason: collision with root package name */
    public s1 f477d;

    public final void a() {
        boolean z10;
        s1 x10 = x();
        do {
            Object S = x10.S();
            if (S instanceof r1) {
                if (S == this) {
                    x0 x0Var = v1.C;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f482a;
                        if (!atomicReferenceFieldUpdater.compareAndSet(x10, S, x0Var)) {
                            if (atomicReferenceFieldUpdater.get(x10) != S) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((S instanceof h1) && ((h1) S).i() != null) {
                t();
                return;
            } else {
                return;
            }
        } while (!z10);
    }

    public final boolean c() {
        return true;
    }

    public final y1 i() {
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + i0.d(this) + "[job@" + i0.d(x()) + ']';
    }

    public final s1 x() {
        s1 s1Var = this.f477d;
        if (s1Var != null) {
            return s1Var;
        }
        j.l("job");
        throw null;
    }
}

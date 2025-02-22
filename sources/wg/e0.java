package wg;

import java.util.concurrent.atomic.AtomicReference;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f16754a = new d0(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f16755b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<d0>[] f16756c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16755b = highestOneBit;
        AtomicReference<d0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i8 = 0; i8 < highestOneBit; i8++) {
            atomicReferenceArr[i8] = new AtomicReference<>();
        }
        f16756c = atomicReferenceArr;
    }

    public static final void a(d0 d0Var) {
        AtomicReference<d0> atomicReference;
        d0 d0Var2;
        boolean z10 = true;
        if (!(d0Var.f16749f == null && d0Var.f16750g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!d0Var.f16747d && (d0Var2 = atomicReference.get()) != f16754a) {
            int i8 = d0Var2 != null ? d0Var2.f16746c : 0;
            if (i8 < 65536) {
                d0Var.f16749f = d0Var2;
                d0Var.f16745b = 0;
                d0Var.f16746c = i8 + 8192;
                while (true) {
                    if (!(atomicReference = f16756c[(int) (Thread.currentThread().getId() & (((long) f16755b) - 1))]).compareAndSet(d0Var2, d0Var)) {
                        if (atomicReference.get() != d0Var2) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z10) {
                    d0Var.f16749f = null;
                }
            }
        }
    }

    public static final d0 b() {
        AtomicReference<d0> atomicReference = f16756c[(int) (Thread.currentThread().getId() & (((long) f16755b) - 1))];
        d0 d0Var = f16754a;
        d0 andSet = atomicReference.getAndSet(d0Var);
        if (andSet == d0Var) {
            return new d0();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new d0();
        }
        atomicReference.set(andSet.f16749f);
        andSet.f16749f = null;
        andSet.f16746c = 0;
        return andSet;
    }
}

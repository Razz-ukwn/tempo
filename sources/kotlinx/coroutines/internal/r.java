package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.a;

public final class r<T> {
    private volatile AtomicReferenceArray<T> array;

    public r(int i8) {
        this.array = new AtomicReferenceArray<>(i8);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i8) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i8 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i8);
        }
        return null;
    }

    public final void c(int i8, a.C0200a aVar) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i8 < length) {
            atomicReferenceArray.set(i8, aVar);
            return;
        }
        int i10 = i8 + 1;
        int i11 = length * 2;
        if (i10 < i11) {
            i10 = i11;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i10);
        for (int i12 = 0; i12 < length; i12++) {
            atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
        }
        atomicReferenceArray2.set(i8, aVar);
        this.array = atomicReferenceArray2;
    }
}

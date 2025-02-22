package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.t;

public final class i extends t<i> {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f10805e = new AtomicReferenceArray(h.f10804f);

    public i(long j10, i iVar, int i8) {
        super(j10, iVar, i8);
    }

    public final int f() {
        return h.f10804f;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f10736c + ", hashCode=" + hashCode() + ']';
    }
}

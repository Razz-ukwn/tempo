package ag;

import kotlinx.coroutines.internal.s;
import lf.c;

public final class m2<U, T extends U> extends s<T> implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final long f444d;

    public m2(long j10, c cVar) {
        super(cVar, cVar.getContext());
        this.f444d = j10;
    }

    public final String h0() {
        return super.h0() + "(timeMillis=" + this.f444d + ')';
    }

    public final void run() {
        x(new l2("Timed out waiting for " + this.f444d + " ms", this));
    }
}

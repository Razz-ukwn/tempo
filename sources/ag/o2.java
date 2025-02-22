package ag;

import jf.f;

public final class o2 extends c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f470c = 0;

    static {
        new o2();
    }

    public final void F0(f fVar, Runnable runnable) {
        r2 r2Var = (r2) fVar.d(r2.f478c);
        if (r2Var != null) {
            r2Var.f479b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final c0 I0(int i8) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

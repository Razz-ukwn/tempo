package ag;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class w {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f503b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f504a;

    public w(Throwable th, boolean z10) {
        this.f504a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f504a + ']';
    }
}

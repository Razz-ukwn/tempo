package ag;

import ff.m;
import kotlinx.coroutines.internal.i;

public final class c2 extends e {

    /* renamed from: a  reason: collision with root package name */
    public final i f405a;

    public c2(i iVar) {
        this.f405a = iVar;
    }

    public final void a(Throwable th) {
        this.f405a.t();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return m.f8717a;
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.f405a + ']';
    }
}

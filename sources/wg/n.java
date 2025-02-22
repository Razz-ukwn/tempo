package wg;

import sf.j;

public abstract class n implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f16788a;

    public n(g0 g0Var) {
        j.f(g0Var, "delegate");
        this.f16788a = g0Var;
    }

    public void B(e eVar, long j10) {
        j.f(eVar, "source");
        this.f16788a.B(eVar, j10);
    }

    public final j0 b() {
        return this.f16788a.b();
    }

    public void close() {
        this.f16788a.close();
    }

    public void flush() {
        this.f16788a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16788a + ')';
    }
}

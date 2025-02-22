package wg;

import sf.j;

public abstract class o implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f16789a;

    public o(i0 i0Var) {
        j.f(i0Var, "delegate");
        this.f16789a = i0Var;
    }

    public long a0(e eVar, long j10) {
        j.f(eVar, "sink");
        return this.f16789a.a0(eVar, j10);
    }

    public final j0 b() {
        return this.f16789a.b();
    }

    public void close() {
        this.f16789a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16789a + ')';
    }
}

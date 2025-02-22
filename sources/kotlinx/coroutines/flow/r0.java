package kotlinx.coroutines.flow;

import ag.l;
import dg.b;
import dg.c;
import jf.d;

public final class r0 extends c<p0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f10631a = -1;

    /* renamed from: b  reason: collision with root package name */
    public l f10632b;

    public final boolean a(b bVar) {
        p0 p0Var = (p0) bVar;
        if (this.f10631a >= 0) {
            return false;
        }
        long j10 = p0Var.E;
        if (j10 < p0Var.F) {
            p0Var.F = j10;
        }
        this.f10631a = j10;
        return true;
    }

    public final d[] b(b bVar) {
        long j10 = this.f10631a;
        this.f10631a = -1;
        this.f10632b = null;
        return ((p0) bVar).w(j10);
    }
}

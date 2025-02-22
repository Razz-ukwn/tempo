package androidx.lifecycle;

import ag.g0;
import ag.n1;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import jf.f;
import sf.j;

public final class d implements Closeable, g0 {

    /* renamed from: a  reason: collision with root package name */
    public final f f2258a;

    public d(f fVar) {
        j.f(fVar, "context");
        this.f2258a = fVar;
    }

    public final void close() {
        n1 n1Var = (n1) this.f2258a.d(n1.b.f447a);
        if (n1Var != null) {
            n1Var.e((CancellationException) null);
        }
    }

    public final f f0() {
        return this.f2258a;
    }
}

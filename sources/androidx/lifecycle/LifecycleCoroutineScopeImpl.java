package androidx.lifecycle;

import ag.n1;
import androidx.lifecycle.j;
import java.util.concurrent.CancellationException;
import jf.f;
import sf.j;

public final class LifecycleCoroutineScopeImpl extends k implements n {

    /* renamed from: a  reason: collision with root package name */
    public final j f2186a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2187b;

    public LifecycleCoroutineScopeImpl(j jVar, f fVar) {
        n1 n1Var;
        j.f(fVar, "coroutineContext");
        this.f2186a = jVar;
        this.f2187b = fVar;
        if (jVar.b() == j.b.f2277a && (n1Var = (n1) fVar.d(n1.b.f447a)) != null) {
            n1Var.e((CancellationException) null);
        }
    }

    public final void d(p pVar, j.a aVar) {
        j jVar = this.f2186a;
        if (jVar.b().compareTo(j.b.f2277a) <= 0) {
            jVar.c(this);
            n1 n1Var = (n1) this.f2187b.d(n1.b.f447a);
            if (n1Var != null) {
                n1Var.e((CancellationException) null);
            }
        }
    }

    public final f f0() {
        return this.f2187b;
    }
}

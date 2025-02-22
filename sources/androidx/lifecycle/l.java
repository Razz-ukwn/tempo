package androidx.lifecycle;

import ag.g0;
import ag.n1;
import androidx.lifecycle.j;
import cb.b;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2290a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2291b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, d<? super l> dVar) {
        super(2, dVar);
        this.f2291b = lifecycleCoroutineScopeImpl;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        l lVar = new l(this.f2291b, dVar);
        lVar.f2290a = obj;
        return lVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        g0 g0Var = (g0) this.f2290a;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2291b;
        if (lifecycleCoroutineScopeImpl.f2186a.b().compareTo(j.b.f2278b) >= 0) {
            lifecycleCoroutineScopeImpl.f2186a.a(lifecycleCoroutineScopeImpl);
        } else {
            n1 n1Var = (n1) g0Var.f0().d(n1.b.f447a);
            if (n1Var != null) {
                n1Var.e((CancellationException) null);
            }
        }
        return m.f8717a;
    }
}

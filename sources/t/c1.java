package t;

import ag.f2;
import ag.g0;
import cb.b;
import d2.f1;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.e;
import rf.p;
import sf.j;

public final class c1 implements j2 {

    /* renamed from: a  reason: collision with root package name */
    public final p<g0, d<? super m>, Object> f14999a;

    /* renamed from: b  reason: collision with root package name */
    public final e f15000b;

    /* renamed from: c  reason: collision with root package name */
    public f2 f15001c;

    public c1(f fVar, p<? super g0, ? super d<? super m>, ? extends Object> pVar) {
        j.f(fVar, "parentCoroutineContext");
        this.f14999a = pVar;
        this.f15000b = f1.e(fVar);
    }

    public final void a() {
        f2 f2Var = this.f15001c;
        if (f2Var != null) {
            f2Var.e((CancellationException) null);
        }
        this.f15001c = null;
    }

    public final void b() {
        f2 f2Var = this.f15001c;
        if (f2Var != null) {
            f2Var.e((CancellationException) null);
        }
        this.f15001c = null;
    }

    public final void c() {
        f2 f2Var = this.f15001c;
        if (f2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause((Throwable) null);
            f2Var.e(cancellationException);
        }
        this.f15001c = b.D(this.f15000b, (f.b) null, 0, this.f14999a, 3);
    }
}

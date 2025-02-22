package ag;

import cb.b;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import jf.f;
import lf.e;
import lf.i;
import rf.a;
import rf.p;

@e(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
public final class j1 extends i implements p<g0, d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a<Object> f424b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1(a<Object> aVar, d<? super j1> dVar) {
        super(2, dVar);
        this.f424b = aVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j1 j1Var = new j1(this.f424b, dVar);
        j1Var.f423a = obj;
        return j1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        k2 k2Var;
        b.J(obj);
        f f02 = ((g0) this.f423a).f0();
        a<Object> aVar = this.f424b;
        try {
            k2Var = new k2(cb.d.G(f02));
            k2Var.c();
            Object d10 = aVar.d();
            k2Var.a();
            return d10;
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        } catch (Throwable th) {
            k2Var.a();
            throw th;
        }
    }
}

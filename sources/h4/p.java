package h4;

import ag.g0;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import cb.b;
import coil.request.ViewTargetRequestDelegate;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import lf.e;
import lf.i;

@e(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
public final class p extends i implements rf.p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f9221a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(q qVar, d<? super p> dVar) {
        super(2, dVar);
        this.f9221a = qVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p(this.f9221a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        q qVar = this.f9221a;
        ViewTargetRequestDelegate viewTargetRequestDelegate = qVar.f9224c;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f4046e.e((CancellationException) null);
            j4.b<?> bVar = viewTargetRequestDelegate.f4044c;
            boolean z10 = bVar instanceof o;
            j jVar = viewTargetRequestDelegate.f4045d;
            if (z10) {
                jVar.c((o) bVar);
            }
            jVar.c(viewTargetRequestDelegate);
        }
        qVar.f9224c = null;
        return m.f8717a;
    }
}

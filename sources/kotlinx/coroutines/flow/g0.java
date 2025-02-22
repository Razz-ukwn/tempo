package kotlinx.coroutines.flow;

import dg.l;
import dg.n;
import ff.m;
import jf.d;
import kf.a;
import rf.q;

public final class g0 implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10557a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10558b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f10559c;

    public g0(f fVar, y0 y0Var, q qVar) {
        this.f10557a = fVar;
        this.f10558b = y0Var;
        this.f10559c = qVar;
    }

    public final Object a(g<Object> gVar, d<? super m> dVar) {
        l lVar = new l((d) null, i0.f10571a, new h0(this.f10559c, (d<? super h0>) null), gVar, new f[]{this.f10557a, this.f10558b});
        n nVar = new n(dVar, dVar.getContext());
        Object h02 = cb.d.h0(nVar, nVar, lVar);
        a aVar = a.f10464a;
        if (h02 != aVar) {
            h02 = m.f8717a;
        }
        return h02 == aVar ? h02 : m.f8717a;
    }
}

package oe;

import ag.g0;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "droidninja.filepicker.viewmodels.BaseViewModel$launchDataLoad$1", f = "BaseViewModel.kt", l = {27}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public g0 f12313a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f12314b;

    /* renamed from: c  reason: collision with root package name */
    public int f12315c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f12316d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f12317e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, p pVar, d dVar) {
        super(2, dVar);
        this.f12316d = aVar;
        this.f12317e = pVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j.f(dVar, "completion");
        b bVar = new b(this.f12316d, this.f12317e, dVar);
        bVar.f12313a = (g0) obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12315c;
        if (i8 == 0) {
            cb.b.J(obj);
            g0 g0Var = this.f12313a;
            p pVar = this.f12317e;
            this.f12314b = g0Var;
            this.f12315c = 1;
            if (pVar.invoke(g0Var, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            try {
                cb.b.J(obj);
            } catch (Exception e10) {
                a aVar2 = this.f12316d;
                aVar2.getClass();
                e10.printStackTrace();
                if (!(e10 instanceof CancellationException)) {
                    aVar2.f12312g.k(e10);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}

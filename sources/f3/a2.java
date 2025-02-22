package f3;

import ag.s0;
import ag.x1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import androidx.recyclerview.widget.b;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.c;
import pd.j;
import rf.l;

public abstract class a2<T, VH extends RecyclerView.b0> extends RecyclerView.e<VH> {

    /* renamed from: d  reason: collision with root package name */
    public boolean f8070d;

    /* renamed from: e  reason: collision with root package name */
    public final f<T> f8071e;

    public a2(j.a aVar) {
        c cVar = s0.f480a;
        x1 x1Var = m.f10728a;
        c cVar2 = s0.f480a;
        sf.j.f(aVar, "diffCallback");
        sf.j.f(x1Var, "mainDispatcher");
        sf.j.f(cVar2, "workerDispatcher");
        this.f8071e = new f<>(aVar, new b(this), x1Var, cVar2);
        this.f2461c = 3;
        this.f2459a.g();
        j jVar = (j) this;
        o(new y1(jVar));
        q(new z1(jVar));
    }

    public static final void p(a2 a2Var) {
        if (a2Var.f2461c == 3 && !a2Var.f8070d) {
            a2Var.f8070d = true;
            a2Var.f2461c = 1;
            a2Var.f2459a.g();
        }
    }

    public final int d() {
        return this.f8071e.f8182f.f8167c.a();
    }

    public final long e(int i8) {
        return -1;
    }

    public final void q(l<? super t, ff.m> lVar) {
        f<T> fVar = this.f8071e;
        fVar.getClass();
        d dVar = fVar.f8182f;
        dVar.getClass();
        s0 s0Var = dVar.f8169e;
        s0Var.getClass();
        s0Var.f8472b.add(lVar);
        t tVar = !s0Var.f8471a ? null : new t(s0Var.f8473c, s0Var.f8474d, s0Var.f8475e, s0Var.f8476f, s0Var.f8477g);
        if (tVar != null) {
            lVar.invoke(tVar);
        }
    }
}

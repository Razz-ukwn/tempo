package f3;

import androidx.recyclerview.widget.RecyclerView;
import f3.m0;
import ff.m;
import pd.j;
import rf.l;

public final class z1 implements l<t, m> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8573a = true;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a2<Object, RecyclerView.b0> f8574b;

    public z1(j jVar) {
        this.f8574b = jVar;
    }

    public final Object invoke(Object obj) {
        t tVar = (t) obj;
        sf.j.f(tVar, "loadStates");
        if (this.f8573a) {
            this.f8573a = false;
        } else if (tVar.f8489d.f8382a instanceof m0.c) {
            a2<Object, RecyclerView.b0> a2Var = this.f8574b;
            a2.p(a2Var);
            f<T> fVar = a2Var.f8071e;
            fVar.getClass();
            d dVar = fVar.f8182f;
            dVar.getClass();
            s0 s0Var = dVar.f8169e;
            s0Var.getClass();
            s0Var.f8472b.remove(this);
        }
        return m.f8717a;
    }
}

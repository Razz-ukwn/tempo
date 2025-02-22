package b3;

import b3.b0;
import b3.f0;
import ff.m;
import java.util.Iterator;
import rf.l;
import sf.j;
import sf.k;

public final class p extends k implements l<g0, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f3154b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(z zVar, m mVar) {
        super(1);
        this.f3153a = zVar;
        this.f3154b = mVar;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        g0 g0Var = (g0) obj;
        j.f(g0Var, "$this$navOptions");
        n nVar = n.f3146a;
        j.f(nVar, "animBuilder");
        c cVar = new c();
        nVar.invoke(cVar);
        int i8 = cVar.f3033a;
        f0.a aVar = g0Var.f3060a;
        aVar.f3053a = i8;
        aVar.f3054b = cVar.f3034b;
        aVar.f3055c = cVar.f3035c;
        aVar.f3056d = cVar.f3036d;
        z zVar = this.f3153a;
        boolean z11 = zVar instanceof b0;
        m mVar = this.f3154b;
        boolean z12 = false;
        if (z11) {
            int i10 = z.F;
            j.f(zVar, "<this>");
            Iterator it = yf.k.o0(zVar, y.f3200a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                z zVar2 = (z) it.next();
                z g10 = mVar.g();
                if (j.a(zVar2, g10 != null ? g10.f3202b : null)) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z12 = true;
            }
        }
        if (z12) {
            int i11 = b0.K;
            int i12 = b0.a.a(mVar.i()).D;
            o oVar = o.f3150a;
            j.f(oVar, "popUpToBuilder");
            g0Var.f3062c = i12;
            q0 q0Var = new q0();
            oVar.invoke(q0Var);
            g0Var.f3063d = q0Var.f3165a;
        }
        return m.f8717a;
    }
}

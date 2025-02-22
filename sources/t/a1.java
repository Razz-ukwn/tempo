package t;

import ff.m;
import rf.l;
import sf.k;

public final class a1 extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b1 f14983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ag.k<m> f14984b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, ag.l lVar) {
        super(1);
        this.f14983a = b1Var;
        this.f14984b = lVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        b1 b1Var = this.f14983a;
        Object obj2 = b1Var.f14992a;
        ag.k<m> kVar = this.f14984b;
        synchronized (obj2) {
            b1Var.f14993b.remove(kVar);
        }
        return m.f8717a;
    }
}

package t;

import ff.m;
import rf.q;
import sf.j;
import sf.k;

public final class a0 extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n2 f14981a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14982b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(n2 n2Var, b bVar) {
        super(3);
        this.f14981a = n2Var;
        this.f14982b = bVar;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        p2 p2Var = (p2) obj2;
        j.f((c) obj, "<anonymous parameter 0>");
        j.f(p2Var, "slots");
        j.f((i2) obj3, "<anonymous parameter 2>");
        p2Var.e();
        b bVar = this.f14982b;
        bVar.getClass();
        n2 n2Var = this.f14981a;
        j.f(n2Var, "slots");
        p2Var.u(n2Var, n2Var.b(bVar));
        p2Var.j();
        return m.f8717a;
    }
}

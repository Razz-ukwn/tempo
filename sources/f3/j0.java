package f3;

import e9.c;
import f3.h0;
import ff.m;
import rf.p;
import sf.j;
import sf.k;

public final class j0 extends k implements p<h0.a, h0.a, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v2 f8283a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(v2 v2Var) {
        super(2);
        this.f8283a = v2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        h0.a aVar = (h0.a) obj;
        h0.a aVar2 = (h0.a) obj2;
        j.f(aVar, "prependHint");
        j.f(aVar2, "appendHint");
        v2 v2Var = aVar.f8260a;
        o0 o0Var = o0.f8398b;
        v2 v2Var2 = this.f8283a;
        if (c.l(v2Var2, v2Var, o0Var)) {
            aVar.f8260a = v2Var2;
            aVar.f8261b.h(v2Var2);
        }
        if (c.l(v2Var2, aVar2.f8260a, o0.f8399c)) {
            aVar2.f8260a = v2Var2;
            aVar2.f8261b.h(v2Var2);
        }
        return m.f8717a;
    }
}

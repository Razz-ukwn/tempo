package f3;

import f3.h0;
import ff.m;
import rf.p;
import sf.j;
import sf.k;

public final class i0 extends k implements p<h0.a, h0.a, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0 f8274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v2 f8275b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(o0 o0Var, v2 v2Var) {
        super(2);
        this.f8274a = o0Var;
        this.f8275b = v2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        h0.a aVar = (h0.a) obj;
        h0.a aVar2 = (h0.a) obj2;
        j.f(aVar, "prependHint");
        j.f(aVar2, "appendHint");
        o0 o0Var = o0.f8398b;
        o0 o0Var2 = this.f8274a;
        v2 v2Var = this.f8275b;
        if (o0Var2 == o0Var) {
            aVar.f8260a = v2Var;
            if (v2Var != null) {
                aVar.f8261b.h(v2Var);
            }
        } else {
            aVar2.f8260a = v2Var;
            if (v2Var != null) {
                aVar2.f8261b.h(v2Var);
            }
        }
        return m.f8717a;
    }
}

package dg;

import ag.n1;
import jf.f;
import kotlinx.coroutines.internal.s;
import rf.p;
import sf.k;

public final class t extends k implements p<Integer, f.b, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r<?> f7588a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(r<?> rVar) {
        super(2);
        this.f7588a = rVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        f.b bVar = (f.b) obj2;
        f.c key = bVar.getKey();
        f.b d10 = this.f7588a.f7582b.d(key);
        int i8 = n1.f446f;
        if (key != n1.b.f447a) {
            return Integer.valueOf(bVar != d10 ? Integer.MIN_VALUE : intValue + 1);
        }
        n1 n1Var = (n1) d10;
        n1 n1Var2 = (n1) bVar;
        while (true) {
            if (n1Var2 != null) {
                if (n1Var2 == n1Var || !(n1Var2 instanceof s)) {
                    break;
                }
                ag.p P = ((s) n1Var2).P();
                n1Var2 = P != null ? P.getParent() : null;
            } else {
                n1Var2 = null;
                break;
            }
        }
        if (n1Var2 == n1Var) {
            if (n1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + n1Var2 + ", expected child of " + n1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}

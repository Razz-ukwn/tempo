package x2;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import sf.j;

public final class b implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final d<?>[] f16913a;

    public b(d<?>... dVarArr) {
        j.f(dVarArr, "initializers");
        this.f16913a = dVarArr;
    }

    public final j0 b(Class cls, c cVar) {
        j0 j0Var = null;
        for (d<?> dVar : this.f16913a) {
            if (j.a(dVar.f16914a, cls)) {
                T invoke = dVar.f16915b.invoke(cVar);
                j0Var = invoke instanceof j0 ? (j0) invoke : null;
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}

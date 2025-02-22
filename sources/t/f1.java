package t;

import jf.f;
import sf.j;
import t.e1;

public final class f1 {
    public static final e1 a(f fVar) {
        j.f(fVar, "<this>");
        int i8 = e1.f15036z;
        e1 e1Var = (e1) fVar.d(e1.a.f15037a);
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}

package ag;

import cb.b;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.c;

public abstract class x1 extends c0 {
    public c0 I0(int i8) {
        b.r(1);
        return this;
    }

    public abstract x1 J0();

    public String toString() {
        String str;
        x1 x1Var;
        c cVar = s0.f480a;
        x1 x1Var2 = m.f10728a;
        if (this == x1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                x1Var = x1Var2.J0();
            } catch (UnsupportedOperationException unused) {
                x1Var = null;
            }
            str = this == x1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + i0.d(this);
    }
}

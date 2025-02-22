package cg;

import d2.f1;
import ff.m;
import jf.f;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import rf.l;

public final class y<E> extends x<E> {
    public final l<E, m> B;

    public y(Object obj, ag.l lVar, l lVar2) {
        super(obj, lVar);
        this.B = lVar2;
    }

    public final void A() {
        f context = this.f4039e.getContext();
        b0 a10 = o.a(this.B, this.f4038d, (b0) null);
        if (a10 != null) {
            f1.z(context, a10);
        }
    }

    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        A();
        return true;
    }
}

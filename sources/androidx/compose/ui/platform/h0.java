package androidx.compose.ui.platform;

import gc.b;
import rf.l;
import s0.a0;
import s0.p1;
import s0.q1;
import sf.j;
import sf.k;
import v0.i;

public final class h0 extends k implements l<a0, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f1294a = new h0();

    public h0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        a0 a0Var = (a0) obj;
        j.f(a0Var, "it");
        p1 n2 = b.n(a0Var);
        v0.j a10 = n2 != null ? q1.a(n2) : null;
        boolean z10 = true;
        if (!(a10 != null && a10.f16062b) || !a10.b(i.f16049g)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}

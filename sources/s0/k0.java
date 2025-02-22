package s0;

import f1.h;
import q0.a;
import q0.o;
import q0.q;
import q0.v;
import s0.f0;
import sf.j;

public abstract class k0 extends v implements q {
    public boolean B;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14379e;

    public static void Q(s0 s0Var) {
        d0 d0Var;
        j.f(s0Var, "<this>");
        s0 s0Var2 = s0Var.D;
        a0 a0Var = s0Var2 != null ? s0Var2.C : null;
        a0 a0Var2 = s0Var.C;
        if (!j.a(a0Var, a0Var2)) {
            a0Var2.W.f14344i.H.g();
            return;
        }
        b h3 = a0Var2.W.f14344i.h();
        if (h3 != null && (d0Var = ((f0.b) h3).H) != null) {
            d0Var.g();
        }
    }

    public abstract int H(a aVar);

    public final int I(a aVar) {
        int H;
        j.f(aVar, "alignmentLine");
        if (L() && (H = H(aVar)) != Integer.MIN_VALUE) {
            return h.a(B()) + H;
        }
        return Integer.MIN_VALUE;
    }

    public abstract k0 J();

    public abstract q0.h K();

    public abstract boolean L();

    public abstract a0 M();

    public abstract o N();

    public abstract k0 O();

    public abstract long P();

    public abstract void R();
}

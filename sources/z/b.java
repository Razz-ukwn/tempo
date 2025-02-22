package z;

import sf.j;
import sf.k;
import t.h;
import t.w1;
import t.y1;

public final class b {
    public static final int a(int i8, int i10) {
        return i8 << (((i10 % 10) * 3) + 1);
    }

    public static final a b(h hVar, int i8, k kVar) {
        a aVar;
        j.f(hVar, "composer");
        hVar.c(i8);
        Object d10 = hVar.d();
        if (d10 == h.a.f15061a) {
            aVar = new a(i8, true);
            hVar.n(aVar);
        } else {
            j.d(d10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            aVar = (a) d10;
        }
        aVar.g(kVar);
        hVar.o();
        return aVar;
    }

    public static final a c(int i8, k kVar, boolean z10) {
        j.f(kVar, "block");
        a aVar = new a(i8, z10);
        aVar.g(kVar);
        return aVar;
    }

    public static final boolean d(w1 w1Var, w1 w1Var2) {
        boolean z10;
        if (w1Var == null) {
            return true;
        }
        if ((w1Var instanceof y1) && (w1Var2 instanceof y1)) {
            y1 y1Var = (y1) w1Var;
            if (y1Var.f15284b != null) {
                t.b bVar = y1Var.f15285c;
                if (bVar != null ? bVar.a() : false) {
                    z10 = true;
                    if (!z10 || j.a(w1Var, w1Var2) || j.a(y1Var.f15285c, ((y1) w1Var2).f15285c)) {
                        return true;
                    }
                }
            }
            z10 = false;
            return true;
        }
        return false;
    }
}

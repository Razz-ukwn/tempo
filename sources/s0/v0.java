package s0;

import d0.g;
import f0.c;
import g0.d;
import g0.i;
import g0.n;
import g0.s;
import o0.t;
import q0.f;
import q0.r;
import q0.u;
import rf.l;
import sf.j;

public final class v0 {
    public static final void a(g.c cVar, int i8) {
        if (cVar.F) {
            boolean z10 = true;
            if (((cVar.f7178b & 2) != 0) && (cVar instanceof x)) {
                i.e((x) cVar).w();
                if (i8 == 2) {
                    s0 d10 = i.d(cVar, 2);
                    d10.F = true;
                    if (d10.U != null) {
                        s0.r0(d10, (l) null);
                    }
                }
            }
            if (((cVar.f7178b & 256) != 0) && (cVar instanceof p)) {
                i.e(cVar).w();
            }
            if (((cVar.f7178b & 4) != 0) && (cVar instanceof m)) {
                n.a((m) cVar);
            }
            if (((cVar.f7178b & 8) != 0) && (cVar instanceof p1)) {
                i.f((p1) cVar).p();
            }
            if (((cVar.f7178b & 64) != 0) && (cVar instanceof l1)) {
                f0 f0Var = i.e((l1) cVar).W;
                f0Var.f14344i.F = true;
                f0Var.getClass();
            }
            if (((cVar.f7178b & 1024) != 0) && (cVar instanceof s)) {
                if (i8 == 2) {
                    cVar.B();
                } else {
                    i.f(cVar).getFocusOwner().f((s) cVar);
                }
            }
            if (((cVar.f7178b & 2048) != 0) && (cVar instanceof n)) {
                ((n) cVar).x(f.f14335a);
            }
            if ((cVar.f7178b & 4096) == 0) {
                z10 = false;
            }
            if (z10 && (cVar instanceof d) && i8 != 2) {
                i.f(cVar).getFocusOwner().j((d) cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int b(g.b bVar) {
        j.f(bVar, "element");
        int i8 = bVar instanceof q0.j ? 3 : 1;
        if (bVar instanceof f) {
            i8 |= 512;
        }
        if (bVar instanceof c) {
            i8 |= 4;
        }
        if (bVar instanceof v0.l) {
            i8 |= 8;
        }
        if (bVar instanceof t) {
            i8 |= 16;
        }
        if ((bVar instanceof r0.d) || (bVar instanceof r0.g)) {
            i8 |= 32;
        }
        if (bVar instanceof g0.c) {
            i8 |= 4096;
        }
        if (bVar instanceof i) {
            i8 |= 2048;
        }
        if (bVar instanceof r) {
            i8 |= 256;
        }
        if (bVar instanceof u) {
            i8 |= 64;
        }
        return ((bVar instanceof q0.s) || (bVar instanceof q0.t) || (bVar instanceof q0.l)) ? i8 | 128 : i8;
    }

    public static final boolean c(int i8) {
        return (i8 & 128) != 0;
    }
}

package s0;

import f1.h;
import java.util.LinkedHashMap;
import q0.k;
import q0.m;
import q0.o;
import q0.v;
import rf.l;
import sf.j;

public abstract class l0 extends k0 implements m {
    public final s0 C;
    public long D = h.f8035b;
    public LinkedHashMap E;
    public final k F = new k(this);
    public o G;
    public final LinkedHashMap H = new LinkedHashMap();

    public l0(s0 s0Var) {
        j.f(s0Var, "coordinator");
        j.f((Object) null, "lookaheadScope");
        this.C = s0Var;
    }

    public static final void S(l0 l0Var, o oVar) {
        ff.m mVar;
        if (oVar != null) {
            l0Var.getClass();
            l0Var.F(b3.l0.a(oVar.b(), oVar.a()));
            mVar = ff.m.f8717a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            l0Var.F(0);
        }
        if (!j.a(l0Var.G, oVar) && oVar != null) {
            LinkedHashMap linkedHashMap = l0Var.E;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!oVar.c().isEmpty())) && !j.a(oVar.c(), l0Var.E)) {
                l0Var.C.C.W.getClass();
                j.c((Object) null);
                throw null;
            }
        }
        l0Var.G = oVar;
    }

    public final void D(long j10, float f10, l<? super i0.k, ff.m> lVar) {
        long j11 = this.D;
        int i8 = h.f8036c;
        if (!(j11 == j10)) {
            this.D = j10;
            s0 s0Var = this.C;
            s0Var.C.W.getClass();
            k0.Q(s0Var);
        }
        if (!this.f14379e) {
            T();
        }
    }

    public final k0 J() {
        s0 s0Var = this.C.D;
        if (s0Var != null) {
            return s0Var.M;
        }
        return null;
    }

    public final q0.h K() {
        return this.F;
    }

    public final boolean L() {
        return this.G != null;
    }

    public final a0 M() {
        return this.C.C;
    }

    public final o N() {
        o oVar = this.G;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    public final k0 O() {
        s0 s0Var = this.C.E;
        if (s0Var != null) {
            return s0Var.M;
        }
        return null;
    }

    public final long P() {
        return this.D;
    }

    public final void R() {
        D(this.D, 0.0f, (l<? super i0.k, ff.m>) null);
    }

    public void T() {
        v.a.C0251a aVar = v.a.f12813a;
        int b10 = N().b();
        f1.j jVar = this.C.C.K;
        q0.h hVar = v.a.f12816d;
        aVar.getClass();
        int i8 = v.a.f12815c;
        f1.j jVar2 = v.a.f12814b;
        v.a.f12815c = b10;
        v.a.f12814b = jVar;
        boolean g10 = v.a.C0251a.g(aVar, this);
        N().d();
        this.B = g10;
        v.a.f12815c = i8;
        v.a.f12814b = jVar2;
        v.a.f12816d = hVar;
    }

    public final float getDensity() {
        return this.C.getDensity();
    }

    public final f1.j getLayoutDirection() {
        return this.C.C.K;
    }

    public final float m() {
        return this.C.m();
    }
}

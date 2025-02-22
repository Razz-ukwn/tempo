package s0;

import androidx.fragment.app.z;
import b1.b;
import b3.l0;
import cb.d;
import d0.g;
import i0.f;
import k0.a;
import k0.c;
import k0.e;
import sf.j;

public final class e0 implements e, c {

    /* renamed from: a  reason: collision with root package name */
    public final a f14332a = new a();

    /* renamed from: b  reason: collision with root package name */
    public m f14333b;

    public final void a(long j10, long j11, long j12, float f10, int i8, b bVar, float f11, int i10) {
        this.f14332a.a(j10, j11, j12, f10, i8, bVar, f11, i10);
    }

    public final void b(f fVar, long j10, s0 s0Var, m mVar) {
        j.f(fVar, "canvas");
        j.f(s0Var, "coordinator");
        m mVar2 = this.f14333b;
        this.f14333b = mVar;
        f1.j jVar = s0Var.C.K;
        a aVar = this.f14332a;
        a.C0186a aVar2 = aVar.f10248a;
        f1.c cVar = aVar2.f10252a;
        f1.j jVar2 = aVar2.f10253b;
        f fVar2 = aVar2.f10254c;
        long j11 = aVar2.f10255d;
        aVar2.f10252a = s0Var;
        j.f(jVar, "<set-?>");
        aVar2.f10253b = jVar;
        aVar2.f10254c = fVar;
        aVar2.f10255d = j10;
        fVar.c();
        mVar.b(this);
        fVar.l();
        a.C0186a aVar3 = aVar.f10248a;
        aVar3.getClass();
        j.f(cVar, "<set-?>");
        aVar3.f10252a = cVar;
        j.f(jVar2, "<set-?>");
        aVar3.f10253b = jVar2;
        j.f(fVar2, "<set-?>");
        aVar3.f10254c = fVar2;
        aVar3.f10255d = j11;
        this.f14333b = mVar2;
    }

    public final float getDensity() {
        return this.f14332a.getDensity();
    }

    public final float m() {
        return this.f14332a.m();
    }

    public final float n(float f10) {
        return this.f14332a.getDensity() * f10;
    }

    public final a.b p() {
        return this.f14332a.f10249b;
    }

    public final long q() {
        return this.f14332a.q();
    }

    public final int r(float f10) {
        return this.f14332a.r(f10);
    }

    public final long u() {
        return this.f14332a.u();
    }

    public final void v(long j10, float f10, float f11, long j11, long j12, float f12, z zVar, int i8) {
        z zVar2 = zVar;
        j.f(zVar2, "style");
        this.f14332a.v(j10, f10, f11, j11, j12, f12, zVar2, i8);
    }

    public final long w(long j10) {
        return this.f14332a.w(j10);
    }

    public final float x(long j10) {
        return this.f14332a.x(j10);
    }

    public final void z() {
        m mVar;
        f a10 = this.f14332a.f10249b.a();
        m mVar2 = this.f14333b;
        j.c(mVar2);
        g.c cVar = mVar2.s().f7181e;
        if (cVar != null && (cVar.f7179c & 4) != 0) {
            while (true) {
                if (cVar == null) {
                    break;
                }
                int i8 = cVar.f7178b;
                if ((i8 & 2) != 0) {
                    break;
                } else if ((i8 & 4) != 0) {
                    mVar = (m) cVar;
                    break;
                } else {
                    cVar = cVar.f7181e;
                }
            }
        }
        mVar = null;
        m mVar3 = mVar;
        if (mVar3 != null) {
            j.f(a10, "canvas");
            s0 d10 = i.d(mVar3, 4);
            long e10 = l0.e(d10.f12811c);
            a0 a0Var = d10.C;
            a0Var.getClass();
            d.d0(a0Var).getSharedDrawScope().b(a10, e10, d10, mVar3);
            return;
        }
        s0 d11 = i.d(mVar2, 4);
        if (d11.e0() == mVar2) {
            d11 = d11.D;
            j.c(d11);
        }
        d11.v0(a10);
    }
}

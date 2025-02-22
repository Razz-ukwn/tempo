package g0;

import d0.g;
import ff.m;
import r0.f;
import s0.a0;
import s0.i;
import s0.p0;
import s0.w0;
import s0.x0;
import sf.j;
import sf.k;
import sf.v;

public final class s extends g.c implements w0, f {
    public r G = r.f8780d;

    public static final class a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v<l> f8782a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s f8783b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v<l> vVar, s sVar) {
            super(0);
            this.f8782a = vVar;
            this.f8783b = sVar;
        }

        public final Object d() {
            this.f8782a.f14957a = this.f8783b.C();
            return m.f8717a;
        }
    }

    public final void B() {
        r rVar = this.G;
        if (rVar == r.f8777a || rVar == r.f8779c) {
            i.f(this).getFocusOwner().k(true);
            return;
        }
        r rVar2 = r.f8778b;
        r rVar3 = r.f8780d;
        if (rVar == rVar2) {
            E();
            this.G = rVar3;
        } else if (rVar == rVar3) {
            E();
        }
    }

    public final m C() {
        p0 p0Var;
        m mVar = new m();
        g.c cVar = this.f7177a;
        if (cVar.F) {
            g.c cVar2 = cVar.f7180d;
            a0 e10 = i.e(this);
            while (e10 != null) {
                if ((e10.V.f14404e.f7179c & 3072) != 0) {
                    while (cVar2 != null) {
                        int i8 = cVar2.f7178b;
                        if ((i8 & 3072) != 0) {
                            if ((i8 & 1024) != 0) {
                                return mVar;
                            }
                            if (cVar2 instanceof n) {
                                ((n) cVar2).x(mVar);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                        cVar2 = cVar2.f7180d;
                    }
                }
                e10 = e10.q();
                cVar2 = (e10 == null || (p0Var = e10.V) == null) ? null : p0Var.f14403d;
            }
            return mVar;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void D() {
        r rVar = this.G;
        if (rVar == r.f8777a || rVar == r.f8779c) {
            v vVar = new v();
            x0.a(this, new a(vVar, this));
            T t2 = vVar.f14957a;
            if (t2 == null) {
                j.l("focusProperties");
                throw null;
            } else if (!((l) t2).a()) {
                i.f(this).getFocusOwner().k(true);
            }
        }
    }

    public final void E() {
        p0 p0Var;
        g.c cVar = this.f7177a;
        if (cVar.F) {
            g.c cVar2 = cVar.f7180d;
            a0 e10 = i.e(this);
            while (e10 != null) {
                if ((e10.V.f14404e.f7179c & 5120) != 0) {
                    while (cVar2 != null) {
                        int i8 = cVar2.f7178b;
                        if ((i8 & 5120) != 0) {
                            if ((i8 & 1024) != 0) {
                                continue;
                            } else if (cVar2 instanceof d) {
                                i.f(this).getFocusOwner().j((d) cVar2);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                        cVar2 = cVar2.f7180d;
                    }
                }
                e10 = e10.q();
                cVar2 = (e10 == null || (p0Var = e10.V) == null) ? null : p0Var.f14403d;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void u() {
        r rVar = this.G;
        D();
        if (!j.a(rVar, this.G)) {
            e.b(this);
        }
    }
}

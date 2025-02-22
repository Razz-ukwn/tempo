package f3;

import f3.m0;
import ff.e;
import sf.j;

public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e2<Object> f8124a;

    public d2(e2<Object> e2Var) {
        this.f8124a = e2Var;
    }

    public final void a(int i8, int i10) {
        this.f8124a.f8165a.a(i8, i10);
    }

    public final void b(o0 o0Var) {
        m0 m0Var;
        m0.c cVar = m0.c.f8367c;
        e2<Object> e2Var = this.f8124a;
        s0 s0Var = e2Var.f8169e;
        s0Var.getClass();
        n0 n0Var = s0Var.f8476f;
        if (n0Var == null) {
            m0Var = null;
        } else {
            int ordinal = o0Var.ordinal();
            if (ordinal == 0) {
                m0Var = n0Var.f8382a;
            } else if (ordinal == 1) {
                m0Var = n0Var.f8383b;
            } else if (ordinal == 2) {
                m0Var = n0Var.f8384c;
            } else {
                throw new e();
            }
        }
        if (!j.a(m0Var, cVar)) {
            s0 s0Var2 = e2Var.f8169e;
            s0Var2.getClass();
            s0Var2.f8471a = true;
            n0 n0Var2 = s0Var2.f8476f;
            n0 b10 = n0Var2.b(o0Var);
            s0Var2.f8476f = b10;
            j.a(b10, n0Var2);
            s0Var2.b();
        }
    }
}

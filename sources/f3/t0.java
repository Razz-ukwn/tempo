package f3;

import f3.m0;
import ff.e;
import sf.j;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public m0 f8491a;

    /* renamed from: b  reason: collision with root package name */
    public m0 f8492b;

    /* renamed from: c  reason: collision with root package name */
    public m0 f8493c;

    public t0() {
        m0.c cVar = m0.c.f8367c;
        this.f8491a = cVar;
        this.f8492b = cVar;
        this.f8493c = cVar;
    }

    public final m0 a(o0 o0Var) {
        j.f(o0Var, "loadType");
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            return this.f8491a;
        }
        if (ordinal == 1) {
            return this.f8492b;
        }
        if (ordinal == 2) {
            return this.f8493c;
        }
        throw new e();
    }

    public final void b(n0 n0Var) {
        j.f(n0Var, "states");
        this.f8491a = n0Var.f8382a;
        this.f8493c = n0Var.f8384c;
        this.f8492b = n0Var.f8383b;
    }

    public final void c(o0 o0Var, m0 m0Var) {
        j.f(o0Var, "type");
        j.f(m0Var, "state");
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            this.f8491a = m0Var;
        } else if (ordinal == 1) {
            this.f8492b = m0Var;
        } else if (ordinal == 2) {
            this.f8493c = m0Var;
        } else {
            throw new e();
        }
    }

    public final n0 d() {
        return new n0(this.f8491a, this.f8492b, this.f8493c);
    }
}

package f3;

import f3.m0;
import ff.e;
import sf.j;

public final class n0 {

    /* renamed from: d  reason: collision with root package name */
    public static final n0 f8381d;

    /* renamed from: a  reason: collision with root package name */
    public final m0 f8382a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f8383b;

    /* renamed from: c  reason: collision with root package name */
    public final m0 f8384c;

    static {
        m0.c cVar = m0.c.f8367c;
        f8381d = new n0(cVar, cVar, cVar);
    }

    public n0(m0 m0Var, m0 m0Var2, m0 m0Var3) {
        j.f(m0Var, "refresh");
        j.f(m0Var2, "prepend");
        j.f(m0Var3, "append");
        this.f8382a = m0Var;
        this.f8383b = m0Var2;
        this.f8384c = m0Var3;
    }

    public static n0 a(n0 n0Var, m0.c cVar, m0.c cVar2, m0.c cVar3, int i8) {
        m0 m0Var = cVar;
        if ((i8 & 1) != 0) {
            m0Var = n0Var.f8382a;
        }
        m0 m0Var2 = cVar2;
        if ((i8 & 2) != 0) {
            m0Var2 = n0Var.f8383b;
        }
        m0 m0Var3 = cVar3;
        if ((i8 & 4) != 0) {
            m0Var3 = n0Var.f8384c;
        }
        n0Var.getClass();
        j.f(m0Var, "refresh");
        j.f(m0Var2, "prepend");
        j.f(m0Var3, "append");
        return new n0(m0Var, m0Var2, m0Var3);
    }

    public final n0 b(o0 o0Var) {
        m0.c cVar = m0.c.f8367c;
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            return a(this, cVar, (m0.c) null, (m0.c) null, 6);
        }
        if (ordinal == 1) {
            return a(this, (m0.c) null, cVar, (m0.c) null, 5);
        }
        if (ordinal == 2) {
            return a(this, (m0.c) null, (m0.c) null, cVar, 3);
        }
        throw new e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return j.a(this.f8382a, n0Var.f8382a) && j.a(this.f8383b, n0Var.f8383b) && j.a(this.f8384c, n0Var.f8384c);
    }

    public final int hashCode() {
        int hashCode = this.f8383b.hashCode();
        return this.f8384c.hashCode() + ((hashCode + (this.f8382a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f8382a + ", prepend=" + this.f8383b + ", append=" + this.f8384c + ')';
    }
}

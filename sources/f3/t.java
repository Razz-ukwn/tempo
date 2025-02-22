package f3;

import sf.j;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f8486a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f8487b;

    /* renamed from: c  reason: collision with root package name */
    public final m0 f8488c;

    /* renamed from: d  reason: collision with root package name */
    public final n0 f8489d;

    /* renamed from: e  reason: collision with root package name */
    public final n0 f8490e;

    public t(m0 m0Var, m0 m0Var2, m0 m0Var3, n0 n0Var, n0 n0Var2) {
        j.f(m0Var, "refresh");
        j.f(m0Var2, "prepend");
        j.f(m0Var3, "append");
        j.f(n0Var, "source");
        this.f8486a = m0Var;
        this.f8487b = m0Var2;
        this.f8488c = m0Var3;
        this.f8489d = n0Var;
        this.f8490e = n0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.a(t.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            t tVar = (t) obj;
            return j.a(this.f8486a, tVar.f8486a) && j.a(this.f8487b, tVar.f8487b) && j.a(this.f8488c, tVar.f8488c) && j.a(this.f8489d, tVar.f8489d) && j.a(this.f8490e, tVar.f8490e);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
    }

    public final int hashCode() {
        int hashCode = this.f8487b.hashCode();
        int hashCode2 = (this.f8489d.hashCode() + ((this.f8488c.hashCode() + ((hashCode + (this.f8486a.hashCode() * 31)) * 31)) * 31)) * 31;
        n0 n0Var = this.f8490e;
        return hashCode2 + (n0Var == null ? 0 : n0Var.hashCode());
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f8486a + ", prepend=" + this.f8487b + ", append=" + this.f8488c + ", source=" + this.f8489d + ", mediator=" + this.f8490e + ')';
    }
}

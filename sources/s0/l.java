package s0;

import b7.a;
import sf.j;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final r1<a0> f14384a = new r1<>(new j());

    public l() {
        a.w(k.f14378a);
    }

    public final void a(a0 a0Var) {
        j.f(a0Var, "node");
        if (a0Var.y()) {
            this.f14384a.add(a0Var);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(a0 a0Var) {
        j.f(a0Var, "node");
        if (a0Var.y()) {
            return this.f14384a.remove(a0Var);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        String obj = this.f14384a.toString();
        j.e(obj, "set.toString()");
        return obj;
    }
}

package s0;

import d0.g;
import ff.m;
import rf.a;
import sf.j;

public final class x0 {
    public static final <T extends g.c & w0> void a(T t2, a<m> aVar) {
        j.f(t2, "<this>");
        o0 o0Var = t2.B;
        if (o0Var == null) {
            o0Var = new o0((w0) t2);
            t2.B = o0Var;
        }
        i.f(t2).getSnapshotObserver().a(o0Var, o0.f14397b, aVar);
    }
}

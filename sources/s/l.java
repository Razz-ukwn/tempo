package s;

import ff.m;
import gf.t;
import java.util.List;
import q0.n;
import q0.o;
import q0.q;
import q0.v;
import sf.j;
import sf.k;

public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final l f14294a = new l();

    public static final class a extends k implements rf.l<v.a, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14295a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((v.a) obj, "$this$layout");
            return m.f8717a;
        }
    }

    public final o a(q qVar, List<? extends q0.m> list, long j10) {
        j.f(qVar, "$this$measure");
        boolean z10 = true;
        int i8 = 0;
        int b10 = f1.a.b(j10) == f1.a.d(j10) ? f1.a.b(j10) : 0;
        if (f1.a.a(j10) != f1.a.c(j10)) {
            z10 = false;
        }
        if (z10) {
            i8 = f1.a.a(j10);
        }
        return qVar.g(b10, i8, t.f8979a, a.f14295a);
    }
}

package q7;

import android.os.Bundle;
import java.util.Iterator;
import o.a;

public final class z0 extends a2 {

    /* renamed from: b  reason: collision with root package name */
    public final a f13456b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final a f13457c = new a();

    /* renamed from: d  reason: collision with root package name */
    public long f13458d;

    public z0(x3 x3Var) {
        super(x3Var);
    }

    public final void j(String str, long j10) {
        k4 k4Var = this.f13121a;
        if (str == null || str.length() == 0) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.B.b("Ad unit id must be a non-empty string");
            return;
        }
        w3 w3Var = ((x3) k4Var).F;
        x3.l(w3Var);
        w3Var.q(new a(this, str, j10));
    }

    public final void k(String str, long j10) {
        k4 k4Var = this.f13121a;
        if (str == null || str.length() == 0) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.B.b("Ad unit id must be a non-empty string");
            return;
        }
        w3 w3Var = ((x3) k4Var).F;
        x3.l(w3Var);
        w3Var.q(new v(this, str, j10));
    }

    public final void l(long j10) {
        j5 j5Var = ((x3) this.f13121a).K;
        x3.k(j5Var);
        f5 o10 = j5Var.o(false);
        a aVar = this.f13456b;
        Iterator it = ((a.c) aVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n(str, j10 - ((Long) aVar.getOrDefault(str, null)).longValue(), o10);
        }
        if (!aVar.isEmpty()) {
            m(j10 - this.f13458d, o10);
        }
        o(j10);
    }

    public final void m(long j10, f5 f5Var) {
        k4 k4Var = this.f13121a;
        if (f5Var == null) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.J.b("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.J.c(Long.valueOf(j10), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            a7.v(f5Var, bundle, true);
            a5 a5Var = ((x3) k4Var).L;
            x3.k(a5Var);
            a5Var.p("am", "_xa", bundle);
        }
    }

    public final void n(String str, long j10, f5 f5Var) {
        k4 k4Var = this.f13121a;
        if (f5Var == null) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.J.b("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.J.c(Long.valueOf(j10), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            a7.v(f5Var, bundle, true);
            a5 a5Var = ((x3) k4Var).L;
            x3.k(a5Var);
            a5Var.p("am", "_xu", bundle);
        }
    }

    public final void o(long j10) {
        a aVar = this.f13456b;
        Iterator it = ((a.c) aVar.keySet()).iterator();
        while (it.hasNext()) {
            aVar.put((String) it.next(), Long.valueOf(j10));
        }
        if (!aVar.isEmpty()) {
            this.f13458d = j10;
        }
    }
}

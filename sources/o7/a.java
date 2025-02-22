package o7;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import q2.d;
import q7.a5;
import q7.a7;
import q7.f5;
import q7.j5;
import q7.s2;
import q7.u4;
import q7.v4;
import q7.w3;
import q7.w6;
import q7.x3;
import q7.z0;
import u6.q;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final x3 f12201a;

    /* renamed from: b  reason: collision with root package name */
    public final a5 f12202b;

    public a(x3 x3Var) {
        q.i(x3Var);
        this.f12201a = x3Var;
        a5 a5Var = x3Var.L;
        x3.k(a5Var);
        this.f12202b = a5Var;
    }

    public final List a(String str, String str2) {
        a5 a5Var = this.f12202b;
        x3 x3Var = (x3) a5Var.f13121a;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        boolean s10 = w3Var.s();
        s2 s2Var = x3Var.E;
        if (s10) {
            x3.l(s2Var);
            s2Var.B.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (d.c()) {
            x3.l(s2Var);
            s2Var.B.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            w3 w3Var2 = x3Var.F;
            x3.l(w3Var2);
            w3Var2.n(atomicReference, 5000, "get conditional user properties", new u4(a5Var, atomicReference, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return a7.s(list);
            }
            x3.l(s2Var);
            s2Var.B.c((Object) null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
    }

    public final Map b(String str, String str2, boolean z10) {
        a5 a5Var = this.f12202b;
        x3 x3Var = (x3) a5Var.f13121a;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        boolean s10 = w3Var.s();
        s2 s2Var = x3Var.E;
        if (s10) {
            x3.l(s2Var);
            s2Var.B.b("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (d.c()) {
            x3.l(s2Var);
            s2Var.B.b("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            w3 w3Var2 = x3Var.F;
            x3.l(w3Var2);
            w3Var2.n(atomicReference, 5000, "get user properties", new v4(a5Var, atomicReference, str, str2, z10));
            List<w6> list = (List) atomicReference.get();
            if (list == null) {
                x3.l(s2Var);
                s2Var.B.c(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
                return Collections.emptyMap();
            }
            o.a aVar = new o.a(list.size());
            for (w6 w6Var : list) {
                Object w10 = w6Var.w();
                if (w10 != null) {
                    aVar.put(w6Var.f13410b, w10);
                }
            }
            return aVar;
        }
    }

    public final void c(Bundle bundle) {
        a5 a5Var = this.f12202b;
        ((x3) a5Var.f13121a).J.getClass();
        a5Var.t(bundle, System.currentTimeMillis());
    }

    public final void d(String str, String str2, Bundle bundle) {
        a5 a5Var = this.f12202b;
        ((x3) a5Var.f13121a).J.getClass();
        a5Var.o(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void e(String str) {
        x3 x3Var = this.f12201a;
        z0 n2 = x3Var.n();
        x3Var.J.getClass();
        n2.j(str, SystemClock.elapsedRealtime());
    }

    public final void f(String str, String str2, Bundle bundle) {
        a5 a5Var = this.f12201a.L;
        x3.k(a5Var);
        a5Var.m(str, str2, bundle);
    }

    public final void g(String str) {
        x3 x3Var = this.f12201a;
        z0 n2 = x3Var.n();
        x3Var.J.getClass();
        n2.k(str, SystemClock.elapsedRealtime());
    }

    public final int zza(String str) {
        a5 a5Var = this.f12202b;
        a5Var.getClass();
        q.f(str);
        ((x3) a5Var.f13121a).getClass();
        return 25;
    }

    public final long zzb() {
        a7 a7Var = this.f12201a.H;
        x3.j(a7Var);
        return a7Var.m0();
    }

    public final String zzh() {
        return this.f12202b.B();
    }

    public final String zzi() {
        j5 j5Var = ((x3) this.f12202b.f13121a).K;
        x3.k(j5Var);
        f5 f5Var = j5Var.f13138c;
        if (f5Var != null) {
            return f5Var.f13001b;
        }
        return null;
    }

    public final String zzj() {
        j5 j5Var = ((x3) this.f12202b.f13121a).K;
        x3.k(j5Var);
        f5 f5Var = j5Var.f13138c;
        if (f5Var != null) {
            return f5Var.f13000a;
        }
        return null;
    }

    public final String zzk() {
        return this.f12202b.B();
    }
}

package q7;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ja;
import com.google.android.gms.internal.measurement.ka;
import com.google.android.gms.internal.measurement.kc;

public final class h6 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i6 f13109a;

    public h6(i6 i6Var) {
        this.f13109a = i6Var;
    }

    public final void a() {
        i6 i6Var = this.f13109a;
        i6Var.i();
        k4 k4Var = i6Var.f13121a;
        g3 g3Var = ((x3) k4Var).D;
        x3.j(g3Var);
        ((x3) k4Var).J.getClass();
        if (g3Var.s(System.currentTimeMillis())) {
            g3 g3Var2 = ((x3) k4Var).D;
            x3.j(g3Var2);
            g3Var2.G.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.J.b("Detected application was in foreground");
                ((x3) k4Var).J.getClass();
                c(false, System.currentTimeMillis());
            }
        }
    }

    public final void b(boolean z10, long j10) {
        i6 i6Var = this.f13109a;
        i6Var.i();
        i6Var.m();
        k4 k4Var = i6Var.f13121a;
        g3 g3Var = ((x3) k4Var).D;
        x3.j(g3Var);
        if (g3Var.s(j10)) {
            g3 g3Var2 = ((x3) k4Var).D;
            x3.j(g3Var2);
            g3Var2.G.a(true);
            kc.b();
            if (((x3) k4Var).C.r((String) null, g2.f13043k0)) {
                ((x3) k4Var).q().p();
            }
        }
        g3 g3Var3 = ((x3) k4Var).D;
        x3.j(g3Var3);
        g3Var3.J.b(j10);
        g3 g3Var4 = ((x3) k4Var).D;
        x3.j(g3Var4);
        if (g3Var4.G.b()) {
            c(z10, j10);
        }
    }

    public final void c(boolean z10, long j10) {
        i6 i6Var = this.f13109a;
        i6Var.i();
        k4 k4Var = i6Var.f13121a;
        if (((x3) k4Var).g()) {
            g3 g3Var = ((x3) k4Var).D;
            x3.j(g3Var);
            g3Var.J.b(j10);
            ((x3) k4Var).J.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.J.c(Long.valueOf(elapsedRealtime), "Session started, time");
            Long valueOf = Long.valueOf(j10 / 1000);
            a5 a5Var = ((x3) k4Var).L;
            x3.k(a5Var);
            a5Var.y(j10, valueOf, "auto", "_sid");
            g3 g3Var2 = ((x3) k4Var).D;
            x3.j(g3Var2);
            g3Var2.K.b(valueOf.longValue());
            g3 g3Var3 = ((x3) k4Var).D;
            x3.j(g3Var3);
            g3Var3.G.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (((x3) k4Var).C.r((String) null, g2.f13025b0) && z10) {
                bundle.putLong("_aib", 1);
            }
            a5 a5Var2 = ((x3) k4Var).L;
            x3.k(a5Var2);
            a5Var2.q(j10, bundle, "auto", "_s");
            ((ka) ja.f5342b.f5343a.zza()).zza();
            if (((x3) k4Var).C.r((String) null, g2.f13031e0)) {
                g3 g3Var4 = ((x3) k4Var).D;
                x3.j(g3Var4);
                String a10 = g3Var4.P.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    a5 a5Var3 = ((x3) k4Var).L;
                    x3.k(a5Var3);
                    a5Var3.q(j10, bundle2, "auto", "_ssr");
                }
            }
        }
    }
}

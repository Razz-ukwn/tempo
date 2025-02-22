package q7;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.wa;
import com.google.android.gms.internal.measurement.xa;

public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    public long f13085a;

    /* renamed from: b  reason: collision with root package name */
    public long f13086b;

    /* renamed from: c  reason: collision with root package name */
    public final f6 f13087c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i6 f13088d;

    public g6(i6 i6Var) {
        this.f13088d = i6Var;
        this.f13087c = new f6(this, (x3) i6Var.f13121a);
        ((x3) i6Var.f13121a).J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f13085a = elapsedRealtime;
        this.f13086b = elapsedRealtime;
    }

    public final boolean a(boolean z10, boolean z11, long j10) {
        i6 i6Var = this.f13088d;
        i6Var.i();
        i6Var.j();
        ((xa) wa.f5574b.f5575a.zza()).zza();
        k4 k4Var = i6Var.f13121a;
        if (!((x3) k4Var).C.r((String) null, g2.f13033f0)) {
            g3 g3Var = ((x3) k4Var).D;
            x3.j(g3Var);
            ((x3) k4Var).J.getClass();
            g3Var.J.b(System.currentTimeMillis());
        } else if (((x3) k4Var).g()) {
            g3 g3Var2 = ((x3) k4Var).D;
            x3.j(g3Var2);
            ((x3) k4Var).J.getClass();
            g3Var2.J.b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f13085a;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = j10 - this.f13086b;
                this.f13086b = j10;
            }
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.J.c(Long.valueOf(j11), "Recording user engagement, ms");
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            j5 j5Var = ((x3) k4Var).K;
            x3.k(j5Var);
            a7.v(j5Var.o(!((x3) k4Var).C.s()), bundle, true);
            if (!z11) {
                a5 a5Var = ((x3) k4Var).L;
                x3.k(a5Var);
                a5Var.p("auto", "_e", bundle);
            }
            this.f13085a = j10;
            f6 f6Var = this.f13087c;
            f6Var.a();
            f6Var.c(3600000);
            return true;
        }
        s2 s2Var2 = ((x3) k4Var).E;
        x3.l(s2Var2);
        s2Var2.J.c(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
        return false;
    }
}

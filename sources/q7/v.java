package q7;

import o.a;
import u6.q;

public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13370a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f13371b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z0 f13372c;

    public v(z0 z0Var, String str, long j10) {
        this.f13372c = z0Var;
        this.f13370a = str;
        this.f13371b = j10;
    }

    public final void run() {
        z0 z0Var = this.f13372c;
        z0Var.i();
        String str = this.f13370a;
        q.f(str);
        a aVar = z0Var.f13457c;
        Integer num = (Integer) aVar.getOrDefault(str, null);
        k4 k4Var = z0Var.f13121a;
        if (num != null) {
            x3 x3Var = (x3) k4Var;
            j5 j5Var = x3Var.K;
            x3.k(j5Var);
            f5 o10 = j5Var.o(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.remove(str);
                a aVar2 = z0Var.f13456b;
                Long l10 = (Long) aVar2.getOrDefault(str, null);
                s2 s2Var = x3Var.E;
                long j10 = this.f13371b;
                if (l10 == null) {
                    x3.l(s2Var);
                    s2Var.B.b("First ad unit exposure time was never set");
                } else {
                    aVar2.remove(str);
                    z0Var.n(str, j10 - l10.longValue(), o10);
                }
                if (aVar.isEmpty()) {
                    long j11 = z0Var.f13458d;
                    if (j11 == 0) {
                        x3.l(s2Var);
                        s2Var.B.b("First ad exposure time was never set");
                        return;
                    }
                    z0Var.m(j10 - j11, o10);
                    z0Var.f13458d = 0;
                    return;
                }
                return;
            }
            aVar.put(str, Integer.valueOf(intValue));
            return;
        }
        s2 s2Var2 = ((x3) k4Var).E;
        x3.l(s2Var2);
        s2Var2.B.c(str, "Call to endAdUnitExposure for unknown ad unit id");
    }
}

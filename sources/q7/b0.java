package q7;

public final class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f12911b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a2 f12912c;

    public /* synthetic */ b0(a2 a2Var, long j10, int i8) {
        this.f12910a = i8;
        this.f12912c = a2Var;
        this.f12911b = j10;
    }

    public final void run() {
        int i8 = this.f12910a;
        long j10 = this.f12911b;
        a2 a2Var = this.f12912c;
        switch (i8) {
            case 0:
                ((z0) a2Var).o(j10);
                return;
            default:
                a5 a5Var = (a5) a2Var;
                g3 g3Var = ((x3) a5Var.f13121a).D;
                x3.j(g3Var);
                g3Var.F.b(j10);
                s2 s2Var = ((x3) a5Var.f13121a).E;
                x3.l(s2Var);
                s2Var.I.c(Long.valueOf(j10), "Session timeout duration set");
                return;
        }
    }
}

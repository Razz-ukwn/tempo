package q7;

public final class p5 extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x5 f13274e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p5(x5 x5Var, k4 k4Var) {
        super(k4Var);
        this.f13274e = x5Var;
    }

    public final void b() {
        x5 x5Var = this.f13274e;
        x5Var.i();
        if (x5Var.o()) {
            s2 s2Var = ((x3) x5Var.f13121a).E;
            x3.l(s2Var);
            s2Var.J.b("Inactivity, disconnecting from the service");
            x5Var.x();
        }
    }
}

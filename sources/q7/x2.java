package q7;

public abstract class x2 extends a2 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f13417b;

    public x2(x3 x3Var) {
        super(x3Var);
        ((x3) this.f13121a).f();
    }

    public final void j() {
        if (!this.f13417b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f13417b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!l()) {
            ((x3) this.f13121a).b();
            this.f13417b = true;
        }
    }

    public abstract boolean l();
}

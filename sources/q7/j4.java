package q7;

public abstract class j4 extends i4 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f13137b;

    public j4(x3 x3Var) {
        super(x3Var);
        ((x3) this.f13121a).f();
    }

    public abstract boolean j();

    public final void k() {
        if (!this.f13137b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f13137b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!j()) {
            ((x3) this.f13121a).b();
            this.f13137b = true;
        }
    }
}

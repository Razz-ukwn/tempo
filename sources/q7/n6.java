package q7;

public abstract class n6 extends m6 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f13233c;

    public n6(t6 t6Var) {
        super(t6Var);
        this.f13208b.M++;
    }

    public final void j() {
        if (!this.f13233c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (!this.f13233c) {
            l();
            this.f13208b.N++;
            this.f13233c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean l();
}

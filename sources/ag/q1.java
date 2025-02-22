package ag;

public class q1 extends s1 implements u {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f475b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(n1 n1Var) {
        super(true);
        boolean z10 = true;
        W(n1Var);
        p P = P();
        q qVar = P instanceof q ? (q) P : null;
        if (qVar != null) {
            s1 x10 = qVar.x();
            while (true) {
                if (!x10.M()) {
                    p P2 = x10.P();
                    q qVar2 = P2 instanceof q ? (q) P2 : null;
                    if (qVar2 == null) {
                        break;
                    }
                    x10 = qVar2.x();
                } else {
                    break;
                }
            }
            this.f475b = z10;
        }
        z10 = false;
        this.f475b = z10;
    }

    public final boolean M() {
        return this.f475b;
    }

    public final boolean N() {
        return true;
    }
}

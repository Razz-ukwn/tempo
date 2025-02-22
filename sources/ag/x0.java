package ag;

import s0.b0;

public final class x0 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f509a;

    public x0(boolean z10) {
        this.f509a = z10;
    }

    public final boolean c() {
        return this.f509a;
    }

    public final y1 i() {
        return null;
    }

    public final String toString() {
        return b0.a(new StringBuilder("Empty{"), this.f509a ? "Active" : "New", '}');
    }
}

package t;

import rf.l;

public final class p0 implements j2 {

    /* renamed from: a  reason: collision with root package name */
    public final l<r0, q0> f15184a;

    /* renamed from: b  reason: collision with root package name */
    public q0 f15185b;

    public p0(l<? super r0, ? extends q0> lVar) {
        this.f15184a = lVar;
    }

    public final void a() {
    }

    public final void b() {
        q0 q0Var = this.f15185b;
        if (q0Var != null) {
            q0Var.a();
        }
        this.f15185b = null;
    }

    public final void c() {
        this.f15185b = this.f15184a.invoke(t0.f15231a);
    }
}

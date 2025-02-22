package q;

import q.p;
import sf.j;

public final class u0<V extends p> implements r0<V> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t0<V> f12775a;

    public u0(float f10, float f11, V v3) {
        this.f12775a = new t0<>(v3 != null ? new p0(f10, f11, v3) : new q0(f10, f11));
    }

    public final void a() {
        this.f12775a.getClass();
    }

    public final V b(long j10, V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        j.f(v11, "initialVelocity");
        return this.f12775a.b(j10, v3, v10, v11);
    }

    public final V c(long j10, V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        j.f(v11, "initialVelocity");
        return this.f12775a.c(j10, v3, v10, v11);
    }

    public final long d(V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        return this.f12775a.d(v3, v10, v11);
    }

    public final V e(V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        return this.f12775a.e(v3, v10, v11);
    }
}

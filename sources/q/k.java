package q;

import cb.b;
import cb.d;
import q.p;
import sf.j;
import t.b3;
import t.n1;
import t.y2;

public final class k<T, V extends p> implements y2<T> {
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public final l0<T, V> f12709a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f12710b;

    /* renamed from: c  reason: collision with root package name */
    public V f12711c;

    /* renamed from: d  reason: collision with root package name */
    public long f12712d;

    /* renamed from: e  reason: collision with root package name */
    public long f12713e;

    public k(l0<T, V> l0Var, T t2, V v3, long j10, long j11, boolean z10) {
        j.f(l0Var, "typeConverter");
        this.f12709a = l0Var;
        this.f12710b = d.R(t2, b3.f14997a);
        this.f12711c = v3 != null ? b.t(v3) : b.E((p) l0Var.a().invoke(t2));
        this.f12712d = j10;
        this.f12713e = j11;
        this.B = z10;
    }

    public final T getValue() {
        return this.f12710b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + this.f12709a.b().invoke(this.f12711c) + ", isRunning=" + this.B + ", lastFrameTimeNanos=" + this.f12712d + ", finishedTimeNanos=" + this.f12713e + ')';
    }
}

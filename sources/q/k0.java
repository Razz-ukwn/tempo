package q;

import cb.b;
import q.p;
import sf.j;

public final class k0<T, V extends p> implements f<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final o0<V> f12714a;

    /* renamed from: b  reason: collision with root package name */
    public final l0<T, V> f12715b;

    /* renamed from: c  reason: collision with root package name */
    public final T f12716c;

    /* renamed from: d  reason: collision with root package name */
    public final T f12717d;

    /* renamed from: e  reason: collision with root package name */
    public final V f12718e;

    /* renamed from: f  reason: collision with root package name */
    public final V f12719f;

    /* renamed from: g  reason: collision with root package name */
    public final V f12720g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12721h;

    /* renamed from: i  reason: collision with root package name */
    public final V f12722i;

    public k0(j<T> jVar, l0<T, V> l0Var, T t2, T t10, V v3) {
        o0<V> a10 = jVar.a(l0Var);
        j.f(a10, "animationSpec");
        this.f12714a = a10;
        this.f12715b = l0Var;
        this.f12716c = t2;
        this.f12717d = t10;
        V v10 = (p) l0Var.a().invoke(t2);
        this.f12718e = v10;
        V v11 = (p) l0Var.a().invoke(t10);
        this.f12719f = v11;
        V t11 = v3 != null ? b.t(v3) : b.E((p) l0Var.a().invoke(t2));
        this.f12720g = t11;
        this.f12721h = a10.d(v10, v11, t11);
        this.f12722i = a10.e(v10, v11, t11);
    }

    public final boolean a() {
        this.f12714a.a();
        return false;
    }

    public final long b() {
        return this.f12721h;
    }

    public final l0<T, V> c() {
        return this.f12715b;
    }

    public final V d(long j10) {
        if (e(j10)) {
            return this.f12722i;
        }
        return this.f12714a.c(j10, this.f12718e, this.f12719f, this.f12720g);
    }

    public final T f(long j10) {
        if (e(j10)) {
            return this.f12717d;
        }
        V b10 = this.f12714a.b(j10, this.f12718e, this.f12719f, this.f12720g);
        int b11 = b10.b();
        int i8 = 0;
        while (i8 < b11) {
            if (!Float.isNaN(b10.a(i8))) {
                i8++;
            } else {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + b10 + ". Animation: " + this + ", playTimeNanos: " + j10).toString());
            }
        }
        return this.f12715b.b().invoke(b10);
    }

    public final T g() {
        return this.f12717d;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f12716c + " -> " + this.f12717d + ",initial velocity: " + this.f12720g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f12714a;
    }
}

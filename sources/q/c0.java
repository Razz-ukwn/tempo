package q;

import sf.j;

public final class c0<T> implements j {

    /* renamed from: a  reason: collision with root package name */
    public final float f12665a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12666b;

    /* renamed from: c  reason: collision with root package name */
    public final T f12667c;

    public c0() {
        this((Object) null, 7);
    }

    public c0(float f10, float f11, T t2) {
        this.f12665a = f10;
        this.f12666b = f11;
        this.f12667c = t2;
    }

    public final o0 a(l0 l0Var) {
        T t2 = this.f12667c;
        return new u0(this.f12665a, this.f12666b, t2 == null ? null : (p) l0Var.a().invoke(t2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!(c0Var.f12665a == this.f12665a)) {
            return false;
        }
        return ((c0Var.f12666b > this.f12666b ? 1 : (c0Var.f12666b == this.f12666b ? 0 : -1)) == 0) && j.a(c0Var.f12667c, this.f12667c);
    }

    public final int hashCode() {
        T t2 = this.f12667c;
        return Float.hashCode(this.f12666b) + n.a(this.f12665a, (t2 != null ? t2.hashCode() : 0) * 31, 31);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, int i8) {
        this((i8 & 1) != 0 ? 1.0f : 0.0f, (i8 & 2) != 0 ? 1500.0f : 0.0f, (i8 & 4) != 0 ? null : obj);
    }
}

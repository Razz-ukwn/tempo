package q;

import cb.d;
import q.p;
import sf.j;
import t.b3;
import t.n1;

public final class b<T, V extends p> {

    /* renamed from: a  reason: collision with root package name */
    public final l0<T, V> f12646a;

    /* renamed from: b  reason: collision with root package name */
    public final T f12647b;

    /* renamed from: c  reason: collision with root package name */
    public final k<T, V> f12648c;

    /* renamed from: d  reason: collision with root package name */
    public final n1 f12649d = d.R(Boolean.FALSE, b3.f14997a);

    /* renamed from: e  reason: collision with root package name */
    public final n1 f12650e;

    /* renamed from: f  reason: collision with root package name */
    public final v f12651f;

    /* renamed from: g  reason: collision with root package name */
    public final V f12652g;

    /* renamed from: h  reason: collision with root package name */
    public final V f12653h;

    /* renamed from: i  reason: collision with root package name */
    public final V f12654i;

    /* renamed from: j  reason: collision with root package name */
    public final V f12655j;

    public b(T t2, l0<T, V> l0Var, T t10, String str) {
        j.f(l0Var, "typeConverter");
        j.f(str, "label");
        this.f12646a = l0Var;
        this.f12647b = t10;
        this.f12648c = new k(l0Var, t2, null, Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f12650e = d.R(t2, b3.f14997a);
        this.f12651f = new v();
        V v3 = (p) l0Var.a().invoke(t2);
        int b10 = v3.b();
        for (int i8 = 0; i8 < b10; i8++) {
            v3.e(i8, Float.NEGATIVE_INFINITY);
        }
        this.f12652g = v3;
        V v10 = (p) this.f12646a.a().invoke(t2);
        int b11 = v10.b();
        for (int i10 = 0; i10 < b11; i10++) {
            v10.e(i10, Float.POSITIVE_INFINITY);
        }
        this.f12653h = v10;
        this.f12654i = v3;
        this.f12655j = v10;
    }
}

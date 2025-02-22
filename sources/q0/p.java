package q0;

import f1.j;
import ff.m;
import java.util.Map;
import q0.v;
import rf.l;
import s0.k0;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f12803a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12804b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<a, Integer> f12805c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f12806d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f12807e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l<v.a, m> f12808f;

    public p(int i8, int i10, Map<a, Integer> map, q qVar, l<? super v.a, m> lVar) {
        this.f12806d = i8;
        this.f12807e = qVar;
        this.f12808f = lVar;
        this.f12803a = i8;
        this.f12804b = i10;
        this.f12805c = map;
    }

    public final int a() {
        return this.f12804b;
    }

    public final int b() {
        return this.f12803a;
    }

    public final Map<a, Integer> c() {
        return this.f12805c;
    }

    public final void d() {
        v.a.C0251a aVar = v.a.f12813a;
        q qVar = this.f12807e;
        j layoutDirection = qVar.getLayoutDirection();
        k0 k0Var = qVar instanceof k0 ? (k0) qVar : null;
        h hVar = v.a.f12816d;
        aVar.getClass();
        int i8 = v.a.f12815c;
        j jVar = v.a.f12814b;
        v.a.f12815c = this.f12806d;
        v.a.f12814b = layoutDirection;
        boolean g10 = v.a.C0251a.g(aVar, k0Var);
        this.f12808f.invoke(aVar);
        if (k0Var != null) {
            k0Var.B = g10;
        }
        v.a.f12815c = i8;
        v.a.f12814b = jVar;
        v.a.f12816d = hVar;
    }
}

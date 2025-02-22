package t;

import androidx.activity.f;
import ff.m;
import rf.a;
import rf.q;
import s0.a0;
import sf.k;

public final class j extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a<Object> f15126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f15127b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15128c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a0.a aVar, b bVar, int i8) {
        super(3);
        this.f15126a = aVar;
        this.f15127b = bVar;
        this.f15128c = i8;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        p2 p2Var = (p2) obj2;
        f.e(cVar, "applier", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
        Object d10 = this.f15126a.d();
        b bVar = this.f15127b;
        sf.j.f(bVar, "anchor");
        p2Var.N(p2Var.c(bVar), d10);
        cVar.f(this.f15128c, d10);
        cVar.b(d10);
        return m.f8717a;
    }
}

package f3;

import cb.b;
import e9.c;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.q;
import sf.j;

@e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
public final class i1 extends i implements q<g0, g0, d<? super g0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ g0 f8276a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g0 f8277b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o0 f8278c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i1(o0 o0Var, d<? super i1> dVar) {
        super(3, dVar);
        this.f8278c = o0Var;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        i1 i1Var = new i1(this.f8278c, (d) obj3);
        i1Var.f8276a = (g0) obj;
        i1Var.f8277b = (g0) obj2;
        return i1Var.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        g0 g0Var = this.f8276a;
        g0 g0Var2 = this.f8277b;
        j.f(g0Var2, "<this>");
        j.f(g0Var, "previous");
        o0 o0Var = this.f8278c;
        j.f(o0Var, "loadType");
        int i8 = g0Var2.f8242a;
        int i10 = g0Var.f8242a;
        return i8 > i10 ? true : i8 < i10 ? false : c.l(g0Var2.f8243b, g0Var.f8243b, o0Var) ? g0Var2 : g0Var;
    }
}

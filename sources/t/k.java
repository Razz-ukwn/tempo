package t;

import androidx.activity.f;
import ff.m;
import rf.q;
import sf.j;

public final class k extends sf.k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f15130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15131b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(int i8, b bVar) {
        super(3);
        this.f15130a = bVar;
        this.f15131b = i8;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        p2 p2Var = (p2) obj2;
        f.e(cVar, "applier", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
        b bVar = this.f15130a;
        j.f(bVar, "anchor");
        Object y10 = p2Var.y(p2Var.c(bVar));
        cVar.e();
        cVar.a(this.f15131b, y10);
        return m.f8717a;
    }
}

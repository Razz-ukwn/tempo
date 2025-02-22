package s;

import d0.a;
import d0.b;
import e9.c;
import f1.i;
import f1.j;
import rf.p;
import sf.k;

public final class h extends k implements p<i, j, f1.h> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.b f14284a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b.a aVar) {
        super(2);
        this.f14284a = aVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((i) obj).f8038a;
        j jVar = (j) obj2;
        sf.j.f(jVar, "layoutDirection");
        return new f1.h(c.a(this.f14284a.a((int) (j10 >> 32), jVar), 0));
    }
}

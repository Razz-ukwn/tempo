package s;

import d0.a;
import d0.b;
import f1.h;
import f1.i;
import f1.j;
import rf.p;
import sf.k;

public final class f extends k implements p<i, j, h> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f14281a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(2);
        this.f14281a = bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((i) obj).f8038a;
        j jVar = (j) obj2;
        sf.j.f(jVar, "layoutDirection");
        return new h(this.f14281a.a(j10, jVar));
    }
}

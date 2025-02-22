package yg;

import ff.m;
import rf.l;
import sf.k;

public final class q extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17495a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(b bVar) {
        super(1);
        this.f17495a = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f17495a.cancel();
        return m.f8717a;
    }
}

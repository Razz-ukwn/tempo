package yg;

import rf.l;
import sf.k;

public final class m extends k implements l<Throwable, ff.m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17491a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(b bVar) {
        super(1);
        this.f17491a = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f17491a.cancel();
        return ff.m.f8717a;
    }
}

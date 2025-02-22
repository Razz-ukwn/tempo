package f3;

import ff.m;
import rf.l;
import sf.k;

public final class n2 extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ag.k<m> f8396a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n2(ag.l lVar) {
        super(1);
        this.f8396a = lVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        m mVar = m.f8717a;
        this.f8396a.resumeWith(mVar);
        return mVar;
    }
}

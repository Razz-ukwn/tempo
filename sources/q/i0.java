package q;

import rf.l;
import sf.k;

public final class i0 extends k implements l<Long, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<Long, Object> f12708a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(l<? super Long, Object> lVar) {
        super(1);
        this.f12708a = lVar;
    }

    public final Object invoke(Object obj) {
        return this.f12708a.invoke(Long.valueOf(((Number) obj).longValue() / 1));
    }
}

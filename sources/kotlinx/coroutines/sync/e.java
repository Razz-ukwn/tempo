package kotlinx.coroutines.sync;

import ff.m;
import rf.l;
import sf.k;

public final class e extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f10789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10790b = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(1);
        this.f10789a = dVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f10789a.a(this.f10790b);
        return m.f8717a;
    }
}

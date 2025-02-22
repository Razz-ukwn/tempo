package kotlinx.coroutines.internal;

import d2.f1;
import ff.m;
import jf.f;
import rf.l;
import sf.k;

public final class n extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<Object, m> f10729a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10730b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f10731c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(l<Object, m> lVar, Object obj, f fVar) {
        super(1);
        this.f10729a = lVar;
        this.f10730b = obj;
        this.f10731c = fVar;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        b0 a10 = o.a(this.f10729a, this.f10730b, (b0) null);
        if (a10 != null) {
            f1.z(this.f10731c, a10);
        }
        return m.f8717a;
    }
}

package b0;

import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class n extends k implements l<Object, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<Object, m> f2953a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l<Object, m> f2954b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(l<Object, m> lVar, l<Object, m> lVar2) {
        super(1);
        this.f2953a = lVar;
        this.f2954b = lVar2;
    }

    public final Object invoke(Object obj) {
        j.f(obj, "state");
        this.f2953a.invoke(obj);
        this.f2954b.invoke(obj);
        return m.f8717a;
    }
}

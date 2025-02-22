package androidx.compose.ui.platform;

import cb.d;
import ff.m;
import rf.a;
import sf.j;
import sf.k;

public final class z2 extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f1538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a3 f1539b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j2.a f1540c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z2(a aVar, a3 a3Var, b3 b3Var) {
        super(0);
        this.f1538a = aVar;
        this.f1539b = a3Var;
        this.f1540c = b3Var;
    }

    public final Object d() {
        a aVar = this.f1538a;
        aVar.removeOnAttachStateChangeListener(this.f1539b);
        j2.a aVar2 = this.f1540c;
        j.f(aVar2, "listener");
        d.K(aVar).f9788a.remove(aVar2);
        return m.f8717a;
    }
}

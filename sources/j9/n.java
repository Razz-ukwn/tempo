package j9;

public final class n extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f9879b;

    public n(o oVar) {
        this.f9879b = oVar;
    }

    public final void a() {
        o oVar = this.f9879b;
        p pVar = oVar.f9880a;
        pVar.f9883b.a("unlinkToDeath", new Object[0]);
        pVar.m.asBinder().unlinkToDeath(pVar.f9891j, 0);
        p pVar2 = oVar.f9880a;
        pVar2.m = null;
        pVar2.f9888g = false;
    }
}

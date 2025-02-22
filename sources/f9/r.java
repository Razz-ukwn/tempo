package f9;

public final class r extends l {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f8627b;

    public r(s sVar) {
        this.f8627b = sVar;
    }

    public final void a() {
        s sVar = this.f8627b;
        t tVar = sVar.f8628a;
        tVar.f8631b.a("unlinkToDeath", new Object[0]);
        tVar.m.asBinder().unlinkToDeath(tVar.f8639j, 0);
        t tVar2 = sVar.f8628a;
        tVar2.m = null;
        tVar2.f8636g = false;
    }
}

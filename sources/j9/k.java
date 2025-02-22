package j9;

public final class k extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f9876b;

    public k(p pVar) {
        this.f9876b = pVar;
    }

    public final void a() {
        p pVar = this.f9876b;
        if (pVar.m != null) {
            pVar.f9883b.a("Unbind from service.", new Object[0]);
            pVar.f9882a.unbindService(pVar.f9893l);
            pVar.f9888g = false;
            pVar.m = null;
            pVar.f9893l = null;
        }
        pVar.b();
    }
}

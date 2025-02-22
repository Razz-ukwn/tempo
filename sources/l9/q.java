package l9;

public final class q extends n {
    public final /* synthetic */ v B;

    public q(v vVar) {
        this.B = vVar;
    }

    public final void b() {
        v vVar = this.B;
        if (vVar.m != null) {
            vVar.f11025b.a("Unbind from service.", new Object[0]);
            vVar.f11024a.unbindService(vVar.f11035l);
            vVar.f11030g = false;
            vVar.m = null;
            vVar.f11035l = null;
        }
        vVar.b();
    }
}

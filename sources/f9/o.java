package f9;

public final class o extends l {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f8624b;

    public o(t tVar) {
        this.f8624b = tVar;
    }

    public final void a() {
        synchronized (this.f8624b.f8635f) {
            try {
                if (this.f8624b.f8640k.get() > 0) {
                    if (this.f8624b.f8640k.decrementAndGet() > 0) {
                        this.f8624b.f8631b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                t tVar = this.f8624b;
                if (tVar.m != null) {
                    tVar.f8631b.a("Unbind from service.", new Object[0]);
                    t tVar2 = this.f8624b;
                    tVar2.f8630a.unbindService(tVar2.f8641l);
                    t tVar3 = this.f8624b;
                    tVar3.f8636g = false;
                    tVar3.m = null;
                    tVar3.f8641l = null;
                }
                this.f8624b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

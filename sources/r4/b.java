package r4;

import r4.c;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13870a;

    public b(c cVar) {
        this.f13870a = cVar;
    }

    public final void run() {
        c cVar = this.f13870a;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f13878c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

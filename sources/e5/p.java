package e5;

import e5.o;
import l5.l;

public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f7837a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o.c.a f7838b;

    public p(o.c.a aVar, boolean z10) {
        this.f7838b = aVar;
        this.f7837a = z10;
    }

    public final void run() {
        o.c.a aVar = this.f7838b;
        aVar.getClass();
        l.a();
        o.c cVar = o.c.this;
        boolean z10 = cVar.f7832a;
        boolean z11 = this.f7837a;
        cVar.f7832a = z11;
        if (z10 != z11) {
            cVar.f7833b.a(z11);
        }
    }
}

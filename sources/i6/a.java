package i6;

import a6.h;
import d6.j;
import d6.n;
import d6.s;
import e6.m;
import java.util.logging.Logger;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9593a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f9594b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f9595c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f9596d;

    public /* synthetic */ a(c cVar, j jVar, h hVar, d6.h hVar2) {
        this.f9593a = cVar;
        this.f9594b = jVar;
        this.f9595c = hVar;
        this.f9596d = hVar2;
    }

    public final void run() {
        s sVar = this.f9594b;
        h hVar = this.f9595c;
        n nVar = this.f9596d;
        c cVar = this.f9593a;
        cVar.getClass();
        Logger logger = c.f9600f;
        try {
            m a10 = cVar.f9603c.a(sVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{sVar.b()});
                logger.warning(format);
                hVar.d(new IllegalArgumentException(format));
                return;
            }
            cVar.f9605e.d(new b(cVar, sVar, a10.a(nVar)));
            hVar.d((Exception) null);
        } catch (Exception e10) {
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.d(e10);
        }
    }
}

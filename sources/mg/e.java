package mg;

import ff.m;
import java.util.logging.Level;
import mg.d;
import sf.j;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f11502a;

    public e(d dVar) {
        this.f11502a = dVar;
    }

    public final void run() {
        a c3;
        long j10;
        while (true) {
            d dVar = this.f11502a;
            synchronized (dVar) {
                c3 = dVar.c();
            }
            if (c3 != null) {
                c cVar = c3.f11482c;
                j.c(cVar);
                d dVar2 = this.f11502a;
                d.b bVar = d.f11491h;
                boolean isLoggable = d.f11493j.isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = cVar.f11485a.f11494a.c();
                    cb.d.k(c3, cVar, "starting");
                } else {
                    j10 = -1;
                }
                try {
                    d.a(dVar2, c3);
                    m mVar = m.f8717a;
                    if (isLoggable) {
                        cb.d.k(c3, cVar, j.k(cb.d.D(cVar.f11485a.f11494a.c() - j10), "finished run in "));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        cb.d.k(c3, cVar, j.k(cb.d.D(cVar.f11485a.f11494a.c() - j10), "failed a run in "));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}

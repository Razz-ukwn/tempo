package ng;

import ff.m;
import java.io.IOException;
import jg.c0;
import jg.s;
import jg.v;
import jg.x;
import og.f;
import sf.j;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11922a = new a();

    public final c0 a(f fVar) {
        d dVar = fVar.f12365a;
        dVar.getClass();
        synchronized (dVar) {
            if (!dVar.K) {
                throw new IllegalStateException("released".toString());
            } else if (!(!dVar.J)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!dVar.I) {
                m mVar = m.f8717a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        c cVar = dVar.E;
        j.c(cVar);
        v vVar = dVar.f11947a;
        j.f(vVar, "client");
        try {
            b bVar = new b(dVar, dVar.f11951e, cVar, cVar.a(fVar.f12370f, fVar.f12371g, fVar.f12372h, vVar.B, !j.a(fVar.f12369e.f10220b, "GET")).j(vVar, fVar));
            dVar.H = bVar;
            dVar.M = bVar;
            synchronized (dVar) {
                dVar.I = true;
                dVar.J = true;
            }
            if (!dVar.L) {
                return f.b(fVar, 0, bVar, (x) null, 61).c(fVar.f12369e);
            }
            throw new IOException("Canceled");
        } catch (j e10) {
            cVar.c(e10.f11984b);
            throw e10;
        } catch (IOException e11) {
            cVar.c(e11);
            throw new j(e11);
        }
    }
}

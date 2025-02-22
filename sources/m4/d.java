package m4;

import ag.k;
import cb.b;
import ff.m;
import java.io.IOException;
import jg.c0;
import jg.e;
import rf.l;

public final class d implements e, l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final jg.d f11193a;

    /* renamed from: b  reason: collision with root package name */
    public final k<c0> f11194b;

    public d(jg.d dVar, ag.l lVar) {
        this.f11193a = dVar;
        this.f11194b = lVar;
    }

    public final void a(c0 c0Var) {
        this.f11194b.resumeWith(c0Var);
    }

    public final void b(ng.d dVar, IOException iOException) {
        if (!dVar.L) {
            this.f11194b.resumeWith(b.u(iOException));
        }
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        try {
            this.f11193a.cancel();
        } catch (Throwable unused) {
        }
        return m.f8717a;
    }
}

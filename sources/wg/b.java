package wg;

import ag.d;
import ff.m;
import java.io.IOException;
import sf.j;

public final class b implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f16733a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f16734b;

    public b(h0 h0Var, y yVar) {
        this.f16733a = h0Var;
        this.f16734b = yVar;
    }

    public final void B(e eVar, long j10) {
        j.f(eVar, "source");
        d.d(eVar.f16752b, 0, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                d0 d0Var = eVar.f16751a;
                j.c(d0Var);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (d0Var.f16746c - d0Var.f16745b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        d0Var = d0Var.f16749f;
                        j.c(d0Var);
                    }
                }
                g0 g0Var = this.f16734b;
                a aVar = this.f16733a;
                aVar.h();
                try {
                    g0Var.B(eVar, j11);
                    m mVar = m.f8717a;
                    if (!aVar.i()) {
                        j10 -= j11;
                    } else {
                        throw aVar.j((IOException) null);
                    }
                } catch (IOException e10) {
                    e = e10;
                    if (aVar.i()) {
                        e = aVar.j(e);
                    }
                    throw e;
                } finally {
                    boolean i8 = aVar.i();
                }
            } else {
                return;
            }
        }
    }

    public final j0 b() {
        return this.f16733a;
    }

    public final void close() {
        g0 g0Var = this.f16734b;
        a aVar = this.f16733a;
        aVar.h();
        try {
            g0Var.close();
            m mVar = m.f8717a;
            if (aVar.i()) {
                throw aVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (aVar.i()) {
                e = aVar.j(e);
            }
            throw e;
        } finally {
            boolean i8 = aVar.i();
        }
    }

    public final void flush() {
        g0 g0Var = this.f16734b;
        a aVar = this.f16733a;
        aVar.h();
        try {
            g0Var.flush();
            m mVar = m.f8717a;
            if (aVar.i()) {
                throw aVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (aVar.i()) {
                e = aVar.j(e);
            }
            throw e;
        } finally {
            boolean i8 = aVar.i();
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f16734b + ')';
    }
}

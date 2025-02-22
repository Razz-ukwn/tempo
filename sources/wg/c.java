package wg;

import ff.m;
import java.io.IOException;
import sf.j;

public final class c implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f16738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i0 f16739b;

    public c(h0 h0Var, s sVar) {
        this.f16738a = h0Var;
        this.f16739b = sVar;
    }

    public final long a0(e eVar, long j10) {
        j.f(eVar, "sink");
        i0 i0Var = this.f16739b;
        a aVar = this.f16738a;
        aVar.h();
        try {
            long a02 = i0Var.a0(eVar, j10);
            if (!aVar.i()) {
                return a02;
            }
            throw aVar.j((IOException) null);
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

    public final j0 b() {
        return this.f16738a;
    }

    public final void close() {
        i0 i0Var = this.f16739b;
        a aVar = this.f16738a;
        aVar.h();
        try {
            i0Var.close();
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
        return "AsyncTimeout.source(" + this.f16739b + ')';
    }
}

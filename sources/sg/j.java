package sg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import jg.w;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final a f14977a;

    /* renamed from: b  reason: collision with root package name */
    public k f14978b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        this.f14977a = aVar;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f14977a.a(sSLSocket);
    }

    public final boolean b() {
        return true;
    }

    public final String c(SSLSocket sSLSocket) {
        k kVar;
        synchronized (this) {
            if (this.f14978b == null && this.f14977a.a(sSLSocket)) {
                this.f14978b = this.f14977a.b(sSLSocket);
            }
            kVar = this.f14978b;
        }
        if (kVar == null) {
            return null;
        }
        return kVar.c(sSLSocket);
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        k kVar;
        sf.j.f(list, "protocols");
        synchronized (this) {
            if (this.f14978b == null && this.f14977a.a(sSLSocket)) {
                this.f14978b = this.f14977a.b(sSLSocket);
            }
            kVar = this.f14978b;
        }
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }
}

package sg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import jg.w;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import rg.c;
import rg.h;
import sg.j;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14972a = new a();

    public static final class a implements j.a {
        public final boolean a(SSLSocket sSLSocket) {
            return c.f14257d && (sSLSocket instanceof BCSSLSocket);
        }

        public final k b(SSLSocket sSLSocket) {
            return new g();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    public final boolean b() {
        boolean z10 = c.f14257d;
        return c.f14257d;
    }

    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : sf.j.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        sf.j.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            h hVar = h.f14273a;
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}

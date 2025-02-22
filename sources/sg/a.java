package sg;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import jg.w;
import rg.h;
import sf.j;

@SuppressLint({"NewApi"})
public final class a implements k {
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public final boolean b() {
        h hVar = h.f14273a;
        return h.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        String g10 = sSLSocket.getApplicationProtocol();
        if (g10 == null ? true : j.a(g10, "")) {
            return null;
        }
        return g10;
    }

    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        j.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            h hVar = h.f14273a;
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}

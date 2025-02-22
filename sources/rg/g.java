package rg;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jg.w;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import rg.h;
import sf.j;

public final class g extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f14271d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f14272c = new OpenJSSE();

    public static final class a {
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, a.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f14271d = z10;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        j.f(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = h.a.a(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null ? true : j.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        }
        return null;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f14272c);
        j.e(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f14272c);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        j.c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        j.e(arrays, "toString(this)");
        throw new IllegalStateException(j.k(arrays, "Unexpected default trust managers: ").toString());
    }
}

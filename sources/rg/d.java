package rg;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jg.w;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import rg.h;
import sf.j;

public final class d extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f14259d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f14260c;

    public static final class a {
        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
        }

        public static boolean b() {
            return d.f14259d;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14261a = new b();
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable() && a.a()) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f14259d = z10;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        j.e(newProvider, "newProvider()");
        this.f14260c = newProvider;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        j.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f14260c);
        j.e(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l10 = l();
        l10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = l10.getSocketFactory();
        j.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f14261a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        j.e(arrays, "toString(this)");
        throw new IllegalStateException(j.k(arrays, "Unexpected default trust managers: ").toString());
    }
}

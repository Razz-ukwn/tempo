package sg;

import android.net.http.X509TrustManagerExtensions;
import androidx.fragment.app.z;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import sf.j;

public final class b extends z {

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManager f14960b;

    /* renamed from: c  reason: collision with root package name */
    public final X509TrustManagerExtensions f14961c;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f14960b = x509TrustManager;
        this.f14961c = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f14960b == this.f14960b;
    }

    public final List h(String str, List list) {
        j.f(list, "chain");
        j.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f14961c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                j.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f14960b);
    }
}

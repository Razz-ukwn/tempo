package sg;

import javax.net.ssl.SSLSocket;
import sg.j;

public final class e implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14965a = "com.google.android.gms.org.conscrypt";

    public final boolean a(SSLSocket sSLSocket) {
        return zf.j.x0(sSLSocket.getClass().getName(), sf.j.k(".", this.f14965a), false);
    }

    public final k b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!sf.j.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(sf.j.k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(cls2);
    }
}

package rg;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.fragment.app.z;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jg.w;
import rg.h;
import sf.j;
import sg.f;
import sg.g;
import sg.i;
import sg.k;
import sg.l;
import ug.d;

public final class b extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f14252e = (h.a.c() && Build.VERSION.SDK_INT < 30);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f14253c;

    /* renamed from: d  reason: collision with root package name */
    public final sg.h f14254d;

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f14255a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f14256b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f14255a = x509TrustManager;
            this.f14256b = method;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            j.f(x509Certificate, "cert");
            try {
                Object invoke = this.f14256b.invoke(this.f14255a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return j.a(this.f14255a, aVar.f14255a) && j.a(this.f14256b, aVar.f14256b);
        }

        public final int hashCode() {
            return this.f14256b.hashCode() + (this.f14255a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f14255a + ", findByIssuerAndSignatureMethod=" + this.f14256b + ')';
        }
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        Method method3 = null;
        try {
            lVar = new l(Class.forName(j.k(".OpenSSLSocketImpl", "com.android.org.conscrypt")), Class.forName(j.k(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt")), Class.forName(j.k(".SSLParametersImpl", "com.android.org.conscrypt")));
        } catch (Exception e10) {
            h.f14273a.getClass();
            h.i(5, "unable to load android socket classes", e10);
            lVar = null;
        }
        kVarArr[0] = lVar;
        kVarArr[1] = new sg.j(f.f14966f);
        kVarArr[2] = new sg.j(i.f14976a);
        kVarArr[3] = new sg.j(g.f14972a);
        ArrayList b02 = gf.l.b0(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f14253c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f14254d = new sg.h(method3, method, method2);
    }

    public final z b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        sg.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new sg.b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar == null ? new ug.a(c(x509TrustManager)) : bVar;
    }

    public final d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        Object obj;
        j.f(list, "protocols");
        Iterator it = this.f14253c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i8) {
        j.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i8);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f14253c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar == null) {
            return null;
        }
        return kVar.c(sSLSocket);
    }

    public final Object g() {
        sg.h hVar = this.f14254d;
        hVar.getClass();
        Method method = hVar.f14973a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.f14974b;
            j.c(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        j.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void k(Object obj, String str) {
        j.f(str, "message");
        sg.h hVar = this.f14254d;
        hVar.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = hVar.f14975c;
                j.c(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            h.j(this, str, 5, 4);
        }
    }
}

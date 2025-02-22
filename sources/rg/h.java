package rg;

import androidx.fragment.app.z;
import gf.m;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jg.v;
import jg.w;
import sf.j;
import ug.b;
import ug.d;
import wg.e;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h f14273a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f14274b = Logger.getLogger(v.class.getName());

    public static final class a {
        public static ArrayList a(List list) {
            j.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((w) next) != w.f10214b) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(m.n0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w) it.next()).f10218a);
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            j.f(list, "protocols");
            e eVar = new e();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.g0(str.length());
                eVar.v0(str);
            }
            return eVar.L(eVar.f16752b);
        }

        public static boolean c() {
            return j.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: rg.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: rg.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rg.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: rg.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: rg.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: rg.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        if (r0 != null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r0 != null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r0 != null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (java.lang.Integer.parseInt(r3) >= 9) goto L_0x016b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016f  */
    static {
        /*
            rg.h$a r0 = new rg.h$a
            r0.<init>()
            boolean r0 = rg.h.a.c()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0079
            java.util.Map<java.lang.String, java.lang.String> r0 = sg.c.f14963b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = sg.c.f14962a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x0017
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0048
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x0054
        L_0x0048:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x0052
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x0054
        L_0x0052:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x0054:
            r4.setLevel(r3)
            sg.d r3 = sg.d.f14964a
            r4.addHandler(r3)
            goto L_0x0017
        L_0x005d:
            boolean r0 = rg.a.f14250d
            if (r0 == 0) goto L_0x0067
            rg.a r0 = new rg.a
            r0.<init>()
            goto L_0x0068
        L_0x0067:
            r0 = r1
        L_0x0068:
            if (r0 != 0) goto L_0x0174
            boolean r0 = rg.b.f14252e
            if (r0 == 0) goto L_0x0073
            rg.b r1 = new rg.b
            r1.<init>()
        L_0x0073:
            sf.j.c(r1)
        L_0x0076:
            r0 = r1
            goto L_0x0174
        L_0x0079:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "Conscrypt"
            boolean r0 = sf.j.a(r3, r0)
            if (r0 == 0) goto L_0x009a
            boolean r0 = rg.d.f14259d
            if (r0 == 0) goto L_0x0095
            rg.d r0 = new rg.d
            r0.<init>()
            goto L_0x0096
        L_0x0095:
            r0 = r1
        L_0x0096:
            if (r0 == 0) goto L_0x009a
            goto L_0x0174
        L_0x009a:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "BC"
            boolean r0 = sf.j.a(r3, r0)
            if (r0 == 0) goto L_0x00bb
            boolean r0 = rg.c.f14257d
            if (r0 == 0) goto L_0x00b6
            rg.c r0 = new rg.c
            r0.<init>()
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            if (r0 == 0) goto L_0x00bb
            goto L_0x0174
        L_0x00bb:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = sf.j.a(r3, r0)
            if (r0 == 0) goto L_0x00dc
            boolean r0 = rg.g.f14271d
            if (r0 == 0) goto L_0x00d7
            rg.g r0 = new rg.g
            r0.<init>()
            goto L_0x00d8
        L_0x00d7:
            r0 = r1
        L_0x00d8:
            if (r0 == 0) goto L_0x00dc
            goto L_0x0174
        L_0x00dc:
            boolean r0 = rg.f.f14270c
            if (r0 == 0) goto L_0x00e6
            rg.f r0 = new rg.f
            r0.<init>()
            goto L_0x00e7
        L_0x00e6:
            r0 = r1
        L_0x00e7:
            if (r0 == 0) goto L_0x00eb
            goto L_0x0174
        L_0x00eb:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "java.specification.version"
            java.lang.String r4 = "unknown"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            java.lang.String r4 = "jvmVersion"
            sf.j.e(r3, r4)     // Catch:{ NumberFormatException -> 0x0103 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0103 }
            r4 = 9
            if (r3 < r4) goto L_0x0103
            goto L_0x016b
        L_0x0103:
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN"
            r5 = 1
            java.lang.Class r4 = java.lang.Class.forName(r4, r5, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r6 = "$Provider"
            java.lang.String r6 = sf.j.k(r6, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.Class r6 = java.lang.Class.forName(r6, r5, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r7 = "$ClientProvider"
            java.lang.String r7 = sf.j.k(r7, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.Class r12 = java.lang.Class.forName(r7, r5, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r7 = "$ServerProvider"
            java.lang.String r3 = sf.j.k(r7, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.Class r13 = java.lang.Class.forName(r3, r5, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r3 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            r7[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            r7[r5] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.reflect.Method r9 = r4.getMethod(r3, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r3 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            r6[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.reflect.Method r10 = r4.getMethod(r3, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r3 = "remove"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            r5[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.reflect.Method r11 = r4.getMethod(r3, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            rg.e r0 = new rg.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r2 = "putMethod"
            sf.j.e(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r2 = "getMethod"
            sf.j.e(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r2 = "removeMethod"
            sf.j.e(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r2 = "clientProviderClass"
            sf.j.e(r12, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            java.lang.String r2 = "serverProviderClass"
            sf.j.e(r13, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016b }
            r1 = r0
        L_0x016b:
            if (r1 == 0) goto L_0x016f
            goto L_0x0076
        L_0x016f:
            rg.h r0 = new rg.h
            r0.<init>()
        L_0x0174:
            f14273a = r0
            java.lang.Class<jg.v> r0 = jg.v.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f14274b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.h.<clinit>():void");
    }

    public static void i(int i8, String str, Throwable th) {
        j.f(str, "message");
        f14274b.log(i8 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(h hVar, String str, int i8, int i10) {
        if ((i10 & 2) != 0) {
            i8 = 4;
        }
        hVar.getClass();
        i(i8, str, (Throwable) null);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public z b(X509TrustManager x509TrustManager) {
        return new ug.a(c(x509TrustManager));
    }

    public d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        j.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<w> list) {
        j.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i8) {
        j.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i8);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f14274b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        j.f(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        j.f(str, "message");
        if (obj == null) {
            str = j.k(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        j.e(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l10 = l();
            l10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l10.getSocketFactory();
            j.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(j.k(e10, "No System TLS: "), e10);
        }
    }

    public X509TrustManager n() {
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
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        j.e(arrays, "toString(this)");
        throw new IllegalStateException(j.k(arrays, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}

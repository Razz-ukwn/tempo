package zd;

import ab.i;
import ab.j;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.lifecycle.b;

public class a extends b {

    /* renamed from: e  reason: collision with root package name */
    public final Application f17942e;

    /* renamed from: f  reason: collision with root package name */
    public final i f17943f = new j().a();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        sf.j.f(application, "application");
        this.f17942e = application;
    }

    public static boolean g(a aVar) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Object systemService = aVar.e().getSystemService("connectivity");
        sf.j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        e9.c.c(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> zd.g<T> f(yg.b0<T> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "response"
            sf.j.f(r8, r0)
            jg.c0 r0 = r8.f17445a
            java.lang.String r1 = r0.f10053c
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "timeout"
            boolean r1 = zf.n.A0(r1, r2)
            if (r1 == 0) goto L_0x001e
            zd.g$a r8 = new zd.g$a
            java.lang.String r0 = "Timeout"
            r8.<init>(r0)
            goto L_0x0120
        L_0x001e:
            boolean r1 = r8.a()
            T r2 = r8.f17446b
            if (r1 == 0) goto L_0x0030
            zd.g$d r8 = new zd.g$d
            sf.j.c(r2)
            r8.<init>(r2)
            goto L_0x0120
        L_0x0030:
            r1 = 400(0x190, float:5.6E-43)
            java.lang.String r3 = r0.f10053c
            r4 = 0
            r5 = 0
            int r0 = r0.f10054d
            if (r0 != r1) goto L_0x00db
            java.lang.String r0 = java.lang.String.valueOf(r2)
            ab.i r1 = r7.f17943f
            java.lang.Class<com.quickkonnect.silencio.models.response.BaseResponse> r2 = com.quickkonnect.silencio.models.response.BaseResponse.class
            r1.b(r2, r0)
            jg.d0 r8 = r8.f17447c
            sf.j.c(r8)
            wg.h r0 = r8.e()
            jg.t r8 = r8.d()     // Catch:{ all -> 0x00d4 }
            if (r8 != 0) goto L_0x0056
            r8 = r5
            goto L_0x005c
        L_0x0056:
            java.nio.charset.Charset r6 = zf.a.f17962b     // Catch:{ all -> 0x00d4 }
            java.nio.charset.Charset r8 = r8.a(r6)     // Catch:{ all -> 0x00d4 }
        L_0x005c:
            if (r8 != 0) goto L_0x0060
            java.nio.charset.Charset r8 = zf.a.f17962b     // Catch:{ all -> 0x00d4 }
        L_0x0060:
            java.nio.charset.Charset r8 = kg.b.s(r0, r8)     // Catch:{ all -> 0x00d4 }
            java.lang.String r8 = r0.P(r8)     // Catch:{ all -> 0x00d4 }
            e9.c.c(r0, r5)
            java.lang.Object r8 = r1.b(r2, r8)
            com.quickkonnect.silencio.models.response.BaseResponse r8 = (com.quickkonnect.silencio.models.response.BaseResponse) r8
            bh.a$a r0 = bh.a.f3654a
            java.lang.String r1 = r8.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.b(r1, r2)
            java.util.Map r0 = r8.getErrors()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00ae
            java.util.Map r2 = r8.getErrors()
            if (r2 == 0) goto L_0x0098
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = gf.q.w0(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0099
        L_0x0098:
            r2 = r1
        L_0x0099:
            java.util.List r3 = cb.d.O(r3)
            java.lang.Object r0 = r0.getOrDefault(r2, r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = gf.q.v0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00ae
            r1 = r0
        L_0x00ae:
            java.lang.String r0 = r8.getMessage()
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.length()
            r2 = 1
            if (r0 <= 0) goto L_0x00bd
            r0 = r2
            goto L_0x00be
        L_0x00bd:
            r0 = r4
        L_0x00be:
            if (r0 != r2) goto L_0x00c1
            r4 = r2
        L_0x00c1:
            if (r4 == 0) goto L_0x00ce
            zd.g$a r0 = new zd.g$a
            java.lang.String r8 = r8.getMessage()
            r0.<init>(r8)
            r8 = r0
            goto L_0x0120
        L_0x00ce:
            zd.g$a r8 = new zd.g$a
            r8.<init>(r1)
            goto L_0x0120
        L_0x00d4:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            e9.c.c(r0, r8)
            throw r1
        L_0x00db:
            r8 = 401(0x191, float:5.62E-43)
            if (r0 != r8) goto L_0x010d
            android.app.Application r8 = r7.f17942e
            zd.j.b(r8)
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = r8.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            if (r0 == 0) goto L_0x00f7
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
        L_0x00f7:
            if (r0 == 0) goto L_0x00ff
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.addFlags(r1)
        L_0x00ff:
            sf.j.c(r0)
            java.lang.Object r1 = t1.a.f15323a
            t1.a.C0282a.b(r8, r0, r5)
            zd.g$a r8 = new zd.g$a
            r8.<init>(r3)
            goto L_0x0120
        L_0x010d:
            bh.a$a r8 = bh.a.f3654a
            java.lang.String r0 = "in else"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r8.b(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r8.b(r3, r0)
            zd.g$a r8 = new zd.g$a
            r8.<init>(r3)
        L_0x0120:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.a.f(yg.b0):zd.g");
    }
}

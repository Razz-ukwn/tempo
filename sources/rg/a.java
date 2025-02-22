package rg;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.fragment.app.z;
import gf.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jg.w;
import rg.h;
import sg.b;
import sg.f;
import sg.g;
import sg.i;
import sg.j;
import sg.k;

public final class a extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f14250d = (h.a.c() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f14251c;

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = h.a.c() && Build.VERSION.SDK_INT >= 29 ? new sg.a() : null;
        kVarArr[1] = new j(f.f14966f);
        kVarArr[2] = new j(i.f14976a);
        kVarArr[3] = new j(g.f14972a);
        ArrayList b02 = l.b0(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f14251c = arrayList;
    }

    public final z b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar == null ? new ug.a(c(x509TrustManager)) : bVar;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        Object obj;
        sf.j.f(list, "protocols");
        Iterator it = this.f14251c.iterator();
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

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f14251c.iterator();
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

    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        sf.j.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}

package jg;

import ag.d;
import d2.f1;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import jg.r;
import kg.b;
import s0.b0;
import sf.j;
import ug.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m f10015a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f10016b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f10017c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f10018d;

    /* renamed from: e  reason: collision with root package name */
    public final f f10019e;

    /* renamed from: f  reason: collision with root package name */
    public final b f10020f;

    /* renamed from: g  reason: collision with root package name */
    public final Proxy f10021g = null;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f10022h;

    /* renamed from: i  reason: collision with root package name */
    public final r f10023i;

    /* renamed from: j  reason: collision with root package name */
    public final List<w> f10024j;

    /* renamed from: k  reason: collision with root package name */
    public final List<i> f10025k;

    public a(String str, int i8, d dVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, c cVar, f fVar, cb.c cVar2, List list, List list2, ProxySelector proxySelector) {
        j.f(str, "uriHost");
        j.f(dVar, "dns");
        j.f(socketFactory, "socketFactory");
        j.f(cVar2, "proxyAuthenticator");
        j.f(list, "protocols");
        j.f(list2, "connectionSpecs");
        j.f(proxySelector, "proxySelector");
        this.f10015a = dVar;
        this.f10016b = socketFactory;
        this.f10017c = sSLSocketFactory;
        this.f10018d = cVar;
        this.f10019e = fVar;
        this.f10020f = cVar2;
        this.f10022h = proxySelector;
        r.a aVar = new r.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        boolean z10 = true;
        if (zf.j.s0(str2, "http", true)) {
            aVar.f10163a = "http";
        } else if (zf.j.s0(str2, "https", true)) {
            aVar.f10163a = "https";
        } else {
            throw new IllegalArgumentException(j.k(str2, "unexpected scheme: "));
        }
        String N = f1.N(r.b.d(str, 0, 0, false, 7));
        if (N != null) {
            aVar.f10166d = N;
            if ((1 > i8 || i8 >= 65536) ? false : z10) {
                aVar.f10167e = i8;
                this.f10023i = aVar.a();
                this.f10024j = b.x(list);
                this.f10025k = b.x(list2);
                return;
            }
            throw new IllegalArgumentException(j.k(Integer.valueOf(i8), "unexpected port: ").toString());
        }
        throw new IllegalArgumentException(j.k(str, "unexpected host: "));
    }

    public final boolean a(a aVar) {
        j.f(aVar, "that");
        return j.a(this.f10015a, aVar.f10015a) && j.a(this.f10020f, aVar.f10020f) && j.a(this.f10024j, aVar.f10024j) && j.a(this.f10025k, aVar.f10025k) && j.a(this.f10022h, aVar.f10022h) && j.a(this.f10021g, aVar.f10021g) && j.a(this.f10017c, aVar.f10017c) && j.a(this.f10018d, aVar.f10018d) && j.a(this.f10019e, aVar.f10019e) && this.f10023i.f10157e == aVar.f10023i.f10157e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return j.a(this.f10023i, aVar.f10023i) && a(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f10015a.hashCode();
        int hashCode2 = this.f10020f.hashCode();
        int hashCode3 = this.f10024j.hashCode();
        int hashCode4 = this.f10025k.hashCode();
        int hashCode5 = this.f10022h.hashCode();
        int hashCode6 = Objects.hashCode(this.f10021g);
        int hashCode7 = Objects.hashCode(this.f10017c);
        int hashCode8 = Objects.hashCode(this.f10018d);
        return Objects.hashCode(this.f10019e) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f10023i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        r rVar = this.f10023i;
        sb2.append(rVar.f10156d);
        sb2.append(':');
        sb2.append(rVar.f10157e);
        sb2.append(", ");
        Proxy proxy = this.f10021g;
        return b0.a(sb2, proxy != null ? j.k(proxy, "proxy=") : j.k(this.f10022h, "proxySelector="), '}');
    }
}

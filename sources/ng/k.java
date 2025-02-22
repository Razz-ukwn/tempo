package ng;

import androidx.lifecycle.u;
import gf.s;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jg.d;
import jg.f0;
import jg.n;
import jg.r;
import kg.b;
import sf.j;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final jg.a f11985a;

    /* renamed from: b  reason: collision with root package name */
    public final u f11986b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11987c;

    /* renamed from: d  reason: collision with root package name */
    public final n f11988d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends Proxy> f11989e;

    /* renamed from: f  reason: collision with root package name */
    public int f11990f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends InetSocketAddress> f11991g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f11992h = new ArrayList();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<f0> f11993a;

        /* renamed from: b  reason: collision with root package name */
        public int f11994b;

        public a(ArrayList arrayList) {
            this.f11993a = arrayList;
        }

        public final boolean a() {
            return this.f11994b < this.f11993a.size();
        }
    }

    public k(jg.a aVar, u uVar, d dVar, n nVar) {
        List<? extends Proxy> list;
        j.f(aVar, "address");
        j.f(uVar, "routeDatabase");
        j.f(dVar, "call");
        j.f(nVar, "eventListener");
        this.f11985a = aVar;
        this.f11986b = uVar;
        this.f11987c = dVar;
        this.f11988d = nVar;
        s sVar = s.f8978a;
        this.f11989e = sVar;
        this.f11991g = sVar;
        r rVar = aVar.f10023i;
        j.f(rVar, "url");
        Proxy proxy = aVar.f10021g;
        if (proxy != null) {
            list = cb.d.O(proxy);
        } else {
            URI g10 = rVar.g();
            if (g10.getHost() == null) {
                list = b.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f10022h.select(g10);
                Collection collection = select;
                if (collection == null || collection.isEmpty()) {
                    list = b.l(Proxy.NO_PROXY);
                } else {
                    j.e(select, "proxiesOrNull");
                    list = b.x(select);
                }
            }
        }
        this.f11989e = list;
        this.f11990f = 0;
    }

    public final boolean a() {
        return (this.f11990f < this.f11989e.size()) || (this.f11992h.isEmpty() ^ true);
    }
}

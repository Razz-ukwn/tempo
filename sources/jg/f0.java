package jg;

import java.net.InetSocketAddress;
import java.net.Proxy;
import sf.j;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f10079a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f10080b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f10081c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        j.f(aVar, "address");
        j.f(inetSocketAddress, "socketAddress");
        this.f10079a = aVar;
        this.f10080b = proxy;
        this.f10081c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return j.a(f0Var.f10079a, this.f10079a) && j.a(f0Var.f10080b, this.f10080b) && j.a(f0Var.f10081c, this.f10081c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f10080b.hashCode();
        return this.f10081c.hashCode() + ((hashCode + ((this.f10079a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f10081c + '}';
    }
}

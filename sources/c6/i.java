package c6;

import c6.o;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.b f3832a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f3833b;

    public i(o.b bVar, o.a aVar) {
        this.f3832a = bVar;
        this.f3833b = aVar;
    }

    public final o.a a() {
        return this.f3833b;
    }

    public final o.b b() {
        return this.f3832a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f3832a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f3833b;
            if (aVar == null) {
                if (oVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = 0;
        o.b bVar = this.f3832a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        o.a aVar = this.f3833b;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i8 ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3832a + ", mobileSubtype=" + this.f3833b + "}";
    }
}

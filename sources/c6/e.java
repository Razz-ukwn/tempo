package c6;

import c6.k;

public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f3808a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3809b;

    public e(k.a aVar, a aVar2) {
        this.f3808a = aVar;
        this.f3809b = aVar2;
    }

    public final a a() {
        return this.f3809b;
    }

    public final k.a b() {
        return this.f3808a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f3808a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f3809b;
            if (aVar2 == null) {
                if (kVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(kVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = 0;
        k.a aVar = this.f3808a;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f3809b;
        if (aVar2 != null) {
            i8 = aVar2.hashCode();
        }
        return i8 ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f3808a + ", androidClientInfo=" + this.f3809b + "}";
    }
}

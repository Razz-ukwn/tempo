package ba;

import ba.d0;
import w9.c;

public final class y extends d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3595a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3596b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3597c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3598d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3599e;

    /* renamed from: f  reason: collision with root package name */
    public final c f3600f;

    public y(String str, String str2, String str3, String str4, int i8, c cVar) {
        if (str != null) {
            this.f3595a = str;
            if (str2 != null) {
                this.f3596b = str2;
                if (str3 != null) {
                    this.f3597c = str3;
                    if (str4 != null) {
                        this.f3598d = str4;
                        this.f3599e = i8;
                        if (cVar != null) {
                            this.f3600f = cVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final String a() {
        return this.f3595a;
    }

    public final int b() {
        return this.f3599e;
    }

    public final c c() {
        return this.f3600f;
    }

    public final String d() {
        return this.f3598d;
    }

    public final String e() {
        return this.f3596b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.a)) {
            return false;
        }
        d0.a aVar = (d0.a) obj;
        return this.f3595a.equals(aVar.a()) && this.f3596b.equals(aVar.e()) && this.f3597c.equals(aVar.f()) && this.f3598d.equals(aVar.d()) && this.f3599e == aVar.b() && this.f3600f.equals(aVar.c());
    }

    public final String f() {
        return this.f3597c;
    }

    public final int hashCode() {
        return ((((((((((this.f3595a.hashCode() ^ 1000003) * 1000003) ^ this.f3596b.hashCode()) * 1000003) ^ this.f3597c.hashCode()) * 1000003) ^ this.f3598d.hashCode()) * 1000003) ^ this.f3599e) * 1000003) ^ this.f3600f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f3595a + ", versionCode=" + this.f3596b + ", versionName=" + this.f3597c + ", installUuid=" + this.f3598d + ", deliveryMechanism=" + this.f3599e + ", developmentPlatformProvider=" + this.f3600f + "}";
    }
}

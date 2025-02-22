package ba;

import androidx.activity.g;
import ba.b0;

public final class i extends b0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3491a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3492b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3493c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.a.C0042a f3494d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f3495e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3496f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3497g;

    public i(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f3491a = str;
        this.f3492b = str2;
        this.f3493c = str3;
        this.f3495e = str4;
        this.f3496f = str5;
        this.f3497g = str6;
    }

    public final String a() {
        return this.f3496f;
    }

    public final String b() {
        return this.f3497g;
    }

    public final String c() {
        return this.f3493c;
    }

    public final String d() {
        return this.f3491a;
    }

    public final String e() {
        return this.f3495e;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.a.C0042a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.a)) {
            return false;
        }
        b0.e.a aVar2 = (b0.e.a) obj;
        if (this.f3491a.equals(aVar2.d()) && this.f3492b.equals(aVar2.g()) && ((str = this.f3493c) != null ? str.equals(aVar2.c()) : aVar2.c() == null) && ((aVar = this.f3494d) != null ? aVar.equals(aVar2.f()) : aVar2.f() == null) && ((str2 = this.f3495e) != null ? str2.equals(aVar2.e()) : aVar2.e() == null) && ((str3 = this.f3496f) != null ? str3.equals(aVar2.a()) : aVar2.a() == null)) {
            String str4 = this.f3497g;
            if (str4 == null) {
                if (aVar2.b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar2.b())) {
                return true;
            }
        }
        return false;
    }

    public final b0.e.a.C0042a f() {
        return this.f3494d;
    }

    public final String g() {
        return this.f3492b;
    }

    public final int hashCode() {
        int hashCode = (((this.f3491a.hashCode() ^ 1000003) * 1000003) ^ this.f3492b.hashCode()) * 1000003;
        int i8 = 0;
        String str = this.f3493c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        b0.e.a.C0042a aVar = this.f3494d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f3495e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3496f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3497g;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return hashCode5 ^ i8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f3491a);
        sb2.append(", version=");
        sb2.append(this.f3492b);
        sb2.append(", displayVersion=");
        sb2.append(this.f3493c);
        sb2.append(", organization=");
        sb2.append(this.f3494d);
        sb2.append(", installationUuid=");
        sb2.append(this.f3495e);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f3496f);
        sb2.append(", developmentPlatformVersion=");
        return g.a(sb2, this.f3497g, "}");
    }
}

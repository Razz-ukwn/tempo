package ba;

import androidx.activity.g;
import ba.b0;

public final class d extends b0.a.C0041a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3460a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3461b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3462c;

    public d(String str, String str2, String str3) {
        this.f3460a = str;
        this.f3461b = str2;
        this.f3462c = str3;
    }

    public final String a() {
        return this.f3460a;
    }

    public final String b() {
        return this.f3462c;
    }

    public final String c() {
        return this.f3461b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a.C0041a)) {
            return false;
        }
        b0.a.C0041a aVar = (b0.a.C0041a) obj;
        return this.f3460a.equals(aVar.a()) && this.f3461b.equals(aVar.c()) && this.f3462c.equals(aVar.b());
    }

    public final int hashCode() {
        return ((((this.f3460a.hashCode() ^ 1000003) * 1000003) ^ this.f3461b.hashCode()) * 1000003) ^ this.f3462c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f3460a);
        sb2.append(", libraryName=");
        sb2.append(this.f3461b);
        sb2.append(", buildId=");
        return g.a(sb2, this.f3462c, "}");
    }
}

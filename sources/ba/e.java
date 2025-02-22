package ba;

import androidx.activity.g;
import ba.b0;

public final class e extends b0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3464b;

    public e(String str, String str2) {
        this.f3463a = str;
        this.f3464b = str2;
    }

    public final String a() {
        return this.f3463a;
    }

    public final String b() {
        return this.f3464b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.c)) {
            return false;
        }
        b0.c cVar = (b0.c) obj;
        return this.f3463a.equals(cVar.a()) && this.f3464b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f3463a.hashCode() ^ 1000003) * 1000003) ^ this.f3464b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f3463a);
        sb2.append(", value=");
        return g.a(sb2, this.f3464b, "}");
    }
}

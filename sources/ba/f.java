package ba;

import androidx.activity.g;
import ba.b0;

public final class f extends b0.d {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.d.a> f3465a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3466b;

    public f() {
        throw null;
    }

    public f(c0 c0Var, String str) {
        this.f3465a = c0Var;
        this.f3466b = str;
    }

    public final c0<b0.d.a> a() {
        return this.f3465a;
    }

    public final String b() {
        return this.f3466b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d)) {
            return false;
        }
        b0.d dVar = (b0.d) obj;
        if (this.f3465a.equals(dVar.a())) {
            String str = this.f3466b;
            if (str == null) {
                if (dVar.b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3465a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3466b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f3465a);
        sb2.append(", orgId=");
        return g.a(sb2, this.f3466b, "}");
    }
}

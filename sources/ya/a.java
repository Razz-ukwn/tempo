package ya;

import androidx.activity.g;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f17320a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17321b;

    public a(String str, String str2) {
        if (str != null) {
            this.f17320a = str;
            if (str2 != null) {
                this.f17321b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final String a() {
        return this.f17320a;
    }

    public final String b() {
        return this.f17321b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17320a.equals(dVar.a()) && this.f17321b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f17320a.hashCode() ^ 1000003) * 1000003) ^ this.f17321b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f17320a);
        sb2.append(", version=");
        return g.a(sb2, this.f17321b, "}");
    }
}

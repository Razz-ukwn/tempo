package r4;

import java.security.MessageDigest;

public final class f implements p4.f {

    /* renamed from: b  reason: collision with root package name */
    public final p4.f f13888b;

    /* renamed from: c  reason: collision with root package name */
    public final p4.f f13889c;

    public f(p4.f fVar, p4.f fVar2) {
        this.f13888b = fVar;
        this.f13889c = fVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f13888b.a(messageDigest);
        this.f13889c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13888b.equals(fVar.f13888b) && this.f13889c.equals(fVar.f13889c);
    }

    public final int hashCode() {
        return this.f13889c.hashCode() + (this.f13888b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f13888b + ", signature=" + this.f13889c + '}';
    }
}

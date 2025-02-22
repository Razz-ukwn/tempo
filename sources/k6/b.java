package k6;

import d6.n;
import d6.s;

public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final long f10303a;

    /* renamed from: b  reason: collision with root package name */
    public final s f10304b;

    /* renamed from: c  reason: collision with root package name */
    public final n f10305c;

    public b(long j10, s sVar, n nVar) {
        this.f10303a = j10;
        if (sVar != null) {
            this.f10304b = sVar;
            if (nVar != null) {
                this.f10305c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final n a() {
        return this.f10305c;
    }

    public final long b() {
        return this.f10303a;
    }

    public final s c() {
        return this.f10304b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f10303a == iVar.b() && this.f10304b.equals(iVar.c()) && this.f10305c.equals(iVar.a());
    }

    public final int hashCode() {
        long j10 = this.f10303a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f10304b.hashCode()) * 1000003) ^ this.f10305c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f10303a + ", transportContext=" + this.f10304b + ", event=" + this.f10305c + "}";
    }
}

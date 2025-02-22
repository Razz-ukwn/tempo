package d6;

import a6.b;
import a6.c;
import a6.e;

public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final s f7337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7338b;

    /* renamed from: c  reason: collision with root package name */
    public final c<?> f7339c;

    /* renamed from: d  reason: collision with root package name */
    public final e<?, byte[]> f7340d;

    /* renamed from: e  reason: collision with root package name */
    public final b f7341e;

    public i(s sVar, String str, c cVar, e eVar, b bVar) {
        this.f7337a = sVar;
        this.f7338b = str;
        this.f7339c = cVar;
        this.f7340d = eVar;
        this.f7341e = bVar;
    }

    public final b a() {
        return this.f7341e;
    }

    public final c<?> b() {
        return this.f7339c;
    }

    public final e<?, byte[]> c() {
        return this.f7340d;
    }

    public final s d() {
        return this.f7337a;
    }

    public final String e() {
        return this.f7338b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7337a.equals(rVar.d()) && this.f7338b.equals(rVar.e()) && this.f7339c.equals(rVar.b()) && this.f7340d.equals(rVar.c()) && this.f7341e.equals(rVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f7337a.hashCode() ^ 1000003) * 1000003) ^ this.f7338b.hashCode()) * 1000003) ^ this.f7339c.hashCode()) * 1000003) ^ this.f7340d.hashCode()) * 1000003) ^ this.f7341e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f7337a + ", transportName=" + this.f7338b + ", event=" + this.f7339c + ", transformer=" + this.f7340d + ", encoding=" + this.f7341e + "}";
    }
}

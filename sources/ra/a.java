package ra;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final String f14157a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14158b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14159c;

    public a(String str, long j10, long j11) {
        this.f14157a = str;
        this.f14158b = j10;
        this.f14159c = j11;
    }

    public final String a() {
        return this.f14157a;
    }

    public final long b() {
        return this.f14159c;
    }

    public final long c() {
        return this.f14158b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14157a.equals(jVar.a()) && this.f14158b == jVar.c() && this.f14159c == jVar.b();
    }

    public final int hashCode() {
        long j10 = this.f14158b;
        long j11 = this.f14159c;
        return ((((this.f14157a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f14157a + ", tokenExpirationTimestamp=" + this.f14158b + ", tokenCreationTimestamp=" + this.f14159c + "}";
    }
}

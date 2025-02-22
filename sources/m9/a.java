package m9;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final long f11317a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11318b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11319c;

    public a(long j10, long j11, long j12) {
        this.f11317a = j10;
        this.f11318b = j11;
        this.f11319c = j12;
    }

    public final long a() {
        return this.f11318b;
    }

    public final long b() {
        return this.f11317a;
    }

    public final long c() {
        return this.f11319c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11317a == jVar.b() && this.f11318b == jVar.a() && this.f11319c == jVar.c();
    }

    public final int hashCode() {
        long j10 = this.f11317a;
        long j11 = this.f11318b;
        long j12 = this.f11319c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f11317a + ", elapsedRealtime=" + this.f11318b + ", uptimeMillis=" + this.f11319c + "}";
    }
}

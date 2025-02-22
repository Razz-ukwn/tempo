package c6;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final long f3831a;

    public h(long j10) {
        this.f3831a = j10;
    }

    public final long b() {
        return this.f3831a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f3831a == ((n) obj).b();
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3831a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f3831a + "}";
    }
}

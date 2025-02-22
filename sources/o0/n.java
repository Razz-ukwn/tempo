package o0;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final long f12068a;

    public /* synthetic */ n(long j10) {
        this.f12068a = j10;
    }

    public static String a(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        return this.f12068a == ((n) obj).f12068a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12068a);
    }

    public final String toString() {
        return a(this.f12068a);
    }
}

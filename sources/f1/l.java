package f1;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final long f8045a;

    public /* synthetic */ l(long j10) {
        this.f8045a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f8045a == ((l) obj).f8045a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8045a);
    }

    public final String toString() {
        long j10 = this.f8045a;
        return a(j10, 0) ? "Unspecified" : a(j10, 4294967296L) ? "Sp" : a(j10, 8589934592L) ? "Em" : "Invalid";
    }
}

package f1;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f8038a;

    public /* synthetic */ i(long j10) {
        this.f8038a = j10;
    }

    public static final int a(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static String b(long j10) {
        return ((int) (j10 >> 32)) + " x " + a(j10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f8038a == ((i) obj).f8038a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8038a);
    }

    public final String toString() {
        return b(this.f8038a);
    }
}

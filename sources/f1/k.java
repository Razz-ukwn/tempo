package f1;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final l[] f8042b = {new l(0), new l(4294967296L), new l(8589934592L)};

    /* renamed from: c  reason: collision with root package name */
    public static final long f8043c = ((((long) Float.floatToIntBits(Float.NaN)) & 4294967295L) | 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f8044a;

    public /* synthetic */ k(long j10) {
        this.f8044a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f8042b[(int) ((j10 & 1095216660480L) >>> 32)].f8045a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        long b10 = b(j10);
        if (l.a(b10, 0)) {
            return "Unspecified";
        }
        if (l.a(b10, 4294967296L)) {
            return c(j10) + ".sp";
        } else if (!l.a(b10, 8589934592L)) {
            return "Invalid";
        } else {
            return c(j10) + ".em";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return this.f8044a == ((k) obj).f8044a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8044a);
    }

    public final String toString() {
        return d(this.f8044a);
    }
}
